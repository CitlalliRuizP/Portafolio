
package getset;


public class variablesDoctor {
   private static String codigoDoctor;
   private static String nombre;
   private static String codigo_clinica;

    public String getCodigoDoctor() {
        return codigoDoctor;
    }

    public void setCodigoDoctor(String codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo_clinica() {
        return codigo_clinica;
    }

    public void setCodigo_clinica(String codigo_clinica) {
        this.codigo_clinica = codigo_clinica;
    }
}
