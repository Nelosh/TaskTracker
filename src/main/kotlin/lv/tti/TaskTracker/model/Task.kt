package lv.tti.TaskTracker.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "TASK")
data class Task(@Id @Column(name = "ID") var id: Long? = null,
                @Column(name = "DESCRIPTION") var description: String? = null)
