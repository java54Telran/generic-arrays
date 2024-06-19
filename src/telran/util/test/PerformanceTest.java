package telran.util.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import telran.util.Arrays;

public class PerformanceTest {
	private static final int N_ELEMENTS = 1_000_000;

	@Test
	@DisplayName("Inserting into Java array N elements is O[N ^ 2], so test should fail")
	@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
void addPerformanceTest() {
	Integer[] array = new Integer[0];
	for(int i = 0; i < N_ELEMENTS; i++) {
		array = Arrays.add(array, i);
	}
	assertEquals(N_ELEMENTS, array.length);
}
}
