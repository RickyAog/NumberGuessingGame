import java.util.Scanner;

public class NumberGussingGame {

public static void main(String [] args){
float numberGuesser;
int numberPicker;
Scanner keyboard;
keyboard=new Scanner (System.in);

System.out.println("-------------------------------------");
System.out.println("|Welcome To The Number Guessing Game|");
System.out.println("|       Please Pick A Number        |");
System.out.println("|        Between 1 and 100          |");
System.out.println("-------------------------------------");


numberPicker = (int)(Math.random()*100);

do {
    numberGuesser = Float.valueOf(keyboard.nextLine());
    if (numberGuesser == numberPicker) {
        System.out.println("you've guessed the number,you must be a psychic");
        System.out.println("Would you like to continue");
        System.out.println("101 = yes 102 = no");
    }
    if(numberGuesser > numberPicker){
        System.out.println("You're too high");
    }
    if(numberGuesser <numberPicker){
        System.out.println("You're too low");
    }
}while(2+2==4);

    }
}
