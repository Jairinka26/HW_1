public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init(){
        Hw1 hw1=new Hw1();
        System.out.println(hw1.Part1(0,1));
        System.out.println(hw1.Part2(0,0));
        System.out.println(hw1.Part3(0,0,0));
        System.out.println(hw1.Part4(1,-2,3));
        System.out.println(hw1.Part5(67));

        Hw1_cikli hw1_cikli = new Hw1_cikli();
        System.out.println("Циклы:");
        System.out.println(hw1_cikli.Part1());
        System.out.println(hw1_cikli.Part2(7));
        System.out.println(hw1_cikli.Part3_1(3));
        System.out.println(hw1_cikli.Part3_2(3));
        System.out.println(hw1_cikli.Part4(4));
        System.out.println(hw1_cikli.Part5(1204));
        System.out.println(hw1_cikli.Part6(1203));

        ClassWork cw = new ClassWork();
        cw.ex1();
        cw.ex2();
        cw.ex3();
        cw.ex4();
        cw.ex5();
        cw.ex6();
        cw.ex7();
        cw.ex8();
        cw.ex9();
        cw.ex10();
    }
}
