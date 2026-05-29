package impl;
import intf.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[Email] Sending: " + message);
    }
}
