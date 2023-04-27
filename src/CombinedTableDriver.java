/**
 * AP CS A - 2021 - FRQ #2
 * Created By: Frederick Morrison
 * Creation Date: 2021-05-11
 */
public class CombinedTableDriver
{

    public static void main(String[] args)
    {
        SingleTable t1 = new SingleTable(4, 60, 74);
        //System.out.println(t1);

        SingleTable t2 = new SingleTable(8, 70, 74);
        //System.out.println(t2);

        SingleTable t3 = new SingleTable(12,75, 76);
        //System.out.println(t3);

        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.format("can seat 9=%b%n", c1.canSeat(9));
        System.out.format("can seat 11=%b%n", c1.canSeat(11));

        double desire = c1.getDesirability();
        System.out.format("desirability = %.1f%n", desire); // 65.0

        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.format("can seat 18=%b%n", c2.canSeat(18));
        desire = c2.getDesirability();
        System.out.format("desirability = %.1f%n", desire); // 62.5

        t2.setViewQuality(80);
        desire = c2.getDesirability();
        System.out.format("desirability = %.1f%n", desire); // 67.5
    }


}
