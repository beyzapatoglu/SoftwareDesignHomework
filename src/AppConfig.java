public class AppConfig {

    private static AppConfig instance = new AppConfig();

    private String universityName =
            "Istanbul Aydin University";

    private double deliveryFee = 25.0;

    private String version = "1.0";

    private AppConfig() {

    }

    public static AppConfig getInstance() {
        return instance;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public String getVersion() {
        return version;
    }
}