var number: Int = 0;

fun increaseNumber(): Int {
    number = 1;
    return number;
}

fun main(args: Array<String>) {
    increaseNumber();
    println(number);
}