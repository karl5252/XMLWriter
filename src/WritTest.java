public class WritTest {
    public static void main(String[] args) {
        test configFile = new test();
        configFile.setFile("C:\\tmp\\config2.xml");
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
