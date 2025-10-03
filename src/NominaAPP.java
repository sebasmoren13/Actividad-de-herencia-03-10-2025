import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class NominaAPP {
    public static void main(String[] args) {


        menu();

    }

    public static void menu() {
        Scanner menu = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        List<Empleado> lstLista = new ArrayList<>();


        int op;

        do {
            Empleado e1 = new Empleado();

            System.out.println("1. Registrar vendedor");
            System.out.println("2. Registrar Gerente");
            System.out.println("3. Listar empleados ");
            System.out.println("4. Calcular nómina total");
            System.out.println("5. Mostrar empleado con mayor salario");
            System.out.println("6. Calcular salario promedio");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("8.  Mostrar cantidad de Vendedores y Gerentes");
            System.out.println("9. Salir");



            op = menu.nextInt();


            switch (op) {

                case 1:
                    System.out.println("1. Registrar vendedor");




                    break;



                case 2:
                    System.out.println("2. Registrar Gerente");



                    break;




                case 3:

                    System.out.println("3. Listar empleados ");

                    break;



                case 4:

                    System.out.println("4. Calcular nómina total");
                    break;


                case 5:
                    System.out.println("5. Mostrar empleado con mayor salario");


                    break;



                case 6:

                    System.out.println("6. Calcular salario promedio");

                    break;



                case 7:

                    System.out.println("7. Buscar empleado por ID");

                    break;



                case 8:

                    System.out.println("8.  Mostrar cantidad de Vendedores y Gerentes");

                    break;



                case 9:


                    System.out.println("9. Salir");


                    Empleado.fin();

                    break;


                default:
                    System.out.println("Opción inválida.");

            }
        }
        while (op != 9);
    }

}
