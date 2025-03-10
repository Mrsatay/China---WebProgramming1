import java.util.Scanner;

class InputScanner{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter your Name: ");
        String name = myObj.nextLine();
        System.out.print("Please enter your Student ID: ");

        int id = myObj.nextInt();

        System.out.println("My name is: "+ name);
        System.out.println("My Student ID is: "+ id);
    }
}