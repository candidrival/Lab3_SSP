import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void MENU(){
        int choice = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            try {


                System.out.println(
                        "        Меню:           " + "\n" +
                        " 0 - Вихід               " + "\n" +
                        " 1 - Похідні         " + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("Ви вибрали вихід");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        double b = 0.7;
                        double c = -1;
                        double t = 1.2;
                        double m = 2;
                        final Function expression = new PowerFunction(1.0 / 3,
                                new Sum(new Multiplication(new Constant(m), new Tan(new Linear(t))),
                                        new Multiplication(new Constant(c), new Sin(new Linear(t)))));
                        System.out.println("f("+t+") = " + expression.calculate(t));
                        System.out.println("f'("+t+") = " + expression.derivative().calculate(t));
                        final Function expression1 = new Sum(new Multiplication(new Constant(m),
                                new Cos(new Multiplication(new Multiplication(new Constant(b), new Constant(t)),
                                        new Sin(new Linear(t))))), new Constant(c));
                        System.out.println("f("+t+") = " + expression1.calculate(t));
                        System.out.println("f'("+t+") = " + expression1.derivative().calculate(t));
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Невірне значення");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}
