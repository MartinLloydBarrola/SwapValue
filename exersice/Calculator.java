import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:" );
        int addInput1 = scanner.nextInt();

        System.out.println("Input second number:" );
        int addInput2 = scanner.nextInt();

        System.out.println("Result for addition : " + add(addInput1,addInput2));
        System.out.println("-".repeat(30));

        System.out.println("Input first number:" );
        int minusInput1 = scanner.nextInt();

        System.out.println("Input second number:" );
        int minusInput2 = scanner.nextInt();

        System.out.println("Result for minus : " + minus(minusInput1,minusInput2));
        System.out.println("-".repeat(30));

        System.out.println("Input first number:" );
        double divisionInput1 = scanner.nextInt();

        System.out.println("Input second number:" );
        double divisionInput2 = scanner.nextInt();

        System.out.println("Result for division : " + divide(divisionInput1,divisionInput2));
        System.out.println("-".repeat(30));

        System.out.println("Input first number:" );
        int multiplyInput1 = scanner.nextInt();

        System.out.println("Input second number:" );
        int multiplyInput2 = scanner.nextInt();

        System.out.println("Result for multiplication : " + multiply(multiplyInput1,multiplyInput2));


    }

    public static int add(int firsNUmber,int secondNumber){
        return firsNUmber + secondNumber;
    }

    public static int minus(int firsNUmber,int secondNumber){
        return firsNUmber - secondNumber;
    }
    public static double divide(double firsNUmber,double secondNumber){
        return firsNUmber / secondNumber;
    }

    public static int multiply(int firsNUmber,int secondNumber){
        return firsNUmber * secondNumber;
    }

}


