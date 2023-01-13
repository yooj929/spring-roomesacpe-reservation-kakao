package nextstep;

import java.sql.SQLException;
import nextstep.console.ConsoleApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomEscapeApplication {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(RoomEscapeApplication.class, args);
        ConsoleApp.run();
    }

}
