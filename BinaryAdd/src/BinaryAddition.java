import java.util.Scanner;

public class BinaryAddition {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your first binary number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second binary number: ");
        int num2 = scanner.nextInt();

        int cnum = num1 + num2;
        String output = "";
        String reverse = "";

        while(cnum > 0){
            if (cnum % 10 == 1){
                output += 1;
                cnum = cnum / 10;
            }
            else if(cnum % 10 == 0){
                output += 0;
                cnum = cnum /10;
            }
            else if(cnum %10 == 2){
                output += 0;
                cnum = (cnum /10) + 1;
            }else if(cnum % 10 == 3){
                output += 1;
                cnum = (cnum /10) + 1;
            }
        }

       for (int i = output.length()-1; i >= 0; i -- ){
           reverse = reverse + output.charAt(i);
        }

        System.out.println(reverse);
    }
}
