package be.abis.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
public class DataSourceTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void testConnectionViaDataSource() {
        try {
            Connection c = dataSource.getConnection();
            System.out.println("Connection succeeded via "
                    + c.getMetaData().getDatabaseProductName() + ". ");
        } catch (SQLException e) {
            System.out.println("Connection failed:");
            e.printStackTrace();
        }
    }
}
