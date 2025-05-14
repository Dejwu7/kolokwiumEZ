public class Point {
    public double x = 4;
    public double y = 5;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String toSvg(){
        return "<svg height=\"100\" width=\"100\" xmlns=\"http://www.w3.org/2000/svg\">" +
                "<circle r=\"45\" cx=\"50\" cy=\"50\" fill=\"red\" />"
                + "</svg>";
    }

    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy){
        Point point2 = new Point();
        point2.x += dx;
        point2.y += dy;
        return point2;
    }
}
