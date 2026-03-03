package lab1;

public class Main {
    public  static void main()
    {
        String litere="";
        for(char i='a';i<='z';i++ ) {
            litere += i;
        }
        System.out.println(litere.toLowerCase());
        System.out.println(litere.toUpperCase());
        String array[]=new String[10];
        for (int i = 0; i <10; i++) {
            array[i] = "";
        }
        int n=0;
        for(int i=0;i<litere.length();i++)
        {
            if(litere.charAt(i)=='e'||litere.charAt(i)=='i'||litere.charAt(i)=='o'||litere.charAt(i)=='u')
            {
                n++;
                array[n]+=litere.charAt(i);
            }
            else  array[n]+=litere.charAt(i);
        }
        for(int i=0;i<n;i++)
            System.out.println(array[i]);
    }



}
