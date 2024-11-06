package org.alex.singleton;

import org.alex.singleton.explanation.*;

/**
 * @author alex
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        SingletonEnum.INSTANCE.doSomething();
    }
}
