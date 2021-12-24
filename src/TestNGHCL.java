package mypackage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGHCL {
  @Test(priority=2)
  public void test2() {
	  System.out.println("Running Test 2");
  }
  @Test(priority=4)
  public void test4() {
	  System.out.println("Running Test 4");
  }
  @Test(priority=1)
  public void test1() {
	  System.out.println("Running Test 1");
  }
  @Test(priority=3)
  public void test3() {
	  System.out.println("Running Test 3");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Running Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Running Test");
  }

}
