import java.util.ArrayList;
import java.util.List;

public class InstagramAccount extends InstagramBase{
    private String userId;

    List<Instagram> subscribers = new ArrayList<>();

    public InstagramAccount(String username, String password, String id) throws Exception {
        super(username, password);

        this.userId = id;
    }

    @Override
    public void subscribe(Instagram sender) {
        subscribers.add(sender);
    }

    @Override
    public void unsubscribe(String id) {
        System.out.println(id + " id unsub");
        for (int i = 0; i < subscribers.size(); i++) {
                System.out.println(id.equals(userId) + " equals");
        System.out.println(userId + " userId");
            if (id.equals(userId)) {
                subscribers.remove(subscribers.get(i));
            };
        }
    }

    @Override
    public int getSubscribers() {
        return subscribers.size();
    }

    @Override
    public String getUserId() {
        return userId;
    }

}
