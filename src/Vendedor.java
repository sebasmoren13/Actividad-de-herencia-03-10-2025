public class Vendedor extends Empleado{


    protected double ventasMensuales; //Monto total vendido durante el mes.
    protected double porcentajeComision; /*Porcentaje de comisión sobre las ventas (ejemplo: 0.05 = 5%).*/


    // Vacio

    public Vendedor() {
    }


// Valores

    public Vendedor(String id, String nombre, Double salarioBase, double porcentajeComision, double ventasMensuales) {
        super(id, nombre, salarioBase);
        this.porcentajeComision = porcentajeComision;
        this.ventasMensuales = ventasMensuales;
    }


    // getter and setter

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }


    // to string

    @Override
    public String toString() {
        return super.toString()+ "Vendedor{" +
                "porcentajeComision=" + porcentajeComision +
                ", ventasMensuales=" + ventasMensuales +
                '}';
    }


//Metodos propios


public double calcularBonificacionPorMeta() {
    if (ventasMensuales > 5000000) {
        return 0.1 * ventasMensuales;
    }
    return 0;
}

    public double calcularSalario() {
        return salarioBase + (ventasMensuales * porcentajeComision) + calcularBonificacionPorMeta();
    }


    @Override

    public String info() {
        double comision = ventasMensuales * porcentajeComision;
        double bono = calcularBonificacionPorMeta();
        double salarioFinal = calcularSalario();
        return ", Ventas Mensuales: " + ventasMensuales +
                ", Comisión: " + comision + ", Bono: " + bono + ", Salario Final: " + salarioFinal;
    }






















}


