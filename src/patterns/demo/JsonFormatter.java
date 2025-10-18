package patterns.demo;

/**
 * JSON-like formatter for notifications. Kept minimal to avoid external deps.
 */
public class JsonFormatter implements MessageFormatter {
    @Override
    public String format(TodoItem item) {
        return String.format("{\"title\":\"%s\",\"priority\":\"%s\"}",
                escape(item.getTitle()), escape(item.getPriority().name()));
    }

    private String escape(String s) {
        return s.replace("\"", "\\\"");
    }
}
