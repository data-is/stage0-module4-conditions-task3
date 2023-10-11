package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character=='a' || character == 'A' || character=='e' || character == 'E'|| character=='o' || character == 'O' || character=='i' || character == 'I' || character=='u' || character == 'U'    ){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
