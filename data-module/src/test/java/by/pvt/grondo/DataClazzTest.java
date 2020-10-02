package by.pvt.grondo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import by.pvt.grodno.DataClazz;

public class DataClazzTest {

	@Test
	public void testGetters_setters () {
		
		DataClazz dataClazz = new DataClazz();
		
		dataClazz.setValue("someValue");
		
		assertEquals(dataClazz.getValue(), "someValue");
	}
	
}
