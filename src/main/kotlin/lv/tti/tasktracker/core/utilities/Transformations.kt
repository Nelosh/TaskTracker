package lv.tti.tasktracker.core.utilities

import lv.tti.tasktracker.core.domain.Task
import lv.tti.tasktracker.dto.TaskDto

/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  Transformations from dto to domain objects
 */
fun TaskDto.toDomain() = Task(this.id?: 0, this.description?: "")


/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  Transformations from domain to dto objects
 */
fun Task.toDto() = TaskDto(this.id, this.description)