package Chapter3;

public class Date {
    private int month;
    private int day;
    private int year;
    private int displayDate;

    public Date(){
        month = 0;
        day = 0;
        year = 0;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    public void setMonth (int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year =year;
    }

    public int getDisplayDate (){
     return month /day/ year;

    }

}
