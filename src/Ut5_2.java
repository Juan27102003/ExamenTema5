import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ut5_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int edad;
        double media = 0;
        int aux=0;
        int contEncima=0;
        int contDebajo=0;
        ArrayList<Integer> edades=new ArrayList<>();
        do {
            edad= sc.nextInt();
            if (edad!=-1){
                edades.add(edad);
                media+=edad;
            }
            
        }while (edad!=-1);
        media=media/edades.size();
        Iterator<Integer> i= edades.iterator();
        while (i.hasNext()){
            if (i.next()<media){
                contDebajo++;
            } else contEncima++;
        }
        System.out.println("La edad media es: "+media);
        System.out.println("Hay "+contEncima+" personas por encima de la media");
        System.out.println("Hay "+contDebajo+" personas por debajo de la media");
    }
}
