package code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class Testing {
@Rule
public ExpectedException exception=ExpectedException.none();
public Verification v;
@Before
public void beforecoding()
{
v=new Verification();	

}
@Test
public void testerJour()
{
Assert.assertEquals(true, v.verifJour(12));	

}
@Test
public void testerMois()
{
Assert.assertEquals(true,v.verifmois(11));	

}
@Test
public void Testannee()
{
	Assert.assertEquals(true, v.verifAnne("2021"));

}
@Test
public void detectAnne()
{
	exception.expect(NumberFormatException.class);
	v.convertAnnee("202a");

}
@Test
public void TesteJour()
{
Assert.assertEquals(true,v.verifjours(31,3, 2020));	

}
}
