class Employee {
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
}

fun main() {
    val employee = Employee()
    employee.fullname = "Старцева Полина Сергеевна"
    employee.position = "Программист"
    employee.salary = -1000
    employee.yearsOfExperience = 55
    employee.salary = 100000
    employee.yearsOfExperience  = 2
}