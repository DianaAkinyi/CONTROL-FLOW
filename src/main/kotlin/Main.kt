fun main(){
numbersOdd()
takeDrinks(3)
    takeDrinks(17)
    takeDrinks(6)

multiply()

println(intString(arrayOf("kelly","malcom's","diana","winnie")))


}



    //Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun numbersOdd(){
    for(n in 1..100){
    if(n%2!=0){
       println(n)
    }
}
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun intString(y:Array<String>):Int {
    var num = 0
    y.forEach { x ->
        if (x.length > 5)
            num++
        }
        return num


}



//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun takeDrinks(age:Int){
    if (age in 1 .. 5){
        println("milk")
    }
    else if(age in 6..15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun multiply(){
    for(p in 1..100)
        if(p%3==0){
            println("Fizz")
        }
      else if(p%5==0)  {
          println("Buzz")
        }
    else if(p%3==0 || p%5==0){
        println("FizzBuzz")

        }else{
            println(p)
        }
}



