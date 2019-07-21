package com.stackroute.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public void delete(int id)
    {
        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //Try block to create a connection with the databse
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcdemo",
                "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("Delete from Employee where id='"+id+"' " );) {

            int deleted = preparedStatement.executeUpdate();

            System.out.println(deleted + " row deleted");

        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
