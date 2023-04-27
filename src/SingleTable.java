/**
 * AP CS A - 2021 - FRQ #2
 * Created By: Frederick Morrison
 * Creation Date: 2021-05-11
 */

/**
 * Purpose: Represents a table at a restaurant
 */
public class SingleTable
{
    private int numSeats; // number of seats at the table
    private double viewQuality;
    private int height;

    public SingleTable(int seats, double quality, int tableHeight)
    {
        numSeats = seats;
        viewQuality = quality;
        height = tableHeight;
    }

    public int getNumSeats()
    {
        return numSeats;
    }

    public double getViewQuality()
    {
        return viewQuality;
    }

    public int getHeight()
    {
        return height;
    }

    public void setViewQuality(double value)
    {
        viewQuality = value;
    }

    @Override
    public String toString()
    {
        return
                "SingleTable{" +
                "numSeats=" + numSeats +
                ", viewQuality=" + viewQuality +
                ", height=" + height +
                '}';
    }
}
