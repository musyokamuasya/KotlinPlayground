package basics

class Functions {
    fun printSum (firstNumber: Double, secondNumber: Double){
        val sum = firstNumber + secondNumber
        println("The sum of $firstNumber and $secondNumber is $sum")
    }

    fun stringTemplates() {
        var a = 1;
        val s1 = "a is $a"

        a = 2;

        val s2 = "${s1.replace("is", "was")} but now is $a"

    }
}