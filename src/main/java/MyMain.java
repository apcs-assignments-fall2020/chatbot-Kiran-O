import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //introduction
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hi "+ name + ", It's nice to meet you.");

        //knock knock joke
        System.out.println("Hey " + name +", knock knock...");
        String a = scan.next();
        System.out.println(a + "? Figs...");
        String b = scan.next();
        System.out.println("Figs your doorbell");

        //number question
        System.out.println("Can you guess what number I'm thinking of "+name+ "?");
        String number = scan.next();
        int k = Integer.parseInt(number+number);
        String num = (k + "");
        System.out.println("Close, but " +num+ " was the number I was thinking of");

        //animal question
        System.out.println("What's your favorite animal "+name+ "?");
        String animal = scan.next();
        System.out.println("Really? A "+animal +" is my favorite animal too");

        //food question
        System.out.println("Okay I've got one last question for you " +name+ " the "+animal+", what is your favorite food?");
        String food = scan.next();
        System.out.println(food+ " is really good but I wouldn't say it's my favorite");
        System.out.println("It was nice to meet you " +name+ ", see you later...");



        scan.close();
    }
}
