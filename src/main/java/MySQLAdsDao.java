import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;
    public MySQLAdsDao() throws SQLException {
    }

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from ads");
        List<Ad> X = new ArrayList<>();
        while (rs.next()) {
            X.add(new Ad(
                    (long)rs.getInt("id"),
                    (long)rs.getInt("user_id"),
                    rs.getString("title"),
                    rs.getString("description"))
            );
        }
        return X;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String title = ad.getTitle();
        String description = ad.getDescription();
        String query = "INSERT INTO ads(user_id, title, description) VALUES(1, '"+title+"', '"+description+"')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }
}
