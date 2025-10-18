package patterns.demo;

/**
 * Small runner that demonstrates Observer + Strategy patterns in action.
 */
public final class DemoMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Strategy instances
        MessageFormatter plain = new PlainFormatter();
        MessageFormatter json = new JsonFormatter();

        // Observers with different formatting strategies
        ConsoleNotifier consolePlain = new ConsoleNotifier(plain);
        ConsoleNotifier consoleJson = new ConsoleNotifier(json);
        EmailNotifier emailToAlice = new EmailNotifier("alice@example.com", plain);

        todoList.addObserver(consolePlain);
        todoList.addObserver(consoleJson);
        todoList.addObserver(emailToAlice);

        // Add sample items
        todoList.addItem(new TodoItem("Buy milk", TodoItem.Priority.MEDIUM));
        todoList.addItem(new TodoItem("Pay bills", TodoItem.Priority.HIGH));

        // Demonstrate removal of observer
        todoList.removeObserver(consoleJson);
        todoList.addItem(new TodoItem("Walk the dog", TodoItem.Priority.LOW));
    }
}
