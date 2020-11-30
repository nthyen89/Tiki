package Tiki1;

public class Search extends SetUp {

	public static void searchText(String search_bar_xpath, String text, String search_btn_xpath) {

		CommonAction.waitForVisible(search_bar_xpath);
		CommonAction.clickElement(search_bar_xpath);
		CommonAction.typeText(search_bar_xpath, text);
		CommonAction.waitForVisible(search_btn_xpath);
		CommonAction.clickElement(search_btn_xpath);

	}

	public static void selectItem(String item_xpath) {

		CommonAction.waitForVisible(item_xpath);
		CommonAction.clickElement(item_xpath);

	}

	public static void searchAndSelectItem(String search_bar_xpath, String text, String search_btn_xpath,
			String item_xpath) {

		searchText(search_bar_xpath, text, search_btn_xpath);
		selectItem(item_xpath);
	}

}
