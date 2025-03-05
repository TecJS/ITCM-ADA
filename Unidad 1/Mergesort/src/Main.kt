
fun main() {
    val array = arrayListOf(7,8,10,5,20,3,1)
    mergeSort(array,0,array.size-1)
    println(array)
}

fun mergeSort(array: ArrayList<Int>, start:Int, fin:Int) {
    if (start < fin) {
        val medio = (start+fin)/2
        mergeSort(array,start,medio)
        mergeSort(array,medio+1,fin)
        merge(array,start,medio,fin)

    }
}
fun  merge(array: ArrayList<Int>,start:Int,medio:Int,fin:Int){
    val izquierda=array.subList(start,medio+1).toList()
    val derecha=array.subList(medio+1,fin+1).toList()
    println("start $start")
    println("medio $medio")
    println("fin $fin")
    println(izquierda)
    println(derecha)
    println(array)
    var i=0
    var j=0
    var z=start
    //comparar para ordenar
    while(i<izquierda.size && j<derecha.size) {
        if(izquierda[i] < derecha[j]){
            array[z]=izquierda[i]
            i++
        }else{
            array[z]=derecha[j]
            j++ }
        z++
    }
    //copiar el resto
    while (i<izquierda.size){array[z]=izquierda[i];i++; z++}
    while(j<derecha.size){array[z]=derecha[j];j++; z++}
}