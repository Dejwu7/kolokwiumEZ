
public class Segment {
    Point point1 = new Point();
    Point point2 = new Point();

    public double length(){
        return Math.sqrt(Math.pow(point2.x-point1.x,2)+Math.pow(point2.y-point1.y,2));
    }

    public static Segment seg(Segment[] segment){
        Segment maxi=segment[0];
        for(Segment i:segment)
        {
            if(maxi.length()<i.length()){
                maxi = i;
            }
        }
        return maxi;
    }

}
