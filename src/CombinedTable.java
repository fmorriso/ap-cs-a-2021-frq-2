/**
 * AP CS A - 2021 - FRQ #2
 * Created By: Frederick Morrison
 * Creation Date: 2021-05-11
 */
public class CombinedTable
{
    private SingleTable t1;
    private SingleTable t2;

    public CombinedTable(SingleTable table1, SingleTable table2)
    {
        t1 = table1;
        t2 = table2;
    }

    /**
     *
     * @param seats - the number of seats being requested.
     * @return - true if, after combining the two tables, there are enough total seats to accomodate the request.
     * @implNote - The combined table can seat two fewer than the total seats in the two SingleTable
     *             objects because two seats are lost when the two tables are pushed together.
     */
    public boolean canSeat(int seats)
    {
        int availableSeats = t1.getNumSeats() + t2.getNumSeats() - 2;
        return seats <= availableSeats;
    }

    /**
     * Returns the desirability of the combined table after taking into account the height of
     * each table.  If the tables are the same height the desirablility is the height of one of the tables.
     * If the tables are of different heights, the desirability is the average of the two heights minus 10.
     * @return - the desirability of the combined tables.
     */
    public double getDesirability()
    {
        double avg = (t1.getViewQuality() + t2.getViewQuality()) / 2.0;
        if(t1.getHeight() == t2.getHeight())
        {
            return avg;
        }
        return avg - 10;
    }
}
