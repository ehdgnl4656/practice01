import java.util.logging.Logger;


public class TestMain {
    static Logger logger = Logger.getLogger(TestMain.class.getName());

    public static void main(String[] args) {
        System.out.println("Test1");
        logger.info("My Message");  // Compliant, output via logger
    }
}
