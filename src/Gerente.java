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
        return super.toString()+"Gerente{" +
                "bonoFijo=" + bonoFijo +
                ", empleadoACargo=" + empleadoACargo +
                '}';
    }


    //Metodos propios

    public double calcularIncentivoLiderazgo() {
        if (empleadoACargo > 10) {
            return 0.05 * salarioBase;
        }
        return 0;
    }

    public double calcularSalario() {
        return salarioBase + bonoFijo + calcularIncentivoLiderazgo();
    }




    @Override



    public String info() {
        double incentivo = calcularIncentivoLiderazgo();
        double salarioFinal = calcularSalario();
        return  ", Bono Fijo: " + bonoFijo +
                ", Empleados a Cargo: " + empleadoACargo +
                ", Incentivo Liderazgo: " + incentivo + ", Salario Final: " + salarioFinal;
    }







}
