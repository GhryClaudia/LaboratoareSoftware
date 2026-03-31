package lab5;

public class AppLab5 {
    public static void main(String[] args)
    {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        AdvancedCalculator adv=new AdvancedCalculator(10);
        int result2=adv.add(3).subtract(12).multiply(2).power2().divide(2).powerN(3).result();
        System.out.println("b) " + result2);
    }
}
