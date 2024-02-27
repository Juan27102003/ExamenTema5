import java.time.LocalDate;
import java.util.*;

public class Ut5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Producto,LocalDate> almacen = new LinkedHashMap<>();
        int dia,mes,anyo;
        String codigo;
        LocalDate aux = null;
        do {
            codigo=sc.next();
            Producto p=new Producto(codigo);
            if (!codigo.equalsIgnoreCase("fin")){
                dia=sc.nextInt();

                mes=sc.nextInt();

                anyo=sc.nextInt();
                LocalDate fecha = LocalDate.of(anyo,mes,dia);
                if (!almacen.containsKey(p)){
                    almacen.put(p,fecha);
                    System.out.println("Nuevo producto. Registrado");
                }else if (almacen.containsKey(p) && !almacen.containsValue(fecha)){
                    almacen.replace(p,fecha,fecha);
                    System.out.println("Producto existente. Actualizado");
                } else if (almacen.containsKey(p) && almacen.containsValue(fecha)) {
                    System.out.println("Producto existente. No se actualiza");
                }
            }

        }while (!codigo.equalsIgnoreCase("fin"));
        System.out.println("LISTADO DEL ALMACEN");
        for (Map.Entry<Producto,LocalDate> o: almacen.entrySet()) {
            System.out.println(o);
        }

    }
}
