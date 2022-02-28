package be.intecbrussel;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/beers", "zuhur","zuhur2021");
            Statement statement= connection.createStatement();
            ResultSet result= statement.executeQuery("SELECT * FROM Categories");

            List<BeerCategory> categories=new ArrayList<>(  );
while (result.next()){
    BeerCategory category= new BeerCategory(result.getInt("Id"), result.getString("Category"));
categories.add(category);
categories.forEach(System.out::println);
}

        } catch (SQLException e) {
            e.printStackTrace( );
        }
    }
}
