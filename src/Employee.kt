class Employee : ReportGenerator {
    var fullname: String= ""
        get
    var position: String = ""
        get
    var salary: Int = 0
        get
        set(value) {
            if (value<0) println("Зарплата не может быть отрицательной")
            else field = value
        }
    var yearsOfExperience: Int = 0
        get
        set(value) {
            if (value>50) {
                println("Опыт работы не может быть больше 50 лет")
                field = 50
            } else field = value
        }
    var currentTask: Task? = null
        get
    fun assignTask(newTask: Task) {
        if (currentTask != null && currentTask?.isCompleted == false) {
            println("Сотрудник уже занят задачей ${currentTask?.title}")
        } else {
            currentTask = newTask
            println("Задача '${currentTask?.title}' назначена сотруднику $fullname")
        }
    }
    override fun generateReport(): String {
        return "Имя сотрудника: $fullname, должность: $position, зарплата: $salary, опыт работы: $yearsOfExperience"
    }
}

fun main() {
    val employee = Employee()
    employee.fullname = "Старцева Полина Сергеевна"
    employee.position = "Программист"
//    employee.salary = -1000
//    employee.yearsOfExperience = 55
    employee.salary = 100000
    employee.yearsOfExperience  = 2
    val developmentDepartment = DevelopmentDepartment("Отдел разработки")
    val task1 = Task(
        "Создать проект",
        "Написать код для собственного приложения",
        priority = Priority.Low
    )
    val task2 = Task(
        "Изучить новый материал",
        "Научиться писать код HTML",
        priority = Priority.Medium
    )
    employee.assignTask(task2)
    employee.assignTask(task1)
    val list = listOf<ReportGenerator>(employee, developmentDepartment)
    println("Сводный отчет: ")
    for (report in list) {
        println(report.generateReport())
    }
}