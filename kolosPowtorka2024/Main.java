import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {

            //System.out.println(czas.toString());
            Map<String,City> mapa= City.parseFile("src/strefy.csv");
            DigitalClock czas = new DigitalClock(DigitalClock.Clocktype.H12, 9, 20, 20, mapa.get("Warszawa"));
            System.out.println(czas.toString());
            czas.setCity(mapa.get("Kijów"));
            System.out.println(czas.toString());
           czas.localmeantime(10,0,0);
           // Collections.sort(mapa,City.worstTimezoneFit());

        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
       try{
            AnalogClock zegarekSvg=new AnalogClock();
            zegarekSvg.toSvg("src/zegarek.svg");
        }
        catch(FileNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
    }

}