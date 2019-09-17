package insert;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class myconnection {
 private  ResultSet result ;    
 private static final String user      = "root";
 private static final String password  = "EwiesProgramming";
 private static Statement stat ;
 private static final String conction_string = "jdbc:mysql://"
         + "localhost:3306/patient"
         + "?useSSL=false";
 private Connection connect =null;
 private List<String> data = new ArrayList<String>();
 private List<String> ides = new ArrayList<String>();
 /* open and close funtion */
 ///////////////////////////////////////////////////
 //////////////////////////////////////////////////
 public void connect_fuction() throws ClassNotFoundException, SQLException
 {
     try{
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection(conction_string, user, password);
        stat = connect.createStatement();
        } 
        catch(SQLException e )
        {
            e.printStackTrace();
        }
     stat.execute("SET SQL_SAFE_UPDATES = 0;");
     
 }
 public void close_fuction() throws SQLException
 {
         stat.close(); 
         connect.close();   
 }
 ///////////////////////////////////////////////////////////////////
 //////////////////////////////////////////////////////////////////
 
  public void insert_function (String sql_statement) throws SQLException { 
             stat.execute(sql_statement);

    }
  
  //////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////
  public void update_and_delete_function(String sql_statement) throws SQLException
  {
      stat.execute(sql_statement);
  }
  public void  select_function_with_name_address_phone (String sql_statement) throws ClassNotFoundException, SQLException{
      
        result = stat.executeQuery(sql_statement);
        showresult ( result);
        Searchtable name_search = new Searchtable(data , ides);
        
        //I dont know her when the connection will be closed ??
        
  }
  public void showresult (ResultSet result) throws SQLException, ClassNotFoundException
   {    
       String s = new String("  ");
       while(result.next())
       {   
           String  x =result.getString("patient_id");
           ides.add(x);
           //////////////////////////////////////
           s = s.concat(String.valueOf(ides.size()));
           s = s.concat("     ");
           //////////////////////////////////////
           s = s.concat(result.getString("name"));
           s = s.concat("     ");
           s = s.concat(result.getString("age"));
           s = s.concat("     ");
           s = s.concat(result.getString("phone"));
           s = s.concat("     ");
           data.add(s);  
           s="  ";
       }
   }
  ///////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////
  
  ////////////////////////////////////////////////////////////////
  ///////////////////////////////////////////////////////////////
  //this function for the output search showing the patient data
  public void select_and_view_with_id(String sql_statement , String  your_id) throws SQLException, ClassNotFoundException{

        result = stat.executeQuery(sql_statement);
        if(result.next())
        {
            String address = result.getString("address");
            String age =     result.getString("age");
            String name =    result.getString("name");
            String gender  =  result.getString("gender");
            String history = result.getString("history");
            String date   =    result.getString("date");
            String phone  =   result.getString("phone");
            String job    =     result.getString("job");
            String status =  result.getString("status");
            searchoutput out  = new searchoutput(address , age , name , gender , history , date , phone , job, status, your_id);
        }
        } 
  ///////////////////////////////////////////////////////////////////
  /////////////////////////////////////////////////////////////////
  //this function get the last id in the data base to can insert the images in this id
  
  public int select_id (String s ) throws SQLException{
      result = stat.executeQuery(s);
      int x =0;
      if(result.next())
        {
            x = result.getInt(1);
        }
      
      return x;
    }
  //////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////
 
  
  //this function helping to get images's paths from the database 
  
  
  public ArrayList<String> get_images(String id ) throws SQLException
  {
      String sql_statement = "select images from patient.patientimages where patient_id =  "+id ; 
      ArrayList<String> imges =new ArrayList<String>();
      result = stat.executeQuery(sql_statement);
      while(result.next())
      {
          imges.add((result.getString("images")));
      }
      return imges;
  }
  
  
}
  ///////////////////////////////////////////////////
  //////////////////////////////////////////////////