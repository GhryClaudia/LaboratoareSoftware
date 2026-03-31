package lab5;

public class AdvancedCalculator extends IntCalculator
{
    public AdvancedCalculator(int state)
    {
        super(state);
    }
    public AdvancedCalculator divide(int nr)
    {
       if(nr!=0)
       {
           int val=result()/nr;
           clear();
           add(val);
       }
       return this;
    }
    public AdvancedCalculator power2()
    {
        int val=result()*result();
        clear();
        add(val);
        return this;
    }
    public  AdvancedCalculator powerN(int n)
    {
        int val=result();
        for(int i=1;i<n;i++)
        {
            val=val*result();
        }
        clear();
        add(val);
        return this;
    }
    @Override
    public AdvancedCalculator add(int val) {
        super.add(val);
        return this;
    }
    @Override
    public AdvancedCalculator subtract(int val) {
        super.subtract(val);
        return this;
    }
    @Override
    public AdvancedCalculator multiply(int val) {
        super.multiply(val);
        return this;
    }
}
