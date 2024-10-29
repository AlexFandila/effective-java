package org.alex.staticfactorymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    String type;
    List<String> availableOperations;

    private Calculator() {
        this.type = "";
        this.availableOperations = new ArrayList<>();
    }

    private Calculator(String type, List<String> availableOperations) {
        this.type = type;
        this.availableOperations = availableOperations;
    }

    public static void addBasicOperations(List<String> operations) {
        operations.addAll(Arrays.asList(
                "add",
                "substract",
                "multiply",
                "divide",
                "percentage"
        ));
    }

    public static Calculator createBasicCalculator() {
        List<String> operations = new ArrayList<>();
        Calculator.addBasicOperations(operations);
        return new Calculator("BASIC", operations);
    }

    public static Calculator createScientificCalculator() {
        List<String> operations = new ArrayList<>();
        operations.addAll(Arrays.asList(
                "sin",
                "cos",
                "tan",
                "sqrt",
                "pow",
                "log",
                "exp",
                "factorial"
        ));
        Calculator.addBasicOperations(operations);

        return new Calculator("SCIENTIFIC", operations);
    }

    public static Calculator createProgrammerCalculator() {
        List<String> operations = new ArrayList<>();
        operations.addAll(Arrays.asList(
                "AND",
                "OR",
                "XOR",
                "NOT",
                "leftShift",
                "rightShift",
                "hexToDec",
                "decToHex",
                "binToDec",
                "decToBin"
        ));
        Calculator.addBasicOperations(operations);

        return new Calculator("PROGRAMMER", operations);
    }

    public String getType() {
        return type;
    }

    public List<String> getAvailableOperations() {
        return new ArrayList<>(availableOperations);
    }
}
