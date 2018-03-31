public class StockDataPoint {
    String symbol = "";
    double price = -1;
    int time = -1;

    StockDataPoint(String s, double d, int i) {
        symbol = s;
        price = d;
        time = i;
    }

    public int getTime() {
        return time;
    }

    public String toString() {
        return symbol + "\t" + price + "\t" + time;
    }
    // immutable
}
