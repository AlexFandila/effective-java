package org.alex.staticfactorymethods;

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

        System.out.println("Basic calc operations: " + basicCalc.getAvailableOperations());
        System.out.println("Scientific Calcultor operations " + scientificCal.getAvailableOperations());
        System.out.println("Prog Calculator operations " + progCalc.getAvailableOperations());

        System.out.println(mySQL.getDatabaseType());
        System.out.println(postgreSQL.getDatabaseType());
        System.out.println(mongoDB.getDatabaseType());
    }
}