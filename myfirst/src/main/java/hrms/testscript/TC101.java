package hrms.testscript;

import org.testng.annotations.Test;

import hrms.lib.General;

public class TC101 {
	@Test
	public void tc001() {
		General obj=new General();
		obj.startup();
		obj.openurl();
		obj.login();
		obj.quit();
		
	}

}
