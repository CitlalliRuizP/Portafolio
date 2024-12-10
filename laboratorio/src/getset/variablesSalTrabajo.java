
package getset;


public class variablesSalTrabajo {
   private static String codigosaldotrabajo;
   private static String saldoPendiente;
   private static String pagocompleto;
   private static String saldoAfavor;
   private static String codigo_trabajo;
   private static String codigo_doctor;

    public static String getCodigosaldotrabajo() {
        return codigosaldotrabajo;
    }

    public static void setCodigosaldotrabajo(String codigosaldotrabajo) {
        variablesSalTrabajo.codigosaldotrabajo = codigosaldotrabajo;
    }


    public String getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(String saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getPagocompleto() {
        return pagocompleto;
    }

    public void setPagocompleto(String pagocompleto) {
        this.pagocompleto = pagocompleto;
    }

    public String getSaldoAfavor() {
        return saldoAfavor;
    }

    public void setSaldoAfavor(String saldoAfavor) {
        this.saldoAfavor = saldoAfavor;
    }

    public String getCodigo_trabajo() {
        return codigo_trabajo;
    }

    public void setCodigo_trabajo(String codigo_trabajo) {
        this.codigo_trabajo = codigo_trabajo;
    }

    public String getCodigo_doctor() {
        return codigo_doctor;
    }

    public void setCodigo_doctor(String codigo_doctor) {
        this.codigo_doctor = codigo_doctor;
    }
}
