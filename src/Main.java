import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            DigitalClock czas = new DigitalClock(DigitalClock.Clocktype.H12, 9, 20, 20);
            //System.out.println(czas.toString());
            Map<String,City> mapa= City.parseFile("src/strefy.csv");

        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

}