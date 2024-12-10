
package getset;


public class variablesClinica {
 private static String codigoClinica;
 private static String nombre;
 private static String direccion;
 private static String telefono;

    public String getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(String codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
