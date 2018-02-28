package lv.tti.TaskTracker.rest

import lv.tti.TaskTracker.core.domain.Task
import lv.tti.TaskTracker.core.services.TaskService
import lv.tti.TaskTracker.dto.TaskDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/tasks")
class TaskController {

    @Autowired lateinit var taskService: TaskService

    @GetMapping("/{id}")
    fun getTask(@PathVariable("id") id : Long) : TaskDto = taskService.getTaskById(id)

    @GetMapping
    fun getAllTasks() : List<TaskDto> = taskService.getAllTasks();

    @PostMapping
    fun saveTask(@RequestBody taskDto : TaskDto) : TaskDto = taskService.saveTask(taskDto)

}