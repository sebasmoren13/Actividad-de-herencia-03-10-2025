public class Empleado {


    protected String id; //Identificador único del empleado (por ejemplo: "E001")
    protected String nombre; //Nombre completo del empleado.
    protected Double salarioBase; //Salario mensual sin incluir comisiones ni bonos.




    // Vacio

    public Empleado() {
    }


    // Valores

    public Empleado(String id, String nombre, Double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }


    // getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }


    // to string

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }


    //Metodos propios

    /*calcularSalario()*/

    //Info


    public String info() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario Base: " + salarioBase;
    }







    // FIN
    public static void fin() {
        System.out.println("Gracias :) ");
    }















}
