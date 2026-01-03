import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = src.nextLine().trim();
        if(name.isEmpty()){
            System.out.println("Hello,"+"Guest!");
        }else{
            System.out.printf("Hello,%s! ",name);
        }

    }
}
