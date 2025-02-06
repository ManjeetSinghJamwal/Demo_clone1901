package hrms.testscript;

import org.testng.annotations.Test;

import hrms.lib.General;

public class TC002 {
	@Test
	public void tc002() {
	General obj=new General();
	obj.startup();
	obj.openurl();
	obj.quit();

}
}