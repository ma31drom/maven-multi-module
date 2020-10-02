package by.pvt.grodno.service;

import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.pvt.grodno.DataClazz;

public class DataServiceTest {

	private DataService service;

	@Mock
	private DataClazz dataClazz;

	@BeforeClass
	public void init() {
		service = new DataService();

		MockitoAnnotations.openMocks(this);

		when(dataClazz.getValue()).thenReturn("value");
	}

	@Test(invocationCount = 10, threadPoolSize = 10, timeOut = 100)
	public void testPreffixAddition() throws InterruptedException {

		String valueWithPrefix = service.enrichValue(dataClazz);

		Thread.sleep(30);

		assertEquals(valueWithPrefix, "Value is value");
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testNegative() {

		service.getSomething(Integer.valueOf(1));

	}

	@Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "No 1 value")
	public void testNegative2() {

		service.getSomething(Integer.valueOf(1));

	}
}
