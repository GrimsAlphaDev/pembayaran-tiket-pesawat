package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {
    private static Connection conn;
    private static final Logger logger = Logger.getLogger(koneksi.class.getName());
    
    public static Connection getConnection(){
        if (conn == null){
            try {
                String url = "jdbc:mysql://localhost:3306/pemesanan_tiket_pesawat";
                String user = "root";
                String password = "root";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "Koneksi ke database gagal", e);
            }
        }
        return conn;
    }
}
