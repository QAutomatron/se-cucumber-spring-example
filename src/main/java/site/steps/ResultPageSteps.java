package site.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import site.pages.ResultPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Steps for Result Page
 */
public class ResultPageSteps {

    private static final Logger LOGGER = Logger.getLogger(ResultPageSteps.class.getName());

    @Autowired
    private ResultPage resultPage;

    @And("^on result form check-in date is \"([^\"]*)\"$")
    public void checkInDateIs(String value) throws Throwable {
        LOGGER.info(String.format("Step start: check-in date is <%s>", value));
        assertEquals("Wrong check-in value",
                value,
                resultPage.getCheckInFieldValue());
    }

    @And("^on result form check-out date is \"([^\"]*)\"$")
    public void checkOutDateIs(String value) throws Throwable {
        LOGGER.info(String.format("Step start: check-out date is <%s>", value));
        assertEquals("Wrong check-out value",
                value,
                resultPage.getCheckOutFieldValue());
    }

    @And("^form header should be \"([^\"]*)\"$")
    public void formHeaderShouldBe(String value) throws Throwable {
        LOGGER.info(String.format("Step start: form header should be <%s>", value));
        assertEquals("Wrong form header value",
                value,
                resultPage.getFormHeaderFieldValue());
    }

    @Then("^user should be on the result page$")
    public void userShouldBeOnTheResultPage() throws Throwable {
        LOGGER.info("Step start: user should be on the result page");
        assertTrue("Result page should be opened",
                resultPage.isPageOpened());
    }
}
