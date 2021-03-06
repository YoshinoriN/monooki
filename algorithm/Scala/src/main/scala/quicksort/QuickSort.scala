package quicksort

import scala.util.Random

object QuickSort extends App {

  val random = new Random()

  println(quicksort(Seq(1,5,8,4,16,2,10)))

  def quicksort(nums: Seq[Int]): Seq[Int] = {

    if (nums.length < 2) {
      return nums
    }

    val pivot: Int = nums(random.nextInt(nums.length))
    val less: Seq[Int] = nums.filter(x => x < pivot)
    val greater: Seq[Int] = nums.filter(x => x > pivot)

    println(Seq.concat(less, Seq(pivot), greater))
    Seq.concat(quicksort(less), Seq(pivot), quicksort(greater))
  }

}
