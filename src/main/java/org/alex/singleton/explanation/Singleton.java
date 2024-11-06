package org.alex.singleton.explanation;

/**
 * @author alex
 */
public class Singleton {
    // unique instance
    private static final Singleton INSTANCE = new Singleton();

    // Private Constructor, avoid external instantiation
    private Singleton() {
        // Initialization if necessary
    }

    // Public method to access instance
    public static Singleton getInstance() {
        return INSTANCE;
    }

    // Methods...
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
