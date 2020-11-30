package Tiki1;

public class Login extends SetUp {

	public static void login(String user, String pass, String username) {

		CommonAction.waitForVisible(CommonConstant.LOGIN_ICON);
		CommonAction.clickElement(CommonConstant.LOGIN_ICON);
		CommonAction.waitForVisible(CommonConstant.LOGIN_BTN_HOME);
		CommonAction.clickElement(CommonConstant.LOGIN_BTN_HOME);

		CommonAction.waitForVisible(CommonConstant.EMAIL);
		CommonAction.typeText(CommonConstant.EMAIL, user);
		CommonAction.waitForVisible(CommonConstant.PASSWORD);
		CommonAction.typeText(CommonConstant.PASSWORD, pass);

		// Close ads popup
		CommonAction.waitForVisible("//*[text()='bỏ qua']");
		CommonAction.clickElement("//*[text()='bỏ qua']");

		CommonAction.waitForVisible(CommonConstant.LOGIN_BTN_POPUP);
		CommonAction.clickElement(CommonConstant.LOGIN_BTN_POPUP);

		// Check login successfully
		CommonAction.waitForVisible(username);

	}

}
