import basics.Functions

fun main(args: Array<String>) {

    maxOf(9, 12)
}

fun maxOf(a: Int, b: Int){
    if (a > b){
        println("$a is greater than $b")
    }

    else {
        println("$b is greater than $a")
    }
}

