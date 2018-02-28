package lv.tti.TaskTracker.core.database

import lv.tti.TaskTracker.core.domain.Task
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

@Transactional(Transactional.TxType.MANDATORY)
interface TaskRepository : JpaRepository<Task, Long>