package ejemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pedir_datos {
    public static Scanner leerInt= new Scanner (System.in);
    public static Scanner leerString= new Scanner (System.in);
    public static Scanner leerFloat= new Scanner(System.in);

    public static int numSwitch(){
        int num=0;
        boolean on= true;

        while(on){
            try{
                System.out.println("Elija una de las opciones");
                num=leerInt.nextInt();
                on=false;

            }catch (InputMismatchException e){
                leerInt.next();
                System.err.println("Error, inserte un número");
            }
        }

        return num;
    }
    public static String nuevoNombre(boolean primeraVez){
        String nombre="";

            System.out.println("Inserte un nuevo nombre");
            nombre= leerString.nextLine();

            if(primeraVez){
                System.out.println("\nPerfecto "+nombre+"! Encantado de conocerte\n");
            }else{
                System.out.println("\nSí, '"+nombre+"' es un nombre que va más con tu personalidad\n");
            }

        return nombre;

    }

    public static float nuevaCantidad(){
        float cantidad;
        System.out.println("Inserte una cantidad:");

        bucle: while (true) {

            try {
                    cantidad=leerFloat.nextFloat();

                    if (cantidad<0){
                        System.err.println("Debe insertar una cantidad positiva");
                    }else{
                        break bucle;
                    }

            }catch (InputMismatchException e){
                System.err.println("Entrada no válida. \nPor favor, introduzca un número en formato decimal con coma, por ejemplo: 0, 0,0 o 0,00.");
                leerFloat.next();
            }
        }

        return cantidad;
    }

}
