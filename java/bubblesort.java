import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bubblesort {

    public static List<Double> bubblesortfnc(double[] array) {
        List<Double> al = Arrays.asList(array);

        for(int i=0; i<al.size(); i++) {
            for(int j=0; j<al.size()-i; j++) {
                if(al.get(i) > al.get(j)){
                    Double temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
        return al;

    }
    public static void main(String args[]) {
        System.out.print("Start");

        double input[] = {5,4,3,2,1};
        System.out.println(bubblesortfnc(input));
    }
}