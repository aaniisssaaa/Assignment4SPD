package patterns.demo;

/**
 * Strategy interface for formatting notification messages.
 */
public interface MessageFormatter {
    /**
     * Format a message for a todo item.
     * @param item the todo item
     * @return formatted string
     */
    String format(TodoItem item);
}
