package impl;
import intf.NotificationFactory;
import intf.Notification;
import impl.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
