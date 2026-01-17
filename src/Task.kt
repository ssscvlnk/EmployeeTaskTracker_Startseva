enum class Priority {
    Low,
    Medium,
    High
}
data class Task(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean = false
)

