import Utility.Client;
import Utility.Season;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.print();
        client1.season(Season.WINTER);
    }
}
