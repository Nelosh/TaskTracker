package lv.tti.tasktracker.core.database

import lv.tti.tasktracker.core.domain.Task
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

@Transactional(Transactional.TxType.MANDATORY)
interface TaskRepository : JpaRepository<Task, Long>