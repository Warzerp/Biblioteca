import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int opcion = 0;
        Scanner keyboard= new Scanner(System.in);
        Biblioteca biblio= new Biblioteca("Rincón Literario");

        do {
            menuPrincipal();
            System.out.println( "Ingrese una ópcion");
            opcion = keyboard.nextInt();
            if(opcion==1){
                subMenu();
                System.out.println("Elige una opcion");
                int o1 = keyboard.nextInt();
                    if(o1==1){
                    biblio.agr
                    }if(o1==2){

                    }if(o1==3){

                    }if(o1==4){
                        break;
                    }
            }if(opcion==2){

            }if(opcion==3){

            }if(opcion==4){
                break;
            }
        }
        while (opcion!=4);
    }

    public static void menuPrincipal(){
        System.out.println("---------Menu-----------");
        System.out.println("1. Agregar Material ");
        System.out.println("2. Eliminar Material");
        System.out.println("3. Buscar Material");
        System.out.println("2. Listar Material");
        System.out.println("3. Mostrar Total de Materiales");
        System.out.println("4. Salir");
    }

    public static void subMenu(){
        System.out.println("----SubMenu--------");
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. DVD");
        System.out.println("4. Salir");
    }

}