package org.example.app.database;

import org.example.app.utils.Constants;

import java.io.File;
import java.sql.*;

public class DBCheck {
    public static boolean isDBExists() {
        Connection connection = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(Constants.DB_URL + Constants.DB_NAME,
                    Constants.DB_USER, Credentials.DB_PASS);

            if (connection != null) {
                return false;
            } else {
                return true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return true;
        }

//        return !new File(
////                Constants.DB_DRIVER +
//                Constants.DB_URL +
//                Constants.DB_NAME).exists();
    }
}
