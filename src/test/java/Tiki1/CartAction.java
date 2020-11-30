package Tiki1;

public class CartAction extends SetUp {

	public static void addItem(String add_cart_xpath, String success_message) {

		CommonAction.waitForVisible(add_cart_xpath);
		CommonAction.clickElement(add_cart_xpath);
		CommonAction.waitForVisible("//*[text()='" + success_message + "']");
	}

	public static void addItemAndViewCart(String add_cart_xpath, String success_message, String view_cart_xpath) {

		addItem(add_cart_xpath, success_message);
		CommonAction.waitForVisible(view_cart_xpath);
		CommonAction.clickElement(view_cart_xpath);
	}

	public static void checkout(String checkout_xpath) {

		CommonAction.waitForVisible(checkout_xpath);
		CommonAction.clickElement(checkout_xpath);
	}

	public static void addItemAndCheckout(String add_cart_xpath, String success_message, String view_cart_xpath,
			String checkout_xpath) {

		addItemAndViewCart(add_cart_xpath, success_message, view_cart_xpath);
		checkout(checkout_xpath);

	}

	public static void cartAccess(String cart_btn_xpath) {

		CommonAction.waitForVisible(cart_btn_xpath);
		CommonAction.clickElement(cart_btn_xpath);
	}

	public static void deleteItem(String delete_btn_xpath) {

		CommonAction.waitForVisible(delete_btn_xpath);
		CommonAction.clickElement(delete_btn_xpath);
	}

}
