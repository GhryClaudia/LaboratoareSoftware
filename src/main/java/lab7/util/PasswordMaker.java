package lab7.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;
    private static PasswordMaker instance=null;
    private String name;
    private static int callingCounts=0;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);
    }

    private PasswordMaker(String name) {
        this.name = name;
    }
    public static PasswordMaker getInstance(){
        if(instance==null)
        {
            instance=new PasswordMaker(MAGIC_STRING);
        }
        callingCounts++;
        return instance;
    }
    public static int getCallingCounts(){return callingCounts;}
    public String getPassword() {
        java.util.Random r = new java.util.Random();
        String ln = ""+name.length();
        ln += r.nextInt(101);
        StringRandomizer srand = new StringRandomizer();
        return srand.randomString(MAGIC_NUMBER) + srand.randomString(10, MAGIC_STRING) + ln;
    }
}

