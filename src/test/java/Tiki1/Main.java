package Tiki1;

import org.testng.annotations.Test;

public class Main extends Config {

	public static final String USER = "0988521135";
	public static final String PASS = "khayen89";
	public static final String USERNAME = "//*[text()= 'Chào nguyen yen']";
	public static final String IPHONE = "iPhone 12 mini 128Gb";

	public static final String ITEM = "//*[@class='product-item' and contains(@href, 'p71201344')]";
	public static final String SUCCESS_MESSAGE = "Thêm vào giỏ hàng thành công!";
	public static final String DELETE_BTN = "//*[contains (@href, 'spid=70766396')]//ancestor::div[@class ='cart-products__desc']//*[text()= 'Xóa']";

	@Test
	public static void buy_Item() {

		// Login
		Login.login(USER, PASS, USERNAME);

		// Search item and checkout
		Search.searchAndSelectItem(CommonConstant.SEARCH_BAR, IPHONE, CommonConstant.SEARCH_BTN, ITEM);
		CartAction.addItemAndCheckout(CommonConstant.ADD_TO_CART_BTN, SUCCESS_MESSAGE, CommonConstant.CART_PAGE_BTN,
				CommonConstant.CHECKOUT_BTN);

		// Delete the item
		CommonAction.clickLogo(CommonConstant.LOGO);
		CartAction.cartAccess(CommonConstant.CART_PAGE_BTN);
		CartAction.deleteItem(DELETE_BTN);

	}

}
