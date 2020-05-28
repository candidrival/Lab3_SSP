import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            RunProg();
        };
        new Thread(runnable).start();
    }

    static void RunProg() {
        Menu menu = new Menu();
        menu.MENU();
    }

}


