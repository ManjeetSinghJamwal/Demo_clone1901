package hrms;

import org.testng.annotations.Test;

public class TestingAnnotation_Examp2 {
	
@Test
	public void login() {
		System.out.println("Login");
	}
@Test(priority=3)
	public void logout() {
		System.out.println("Logout");
	}
@Test(priority=2)
public void add() {
	System.out.println("Add");
}
@Test(priority=1)
public void Delete() {
	System.out.println("Delete");
}

}
