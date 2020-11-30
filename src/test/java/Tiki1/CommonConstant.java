package Tiki1;

public class CommonConstant {

	public static final String TIKI = "http://tiki.vn/";

	// Login
	public static final String LOGIN_ICON = "//span[text()='Đăng nhập']";
	public static final String LOGIN_BTN_HOME = "//button[text()='Đăng nhập']";
	public static final String LOGIN_BTN_POPUP = "//*[@class ='ReactModalPortal']//button[text()='Đăng nhập']";
	public static final String EMAIL = "//*[@id='email']";
	public static final String PASSWORD = "//*[@id='password']";

	// Logout
	public static final String LOGOUT_BTN = "/*[text() = 'Thoát tài khoản']";

	// Home page
	public static final String LOGO = "//*[@class = 'logo']";
	public static final String ACCOUNT_BTN = "//*[text() = 'Tài khoản']";
	public static final String CART_PAGE_BTN = "//*[text()='Giỏ hàng']";

	// Search
	public static final String SEARCH_BAR = "//*[@data-view-id = 'main_search_form_input']";
	public static final String SEARCH_BTN = "//*[@data-view-id = 'main_search_form_button']";

	// Add to cart
	public static final String ADD_TO_CART_BTN = "//*[text()='Chọn mua']";

	// Cart page
	public static final String CHECKOUT_BTN = "//*[@class='cart__submit']";

}
