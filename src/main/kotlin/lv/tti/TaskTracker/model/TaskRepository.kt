package lv.tti.TaskTracker.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Transactional(Transactional.TxType.MANDATORY)
interface TaskRepository : JpaRepository<Task, Long>