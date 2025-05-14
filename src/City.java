import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class City {
    private String name,N_S,W_E; // szerokosc, dlugosc
    private int strefa;

    private static City parseLine(String line){
        String temp[]=line.split(",");
        City lokalizacja = new City();
        lokalizacja.name = temp[0];
        lokalizacja.strefa = Integer.parseInt(temp[1]);
        lokalizacja.N_S = temp[2];
        lokalizacja.W_E = temp[3];

        return lokalizacja;
    }

    public String getName() {
        return name;
    }

    public String getN_S() {
        return N_S;
    }

    public String getW_E() {
        return W_E;
    }

    public int getStrefa() {
        return strefa;
    }

    public static Map<String, City> parseFile(String filePath) throws FileNotFoundException {
        Map<String, City> mapa= new TreeMap<>();
        Scanner odczyt = new Scanner(new File(filePath));
        odczyt.nextLine();
        while(odczyt.hasNext()){
            String linia = odczyt.nextLine();
            City temp = parseLine(linia);
            mapa.put(temp.getName(),temp);
        }


        //Scanner.close();
        return mapa;
    }
}
