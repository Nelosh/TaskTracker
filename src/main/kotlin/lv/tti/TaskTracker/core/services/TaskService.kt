package lv.tti.TaskTracker.core.services

import lv.tti.TaskTracker.core.database.TaskRepository
import lv.tti.TaskTracker.core.domain.Task
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskService {

    @Autowired lateinit var taskDao : TaskRepository;

    fun getTaskById(id : Long) = taskDao.findById(id)
    fun saveTask(task : Task) = taskDao.save(task)
    fun getAllTasls(): List<Task> = taskDao.findAll()
}