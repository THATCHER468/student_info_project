/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *z
 * @author MARGARET THATHER
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Db_connection extends javax.swing.JFrame {
    Connection cn;
    
    public Db_connection(){
        initComponents();
        myconnection();
    }

    private void initComponents() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void myconnection() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try{
            cn=DriverManager.getConnection("jdbc:mysql://localhost/student_information", "root", null);
            //rs.cn.PrepareStatement("select*romstudentinfo",ResultSet.TYPE_SCROLL_INSENSITIVE).executeQuery();
            //JOptionPane.showMessageDialog(null, );
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    
}


