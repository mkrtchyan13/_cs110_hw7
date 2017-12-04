import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;
public class Driver {
    public static void main(String[] args) {
        Puppy Joey = new Puppy("Joey");
        Puppy Chandler = new Puppy("Chandler");
        Puppy Ross = new Puppy("Ross");
        System.out.println(Joey.getName());
        System.out.println(Chandler.getName());
        System.out.println(Ross.getName());

        int[] a = {9, 20, 3, 44, 88, 300};
        ArrayUtils.reverse(a);
        System.out.println(ArrayUtils.stringifyArray(a));

        double forFactorial = 15.4;
        System.out.println(Math.factorial((int) forFactorial));
        System.out.println(Math.factorialLoop((int) forFactorial));
    }
}