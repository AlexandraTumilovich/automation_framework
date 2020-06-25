package project.by.stormnet.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.UserService;

public class UserTest {
   //private UserService userService = new UserService();

    @Test(priority=3)
    public void getMyUser(){
        UserService userService = new UserService();
        Response response = userService.getSingleUser();
        int code = response.getCode();
        Assert.assertTrue(code==200, "User is not created!");
    }

    @Test(priority=2)
    public void createMyUser(){
        UserService userService = new UserService();
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        Response response = userService.createUser(body);
        int code = response.getCode();
        System.out.println(response.getBody());
        Assert.assertTrue(code==201, "User is not created!");
    }

    @Test(priority=1)
    public void updateMyUser(){
        UserService userService = new UserService();
        String body = "{\"name\": \"morpheus\",\"job\": \"zion resident\"}";
        Response response = userService.updateUser(body);
        int code = response.getCode();
        Assert.assertTrue(code==200, "User is not updated!");
    }

    @Test(priority=4)
    public void deleteMyUser(){
        UserService userService = new UserService();
        Response response = userService.deleteUser();
        int code = response.getCode();
        Assert.assertTrue(code==204, "User is not deleted!");
    }


}
