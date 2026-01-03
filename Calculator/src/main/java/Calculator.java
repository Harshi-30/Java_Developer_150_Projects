import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("-------choose Any One-------" +
                    "\nAddition choose 1" +
                    "\nSubtraction choose 2 \n" +
                    "Multiplication choose 3\n" +
                    "Modulo choose 4\n" +
                    "Division choose 5\n" +
                    "Enter -1 to exit\n" +
                    "Enter your choice:");
            int choice = sc.nextInt();
            if (choice == -1){
                System.out.println("Thank you for using the calculator");

                break;
            }
            if(choice <= 1||choice >= 5){
                System.out.println("Invalid choice");
                continue;
            }
            System.out.print("Enter the 1st number:");
            float a = sc.nextFloat();
            System.out.print("Enter the 2nd number:");
            float b = sc.nextFloat();
            System.out.println("Answer is: "+operation(a,b,choice));

        }

    }
    public static float operation(float a,float b,int choice){
        return switch (choice){

            case 1-> a+b;
            case 2-> a-b;
            case 3-> a*b;
            case 4-> {
                if(b != 0){
               yield  a%b;
            }else {
                    System.out.println("Modulo by zero not allowed");
                yield 0.0f;
                }
            }
            case 5-> {
                if(b != 0){
                    yield a/b;
                }else {
                    System.out.println("Division by zero not allowed");
                    yield 0.0f;
                }

            }

            default -> {
                System.out.println("Invalid choice");
               yield  0.0f;
            }
        };

    }
}
