package site.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

/**
 * Main Page
 */
@Component
public class MainPage extends Page{

    @FindBy(id = "searchbar")
    private WebElement searchBarElement;

    @FindBy(id = "location")
    private WebElement locationInput;

    @FindBy(id = "checkin")
    private WebElement checkInInput;

    @FindBy(id = "checkout")
    private WebElement checkOutInput;

    @FindBy(id = "submit_location")
    private WebElement submitButton;

    public void open(){
        openAt("/");
    }

    /**
     * Check if Main Page is opened
     * @return boolean
     */
    public boolean isPageOpened() {
        return waitForElementPresent(searchBarElement);
    }

    /**
     * Set value in Location input field
     * @param s value
     */
    public void setLocationInput(String s) {
        typeInto(locationInput, s);
    };

    /**
     * Get value of check-out field
     * @return value
     */
    public String getCheckOutValue() {
        return getValue(checkOutInput);
    }

    /**
     * Get value of check-in field
     * @return value
     */
    public String getCheckInValue() {
        return getValue(checkInInput);
    }

    /**
     * Click Submit button
     */
    public void clickSubmitButton() {
        submitButton.click();
    }
}

