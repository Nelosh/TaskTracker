package lv.tti.TaskTracker.core.utilities

import lv.tti.TaskTracker.core.domain.Task
import lv.tti.TaskTracker.dto.TaskDto

/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  Transformations from dto to domain objects
 */
fun TaskDto.toDomain() = Task(this.id?: 0, this.description?: "")


/* * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  Transformations from domain to dto objects
 */
fun Task.toDto() = TaskDto(this.id, this.description)