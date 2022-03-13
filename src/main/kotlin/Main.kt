import basics.Functions

fun main(args: Array<String>) {

    maxOf(9, 12)
    listOfItems()
}

fun maxOf(a: Int, b: Int){
    if (a > b){
        println("$a is greater than $b")
    }

    else {
        println("$b is greater than $a")
    }
}

fun listOfItems(){
    val names = listOf("Ken", "Mike", "Susan", "Andrew", "Joan")
    for(name in names){
        println(name)
    }

    for(index in names.indices){
        println("Name on index $index is ${names[index]} using for loop")
    }

    var index = 0;
    while(index < names.size){
        println("Name on index $index is ${names[index]} using while loop")
        index ++
    }
}



