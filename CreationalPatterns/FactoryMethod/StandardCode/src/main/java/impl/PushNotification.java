package impl;
import intf.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[Push] Sending: " + message);
    }
}
