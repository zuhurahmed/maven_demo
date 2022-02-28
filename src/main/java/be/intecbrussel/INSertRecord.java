package be.intecbrussel;

import java.sql.*;

public class INSertRecord {
    public static void main(String[] args) {

            try {
              Connection connection = DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/beers", "zuhur", "zuhur2021");
              Statement statement = connection.createStatement( );
              
                String brewerName= " zuhur";

                int updateRecord = statement.executeUpdate("INSERT INTO Brewers(NAME)VALUE ('" + brewerName + " ')");
                String successState = updateRecord ==1? "Insert successful":"Insert failed";
                System.out.println("Update with code "+ updateRecord+ ""+successState );


            } catch (
                    SQLException e) {
                e.printStackTrace( );
            }

        }
    }
