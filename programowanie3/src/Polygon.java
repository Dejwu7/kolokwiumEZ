import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Point> listaPunktow;

    public Polygon(List<Point> listaPunktow) {
        listaPunktow = new ArrayList<>();
        this.listaPunktow = listaPunktow;
    }

    public boolean inside(Point point){
        int licznik = 0;
        for(int i=0;i< listaPunktow.size();i++) {
            if (listaPunktow.getLast() == listaPunktow.get(i)) {
                if (listaPunktow.getFirst().y < listaPunktow.get(i).y) {
                    Point temp = listaPunktow.getLast();
                    listaPunktow.set(i, listaPunktow.getFirst());
                    listaPunktow.set(0, temp);

                }
            } else if (listaPunktow.get(i + 1).y < listaPunktow.get(i).y) {
                Point temp = listaPunktow.get(i);
                listaPunktow.set(i, listaPunktow.get(i + 1));
                listaPunktow.set(i + 1, temp);
            }
            if (listaPunktow.get(i).y < point.y && point.y < listaPunktow.get(i + 1).y) {
                double d = listaPunktow.get(i + 1).x - listaPunktow.get(1).x;
                double x;
                if (d == 0) {
                    x = listaPunktow.get(i).x;
                } else {
                    double a = (listaPunktow.get(i + 1).y - listaPunktow.get(i).y) / d;
                    double b = listaPunktow.get(1).y - a * listaPunktow.get(i).x;
                    x = point.y  - b;
                }
                if (x < point.x) {
                    licznik++;
                }

            }
        }
            if(licznik%2==0) return true;
                             return false;
    }

}




