package com.example.MS_training;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
class MsTrainingApplicationTests {

	@Test
	void test() {
		Logger logger = LoggerFactory.getLogger(SpringApplication.class);
		MsTrainingApplication.main(new String[] {});
		logger.info("Main Class Running");
	}

}
