package lab5.advanced;

public class DoubleCalculator extends ACalculator
{
    @Override
    public void Init(Object val){
        this.state=(double)val;
    }
    public DoubleCalculator add(double nr)
    {
        state=(double)state+nr;
        return this;
    }
    public DoubleCalculator subtract(double nr)
    {
        state=(double)state-nr;
        return this;
    }
    public DoubleCalculator multiply(double nr)
    {
        state=(double)state*nr;
        return this;
    }
}
