package patterns.demo;

/**
 * Notifier that simulates sending an email. Keeps message creation separate from sending.
 */
public class EmailNotifier implements Notifier {
    private final MessageFormatter formatter;
    private final String recipient;

    public EmailNotifier(String recipient, MessageFormatter formatter) {
        if (recipient == null || recipient.isEmpty()) {
            throw new IllegalArgumentException("recipient must not be empty");
        }
        this.recipient = recipient;
        this.formatter = formatter;
    }

    @Override
    public void notifyNew(TodoItem item) {
        String body = formatter.format(item);
        sendEmail(recipient, "New todo created", body);
    }

    private void sendEmail(String to, String subject, String body) {
        // Simulated email sending for demo purposes. Single responsibility: prepare content here, sending
        // is represented by a single method to allow later replacement with real mail client.
        System.out.printf("[Email] to=%s subject=%s body=%s%n", to, subject, body);
    }
}
