import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class bubblesort {

    public static List<Double> bubblesortfnc(double[] array) {
        List<Double> al = new ArrayList<Double>();

        for(double d: array){
            al.add(new Double(d));
        }

        for(int i=0; i<al.size(); i++) {
            for(int j=0; j<al.size()-i-1; j++) {
                if(al.get(j) > al.get(j+1)){
                    Double temp = al.get(j);
                    al.set(j, al.get(j+1));
                    al.set(j+1, temp);
                }
            }
        }
        return al;

    }

    public static double[] genRandArr(int size, int min, int max) {
        Random rnd = new Random();
        double[] arr = new double[size];
        int i=0;
        while(i<size){
            arr[i] = rnd.nextDouble()*max;
            i++;
        }
        return arr;

    }

    public static void main(String args[]) {
        System.out.print("Start");

        double t1 = System.currentTimeMillis();
        double input[] = genRandArr(1000, 0, 100);
        System.out.println(bubblesortfnc(input));
        double t2 = System.currentTimeMillis();
        System.out.print("Time taken = "+(t2-t1));
    }
}