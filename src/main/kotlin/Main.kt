fun main(args: Array<String>) {
    println("Hello World!")
    val students = mutableListOf(41 to "Helen", 21 to "Tom", 30 to "Jim")

    val ageComparator = compareBy<Pair<Int, String>> { it.second }
    println(students.sortedWith(ageComparator))

    val p1 = Person(91)
    val p2 = Person(10)
    val p3 = Person(78)
    val listOfPerson = listOf(p1, p2, p3)

    var sortedListOfPerson = listOfPerson.sortedBy {
        it.age
    }
    println(sortedListOfPerson)


    val listOfStudent = listOf(Student(25, "Ivan"), Student(20, "Aetr"), Student(21, "Max"))
    listOfStudent.sorted().forEach{ println(it)}

}
data class Person (var age: Int)
data class Student (var age: Int, var name: String) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return this.name.compareTo(other.name)
       // return other.age - this.age
    }

}

// https://www.bezkoder.com/kotlin-sort-list-objects/