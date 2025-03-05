
fun main() {
    val array = arrayListOf(4,23,12,4,1,2,7)
    array.mergeSort(0,array.size-1)
    println(array)
}

fun <T: Comparable<T>> ArrayList<T>.mergeSort( start:Int, fin:Int) {
    if (start < fin) {
        val medio = (start+fin)/2
        this.mergeSort(start,medio)
        this.mergeSort(medio+1,fin)
        this.merge(start,medio,fin)

    }
}
fun  <T: Comparable<T>> ArrayList<T>.merge(start:Int,medio:Int,fin:Int){
    val izquierda=this.subList(start,medio+1).toList()
    val derecha=this.subList(medio+1,fin+1).toList()
    println("start $start")
    println("medio $medio")
    println("fin $fin")
    println(izquierda)
    println(derecha)
    println(this)
    var i=0
    var j=0
    var z=start
    //comparar para ordenar
    while(i<izquierda.size && j<derecha.size) {
        if(izquierda[i] < derecha[j]){
            this[z]=izquierda[i]
            i++
        }else{
            this[z]=derecha[j]
            j++ }
        z++
    }
    //copiar el resto
    while (i<izquierda.size){this[z]=izquierda[i];i++; z++}
    while(j<derecha.size){this[z]=derecha[j];j++; z++}
}