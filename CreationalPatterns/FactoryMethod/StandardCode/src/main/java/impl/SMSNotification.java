package impl;
import intf.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[SMS] Sending: " + message);
    }
}
