package project.by.stormnet.api;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.StarWarsService;

public class ApiPlanetTest {
    private StarWarsService starWarsService = new StarWarsService();

    @Test
    public void getAllPlanetsTest(){
        Response response = starWarsService.getAllPlanets();
        int code = response.getCode();
        boolean containsUser = response.getBody().contains("Janet");
        Assert.assertTrue(code==200 && containsUser, "User is not available!");

    }


}
