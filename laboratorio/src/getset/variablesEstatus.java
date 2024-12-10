
package getset;


public class variablesEstatus {
   private static String codigotrabajoestatus;
   private static String prueba;
   private static String terminado;
   private static String garantia;
   private static String correcion;
   private static String codigo_trabajo;

    public static String getCodigotrabajoestatus() {
        return codigotrabajoestatus;
    }

    public static void setCodigotrabajoestatus(String codigotrabajoestatus) {
        variablesEstatus.codigotrabajoestatus = codigotrabajoestatus;
    }
   

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getTerminado() {
        return terminado;
    }

    public void setTerminado(String terminado) {
        this.terminado = terminado;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getCorrecion() {
        return correcion;
    }

    public void setCorrecion(String correcion) {
        this.correcion = correcion;
    }

    public String getCodigo_trabajo() {
        return codigo_trabajo;
    }

    public void setCodigo_trabajo(String codigo_trabajo) {
        this.codigo_trabajo = codigo_trabajo;
    }
}
