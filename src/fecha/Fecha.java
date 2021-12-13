/*
7.  Cree una clase llamada Fecha, que incluya tres piezas de información como variables de instancia 
—un mes(tipo int), un día (tipo int) y un año (tipo int). Su clase debe tener un constructor que 
inicialice las tres variables de instancia, y debe asumir que los valores que se proporcionan son correctos. 
Proporcione un método establecer y un método obtener para cada variable de instancia. 
Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/). 
Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
 */
package fecha;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Fecha {
    //atributos
    int dia, mes, ano;
    
    //metodo constructor
    Fecha() {
        this.dia=0;
        this.mes=0;
        this.ano=0;
    }
    
    //etodos setter y getter
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //creando archivo txt para almacenar los datos ingresados
    public void crearArchivo(JTable jtab){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Fecha\\src\\fecha\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jtab.getColumnCount(); i++) {
                bfw.write(jtab.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jtab.getRowCount(); i++) {
                for (int j = 0; j < jtab.getColumnCount(); j++) {
                    bfw.write(jtab.getValueAt(i, j).toString() + "           ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(null, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo." + e.getMessage());
        }
    }
    
    //llenar tabla con los registros
    public void llenarTabla(int dia, int mes, int ano, String fechaCompleta, JTable tabla) {
        int d = 0, m = 0, a = 0;
        boolean ok = false;
        try {

            if (ok == false) {
                //validar días (max 31)
                if (dia >= 1 && dia <= 31) {
                    setDia(dia);
                    d=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Día no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    d=0;
                }
                //validar mes (max 12)
                if (mes >= 1 && mes <= 12) {
                    setMes(mes);
                    m=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Mes no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    m=0;
                }
                //validar año (<2022)
                if (ano >= 1 && ano <= 2021) {
                    setAno(ano);
                    a=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Año no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    a=0;
                }
            }
               if (d==1 && m==1 && a==1) {
                fechaCompleta = dia + "/" + mes + "/" + ano;
                DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
                Object nuevaTab[] = {fechaCompleta};
                tb.addRow(nuevaTab);
                JOptionPane.showMessageDialog(null, "Registro Añadido exitosamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo añadir " + e.getMessage());
        }
    }
    
    // Eliminar datos de una tabla
    public void eliminaRegistro(JTable tabla){
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        if (tabla.getSelectedRow()>=0){
            tb.removeRow(tabla.getSelectedRow());
        } 
    }
    
    //guardar datos modificados
    public void guardarDatosModificados(JTable tabla, int filaSelec, int dia, int mes, int ano, String fechaCompleta) {
        int d = 0, m = 0, a = 0;
        boolean ok = false;
        try {
            if (ok == false) {
                //validar días (max 31)
                if (dia >= 1 && dia <= 31) {
                    setDia(dia);
                    d=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Día no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    d=0;
                }
                //validar mes (max 12)
                if (mes >= 1 && mes <= 12) {
                    setMes(mes);
                    m=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Mes no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    m=0;
                }
                //validar año (<2022)
                if (ano >= 1 && ano <= 2021) {
                    setAno(ano);
                    a=1;
                } else {
                    JOptionPane.showMessageDialog(null, "Año no aceptable", "ERROR", JOptionPane.ERROR_MESSAGE);
                    a=0;
                }
            }
               if (d==1 && m==1 && a==1) {
                fechaCompleta = dia + "/" + mes + "/" + ano;
                tabla.setValueAt(fechaCompleta, filaSelec, 0);
                JOptionPane.showMessageDialog(null, "Registro Modificado exitosamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
   
    
}
