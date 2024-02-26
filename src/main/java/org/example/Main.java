package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/";
        String url1 = "jdbc:postgresql://localhost:5432/target";

        String username = "user";
        String  password = "";

        try {
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement databaseCreation = connection.createStatement();
            //SELECT 'CREATE DATABASE <db_name>'
            //WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = '<db_name>')
            databaseCreation.executeUpdate("DROP DATABASE IF EXISTS JDBC_DB");
            databaseCreation.executeUpdate("CREATE DATABASE TARGET");

            Connection dbconnection = DriverManager.getConnection(url+"target");
            StudentDAO studentDAO = new StudentDAO(dbconnection);
            Student myStudent = new Student(16,"abdul1","ansari1","emailabdul","9999","addrs","blr","kar","56000");
            studentDAO.create(myStudent);

            connection.close();
        } catch (SQLException e) {

        }

    }
}