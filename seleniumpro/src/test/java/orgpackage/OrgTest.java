package orgpackage;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void orgTestt() {

	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}

	@Test
	public void test1() {
		System.out.println("create org test");
	}
	
	@Test
	public void test2() {
		System.out.println("create test2");
	}
	
	@Test
	public void test3() {
		System.out.println("create test3");
	}
	
	@Test
	public void test4() {
		System.out.println("execute test4");
	}
}
