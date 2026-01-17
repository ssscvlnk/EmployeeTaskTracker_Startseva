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

fun main() {
    val task1 = Task(
        "Сделать ДЗ",
        "Задание по РМП",
        priority = Priority.Medium
    )
    val task2 = Task(
        "Пройти курс на Stepik",
        "Курс С# для продвинутых",
        priority = Priority.Low
    )
    val task3 = Task(
        "Создать проект",
        "Написать код для собственного приложения",
        priority = Priority.Low
    )
    println("task1 == task2: ${task1==task2}")
    println(task1)
    val task4 = task1.copy(priority = Priority.High)
    println("Копия task1 с другим приоритетом: $task4")
}
