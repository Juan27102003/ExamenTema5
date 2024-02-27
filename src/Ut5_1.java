import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ut5_1 {
    public static void main(String[] args) {
        Random r =new Random();
        int aux=0;
        Set<Integer> primitiva=new TreeSet<>();
        for (int i=0;i<6;i++){
            primitiva.add(r.nextInt(49)+1);
        }
        System.out.println("Apuesta: "+primitiva);

    }
}
