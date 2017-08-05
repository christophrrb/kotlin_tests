open class item(price: Double)

/*//Burgers
class regularBurger():item(1.00)
class cheeseBurger():item(1.50)
class goodBurger():item(2.00)

//Hotdogs
class regularDog():item(1.00)
class chiliDog():item(1.50)
class slawDog():item(1.50)
class goodDog():item(2.00)*/

var toGoOption: String = "";

val burgers: HashMap<String, Double> = hashMapOf("Regular Burger" to 1.00, "Cheeseburger" to 1.50, "Goodburger" to 2.00);

var order: HashMap<String, Double> = hashMapOf();

fun confirmation() {
    var input = readLine();
    if (burgers.containsKey(input)) {
        processInput(input!!);
    } else if (input == "Done") {
        carryOutSetAnswer();
    } else {
        println("That is not a valid order item.");
    }
}

fun processInput(input: String) {
    var price:Double = burgers.get(input)!!;
    order.put(input, price);
    confirmation();
}

fun carryOutSetAnswer() {
    println("Would you like that for here or to go?");
    val carryOut = readLine();
    if (carryOut != null) {
        if (carryOut == "Here") {
            toGoOption = "Here";
            orderComplete(toGoOption);
        } else if (carryOut == "To Go") {
            toGoOption = "To Go";
            orderComplete(toGoOption);
        } else {
            println("${carryOut} is not a valid option");
            carryOutSetAnswer();
    }
    } else {
        carryOutSetAnswer();
    }
}

fun subtotal(): Double {
    var sub: Double = 0.00;
    for (price in order.values) {
        sub = sub + price;
    }
    return sub;
}

fun total(subtotal: Double): Double {
    val total = subtotal() * 1.07;
    return total;
}

fun orderComplete(toGoOption: String) {
    println("Your meal is as follows:");
    for (food in order) {
        println(food);
    }

    println("And you're eating it ${toGoOption}");
    val priceOne = subtotal();
    println("Subtotal: $${priceOne}");
    println("Total: $${total(priceOne)}");
}





fun main(args: Array<String>) {
    var foodNumber: Int = 1;
    println("Welcome to Goodburger, home of the Goodburger! May I take your order?")

    for (food in burgers.keys) {
        println("${foodNumber}. ${food}");
        foodNumber++;
    }

    confirmation();
}
