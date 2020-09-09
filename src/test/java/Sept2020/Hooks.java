package Sept2020;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends UtilsPage{

    //BrowserSelector browserSelector = new BrowserSelector();

    BrowserSelectore2 browserSelectore2 = new BrowserSelectore2();

@Before
public void setupBrowser(){


browserSelectore2.setUpBrowser();

manageWindow();
manageTimeoutImplicity();
openNopCommerce();

}
@After
public void closeBrowser(Scenario scenario){


    if(scenario.isFailed()){

        UtilsPage.takeSnapShot(scenario.getName());

    }


driver.quit();

}


}
