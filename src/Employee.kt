open class Employee() {
     var name = "";
     var age = 0
     var salary = 0.0;

    constructor(eName: String, eAge: Int, eSalary: Double) :this(){
        this.name = eName
        this.age = eAge
        this.salary = eSalary
    }
}

class AndroidDeveloper : Employee(){

    fun androidApp() {
        println("Inside Android Developer ^-^")
    }
}
class WebDeveloper : Employee(){

    fun webApp() {
        println("Inside Web Developer ^-^")
    }
}
class IOSDeveloper : Employee (){

    fun iosApp() {
        println("Inside IOS Developer ^-^\"")
    }
}
//-------------------- MAIN Function---------------------------------///

fun main() {
    var android = AndroidDeveloper()
    var ios = IOSDeveloper()
    var web = WebDeveloper()

    android.name="MAimoona Al-Rozmi"
    android.age=24
    android.salary=4000.0

    ios.name="Nora Nissan"
    ios.age=26
    ios.salary=3000.0

    web.name="Belqess Almajedi"
    web.age=25
    web.salary=2000.0

    println("----------------------------------------------------------")
    android.androidApp()
    println("Developer name is :"+android.name+"\n Age: "+android.age+"\n Salary:"+android.salary+"$")

    println("-----------------------------------------------------------")
    ios.iosApp()
    println("Developer name is :"+ios.name+"\n Age: "+ios.age+"\n Salary:"+ios.salary+"$")

    println("-----------------------------------------------------------")
    web.webApp()
    println("Developer name is :"+web.name+"\n Age: "+web.age+"\n Salary:"+web.salary+"$")
}
