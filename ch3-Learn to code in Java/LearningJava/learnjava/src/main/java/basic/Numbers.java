package basic;

/**
 * Created by jamesshih.ilink on 29/03/2017.
 */

public class Numbers {

    public static void main(String[] args) {

        int age = 25;
        int myFavoriteSports = -50;

        int sum = 5 + 5;
        int num1 = 10;
        int num2 = 12;

        System.out.println(sum);
        System.out.println(num1 + num2);

        int different = 100 - 20;
        int product = 22 * 5;
        int divide = 15 / 5;

        System.out.println(different);
        System.out.println(product);
        System.out.println(divide);

        int modulo = 20 % 3;
        System.out.println(modulo);

        //32 bits of storage
        float bankBalance = 432.23f;

        //64 bits of storage
        double thisIsADouble = 5678.3435;

        //For big big BIG WHOLE numbers (up to around 2 billion)
        long donaldTrumpsBankAccount;

        Integer myInt = 550;
        String intStr = myInt.toString();

    }
}
