package lv.tti.TaskTracker.rest

import lv.tti.TaskTracker.core.domain.Task
import lv.tti.TaskTracker.core.services.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController()
@RequestMapping("/tasks")
class TaskController {

    @Autowired lateinit var taskService: TaskService

    @GetMapping("/{id}")
    fun getTask(@PathVariable("id") id : Long) = taskService.getTaskById(id)

    @GetMapping
    fun getAllTasks() = taskService.getAllTasls();

    @PostMapping
    fun saveTask(@RequestBody task : Task) = taskService.saveTask(task)

}