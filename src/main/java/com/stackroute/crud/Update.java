package com.stackroute.crud;

import java.sql.*;

public class Update {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public void update(int id, String name, int age, String gender){

        //Load the required drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Try to create a connection with the database
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbcdemo",
                "root", "Root@123");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Employee SET " +
                     "name='"+name+"', age='"+age+"', gender='"+gender+"' WHERE id='"+id+"'");) {

            int updated = preparedStatement.executeUpdate();

            System.out.println(updated + " rows updated");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
