public class Hw1 {

    public static String Part1 (int x,int y){
        if (x > 0)  {
            if (y > 0)
                return "Первая четверть";
            else
                return "Четвертая четверть";
        }
        else {
            if (y > 0)
                return "Вторая четверть";
            else if (x==0 & y==0)
                return "Начало осей координат";
            else
                return "Третья четверть";
        }
    }

    public static String Part2 (float a, float b){
        String vv;
        if (a%2==0)
            return vv="Произведение "+a+" на "+b+" равно "+a*b;
        else
            return "Сумма чисел "+a+" и "+b+" равно "+(a+b);
    }

    public static int Part3(int a, int b, int c){
        int sum=0;
        if (a>=0) sum=sum+a;
        if (b>=0) sum=sum+b;
        if (c>=0) sum=sum+c;
        return sum;

    }

    public static int Part4(int a, int b, int c){
        int sum=0, mult=1;
        if ((a+b+c)>(a*b*c))
                return a+b+c+3;
        else
                return a*b*c+3;
    }

    public static String Part5 (int bal){
        if ((bal>=0) && (bal<20)) return "F";
        if ((bal>19) && (bal<40)) return "E";
        if ((bal>39) && (bal<60)) return "D";
        if ((bal>59) && (bal<75)) return "C";
        if ((bal>74) && (bal<90)) return "B";
        if ((bal>89) && (bal<=100)) return "A";
        return "Введите значение от 0 до 100";
    }


}
