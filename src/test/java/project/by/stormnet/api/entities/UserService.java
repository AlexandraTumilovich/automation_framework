package project.by.stormnet.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class UserService extends AbstractService{
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String usersURL = baseUrl2 + "users/";
    private String usersURL2 = baseUrl2 + "users/2";
    private String userUpdateUrl = baseUrl2 + "users/3";

    public Response getSingleUser(){
        System.out.println("Get all users from site...");
        return client.doGet(usersURL2);
    }

    public Response createUser(String body){
        System.out.println("Creating a new user");
        return client.doPost(usersURL,body);
    }

    public Response updateUser(String body){
        System.out.println("Updating existing user");
        return client.doPut(userUpdateUrl,body);
    }

    public Response deleteUser(){
        System.out.println("Deleting existing user");
        return client.doDelete(usersURL2);
    }

}
