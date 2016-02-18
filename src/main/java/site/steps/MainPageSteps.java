package site.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import site.pages.MainPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Steps for Main Page
 */
public class MainPageSteps {

    private static final Logger LOGGER = Logger.getLogger(MainPageSteps.class.getName());

    @Autowired
    private MainPage mainPage;

    @Given("^user is on the main page")
    public void user_is_on_the_main_page() throws Throwable {
        LOGGER.info("Step start: user in on the main page");
        mainPage.open();
        assertTrue("Main Page should be opened",
                mainPage.isPageOpened());
    }

    @And("^location is set to \"([^\"]*)\"$")
    public void locationIsSetTo(String value) throws Throwable {
        LOGGER.info(String.format("Step start: location is set to <%s>", value));
        mainPage.setLocationInput(value);
    }

    @And("^check-in date is \"([^\"]*)\"$")
    public void checkInDateIs(String value) throws Throwable {
        LOGGER.info(String.format("Step start: check-in date is <%s>", value));
        assertEquals("Wrong check-in value",
                value,
                mainPage.getCheckInValue());
    }

    @And("^check-out date is \"([^\"]*)\"$")
    public void checkOutDateIs(String value) throws Throwable {
        LOGGER.info(String.format("Step start: check-out date is <%s>", value));
        assertEquals("Wrong check-out value",
                value,
                mainPage.getCheckOutValue());
    }

    @When("^user press the Search button$")
    public void userPressTheSearchButton() throws Throwable {
        LOGGER.info("Step start: user press the Search button");
        mainPage.clickSubmitButton();
    }
}
