package org.alex.staticfactorymethods;

import org.alex.builderpattern.User;
import org.alex.builderpattern.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        // Create calculators
        Calculator basicCalc = Calculator.createBasicCalculator();
        Calculator scientificCal = Calculator.createScientificCalculator();
        Calculator progCalc = Calculator.createProgrammerCalculator();

        // Create connections
        Connection mySQL = Connection.createMySQLConnection("pepe", "pepe", "localhost");
        Connection postgreSQL = Connection.createPostgreSQLConnection("pepe", "pepe", "localhost");
        Connection mongoDB = Connection.createMongoConnection("pepe", "pepe", "localhost");

        User u = new User.UserBuilder("John", "Doe")
                .age(30)
                .email("johndoe@doe.com")
                .phoneNumber("123-456-7890")
                .build();

        // Static method factory
        System.out.println("Basic calc operations: " + basicCalc.getAvailableOperations());
        System.out.println("Scientific Calcultor operations " + scientificCal.getAvailableOperations());
        System.out.println("Prog Calculator operations " + progCalc.getAvailableOperations());

        // Static method factory
        System.out.println(mySQL.getDatabaseType());
        System.out.println(postgreSQL.getDatabaseType());
        System.out.println(mongoDB.getDatabaseType());

        // Builder test
        System.out.println(u.getAge());
        System.out.println(u.getEmail());
        System.out.println(u.getFirstName());

    }
}
