package restapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    UserData userData=UserData.getInstance();

    @GetMapping("/users")
    public List<User> index(){
        return userData.fetchUsers();
    }
    @GetMapping("/users/{id}")
    public User index(@PathVariable String id){
        return userData.fetchUserById(id);
    }
    @PostMapping("/user")
    public User create(@RequestBody Map<String,String> body){
        String username=body.get("username");
        String password=body.get("password");
        String emailid=body.get("emailid");
        return userData.createUser(username,password,emailid);
    }

}
