package jdbc1;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class AppShowDB {
    private final static String SELECT_STUDENT = "select * from people";

    public static void main(String[] args){

        try{
            //get connection with the database
            Statement statement = App.getConnection().createStatement();
            //execute sql query and sets the value of query to resultSet object
            ResultSet resultSet = statement.executeQuery(SELECT_STUDENT);

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Cannot Execute");
        }
    }
    
}
