package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.OnlinerPage;

public class OnlinerHelper extends AbstractHelper {
    private OnlinerPage onlinerPage = new OnlinerPage();

    public OnlinerHelper navigateToOnlinerPage(){
        System.out.println("Navigate to 'Onliner' page");
        onlinerPage.navigateToOnlinerPage();
        return this;
    }


}
