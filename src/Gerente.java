public class Gerente extends Empleado{






    protected double bonoFijo; // Bono mensual fijo
    protected int empleadoACargo; //Cantidad de empleados que supervisa.


    // Vacio

    public Gerente() {
    }


// Valores

    public Gerente(String id, String nombre, Double salarioBase, double bonoFijo, int empleadoACargo) {
        super(id, nombre, salarioBase);
        this.bonoFijo = bonoFijo;
        this.empleadoACargo = empleadoACargo;
    }


    // getter and setter

    public double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        this.bonoFijo = bonoFijo;
    }

    public int getEmpleadoACargo() {
        return empleadoACargo;
    }

    public void setEmpleadoACargo(int empleadoACargo) {
        this.empleadoACargo = empleadoACargo;
    }


// to string

    @Override
    public String toString() {
        return "Gerente{" +
                "bonoFijo=" + bonoFijo +
                ", empleadoACargo=" + empleadoACargo +
                '}';
    }


    //Metodos propios


   /* calcularIncentivoLiderazgo()
    o Devuelve un 5% del salario base si el gerente tiene más de 10
    empleados a su cargo.
    o Si no cumple la condición, retorna 0.*/



           /* 4. calcularSalario() (sobrescrito)
    o Calcula el salario total del gerente:
    salarioTotal = salarioBase + bonoFijo + calcularIncentivoLiderazgo()*/


/*5. info() (sobrescrito)
            • Muestra la información completa del gerente.*/









}
