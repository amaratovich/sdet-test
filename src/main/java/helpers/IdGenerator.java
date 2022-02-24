package helpers;

public class IdGenerator {
    public static String  getUniqueId() {
        String id = Long.toString(System.currentTimeMillis());
        return  id;
    }
}
