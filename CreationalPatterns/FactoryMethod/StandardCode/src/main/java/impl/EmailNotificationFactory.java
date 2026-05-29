package impl;
import intf.NotificationFactory;
import intf.Notification;
import impl.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
