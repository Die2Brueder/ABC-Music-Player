package player.ast;

public class MeterC implements Meter
{
    private static MeterC instance;

    private MeterC()
    {
    }

    /**
     * @return the sole instance of MeterC
     */
    public static MeterC getInstance()
    {
        if (instance == null)
            instance = new MeterC();

        return instance;
    }

    @Override
    public String toString()
    {
        return "MeterC";
    }

    @Override
    public <R> R accept(AbcVisitor<R> visitor)
    {
        return visitor.on(this);
    }

    @Override
    public int getUpper()
    {
        return 4;
    }

    @Override
    public int getLower()
    {
        return 4;
    }
}
