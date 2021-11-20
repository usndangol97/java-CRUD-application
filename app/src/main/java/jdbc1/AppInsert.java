package jdbc1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppInsert {
    private static final String Insert_Query = "Insert into people(id,name,address) values(?,?,?)";

    public static void main(String[] args){
        try{
            PreparedStatement prepStatement = App.getConnection().prepareStatement(Insert_Query);
            prepStatement.setInt(1,23);
            prepStatement.setString(2,"PQR");
            prepStatement.setString(3,"Kavre");

            int rowsUpdated = prepStatement.executeUpdate();
            System.out.println("Rows updated after insert query : "+rowsUpdated);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
