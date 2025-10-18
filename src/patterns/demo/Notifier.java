package patterns.demo;

/**
 * Observer interface for receiving notifications when a TodoItem is added.
 */
public interface Notifier {
    void notifyNew(TodoItem item);
}
