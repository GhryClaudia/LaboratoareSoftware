package lab5;

public class IntCalculator {
    private int state;
    public IntCalculator(int s)
    {
        state=s;
    }
    public IntCalculator add(int nr)
    {
        this.state=this.state+nr;
        return this;
    }
    public IntCalculator subtract(int nr)
    {
        this.state=this.state-nr;
        return this;
    }
    public IntCalculator multiply(int nr)
    {
        this.state=this.state*nr;
        return this;
    }
    public int result()
    {
        return this.state;
    }
    public void clear()
    {
        this.state=0;
    }
}
