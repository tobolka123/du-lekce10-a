package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindingMatchingTest {

	List<Double> testList2;
	List<Double> testList3;

	@BeforeEach
	void setup()
	 {
		testList2 = List.of(12.0, 8.126 , 6.0);
	}
	{
		testList3 = List.of(12.0, 8.126, 9.0, 158.0 , 6.0);
	}

	@Test
	void findMatchingfirst() {
		Double testResult = FindingMatching.findMatching(testList2, 11.0, 12.6);
		Double expected = 12.0;

		Assertions.assertEquals(expected, testResult);
	}
	@Test
	void findMatchingsecond() {
		Double testResult = FindingMatching.findMatching(testList3, 8.0, 10.0);
		Double expected = 8.126;

		Assertions.assertEquals(expected, testResult);
	}
}