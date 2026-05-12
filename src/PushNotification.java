public class PushNotification implements Notification {

    @Override
    public void send(String studentName, String foodName) {

        System.out.println("Sending PUSH notification...");

        System.out.println(
                "Your " + foodName +
                        " order is being prepared."
        );
    }
}