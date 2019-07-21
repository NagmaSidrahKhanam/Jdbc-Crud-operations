package com.stackroute.crud;

import java.sql.*;

public class Create {
    private Connection connection;
    private Statement statement;


    public void create(int id,String name,int age, String gender)
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
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Employee VALUES " +
                     "('"+id+"','"+name+"','"+age+"','"+gender+"')");) {

            int created = preparedStatement.executeUpdate();

            System.out.println(created + " row inserted");

        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
