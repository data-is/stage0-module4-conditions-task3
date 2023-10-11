package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month>0 & month<=2 || month == 12){
            System.out.println("Winter");
        }
        if(month>2 & month<=5){
            System.out.println("Sprint");
        }
        if(month>5 & month<=8){
            System.out.println("Summer");
        }
        if(month>8 & month<=12){
            System.out.println("Fall");
        }
        if(month == 0){
            System.out.println("wrong number!");
        }

    }
}
