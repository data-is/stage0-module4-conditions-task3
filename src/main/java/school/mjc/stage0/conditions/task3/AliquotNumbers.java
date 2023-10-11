package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (first % second == 0){
            System.out.println("Aliquot is yes");
        }
        else{
            System.out.println("Not aliquot");
        }
    }
}
