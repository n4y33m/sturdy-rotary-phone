import junit.framework.*;

public class MathUtilTest extends TestCase
{
	public MathUtilTest(String name)
	{
		super(name);
	}
	
	public void testLog2()
	{
		assertEquals(3.0, MathUtil.log2(8.0), 0.0000001);
		assertEquals(0.0, MathUtil.log2(1.0), 0.0000001);
		assertEquals(4.0, MathUtil.log2(16.0), 0.0000001);
	}
}