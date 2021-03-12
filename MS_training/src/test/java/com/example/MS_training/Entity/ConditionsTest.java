package com.example.MS_training.Entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.TestConfiguration;
class ConditionsTest {
	@InjectMocks
	Conditions c=new Conditions();
	
	@Test
	void test() {
		c.setChanges("fsdrg");
		c.setConditions("esfdgb");
		Assertions.assertEquals("fsdrg", c.getChanges());
		Assertions.assertEquals("esfdgb", c.getConditions());
	}

}
