import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*



internal class CalculadoraTest {

    val calculo = Calculadora()

    @Test
    fun soma (){
        assertEquals(10, calculo.soma(5,5))
    }

    @Test
    fun subtracao (){
        assertEquals(5, calculo.subtracao(10,5))
    }

    @Test
    fun multiplicar (){
        assertEquals(21, calculo.multiplicar(7,3))
    }

    @Test
    fun divisao (){
        assertEquals(10.0, calculo.divisao(20.0,2.0))
    }

    @Test
    fun raizQuadrada(){
        assertEquals(5.0, calculo.raizQuadrada(25))
    }

    @Test
    fun potencia(){
        assertEquals(4.0, calculo.potencia(2,2))
    }


}