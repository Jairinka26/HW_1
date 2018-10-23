public class Hw1_cikli {

    public  String Part1 (){
        int y=0, sum=0;
        for (int i = 1; i < 99; i++) {
            if (i%2 ==0){
                y++;
                sum=sum+i;
            }
        }
        return "Сумма нечетных чисел равна "+sum+", а их количество "+y;
    }

    public String Part2 (int a){
        for (int i = 2; i < a ; i++) {
            if (a%i == 0)
                return "Число "+a+" не является простым";
        }
        return "Число "+a+" является простым";
    }

    public int Part3_1 (int a){
        int b=1;
        while (b*b < a) {
            b++;
        }
            if (b*b == a)
                return b;
            else
                return b-1;
    }

    public int Part3_2 (int a){
        int c1=1, c2=a;
        while ((( ( (c2-c1)/2) +c1) != c1) && (( ( (c2-c1)/2) +c1) != c2) ) {
            if ((((c2-c1)/2) +c1)* (((c2-c1)/2) +c1) > a )
                c2 = (((c2-c1)/2) +c1);
            else
                c1 = (((c2-c1)/2) +c1);
        }
        return (((c2-c1)/2) +c1);

    }

    public int Part4 (int a){
        int f=1, i=1;
        while (i<=a ) {
            f=f*i;
            i++;
        }
        return f;
    }

    public int Part5 (int a){
        int sum=0;
        while (a != 0) {
            sum=sum+a%10;
            a=a/10;
        }
        return sum;
    }

    public static int Part6 (int a){
        int a1=0,b=0;
        while (a1 != a){
            b = b*10+ a%10;
            a=a/10;
        }
        return b;
    }
}
