class Calculadora {

    fun soma (num1: Int, num2: Int):Int{
        return num1 + num2
    }

    fun subtracao (num1: Int, num2: Int):Int{
        return num1 - num2
    }

    fun multiplicar (num1: Int, num2: Int):Int{
        return num1 * num2
    }

    fun divisao (num1: Double, num2: Double):Double{
        return num1 / num2
    }

    fun raizQuadrada (num1: Int): Double{
        return Math.sqrt(num1.toDouble())
    }

    fun potencia (num1: Int, num2: Int): Double {
        return Math.pow(num1.toDouble(), num2.toDouble())
    }
}