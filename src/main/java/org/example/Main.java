package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/target";
        String username = "user";
        String  password = "";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement databaseCreation = connection.createStatement();
           // databaseCreation.executeUpdate("DROP DATABASE IF EXISTS JDBC_DB");
            //databaseCreation.executeUpdate("CREATE DATABASE TARGET");
           // connection = DriverManager.getConnection(url+"target");
            StudentDAO studentDAO = new StudentDAO(connection);
            Student myStudent = new Student(12,"abdul","ansari","emailabdul","9999","addrs","blr","kar","56000");
            studentDAO.create(myStudent);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}