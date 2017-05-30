package basic;

/**
 * Created by jamesshih.ilink on 29/03/2017.
 */

public class Arrays {

    public static void main(String[] args) {
        //Tom
//        int game1 = 250;
//        int gmae2 = 400;
//        int game3 = 600;

        int[] tomsAverages = new int[10];
        double[] dblArray;
        String[] names ;

        names = new String[5];
        names[0] = "John";
        names[1] = "Jacob";
        names[2] = "Jingle";
        names[3] = "Heimer";
        names[4] = "Smith";

        tomsAverages[0] = 250;
        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println("Val 1: " + tomsAverages[0]);
        System.out.println("Val 2: " + tomsAverages[1]);
        System.out.println("Val 3: " + tomsAverages[2]);

        String[] top5Cars = {
                "GTR", "Astin Martin", "Chevy Pinto", "Jaguar", "BMW"
        };

        System.out.println(top5Cars[2]);
        System.out.println(top5Cars[4]);

        System.out.println("Total Cars: " + top5Cars.length);
        System.out.println("Last Car: " + top5Cars[top5Cars.length - 1]);
    }

}
