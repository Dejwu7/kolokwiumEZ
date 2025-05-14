import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point punkt = new Point(2,3);
        List<Point> list=new ArrayList<>();
        list.add(punkt);
        list.add(new Point(4,5));
        list.add(new Point(5,8));
        list.add(new Point(4,10));
        Polygon w1=new Polygon(list);
        System.out.println( w1.inside(new Point(100000,1000000)));


    }
}