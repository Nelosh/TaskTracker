package lv.tti.tasktracker.rest

import lv.tti.tasktracker.core.services.TaskService
import lv.tti.tasktracker.dto.TaskDto
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