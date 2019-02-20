import org.junit.Assert;
import org.junit.Test;

public class TestJNI {
  @Test
  public void RunTest() {
    Assert.assertEquals(JNICode.doThing(), 0);
  }
}
