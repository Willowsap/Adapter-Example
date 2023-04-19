package computer;

import theater.Projector;

/**
 * Example of an adapter that lets a projector be used as a monitor.
 * 
 * @author Willow Sapphire
 * @version 04/19/2023
 */
public class ProjectorAdapter implements Display 
{
    /**
     * The projector that is wrapped.
     */
    private Projector projector;

    /**
     * Constructs a new adapter for a projector.
     * 
     * @param projector the projector to adapt
     */
    public ProjectorAdapter(Projector projector)
    {
        this.projector = projector;
    }

    /**
     * Converts the projector's power method
     * into the turnOn method of display.
     * Needs to check that it doesn't turn off if
     * the projector is already on.
     */
    @Override
    public void turnOn()
    {
        if (!projector.isOn())
        {
            projector.power();
        }
    }

    /**
     * Converts the projector's power method
     * into the turnOff method of display.
     * Needs to check that it doesn't turn on if
     * the projector is already off.
     */
    @Override
    public void turnOff()
    {
        if (projector.isOn())
        {
            projector.power();
        }
    }

    /**
     * Converts the projector's project method to the
     * display method of Display.
     * Needs to convert the input.
     */
    @Override
    public void display(String toDisplay)
    {
        projector.project(toDisplay.toCharArray());
        System.out.println();
    }
    
}
