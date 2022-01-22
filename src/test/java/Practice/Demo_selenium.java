package Practice;

import org.junit.*;

public class Demo_selenium {
	@Before
	public void before() {
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println("Test1");
	}
	@After
	public void after() {
		System.out.println("After Method");
	}
}
