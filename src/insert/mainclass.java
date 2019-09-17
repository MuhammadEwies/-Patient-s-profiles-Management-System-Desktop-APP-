package insert;

import java.sql.SQLException;



public class mainclass {
    public static myconnection  connect_and_excute = new myconnection();
    
    public static void main(String args []  ) throws ClassNotFoundException, SQLException
    {   
        
       MacIp ip = new MacIp();
       //if(ip.mac_value())
       //{
       login n = new login();
       connect_and_excute.connect_fuction();
      // }
    }   
    
}