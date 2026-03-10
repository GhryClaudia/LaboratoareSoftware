package lab2;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList(); //d
        List<Integer> maiMareDecatP = new ArrayList(); //d
        Random rand = new Random();
        for(int i=0;i<5;i++)
        {
            x.add(rand.nextInt(10));
        }
        for(int i=0;i<7;i++)
        {
            y.add(rand.nextInt(10));
        }
        System.out.println(x);
        System.out.println(y);
        Collections.sort(x);
        Collections.sort(y);
        System.out.println(x);
        System.out.println(y);
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println(xPlusY);
        Collections.sort(xPlusY);
        System.out.println(xPlusY);
        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println(zSet);
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println(xMinusY);
        xPlusYLimitedByP.addAll(xPlusY);
        for(int i=p;i<=9;i++)
        {
           maiMareDecatP.add(i);
        }
        xPlusYLimitedByP.removeAll(maiMareDecatP);
        System.out.println(xPlusYLimitedByP);

    }
}
