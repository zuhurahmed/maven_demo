package be.intecbrussel;
import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MainBeer {
    public static void main(String[] args) {



        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/beers", "zuhur","zuhur2021");
            Statement statement= connection.createStatement();
            ResultSet result= statement.executeQuery("SELECT * FROM Beers WHERE ID <100");

            List<Beers> beers=new ArrayList<>(  );
            while (result.next()){
                Beers name= new Beers(result.getInt("Id"), result.getString("name"));
                beers.add(name);
                beers.forEach(System.out::println);

            }

        } catch (SQLException e) {
            e.printStackTrace( );
        }
    }
    }

