fun main() {
    val array = arrayListOf(7,8,10,5,20,3,1)
    array.quickSort(0,array.size - 1)
    println(array)
}
fun <T: Comparable<T>> ArrayList<T>.quickSort (low: Int, high: Int ) {
    if(low >= high) return
    val pivot = this[high]
    var i = low-1
    for (j in low..high) {
        if (this[j]<pivot) {
            i++
            val temp = this[j]
            this[j] = this[i]
            this[i] = temp
        }
    }
    val temp = this[i+1]
    this[i+1] = this[high]
    this[high] = temp

    val pivotIndex = i + 1

    this.quickSort(low,pivotIndex-1)
    this.quickSort(pivotIndex+1,high)
}

fun <T: Comparable<T>> List<T>.quickSortK ( ):List<T> {
    if(this.size<2) return this
    val pivot = this[this.size/2]

    val less = this.filter({ it -> it < pivot })
    val equal =this.filter({ it -> it == pivot })
    val greater =this.filter({ it -> it > pivot })

    return less.quickSortK()+equal+greater.quickSortK()
}