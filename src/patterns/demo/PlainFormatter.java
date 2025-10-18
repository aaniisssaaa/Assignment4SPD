package patterns.demo;

/**
 * Simple plain-text formatter for notifications.
 */
public class PlainFormatter implements MessageFormatter {
    @Override
    public String format(TodoItem item) {
        return String.format("Todo: %s (priority=%s)", item.getTitle(), item.getPriority());
    }
}
