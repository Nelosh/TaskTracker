package lv.tti.TaskTracker.core.services

import lv.tti.TaskTracker.core.database.TaskRepository
import lv.tti.TaskTracker.core.domain.Task
import lv.tti.TaskTracker.core.utilities.toDomain
import lv.tti.TaskTracker.core.utilities.toDto
import lv.tti.TaskTracker.dto.TaskDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService {

    @Autowired lateinit var taskDao : TaskRepository;

    fun getTaskById(id : Long) = taskDao.findById(id).get().toDto()
    fun saveTask(task : TaskDto) = taskDao.save(task.toDomain()).toDto()
    fun getAllTasks(): List<TaskDto> = taskDao.findAll().map { it.toDto() }
}