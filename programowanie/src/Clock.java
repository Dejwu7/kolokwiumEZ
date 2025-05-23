import java.time.LocalTime;

public abstract class Clock {
    private int hh;
    private int mm;
    private int ss;
    private City city;
    
    public void setCurrentTime(){
        LocalTime obj = LocalTime.now();
        hh=obj.getHour();
        mm=obj.getMinute();
        ss=obj.getSecond();
    }

    public void setTime(int hh, int mm, int ss, City city){
        if(hh>=24 || hh<0) throw new IllegalArgumentException("Błędna godzina");
        if(mm>=60 || mm<0) throw new IllegalArgumentException("Błędna minuta");
        if(ss>=60 || ss<0) throw new IllegalArgumentException("Błędna sekunda");
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
        this.city = city;
    }

    public void setCity(City city){
        this.city = city;
        hh += city.getStrefa();
        if (hh >=24){
            hh-=24;
        }
    }
    public Clock localmeantime(int h,int m,int s)
    {
        String[] temp=city.getW_E().split(" ");
        int wspolrzedne= Integer.parseInt(temp[0]);
        wspolrzedne*=4;
        Clock clock=new Clock(){};
        clock.hh=h;
        clock.mm=m;
        clock.ss=s;
        clock.hh-=city.getStrefa();
        clock.hh=wspolrzedne/60;
        wspolrzedne-= clock.hh*60;
        clock.mm=wspolrzedne;
        return clock;
    }


    @Override
    public String toString(){
        return hh + ":" + mm + ":" + ss;
    }

    public int getHh() {
        return hh;
    }
    public City getCity() {
        return city;
    }

    public int getMm() {
        return mm;
    }

    public int getSs() {
        return ss;
    }

}
