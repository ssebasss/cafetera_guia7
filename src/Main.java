import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ServicioCafe svc = new ServicioCafe();

        boolean bandera=false;
        int opciones, opcionServido = 0;

        while (bandera==false){
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir cafe");
            System.out.println("3. Vaciar Cefetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. mostrar cantidad de Cafe");
            System.out.println("6. Cerrar negocio");
            opciones = sc.nextInt();
            switch (opciones){
                case 1: svc.llenarCafetera();
                    System.out.println("la cantidad dsp de llenar es "+ svc.cantidadActual);
                    System.out.println("");
                break;
                case 2:
                    do {
                        System.out.println("-------sub menu---------");
                        System.out.println("1. Taza de 150cc");
                        System.out.println("2. Taza de 250cc");
                        System.out.println("3. Taza de 350cc");
                        opcionServido = sc.nextInt();
                        switch (opcionServido){
                            case 1: svc.servirTaza(150);break;
                            case 2: svc.servirTaza(250);break;
                            case 3: svc.servirTaza(350);break;
                            default:
                                System.out.println("Intente de nuevo");
                        }
                    }while (opcionServido != 1 && opcionServido!= 2 && opcionServido!= 3 );
                    System.out.println("opcion inválida, intente de nuevo.");
                    break;
                case 3:svc.vaciarCafertera();
                    System.out.println("La cafetera se veció changuito...");break;
                case 4:
                    System.out.println("ingresa la cantidad de cafe que tenes recien hecho");
                    int cafe=sc.nextInt();
                    svc.agregarCafe(cafe);break;
                case 5:
                    System.out.println("el contenido de la cafetera es ");break;
                case 6 :System.out.println("Saliendo");
                  bandera = true; break;
                default:
                    System.out.println("ingrese opcion correcta");

            }
            if (bandera==true){
                System.out.println("genial saliste de la cafetera, cerra bien la puerta");
            }
        }
    }
}