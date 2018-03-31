import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestCase {
    Queue<StockDataPoint> queue = new LinkedList<StockDataPoint>();

    TestCase(String num) {
        if (num.equalsIgnoreCase("case 1")) {            //  real order below  (300 seconds in a minute)
            queue.add(new StockDataPoint("F",120.23,12900)); //  120.22

            queue.add(new StockDataPoint("F",120.20,13000)); //  120.23

            queue.add(new StockDataPoint("F",120.29,13100)); //

            queue.add(new StockDataPoint("F",120.22,12800)); //

            queue.add(new StockDataPoint("F",120.29,12950)); //

            queue.add(new StockDataPoint("F",120.29,13200)); //

            queue.add(new StockDataPoint("F",120.29,12900)); //

            queue.add(new StockDataPoint("F",120.29,12900)); //

        }
    }
}
