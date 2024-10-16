package calculadora

open class Calculadora {

    fun suma(a:Int, b:Int)=a+b
    fun resta(a:Int, b: Int)=a-b
    fun multiplicacion(a: Int, b: Int)=a*b
    fun division(a:Int, b: Int){
        if(b==0){
            println("No se puede realizar la operacion division por cero")
        }else{
            a/b
        }
    }

}