package Configuration;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.awt.Window;
import static java.awt.Window.getWindows;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public final class Configuration {
    public static boolean isLoggedIn=false;
    public static String loggedUser="";
    private static final String User_Name="root";
    private static final String Password="";
    private static final String Con_str="jdbc:mysql://127.0.0.1/hospitalmanagementsystem";
    private static Connection con;
    private static PreparedStatement ps;
    public static Connection GetConnection(){
        try{
            return (Connection) DriverManager.getConnection(Con_str, User_Name, Password);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", Type.ERROR);
        }
        return null;
    }
    public static boolean IsEmailValid(String email){
        String regx="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(email.matches(regx))
            return true; 
        else{
            JOptionPane.showMessageDialog(null, "Invalid Email Address");
            return false;
        }
    }
    public static boolean IsPhoneNumberValid(String phoneNumber){
        String regx="^(?:\\+88|01)?\\d{11}$";
        if(phoneNumber.matches(regx))
            return true;
        else{
            JOptionPane.showMessageDialog(null, "Invalid phone number");
            return false;
        }
    }
    public static boolean IsDateValid(String dateOfBirth){
        String regx="^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        if(dateOfBirth.matches(regx))
            return true;
        else{
            JOptionPane.showMessageDialog(null, "Invalid Date");
            return false;
        }        
    }
    public static ResultSet GetOrganizationalDataByType(String type){
        try{
            con=Configuration.GetConnection();
            ps=con.prepareStatement("Select Name, Value from organizationalconfig where Type='"+type+"'");
            return ps.executeQuery();
        }
        catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
        
    }
    public static void Logout(){
        Configuration.isLoggedIn=false;
        Configuration.loggedUser="";
        Window[] windows = getWindows();

    for (Window window : windows)
    {
        if (window instanceof JFrame)
        {
            window.dispose();
        }
    }
        new UserLogin().setVisible(true);
    }
    public static class UserType{
        public static final int Admin=1;
        public static final int Doctor=2;
        public static final int DoctorAssistant=3;
        public static final int Reciptionist=4;
    }
}
