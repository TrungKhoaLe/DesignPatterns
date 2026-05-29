import intf.NotificationFactory;
import impl.EmailNotificationFactory;
import impl.SMSNotificationFactory;
import impl.PushNotificationFactory;

public class Client {
    public static void main(String[] args) {
        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        factory.sendNotification("Your order has been shipped!");

        factory = new SMSNotificationFactory();
        factory.sendNotification("Your OTP is 1234565");

        factory = new PushNotificationFactory();
        factory.sendNotification("You have a new message.");
        // brand new tupe - zero changes to the existing code
        //
        // factory = new SlackNotificationFactory();
        // factory.send("Daily stand up starts in 5 minutes");
        //
    }
}
