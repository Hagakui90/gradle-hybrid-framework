package pageUIs.wordpress;

public class AdminPostSearchPageUI {
	public static final String ADD_NEW_BUTTON = "css=a.page-title-action";
	public static final String SEARCH_TEXTBOX = "css=input#post-search-input";
	public static final String SEARCH_POST_BUTTON = "css=input#search-submit";
	public static final String TABLE_HEADER_INDEX_BY_TABLE_NAME = "xpath=//table[contains(@class,'table-view-list posts')]/thead//th[@id='%s']/preceding-sibling::*";
	public static final String TABLE_ROW_VALUE_BY_HEADER_INDEX = "xpath=//table[contains(@class,'table-view-list posts')]/tbody/tr/*[%s]//a[text()='%s']";
	public static final String ROW_TITLE_DETAIL_BY_TITLE_NAME = "xpath=//table[contains(@class,'table-view-list posts')]/tbody/tr//a[text()='%s']";
	public static final String ROW_CHECKBOX_BY_TITLE_NAME = "xpath=//table[contains(@class,'table-view-list posts')]/tbody/tr/th/label[contains(text(),'%s')]/following-sibling::input";
	public static final String ACTION_DROPDOWN = "css=select#bulk-action-selector-top";
	public static final String APPLY_BUTTON = "css=input#doaction";
	public static final String MOVE_TO_BIN_MESSSAGE = "xpath=//div[@id='message']/p[contains(text(),'1 post moved to the Bin.')]";
	public static final String NO_POST_FOUND_MESSAGE = "xpath=//table[contains(@class,'table-view-list posts')]/tbody/tr/td[text()='%s']";

}
