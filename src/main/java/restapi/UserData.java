package restapi;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private List<User> users;
    private static UserData instance=null;
    public static UserData getInstance(){
        if(instance==null){
            instance=new UserData();
        }
        return instance;
    }
    public UserData(){
        users=new ArrayList<User>();
        users.add(new User("a","a","a@gmail.com"));
        users.add(new User("b","b","b@gmail.com"));
        users.add(new User("c","c","c@gmail.com"));
        users.add(new User("d","d","d@gmail.com"));

    }
    public List<User> fetchUsers(){
        return users;
    }
    public User fetchUserById(String id){
        for(User user:users){
            if(user.getEmailId()==id){
                return user;
            }
        }
        return null;
    }
    public User createUser(String username,String password,String emailid){
        User newUser = new User(username, password, emailid);
        users.add(newUser);
        return newUser;
    }
    public User updateUser(String username,String password,String emailid){
        for(User user:users){
            if(user.getEmailId()==emailid){
                user.setUserName(username);
                user.setPassword(password);
                return user;
            }
        }
        return null;

    }
    public boolean deleteUser(String emailid){
        for(User user:users){
            if(user.getEmailId()==emailid){
                users.remove(user);
                return true;
            }
        }
        return false;
    }


}
