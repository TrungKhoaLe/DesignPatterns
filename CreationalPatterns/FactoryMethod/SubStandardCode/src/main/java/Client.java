public class Client {
    public void notify(String type, String message) {
        if (type.equals("EMAIL")) {
            EmailNotification n = new EmailNotification();
            n.send(message);
        } else if (type.equals("SMS")) {
            SMSNotification s = new SMSNotification();
            s.send(message);
        } else if (type.equals("PUSH")) {
            PushNotification p = new PushNotification();
            p.send(message);
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
