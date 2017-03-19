package test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Sleeping extends TestCase {
	
	@Test
	public void getValue(){
		Sleeping s = new Sleeping();
		Assert.assertEquals((float)s.getValue(),(float)100,(float)0.001);
	}

}
