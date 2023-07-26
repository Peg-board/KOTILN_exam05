fun main(args: Array<String>) {

    var num1 : Int = 100
    var num2 : Int = 0

    try{
        println(num1/num2)
    }catch (e: ArithmeticException){
        println("어떤 수든 0으로 나눌 수 없습니다.")
    }
}