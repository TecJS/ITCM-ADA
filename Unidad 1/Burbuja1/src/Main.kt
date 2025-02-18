fun main() {
    val array = arrayListOf(7.5,8.6,10.1,0.5)
    bubbleSort(array)
    println(array)
}
fun <T: Comparable<T>> bubbleSort(a : ArrayList<T>) : Unit{
    for (i in 0..a.size - 2)
        for (j in 0..a.size - 2 - i)
            if (a[j] > a[j+1]) {
                val temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
            }


}