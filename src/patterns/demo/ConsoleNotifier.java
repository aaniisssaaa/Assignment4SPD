package patterns.demo;

/**
 * Notifier that prints messages to the console.
 */
public class ConsoleNotifier implements Notifier {
    private final MessageFormatter formatter;

    public ConsoleNotifier(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void notifyNew(TodoItem item) {
        String message = formatter.format(item);
        System.out.println("[Console] " + message);
    }
}
