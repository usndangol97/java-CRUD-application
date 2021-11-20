package jdbc1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppDelete {
    private static final String Delete_Query = "Delete from people where id=?";

    public static void main(String[] args){
        try{
            PreparedStatement prepStatement = App.getConnection().prepareStatement(Delete_Query);
            prepStatement.setInt(1,23);

            int rowAffected = prepStatement.executeUpdate();
            if(rowAffected>0){
                System.out.println(rowAffected+ " data deleted sucessfuly");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
