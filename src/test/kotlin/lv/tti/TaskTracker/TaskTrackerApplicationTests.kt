package lv.tti.TaskTracker

import lv.tti.TaskTracker.model.TaskRepository
import org.junit.Assert
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class TaskTrackerApplicationTests {

	@Autowired
	lateinit var repository: TaskRepository

	@Test
	fun contextLoads() {
		assertTrue(repository.findById(1).isPresent);
	}

}
