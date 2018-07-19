import java.util.Scanner;
public class ChooseAdventure {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String userInput;

        System.out.println("Live or Die");
        System.out.println("CHOOSE wisely..." + "\n");

        System.out.println("Choose box 'a' or 'b'.");
        userInput = keyboard.nextLine();

        if (userInput.equalsIgnoreCase("a")) {
            System.out.println("Nice. Choose the 'cooler' or 'lunchbox'.");
            userInput = keyboard.nextLine();
            }

            if (userInput.equalsIgnoreCase("cooler")) {
            System.out.println("Sweet. Now choose to open the 'black' or 'blue' container.");
            userInput = keyboard.nextLine();
            }

            if (userInput.equalsIgnoreCase("black")) {
            System.out.println("Congratulations. You chose wisely. Take your prize and get outta here!");
            }

            else if (userInput.equalsIgnoreCase("blue")) {
            System.out.println("Noooooo!!! You triggered the bomb! Bummer. We'll pour one out for you. R.I.P.");
            }



            if (userInput.equalsIgnoreCase("lunchbox")) {
                System.out.println("Now choose to open the 'yellow' or 'red' container.");
                userInput = keyboard.nextLine();
            }

            if (userInput.equalsIgnoreCase("red")) {
                System.out.println("Congrats! You chose wisely. Now get outta here!");
            }

            else if (userInput.equalsIgnoreCase("yellow")){
                    System.out.println("Oh no! You released the poison! You will be missed!");
                    }



        if (userInput.equalsIgnoreCase("b")) {
            System.out.println("Excellent. Choose the 'pink' or 'orange' shoe box.");
            userInput = keyboard.nextLine();

            if (userInput.equalsIgnoreCase("pink")){
                System.out.println("Great. Now choose to open the smaller 'purple' or 'gray' box.");
                userInput = keyboard.nextLine();
            }
            if (userInput.equalsIgnoreCase("purple")){
                System.out.println("Oops! You released a swarm of killer bees!");
                userInput = keyboard.nextLine();
            }
            else if (userInput.equalsIgnoreCase("gray")){
                System.out.println("Whew! You chose wisely! Keep on living!");
            }


            if (userInput.equalsIgnoreCase("orange")){
                System.out.println("Mmmm. Now choose to open the smaller 'lavender' or 'brown' box.");
                userInput = keyboard.nextLine();

            if (userInput.equalsIgnoreCase("lavender")){
                System.out.println("Kaboom! You set off the explosive!");
            }
            else if (userInput.equalsIgnoreCase("brown")){
                System.out.println("You're ALIVE!! You chose wisely! You can continue playing silly games!");
            }

            }

        }


            }
        }

















