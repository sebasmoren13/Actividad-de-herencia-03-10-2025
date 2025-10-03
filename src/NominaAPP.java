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

                    System.out.println("Registre el id vendedor");
                    e1.setId(teclado.next());
                    System.out.println("Registre el nombre del vendedor ");
                    e1.setNombre(teclado.next());
                    System.out.println("Registre el salarioBase  ");
                    e1.setSalarioBase(teclado.nextDouble());
                    System.out.println("Registre ventas mensuales ");
                    double ventasMensuales = teclado.nextDouble();
                    System.out.println("Registre porcentaje de comision ");
                    double porcentajeComision = teclado.nextDouble();


                    Empleado v1 = new Vendedor(e1.id, e1.nombre, e1.salarioBase, ventasMensuales, porcentajeComision);


                    lstLista.add(v1);


                    System.out.println("Registro exitoso");


                    break;


                case 2:
                    System.out.println("2. Registrar Gerente");


                    System.out.println("Registre el id Gerente");
                    e1.setId(teclado.next());
                    System.out.println("Registre el nombre del Gerente ");
                    e1.setNombre(teclado.next());
                    System.out.println("Registre el salarioBase  ");
                    e1.setSalarioBase(teclado.nextDouble());
                    System.out.println("Registre bono fijo ");
                    double bonoFijo = teclado.nextDouble();
                    System.out.println("Registre empleado a cargo");
                    int empleadoACargo = teclado.nextInt();


                    Empleado g1 = new Gerente(e1.id, e1.nombre, e1.salarioBase, bonoFijo, empleadoACargo);


                    lstLista.add(g1);

                    System.out.println("Registro exitoso");


                    break;


                case 3:

                    System.out.println("3. Listar empleados ");

                    for (Empleado e : lstLista) {




                      if (e instanceof Vendedor){
                            System.out.println(e);
                    }
                        else if (e instanceof Gerente) {
                    System.out.println(e);

                }

            }






                    break;



                case 4:

                    System.out.println("\n--- Nómina Total ---");
                    double totalNomina = 0;
                    for (Empleado e : lstLista) {
                        totalNomina += e.calcularSalario();
                    }
                    System.out.println("Nómina Total: " + totalNomina);
                    break;





                case 5:
                    System.out.println("\n--- Empleado con Mayor Salario ---");
                    Empleado mayor = null;
                    for (Empleado e : lstLista) {
                        if (mayor == null || e.calcularSalario() > mayor.calcularSalario()) {
                            mayor = e;
                        }
                    }
                    if (mayor != null) {
                        System.out.println(mayor.info());
                        System.out.println("Nombre del empleado con mayor salario: " + mayor.getNombre());
                    }
                    break;

                case 6:
                    System.out.println("\n--- Salario Promedio ---");
                    double suma = 0;
                    int contador = 0;
                    for (Empleado e : lstLista) {
                        suma += e.calcularSalario();
                        contador++;
                    }
                    if (contador > 0) {
                        System.out.println("Promedio: " + (suma / contador));
                    }
                    break;

                case 7:
                    System.out.println("\n--- Buscar Empleado por ID ---");
                    System.out.print("Ingrese el ID: ");
                    String idBuscar = teclado.next();
                    for (Empleado e : lstLista) {
                        if (e.getId().equalsIgnoreCase(idBuscar)) {
                            System.out.println(e.info());
                            System.out.println("Nombre del empleado: " + e.getNombre());
                        }
                    }
                    break;
                case 8:
                    System.out.println("\n--- Cantidad de Vendedores y Gerentes ---");
                    int contV = 0, contG = 0;
                    for (Empleado e : lstLista) {
                        if (e instanceof Vendedor) contV++;
                        if (e instanceof Gerente) contG++;
                    }
                    System.out.println("Vendedores: " + contV + " | Gerentes: " + contG);
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
