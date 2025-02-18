fun main() {
    val array = arrayListOf(7.5,8.6,10.1,0.5)
    array.bubbleSort()
    println(array)
}
fun <T: Comparable<T>> ArrayList<T>.bubbleSort (){
    for (i in 0..this.size - 2)
        for (j in 0..this.size - 2 - i)
            if (this[j] > this[j+1]) {
                val temp = this[j]
                this[j] = this[j+1]
                this[j+1] = temp
            }


}