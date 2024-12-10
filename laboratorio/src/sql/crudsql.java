package sql;

import getset.variablesClinica;
import getset.variablesDoctor;
import getset.variablesEstatus;
import getset.variablesFecha;
import getset.variablesPago;
import getset.variablesSalTrabajo;
import getset.variablesTrabajo;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class crudsql extends conexionsql {

    java.sql.Statement st;
    ResultSet rs;
    variablesTrabajo var1 = new variablesTrabajo();
    variablesClinica var2 = new variablesClinica();
    variablesDoctor var3 = new variablesDoctor();
    variablesEstatus var4 = new variablesEstatus();
    variablesSalTrabajo var5 = new variablesSalTrabajo();
    variablesFecha var6 = new variablesFecha();
    variablesPago var7 = new variablesPago();

    public void insertar(String nombrePaciente, String codigotrabajo, String descripccion, String codigo_doctor) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into trabajo(nombrePaciente,codigotrabajo,descripccion,codigo_doctor)values('" + nombrePaciente + "',"
                    + "'" + codigotrabajo + "','" + descripccion + "','" + codigo_doctor + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarClinica(Integer codigoClinica, String nombre, String direccion, String telefono) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into clinica(codigoClinica,nombre,direccion,telefono)values('" + codigoClinica + "','" + nombre + "',"
                    + "'" + direccion + "','" + telefono + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarDoctor(Integer codigoDoctor, String nombre, Integer codigo_clinica) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into doctor(codigoDoctor,nombre,codigo_clinica)values('" + codigoDoctor + "','" + nombre + "',"
                    + "'" + codigo_clinica + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarEstatus(String codigotrabajoestatus,String prueba, String terminado, String garantia, String correcion, Integer codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into trabajoEstatus(codigotrabajoestatus,prueba,terminado,garantia,correcion,codigo_trabajo)values('"+codigotrabajoestatus+"','" + prueba + "',"
                    + "'" + terminado + "','" + garantia + "','" + correcion + "','" + codigo_trabajo + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarSalTrabajo(String codigosaldotrabajo,String saldoPendiente, String pagocompleto, String saldoAfavor, Integer codigo_trabajo, Integer codigo_doctor) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into saldoTrabajo(codigosaldotrabajo, saldoPendiente,pagocompleto,saldoAfavor,codigo_trabajo,codigo_doctor)values('"+codigosaldotrabajo+"','" + saldoPendiente + "',"
                    + "'" + pagocompleto + "','" + saldoAfavor + "','" + codigo_trabajo + "','" + codigo_doctor + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarFecha(String Fprueba, String Fllegada, String Fsalida, Integer codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into fechaEstatus(Fprueba,Fllegada,Fsalida,codigo_trabajo)values('" + Fprueba + "','" + Fllegada + "',"
                    + "'" + Fsalida + "','" + codigo_trabajo + "')";

            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarPago(String FechaAbono, String abono, String abonado, Integer codigo_doctor, Integer codigo_saldoTrabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "insert into pago(FechaAbono,abono,abonado,codigo_doctor,codigo_saldoTrabajo)values('" + FechaAbono + "','" + abono + "',"
                    + "'" + abonado + "','" + codigo_doctor + "','" + codigo_saldoTrabajo + "')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardo correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo " + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
///////////////////////////////////////////////SELECT////////////////////////////////////////////////////////////////////////////////
    public void mostrarTrabajo(String codigotrabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from trabajo where codigotrabajo='" + codigotrabajo + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var1.setNombrePaciente(rs.getString("nombrePaciente"));
                var1.setCodigotrabajo(rs.getString("codigotrabajo"));
                var1.setDescripccion(rs.getString("descripccion"));
                var1.setCodigo_doctor(rs.getString("codigo_doctor"));
            } else {
                var1.setNombrePaciente(rs.getString(""));
                var1.setCodigotrabajo(rs.getString(""));
                var1.setDescripccion(rs.getString(""));
                var1.setCodigo_doctor(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarClinica(String codigoClinica) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from clinica  where codigoClinica='" + codigoClinica + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var2.setCodigoClinica(rs.getString("codigoClinica"));
                var2.setNombre(rs.getString("nombre"));
                var2.setDireccion(rs.getString("direccion"));
                var2.setTelefono(rs.getString("telefono"));
            } else {
                var2.setCodigoClinica(rs.getString(""));
                var2.setNombre(rs.getString(""));
                var2.setDireccion(rs.getString(""));
                var2.setTelefono(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarDoctor(String codigoDoctor) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from doctor  where codigoDoctor='" + codigoDoctor + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var3.setCodigoDoctor(rs.getString("codigoDoctor"));
                var3.setNombre(rs.getString("nombre"));
                var3.setCodigo_clinica(rs.getString("codigo_clinica"));
            } else {
                var3.setCodigoDoctor(rs.getString(""));
                var3.setNombre(rs.getString(""));
                var3.setCodigo_clinica(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarEstatus(String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from trabajoestatus where codigo_trabajo='" + codigo_trabajo + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var4.setCodigotrabajoestatus(rs.getString("codigotrabajoestatus"));
                var4.setPrueba(rs.getString("prueba"));
                var4.setTerminado(rs.getString("terminado"));
                var4.setGarantia(rs.getString("garantia"));
                var4.setCorrecion(rs.getString("correcion"));
                var4.setCodigo_trabajo(rs.getString("codigo_trabajo"));
            } else {
                var4.setCodigotrabajoestatus(rs.getString(""));
                var4.setPrueba(rs.getString(""));
                var4.setTerminado(rs.getString(""));
                var4.setGarantia(rs.getString(""));
                var4.setCorrecion(rs.getString(""));
                var4.setCodigo_trabajo(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarSalTrabajo(String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from saldotrabajo where codigo_trabajo='" + codigo_trabajo + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var5.setCodigosaldotrabajo(rs.getString("codigosaldotrabajo"));
                var5.setSaldoPendiente(rs.getString("saldoPendiente"));
                var5.setPagocompleto(rs.getString("pagocompleto"));
                var5.setSaldoAfavor(rs.getString("saldoAfavor"));
                var5.setCodigo_trabajo(rs.getString("codigo_trabajo"));
                var5.setCodigo_doctor(rs.getString("codigo_doctor"));

            } else {
                var5.setCodigosaldotrabajo(rs.getString(""));
                var5.setSaldoPendiente(rs.getString(""));
                var5.setPagocompleto(rs.getString(""));
                var5.setSaldoAfavor(rs.getString(""));
                var5.setCodigo_trabajo(rs.getString(""));
                var5.setCodigo_doctor(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarFecha(String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from fechaestatus where codigo_trabajo='" + codigo_trabajo + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var6.setFprueba(rs.getString("Fprueba"));
                var6.setFllegada(rs.getString("Fllegada"));
                var6.setFsalida(rs.getString("Fsalida"));
                var6.setCodigo_trabajo(rs.getString("codigo_trabajo"));
            } else {
                var6.setFprueba(rs.getString("Fprueba"));
                var6.setFllegada(rs.getString("Fllegada"));
                var6.setFsalida(rs.getString("Fsalida"));
                var6.setCodigo_trabajo(rs.getString("codigo_trabajo"));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarPago(String codigo_saldoTrabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "select * from pago where codigo_saldoTrabajo='" + codigo_saldoTrabajo + "';";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                var7.setFechaAbono(rs.getString("FechaAbono"));
                var7.setAbono(rs.getString("abono"));
                var7.setAbonado(rs.getString("abonado"));
                var7.setCodigo_doctor(rs.getString("codigo_doctor"));
                var7.setCodigo_saldoTrabajo(rs.getString("codigo_saldoTrabajo"));
            } else {
                var7.setFechaAbono(rs.getString(""));
                var7.setAbono(rs.getString(""));
                var7.setAbonado(rs.getString(""));
                var7.setCodigo_doctor(rs.getString(""));
                var7.setCodigo_saldoTrabajo(rs.getString(""));
                JOptionPane.showMessageDialog(null, "No se encontro el registro", "Sin registro", JOptionPane.INFORMATION_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el sistema de busqueda", "Error busqueda", JOptionPane.ERROR_MESSAGE);
        }
    }
//////////////////////////////////////////MODIFICAR/////////////////////////////////////////////////////////////////////////////
    public void actualizarTrabajo(String nombrePaciente, String descripccion, String codigo_doctor, String codigotrabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update trabajo set nombrePaciente='" + nombrePaciente + "',descripccion='" + descripccion + "',codigo_doctor='" + codigo_doctor + "' where codigotrabajo='" + codigotrabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarClinica(String nombre, String direccion, String telefono, String codigoClinica) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update clinica set nombre='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono + "' where codigoClinica='" + codigoClinica + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarDoctor(String nombre, String codigo_clinica, String codigoDoctor) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update doctor set nombre='" + nombre + "',codigo_clinica='" + codigo_clinica + "' where codigoDoctor='" + codigoDoctor + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarEstatus(String codigotrabajoestatus,String prueba, String terminado, String garantia, String correcion, String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update trabajoestatus set codigotrabajoestatus='"+codigotrabajoestatus+"',prueba='" + prueba + "',terminado='" + terminado + "',garantia='" + garantia + "',correcion='"+correcion+"' where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void actualizarSalTrabajo(String codigosaldotrabajo,String saldoPendiente, String pagocompleto, String saldoAfavor, String codigo_doctor, String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update saldotrabajo set codigosaldotrabajo='"+codigosaldotrabajo+"',saldoPendiente='" + saldoPendiente + "',pagocompleto='" + pagocompleto + "',saldoAfavor='" + saldoAfavor + "',codigo_doctor='"+codigo_doctor+"' where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarFecha(String Fprueba, String Fllegada, String Fsalida, String codigo_trabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update fechaestatus set Fprueba='" + Fprueba + "',Fllegada='" + Fllegada + "',Fsalida='" + Fsalida + "' where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarPago(String FechaAbono, String abono, String abonado, String codigo_doctor, String codigo_saldoTrabajo) {
        try {
            Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "update pago set FechaAbono='" + FechaAbono + "',abono='" + abono + "',abonado='" + abonado + "',codigo_doctor='"+codigo_doctor+"' where codigo_saldoTrabajo='" + codigo_saldoTrabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /////////////////////////////////////////Delete/////////////////////////////////////////////////////////////////////////////////
    public void eliminarTrabajo(String codigotrabajo){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from trabajo where codigotrabajo='" + codigotrabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarClinica(String codigoClinica){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from clinica where codigoClinica='" + codigoClinica + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarDoctor(String codigoDoctor){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from doctor where codigoDoctor='" + codigoDoctor + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarEstatus(String codigo_trabajo){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from trabajoestatus where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarSalTrabajo(String codigo_trabajo){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from saldotrabajo where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarFecha(String codigo_trabajo){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from fechaestatus where codigo_trabajo='" + codigo_trabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarPago(String codigo_saldoTrabajo){
        try{
        Connection conexion = conectar();
            st = conexion.createStatement();
            String sql = "delete from pago where codigo_saldoTrabajo='" + codigo_saldoTrabajo + "';";
            st.executeUpdate(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se elimino", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
