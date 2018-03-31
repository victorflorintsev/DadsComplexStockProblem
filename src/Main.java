import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        TestCase in = new TestCase("case 1");

        Vector<StockDataPoint> out = new Vector<StockDataPoint>();
        sortStocks(in, out);
    }
    public static void sortStocks(TestCase in, Vector<StockDataPoint> out) {
        PriorityQueue<StockDataPoint> oldestTime = new PriorityQueue<StockDataPoint>(new LongestTimeComparator());
        while (!in.queue.isEmpty()) {
            oldestTime.add(in.queue.remove());
        }
        StockDataPoint x;
        while (!oldestTime.isEmpty()) {
            x = oldestTime.peek();
            System.out.println(oldestTime.peek());
            oldestTime.remove(x);
        }
    }

    public static class LongestTimeComparator implements Comparator<StockDataPoint> {
        @Override
        public int compare(StockDataPoint x, StockDataPoint y) {
            if (x.getTime() < y.getTime())
            {
                return 1;
            }
            if (x.getTime() > y.getTime())
            {
                return -1;
            }
            return 0;
        }
    }
};



/* Description of the problem:

Live sort an out of order stream of stocks efficiently.
You may assume that a stock will not be more than 5 minutes
out of order.

 */