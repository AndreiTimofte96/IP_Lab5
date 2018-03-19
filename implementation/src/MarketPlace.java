import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class MarketPlace {
    private static MarketPlace instance = null;
    private java.util.Vector users;
    private java.util.Vector productCollection;

    private MarketPlace() {
        users = new Vector();
        productCollection = new Vector();
    }

    public static MarketPlace getInstance() {
        if (instance == null)
            instance = new MarketPlace();
        return instance;
    }

    public User getUser(Integer id) {
        ArrayList<User> list = new ArrayList<User>(users);
        for (User user : list)
            if (user.getId() == id)
                return user;
        return null;
    }

    public static void setInstance(MarketPlace instance) {
        MarketPlace.instance = instance;
    }

    public Vector getUsers() {
        return users;
    }

    public void setUsers(Vector users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Vector getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Vector productCollection) {
        this.productCollection = productCollection;
    }

    @Override
    public String toString() {
        return "MarketPlace{" +
                "users=" + users +
                ", productCollection=" + productCollection +
                '}';
    }
}