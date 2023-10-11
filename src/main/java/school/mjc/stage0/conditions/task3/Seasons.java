package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month>0 & month<=2 || month == 12){
            System.out.println("winter");
        }
        if(month>2 & month<=5){
            System.out.println("sprint");
        }
        if(month>5 & month<=8){
            System.out.println("summer");
        }
        if(month>8 & month<=12){
            System.out.println("fall");
        }

    }
}
