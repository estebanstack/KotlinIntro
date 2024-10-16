package calculadora
import kotlin.math.*

class CalculadoraCientifica: Calculadora() {
    fun seno(x:Double):Double=sin(x)
    fun cos(x:Double):Double= cos(x)
    fun tan(x:Double):Double= tan(x)

    fun potencia(x:Double, exp:Double)=x.pow(exp)
    fun raizCuadrada(x: Double) {
        if (x < 0) {
            println("No hay raiz negatica")
        } else {
            sqrt(x)
        }
    }

    fun log10(x:Double):Double= log10(x)
    fun logE(x:Double)= ln(x)

    fun exponencial(x:Double):Double= exp(x)

}