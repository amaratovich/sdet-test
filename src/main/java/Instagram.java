import java.util.ArrayList;
import java.util.List;

public interface Instagram {
    List<Instagram> dataBase = new ArrayList<>();

    void subscribe(Instagram sender);

    void unsubscribe(String id);

    int getSubscribers();

    String getUserId();

    static void subscribe(Instagram requestRecipient, Instagram requestSender) {
        requestRecipient.subscribe(requestSender);
    }

    static void unsubscribe(Instagram requestRecipient, String userId) {
        requestRecipient.unsubscribe(userId);
    }

    static void setUserToDataBase(Instagram user) {
        dataBase.add(user);
    }
}
