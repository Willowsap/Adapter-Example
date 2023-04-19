package client;
import java.util.Scanner;

import computer.Display;
import computer.Monitor;
import computer.ProjectorAdapter;
import theater.Projector;

/**
 * Demo to show the adaper.
 * 
 * @author Willow Sapphire
 * @version 04/05/2023
 */
public class Demo
{
    /**
     * Runs the demo
     * 
     * @param args unused
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        Display[] displays = {new Monitor(), new ProjectorAdapter(new Projector())};

        for (Display d : displays)
        {
            d.display("Displaying...");
        }

        kb.close();
    }
}
