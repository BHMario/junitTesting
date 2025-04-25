package ejemplo;

public class Menu {


    public static void menu(){
        System.out.println("Bienvenid@! Vamos a registrarnos antes de empezar :)");
        Usuario usuarioPredeterminado=new Usuario(Pedir_datos.nuevoNombre(true));

        encendido: while (true){
            mostrarOpciones();
            switch (Pedir_datos.numSwitch()){
                case 1://introducir nombre de usuario
                    System.out.println("Ha elegido: 1.- Introduce nombre de usuario");
                    usuarioPredeterminado.setNombreUsuario(Pedir_datos.nuevoNombre(false));
                    break;
                case 2://introducir ingresos
                    //sumo la cantidad ingresada al saldo
                    System.out.println("Ha elegido: 2.- Introducir ingresos");
                    usuarioPredeterminado.setSaldo(usuarioPredeterminado.getSaldo()+ Pedir_datos.nuevaCantidad());

                    break;

                case 3://introducir gasto
                    System.out.println("Ha elegido: 3.- Introducir gasto");
                    if(usuarioPredeterminado.getSaldo()>usuarioPredeterminado.getGasto()){
                        System.out.println(usuarioPredeterminado.getNombreUsuario()+", introduzca su gasto");
                        usuarioPredeterminado.setGasto(usuarioPredeterminado.getGasto()+ Pedir_datos.nuevaCantidad());
                    }else{
                        System.out.println("Lo sentimos mucho "+usuarioPredeterminado.getNombreUsuario()+", no posee el saldo suficiente");
                    }
                    break;

                case 4://mostrar saldo
                    System.out.println("Ha elegido: 4.- Mostrar saldo");
                    System.out.println(usuarioPredeterminado.getNombreUsuario()+", su saldo es de: "+ usuarioPredeterminado.getSaldo()+"€");

                    break;
                case 5:
                    System.out.println("Ha elegido: 5.- Salir\n");
                    System.out.println("Muchas gracias, hasta la próxima 😊");
                    break encendido;
                default:
                    System.out.println("Vaya, parece que esa opción no existía 😅");
                    break;

            }
        }

    }

    public static void mostrarOpciones(){
        System.out.println("1.- Introduce nombre de usuario" +
                "\n2.- Introducir ingresos" +
                "\n3.- Introducir gasto" +
                "\n4.- Mostrar saldo" +
                "\n5.- Salir");

    }

}
