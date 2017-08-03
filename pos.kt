open class item(price: Double)

//Burgers
class regularBurger():item(1.00)
class cheeseBurger():item(1.50)
class goodBurger():item(2.00)

//Hotdogs
class regularDog():item(1.00)
class chiliDog():item(1.50)
class slawDog():item(1.50)
class goodDog():item(2.00)

//Salads

//Sides

//Condiments

fun processInput(input: String) {

}

///--------------------------

val burgers: HashMap<String, Double> = hashMapOf("Regular Burger" to 1.00, "Cheeseburger" to 1.50, "Goodburger" to 2.00);

fun main(args: Array<String>) {
    println("Welcome to Goodburger, home of the Goodburger! May I take your order?")

    for (food in burgers.keys) {
        println(food);
    }

    var input = readLine()


    println("Would you like that for here or to go?");

    //Rest of code goes here.




}