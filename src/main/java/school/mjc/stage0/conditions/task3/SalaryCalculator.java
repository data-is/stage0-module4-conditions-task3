package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 0){
            System.out.println("wrong input");
        }
        if(salary <= 1000){
            System.out.println((float)salary*0.85);
        }
        if(1000 < salary && salary <= 2000){
            System.out.println((float)salary*0.82);
        }
        if(salary > 2000){
            System.out.println((float)salary * 0.8);
        }
    }
}
