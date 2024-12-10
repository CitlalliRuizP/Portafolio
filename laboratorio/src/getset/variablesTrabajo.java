
package getset;


public class variablesTrabajo {
   private static String nombrePaciente;
   private static String codigotrabajo;
   private static String descripccion;
   private static String codigo_doctor ;

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCodigotrabajo() {
        return codigotrabajo;
    }

    public void setCodigotrabajo(String codigotrabajo) {
        this.codigotrabajo = codigotrabajo;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getCodigo_doctor() {
        return codigo_doctor;
    }

    public void setCodigo_doctor(String codigo_doctor) {
        this.codigo_doctor = codigo_doctor;
    }
}
