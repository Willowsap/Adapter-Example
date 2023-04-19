package computer;

public class Monitor implements Display
{
    private boolean isOn;

    @Override
    public void turnOn()
    {
        System.out.println("Turning on the monitor");
        this.isOn = true;
    }

    @Override
    public void turnOff()
    {
        System.out.println("Turning off the monitor");
        this.isOn = false;
    }

    /**
     * Checks if the monitor is on.
     * 
     * @return true if the monitor is on.
     */
    public boolean isOn()
    {
        return isOn;
    }

    @Override
    public void display(String toDisplay)
    {
        System.out.println(toDisplay);
    }
    
}
