/**
 * A Singleton class ensures only one instance exists throughout the application.
 * <p>
 * These are often used for resources like configurations, loggers, or connection managers,
 * which are expensive to create and should be shared across the system.
 * </p>
 */
class Singleton {

    /**
     * Holds the single instance of {@link Singleton}, made volatile for thread safety.
     * <h3>Why {@code volatile}?</h3>
     * <ul>
     *   <li>Without {@code volatile}, threads might see a <i>partially constructed</i> object
     *       due to JVM instruction reordering.</li>
     *   <li>{@code volatile} ensures that the write of the fully constructed object happens
     *       before any thread reads it.</li>
     * </ul>
     */
    private static volatile Singleton singletonInstance;

    /**
     * Private constructor prevents external instantiation.
     */
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    /**
     * Returns the single {@link Singleton} instance.
     * Uses double-checked locking with {@code volatile} to ensure safe publication.
     * <h3>Why double-checked locking?</h3>
     * <ul>
     *   <li>First check: Avoids locking when the instance is already created.</li>
     *   <li>Second check (inside synchronized block): Ensures another thread
     *       hasn't already created the instance while waiting for the lock.</li>
     * </ul>
     *
     * <p>
     * Analogy: Think of it like a shared coffee machine in an office —
     * once built, everyone uses the same one.
     * {@code volatile} ensures you never get a "half-built" coffee machine.
     * </p>
     *
     * @return the single {@link Singleton} instance
     */
    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                    return singletonInstance;
                }
            }
        }
        return singletonInstance;
    }

    /**
     * Example action method for demonstration purposes.
     *
     * @param i an integer to include in the log
     * @return a formatted log string
     */
    public String doSomething(int i) {
        return "Log " + i;
    }
}

/**
 * Demonstrates the {@link Singleton} pattern using multiple threads.
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            Singleton singleton = Singleton.getSingletonInstance();
            System.out.println(singleton.doSomething(1));
        };

        Runnable runnable2 = () -> {
            Singleton singleton = Singleton.getSingletonInstance();
            System.out.println(singleton.doSomething(2));
        };

        Runnable runnable3 = () -> {
            Singleton singleton = Singleton.getSingletonInstance();
            System.out.println(singleton.doSomething(3));
        };

        Runnable runnable4 = () -> {
            Singleton singleton = Singleton.getSingletonInstance();
            System.out.println(singleton.doSomething(4));
        };

        Runnable runnable5 = () -> {
            Singleton singleton = Singleton.getSingletonInstance();
            System.out.println(singleton.doSomething(5));
        };

        runnable1.run();
        runnable2.run();
        runnable3.run();
        runnable4.run();
        runnable5.run();
    }
}
