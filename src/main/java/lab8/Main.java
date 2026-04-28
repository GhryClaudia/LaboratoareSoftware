package lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream(new File("laborator8_input.xlsx"));
//Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

//Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

//Iterate through each rows one by one
        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();

            //For each row, iterate through all the columns
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                //Check the cell type and format accordingly
                switch (cell.getCellType()) {
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "  ");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "  ");
                        break;
                }
            }
            System.out.println();
        }
        ScrieFisier2(workbook);
        ScrieFisier3(workbook);
        file.close();
    }
    public static void ScrieFisier2( XSSFWorkbook workbookIn) throws IOException
    {
        XSSFWorkbook workbookOut = new XSSFWorkbook();
        XSSFSheet sheetIn = workbookIn.getSheetAt(0);
        XSSFSheet sheetOut = workbookOut.createSheet("Studenti");
        int rowNum = 0;
        double medie;
        for (Row rowIn : sheetIn) {
            Row rowOut = sheetOut.createRow(rowNum);
            int cellNum = 0;
            for (Cell cellIn : rowIn) {
                Cell cellOut = rowOut.createCell(cellNum++);

                switch (cellIn.getCellType()) {
                    case STRING:
                        cellOut.setCellValue(cellIn.getStringCellValue());
                        break;
                    case NUMERIC:
                        cellOut.setCellValue(cellIn.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        cellOut.setCellValue(cellIn.getBooleanCellValue());
                        break;
                    default:
                        cellOut.setCellValue("");
                }
            }
            Cell sumaCell = rowOut.createCell(cellNum);
            if (rowNum == 0) {
                sumaCell.setCellValue("Medie");
            } else {
                int lastCol = rowIn.getLastCellNum();
                double suma = 0;
                int count = 0;
                for (int i = lastCol - 3; i < lastCol; i++) {
                    Cell c = rowIn.getCell(i);
                    if (c != null && c.getCellType() == CellType.NUMERIC) {
                        suma += c.getNumericCellValue();
                        count++;
                    }
                }
                medie = (count > 0) ? suma / count : 0;
                sumaCell.setCellValue(medie);
            }
            rowNum++;
        }
        try (FileOutputStream out = new FileOutputStream("laborator8_output3.xlsx")) {
            workbookOut.write(out);
        }
        workbookOut.close();
        System.out.println("Fisier scris cu succes!");
    }
    public static void ScrieFisier3( XSSFWorkbook workbookIn) throws IOException
    {
        XSSFWorkbook workbookOut = new XSSFWorkbook();
        XSSFSheet sheetIn = workbookIn.getSheetAt(0);
        XSSFSheet sheetOut = workbookOut.createSheet("Studenti");
        int rowNum = 0;
        for (Row rowIn : sheetIn) {
            Row rowOut = sheetOut.createRow(rowNum);
            int cellNum = 0;
            for (Cell cellIn : rowIn) {
                Cell cellOut = rowOut.createCell(cellNum++);

                switch (cellIn.getCellType()) {
                    case STRING:
                        cellOut.setCellValue(cellIn.getStringCellValue());
                        break;
                    case NUMERIC:
                        cellOut.setCellValue(cellIn.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        cellOut.setCellValue(cellIn.getBooleanCellValue());
                        break;
                    default:
                        cellOut.setCellValue("");
                }
            }
            Cell sumaCell = rowOut.createCell(cellNum);
            if (rowNum == 0) {
                sumaCell.setCellValue("Medie");
            } else {
                int lastCol = rowIn.getLastCellNum();
                String formula = "AVERAGE(" +
                        CellReference.convertNumToColString(lastCol - 3) + (rowNum + 1) + ":" +
                        CellReference.convertNumToColString(lastCol - 1) + (rowNum + 1) +
                        ")";
                sumaCell.setCellFormula(formula);
            }
            rowNum++;
        }
        try (FileOutputStream out = new FileOutputStream("laborator8_output3.xlsx")) {
            workbookOut.write(out);
        }
        workbookOut.close();
        System.out.println("Fisier scris cu succes!");
    }
}
