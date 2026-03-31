package lab5.advanced;

import lab5.IntCalculator;

public class NewIntCalculator extends ACalculator
{
    @Override
    public void Init(Object val){
        this.state=(Integer)val;
    }
    public NewIntCalculator add(Integer nr)
    {
        state=(Integer)state+nr;
        return this;
    }
    public NewIntCalculator subtract(Integer nr)
    {
        state=(Integer)state-nr;
        return this;
    }
    public NewIntCalculator multiply(Integer nr)
    {
        state=(Integer)state*nr;
        return this;
    }

}
