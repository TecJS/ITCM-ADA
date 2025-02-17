fun main() {
    val array = arrayListOf(6,23,8,10,12,77,54,2,100)
    bubbleSort(array)
    println(array)
}
fun bubbleSort(a : ArrayList<Int>) : Unit{
    for (i in 0..a.size - 2)
        for (j in 0..a.size - 2 - i)
            if (a[j] > a[j+1]) {
                val temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
            }


}