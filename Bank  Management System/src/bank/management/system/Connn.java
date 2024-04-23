package bank.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","raushanR@123");
           statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
