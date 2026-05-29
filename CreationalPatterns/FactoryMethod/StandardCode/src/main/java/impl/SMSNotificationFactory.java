package impl;
import intf.NotificationFactory;
import intf.Notification;
import impl.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
