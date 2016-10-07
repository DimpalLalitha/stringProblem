import org.junit.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class StringProblemMainTest {

	@Test
	public void removeCharByFunctionTestPos() {
		String expected = "progra";
		String actual = StringProblemMain.removeCharByFunction("programm", "m");
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void removeCharByFunctionTestNeg() {
		String expected = "progra";
		String actual = StringProblemMain.removeCharByFunction("programm", "M");
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void removeCharByItrTestPos() {
		String expected = "progra";
		String actual = StringProblemMain.removeCharByItr("programm", 'm');
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void removeCharByItrTestNeg() {
		String expected = "progra";
		String actual = StringProblemMain.removeCharByItr("programm", 'M');
		Assert.assertEquals(expected, actual);
	}
}
