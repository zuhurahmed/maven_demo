package be.intecbrussel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class MainBrewers {
        public static void main(String[] args) {



            try {
                Connection connection= DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/beers", "zuhur","zuhur2021");
                Statement statement= connection.createStatement();
                ResultSet result= statement.executeQuery("SELECT * FROM Brewers where ID <100");

                List<Brewers> brewers=new ArrayList<>(  );
                while (result.next()){
                    Brewers name= new Brewers(result.getInt("Id"), result.getString("name"));
                    brewers.add(name);
                    brewers.forEach(System.out::println);

                }



            } catch (SQLException e) {
                e.printStackTrace( );
            }
        }
    }


