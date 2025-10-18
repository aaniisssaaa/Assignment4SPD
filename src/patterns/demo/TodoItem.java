package patterns.demo;

/**
 * Represents a single todo item.
 */
public final class TodoItem {
    private final String title;
    private final Priority priority;

    public enum Priority { LOW, MEDIUM, HIGH }

    public TodoItem(String title, Priority priority) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("title must not be empty");
        }
        this.title = title;
        this.priority = priority == null ? Priority.LOW : priority;
    }

    public String getTitle() {
        return title;
    }

    public Priority getPriority() {
        return priority;
    }
}
