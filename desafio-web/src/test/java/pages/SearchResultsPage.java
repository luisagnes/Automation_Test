package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    private final By productGrid = By.cssSelector(".features_items");
    public SearchResultsPage(WebDriver driver){
        super(driver);
    }
    public boolean hasResultsFor(String term){
        // Simple heuristic: container visible and term appears somewhere in products section
        var text = $(productGrid).getText().toLowerCase();
        return text.contains(term.toLowerCase());
    }
}
