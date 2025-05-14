import java.time.LocalTime;

public abstract class Clock {
    private int hh;
    private int mm;
    private int ss;
    
    public void setCurrentTime(){
        LocalTime obj = LocalTime.now();
        hh=obj.getHour();
        mm=obj.getMinute();
        ss=obj.getSecond();
    }

    public void setTime(int hh, int mm, int ss){
        if(hh>=24 || hh<0) throw new IllegalArgumentException("Błędna godzina");
        if(mm>=60 || mm<0) throw new IllegalArgumentException("Błędna minuta");
        if(ss>=60 || ss<0) throw new IllegalArgumentException("Błędna sekunda");
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
    @Override
    public String toString(){
        return hh + ":" + mm + ":" + ss;
    }

    public double getHh() {
        return hh;
    }

    public double getMm() {
        return mm;
    }

    public double getSs() {
        return ss;
    }
}
