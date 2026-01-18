abstract class Department(val departmentName : String) {
    abstract fun printDepartmentGoal()
}
class DevelopmentDepartment(departmentName: String) : Department(departmentName) {
    override fun printDepartmentGoal() {
        println("Писать чистый код")
    }
}
class TestingDepartment(departmentName: String) : Department(departmentName) {
    override fun printDepartmentGoal() {
        println("Находить все баги")
    }
}

fun main() {
    val developmentDepartment = DevelopmentDepartment("Отдел разработки")
    val testingDepartment = TestingDepartment("Отдел тестирования")
    println(developmentDepartment.departmentName)
    developmentDepartment.printDepartmentGoal()
    println(testingDepartment.departmentName)
    testingDepartment.printDepartmentGoal()
}