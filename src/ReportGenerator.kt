interface ReportGenerator {
    abstract  fun generateReport(): String
}

fun main() {
    val employee = Employee()
    employee.fullname = "Старцева Полина Сергеевна"
    employee.position = "Программист"
    employee.salary = 100000
    employee.yearsOfExperience  = 2
    val developmentDepartment = DevelopmentDepartment("Отдел разработки")
    val list = listOf<ReportGenerator>(employee, developmentDepartment)
    for (report in list) {
        println(report.generateReport())
    }
}