fun main() {
    print("Escribe una palabra o numero")

    //constante
    val consola=readln().toInt() //-> se usa toTipo para castearlo (por defecto es string)

    //variable
    var numero=0;

    //variable sin valor inicial
    var numero1:Int

    //se usa el $ para imprimir una variable dentro de un texto
    println("La palabra o numero que escribiste fue: $consola")

    println(suma(1,3))
    mostrarSuma()
    println(resta(4,numero))
    println(maximo(5,6))

    //ciclo for
    //creacion de listas2
    val listaNombres= listOf("Esteban", "Castro")
    for(nombre in listaNombres){
        println(nombre)
    }
    //por medio de los indices
    for(index in listaNombres.indices){
        println("El elemento en el indice $index es: ${listaNombres[index]}")
    }

    //while
    var index=0
    while(index<listaNombres.size){
        print("En el while ")
        println("el elemento en el indice $index es ${listaNombres[index]}")
        index++
    }
    val numeroLong: Long=1223248787
    println(responde(numeroLong))

    //implementacion de rangos
    val x=2
    val y=3
    if(x in 1..y+1){
        println("Este numero está dentro del rango")
    }

    //instacia de clases
    val cuadrado=Square(5.4)
    println("El perimetro del cuadrado es: ${cuadrado.perimetro}")
}

//funciones en donde se especifica el tipo
    fun suma(a:Int, b: Int):Int{
    return a+b
    }

//funcion void
    fun mostrarSuma():Unit{
    println(1+2)
    }

//funcion en donde se retorna una sola linea de codigo
    fun resta(a:Int, b:Int)=a-b

//funcion con ternarios
    fun maximo(a:Int, b:Int)=if (a>b) a else b

//uso del when (es como un switch) el any significa cualquier tipo
    fun responde(ask:Any):String=
        when(ask){
            1 -> "Ese es el 1"
            "Hola" -> "Como estás"
            is Long -> "Oh, eso es un numero muy grande"
            !is String -> "Eso no es una palabra es un " + ask.javaClass.name
            else -> "No reconozco esa palabra"
        }


//creacion de clase
    class Square(private val lado:Double){
        val perimetro=lado*2
    }