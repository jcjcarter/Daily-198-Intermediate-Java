import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a number and a negative base");
        int base = scan.nextInt(), num = scan.nextInt(), fixedNum = num;

        int place = 0, resultBase10 = 0;
        while(num!=0){
            resultBase10+=(num%10*Math.pow(base, place));
            place++;
            num/=10;
            System.out.println(">>>>>>>>>>>>>>>> " + num);
        }

        System.out.println(fixedNum +" in base "+base +" is "
                + Integer.toString(resultBase10, Math.abs(base))
                +" in base "+Math.abs(base));
    }
}
