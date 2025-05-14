public class Main {
    public static void main(String[] args) {
        Point point = new Point();

        System.out.println(point.x + " " + point.y);
        Point p2=point.translated(10, 10);
        System.out.println(p2.toString());
        Segment segment = new Segment();
        segment.point1 = point;
        segment.point2 = p2;
        Segment[] tablicaSegment = new Segment[4];
        for(int i = 0; i < 4; i++){
            tablicaSegment[i] = new Segment();
        }
        tablicaSegment[0] = segment;
        Segment.seg(tablicaSegment);
        System.out.println(Segment.seg(tablicaSegment));
    }
}