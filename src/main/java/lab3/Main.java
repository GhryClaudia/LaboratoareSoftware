package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        File f = new File("in.txt");
        Scanner sc = null;
        String text="";
        try {
            sc = new Scanner(f);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(f.getAbsolutePath());
        }
        while (sc.hasNextLine())
        {
           text+=sc.nextLine();
        }
        String[] lines = text.split("\\. ");
        for(int i=0;i<lines.length;i++)
        {
            lines[i] += "\n";
            System.out.println(lines[i]);
        }
        sc.close();
        List<String> linesout = Arrays.asList(lines);
        try {
            Path path = Paths.get("out.txt");
            Files.write(path, linesout);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
