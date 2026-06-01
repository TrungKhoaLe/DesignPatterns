public class Main {
    public static void main(String[] args) {
        Client service = new Client();
        service.notify("EMAIL", "Your order has been shipped.");
        service.notify("SMS", "Your OTP is 1234565");
        service.notify("PUSH", "You have a new message");
    }
}
