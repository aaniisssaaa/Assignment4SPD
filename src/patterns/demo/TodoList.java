package patterns.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages todo items and notifies registered observers when items are added.
 * Demonstrates the Observer pattern with clean method names and small methods.
 */
public class TodoList {
    private final List<TodoItem> items = new ArrayList<>();
    private final List<Notifier> observers = new ArrayList<>();

    public void addObserver(Notifier observer) {
        if (observer == null) {
            return;
        }
        observers.add(observer);
    }

    public void removeObserver(Notifier observer) {
        observers.remove(observer);
    }

    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(TodoItem item) {
        validateItem(item);
        items.add(item);
        notifyObservers(item);
    }

    private void validateItem(TodoItem item) {
        if (item == null) {
            throw new IllegalArgumentException("item must not be null");
        }
    }

    private void notifyObservers(TodoItem item) {
        for (Notifier observer : new ArrayList<>(observers)) {
            try {
                observer.notifyNew(item);
            } catch (Exception e) {
                System.err.println("Observer failed: " + e.getMessage());
            }
        }
    }
}
