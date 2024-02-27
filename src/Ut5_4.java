import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ut5_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<String> productos=new HashSet<>();
        String producto = null;
        int casos;
        do {
            System.out.println("Pedidos:");
            casos= sc.nextInt();
            if (casos>150000){
                casos=0;
                System.out.println("No puede haber mas de 150 mil productos");
            }
            for (int i=0; i<casos;i++){
                if (i==0){
                    sc.nextLine();
                }
                producto= sc.nextLine();
                producto=producto.toLowerCase().strip();
                productos.add(producto);
            }
            System.out.println(productos.size());
        }while (casos!=0);

    }
}
