package domain;

/**
 *
 * @author enriq
 */
public class Empleado extends Persona{
    private int idEpmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEpmpleado = ++Empleado.contadorEmpleado;
    }

    public int getIdEpmpleado() {
        return this.idEpmpleado;
    }

    public void setIdEpmpleado(int idEpmpleado) {
        this.idEpmpleado = idEpmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEpmpleado=").append(idEpmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
 
}
