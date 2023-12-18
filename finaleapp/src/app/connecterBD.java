

package app;
import java.sql.*;

public class connecterBD {
    Connection con;
      public connecterBD(){
          if (con==null){
          
          String url ="jdbc:mysql://localhost/";
          String dbName="student";
          String drives="com.mysql.jdbc.Driver";
          String userName="root";
          String password="";
          
          }
                  try{
          Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connexion");
          }catch(ClassNotFoundException e){
              System.out.println("echec dalkjj");
          }
         try{
         this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/student","root","");
                 } catch(SQLException e){ 
                  System.out.println("echec");
                 }
          
   }
      Connection obtenirconnection(){
          return con;}
}
