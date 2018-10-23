import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassWork {
    public void ex1() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void ex2() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


    public void ex3() {
        for (char i = 'А'; i <= 'Я'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ex4() {
        for (char i = 'я'; i >= 'б'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ex5() {
        for (int i = 0; i <= 90; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ex6() {
        for (int i = 90; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ex7() {
        for (int i = -10; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ex8() {
        int index = 0;
        while (index <= 20) {
            System.out.print(index + " ");
            index++;
        }
        System.out.println();
        do {
            System.out.println("while");
            System.out.println("do while " + index);
        }
        while (index < 21);
    }

//    public void ex9 (){
//        System.out.println("while");
//    }

    public void ex9() {
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                if ((i == 0) || (y == 0) || (i == 3) || (y == 3)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public void ex10 (){
        BufferedReader reader;
        try {
            reader =new BufferedReader(new InputStreamReader(System.in));
            int i=0, sum=0;
            while (i<4) {
                System.out.println("Введите число");
                String a1 = reader.readLine();
                int a1_int = Integer.parseInt(a1);
                sum = sum + a1_int;
                i++;
            }
            System.out.println("Сумма равна "+sum);
        }
        catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        }
        catch (IOException e) {
        }
        }
}


