package Friends;

import java.util.ArrayList;

public class Friends {
    String[] myFriends = {"Vasy", "Sasha", "Mary", "Ann"};
    ArrayList myFriendsVar = new ArrayList();

    Friends() {
        for (var friend : myFriends) {
            myFriendsVar.add(friend);
        }
    }
    void addNewFriend(String friend) {
        myFriendsVar.add(friend);
    }
}
