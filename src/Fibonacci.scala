class Fibonacci {
  
  
    
  def get(fibonnacci_index : Int) = {
  
  def fiboRecur(n: Int, fibo_n_min1: Int, fibo_n_min2:Int) :Int = n match {
    case `fibonnacci_index` => fibo_n_min1+fibo_n_min2
    case _ => fiboRecur(n+1, fibo_n_min1+fibo_n_min2, fibo_n_min1)
  }
  
  fibonnacci_index match {
  	case 0=>1
    case 1=>1
    case _ => fiboRecur(2,1,1)
  }}

}