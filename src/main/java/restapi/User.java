package restapi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String userName;
    String password;
    String emailId;
    public User(String userName,String password,String emailId){
        this.userName=userName;
        this.password=password;
        this.emailId=emailId;
    }
    @Override
    public String toString() {
        return "User{" +
                "Username=" + userName +
                ", Password='" + password + '\'' +
                ", Email Id='" + emailId + '\'' +
                '}';
    }
}
