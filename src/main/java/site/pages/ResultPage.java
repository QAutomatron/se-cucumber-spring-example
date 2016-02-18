package site.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

/**
 * Result Page
 */
@Component
public class ResultPage extends Page{

    @FindBy(css = ".map-search")
    private WebElement mapSearchBlock;

    @FindBy(id = "header-search-form")
    private WebElement headerSearchFormField;

    @FindBy(id = "map-search-checkin")
    private WebElement mapCheckInField;

    @FindBy(id = "map-search-checkout")
    private WebElement mapCheckOutField;

    /**
     * Check if Result Page is opened
     * @return boolean
     */
    public boolean isPageOpened() {
        return waitForElementPresent(mapSearchBlock);
    }

    /**
     * Get value of check-out field
     * @return value
     */
    public String getCheckOutFieldValue() {
        return getValue(mapCheckOutField);
    }

    /**
     * Get value of check-in field
     * @return value
     */
    public String getCheckInFieldValue() {
        return getValue(mapCheckInField);
    }

    /**
     * Get value of header search form field
     * @return value
     */
    public String getFormHeaderFieldValue() {
        return getValue(headerSearchFormField);
    }
}

