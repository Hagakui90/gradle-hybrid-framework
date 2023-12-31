package pageUIs.wordpress;

public class UserHomePageUI {
	public static final String POST_TITLE_TEXT = "xpath=//article//h2/a[text()='%s']";
	public static final String POST_CURRENT_DATE_TEXT_BY_POST_TITLE = "xpath=//article//a[text()='%s']/parent::h2/following-sibling::div//time[text()='%s']";
	public static final String POST_BODY_TEXT = "xpath=//article//a[text()='%s']/ancestor::header/following-sibling::div/p[text()='%s']";
	public static final String POST_AUTHOR_TEXT = "xpath=//article//a[text()='%s']/parent::h2/following-sibling::div//span/a[text()='%s']";
	public static final String SEARCH_TEXTBOX = "css=section.widget input.search-field";
	public static final String SEARCH_BUTTON = "css=section.widget input.search-submit";
}
