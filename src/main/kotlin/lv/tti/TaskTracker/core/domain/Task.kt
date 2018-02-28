package lv.tti.TaskTracker.core.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "Task")
data class Task(@Id @Column(name = "id")          var id: Long? = null,
                    @Column(name = "description") var description: String? = null)
