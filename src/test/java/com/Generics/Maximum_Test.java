package com.Generics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Maximum_Test {
	
	 private static final double DELTA = 1e-15;
	
	 @Test
	    public void shouldReturn_MaxIntegerValue() {
		    int maxValue=Maximum.maximum(52, 11, 21);
		    assertEquals( 52 , maxValue );
		    int maxValue1=Maximum.maximum(5, 37, 2);
		    assertEquals( 37 , maxValue1 );
		    int maxValue2=Maximum.maximum(100, 1000, 10000);
		    assertEquals( 10000 , maxValue2 );
	 }
	 
	 @Test
	    public void shouldReturn_MaxFloatValue() {
		    float maxValue=Maximum.maximum(5.5f, 3.9f, 1.4f);
		    assertEquals( 5.5f , maxValue, DELTA );
		    float maxValue1=Maximum.maximum(0.65f, 0.81f, 0.045f);
		    assertEquals( 0.81f , maxValue1, DELTA);
		    float maxValue2=Maximum.maximum(100.56f, 1000.88f, 1000.89f);
		    assertEquals( 1000.89f , maxValue2, DELTA );
	 }
	 
	 @Test
	    public void shouldReturn_MaxStringValue() {
		    String maxValue=Maximum.maximum("Peach", "Apple", "Banana");
		    assertEquals( "Peach" , maxValue );
		    String maxValue1=Maximum.maximum("dew", "new", "few");
		    assertEquals( "new" , maxValue1);
		    String maxValue2=Maximum.maximum("spicy", "sour", "sweet");
		    assertEquals( "sweet" , maxValue2);
	 }

}
