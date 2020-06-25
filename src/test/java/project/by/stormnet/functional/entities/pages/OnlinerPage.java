package project.by.stormnet.functional.entities.pages;

public class OnlinerPage extends AbstractPage{
    public static String onlinerLogo = "//img[@class='onliner_logo']";


    public static OnlinerPage getOnlinerPage(){
        waitForElementVisible(getElementBy(onlinerLogo));
        OnlinerPage onlinerPage = new OnlinerPage();
        return onlinerPage;
    }

    public OnlinerPage navigateToOnlinerPage(){
        openUrl(onlinerUrl);
        return getOnlinerPage();
    }

    public void clickOnCatalog(){

    }

}
