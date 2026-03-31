package lab5.advanced;

public class Lab5Adv {
    public static void main(String[] args)
    {
        NewIntCalculator calc=new NewIntCalculator();
        calc.Init(10);
        Object rezInt=calc.add(5).subtract(3).multiply(2).result();
        System.out.println(rezInt);
        DoubleCalculator calc2=new DoubleCalculator();
        calc2.Init(10.0);
        Object rezDouble=calc2.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println(rezDouble);
    }
}
