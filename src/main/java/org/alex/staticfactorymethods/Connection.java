package org.alex.staticfactorymethods;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection {
    String databaseType, host, username, password;
    int port;

    private Connection(String databaseType, String host, String username, String password, int port) {
        this.databaseType = databaseType;
        this.host = host;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static Connection createMySQLConnection(String username, String password, String host) {
        return new Connection("MySQL", host, username, password, 3306);
    }

    public static Connection createPostgreSQLConnection(String username, String password, String host) {
        return new Connection("PostgreSQL", host, username, password, 5432);
    }

    public static Connection createMongoConnection(String username, String password, String host) {
        return new Connection("MongoDB", host, username, password, 27017);
    }
}
