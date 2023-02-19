package tests;

import code.Coverage;
import org.junit.Assert;
import org.junit.Test;


public class CoverageTest {

  @Test
  public void testA() {
      Assert.assertTrue(Coverage.methodA(true));
      Assert.assertFalse(Coverage.methodA(false));
  }

  @Test
  public void testAB() {
      Assert.assertTrue(Coverage.methodAB(true,  false));
      Assert.assertTrue(Coverage.methodAB(false, true));
  }

  @Test
  public void testABC() {
      Assert.assertTrue(Coverage.methodABC(true,  false, false));
      Assert.assertTrue(Coverage.methodABC(false, true,  false));
      Assert.assertTrue(Coverage.methodABC(false, false, true));
  }

  @Test
  public void testOrAB() {
      Assert.assertTrue(Coverage.methodOrAB(true,  false));
      Assert.assertTrue(Coverage.methodOrAB(false, true));
      Assert.assertFalse(Coverage.methodOrAB(false, false));
  }

  @Test
  public void testAndAB() {
    Assert.assertTrue(Coverage.methodAndAB(true,  true));
    Assert.assertFalse(Coverage.methodAndAB(true,  false));
    Assert.assertFalse(Coverage.methodAndAB(false, true));
    Assert.assertFalse(Coverage.methodAndAB(false, false));
  }

  @Test
  public void testOrABC() {
      Assert.assertTrue(Coverage.methodOrABC(true,  true,  true));
      Assert.assertTrue(Coverage.methodOrABC(true,  false, false));
      Assert.assertTrue(Coverage.methodOrABC(false, true,  false));
      Assert.assertFalse(Coverage.methodOrABC(false, false, false));
  }

  @Test
  public void testAndABC() {
      Assert.assertTrue(Coverage.methodAndABC(true,  true,  true));
      Assert.assertFalse(Coverage.methodAndABC(true, true, false));
  }


  @Test
  public void testOrABCD() {
      Assert.assertTrue(Coverage.methodOrABCD(true,true,true,true));
      Assert.assertTrue(Coverage.methodOrABCD(false,true,true,true));
  }

  @Test
  public void testAndABCD() {
  }

}
