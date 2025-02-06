package hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//variable
	public WebDriver driver;
	public String url = "https://ctcorphyd.com/SureshIT/login.php";
	public String un = "sureshit";
	public String psw = "sureshit";

	// obj
	public String txt_loginname = "/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
}
