object ScalaTutorial {
	def main(args:Array[String]){
		var i= 0
		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val aList= List(1,2,3,4,5)

		// the value of i, after it cycles through this list,is goin to be store in the evenList
		// var evenList= for{i <- 1 to 20 
		//  if (i%2) == 0 } yield i


		//  for(i<-evenList)
		//  	println(i)

		// while(i<=10){
		// 	println(i)
		// 	i+=1
		// }

		// do{
		// 	println(i)
		// 	i+=1
		// }
		// while(i<=10)

			// different type of loop
		// for(i<- 1 to 10 ){
		// 	println(i)
		// }

		// loops string or array
		// for( i <- O until randLetters.length){
		// 	println(randLetters(i))
		// }

		// for(i<-aList){
		// 	println("List items " +i)
		// }

		//multiple variables increment
		// for(i<- 1 to 5;j<-6 to 10){
		// 	println("i : "+i)
		// 	println("j :"+j)
		// }

		// function to stop a loop because there's no break in scala
		// def printPrimes(){
		// 	val primeList=List(1,2,3,4,7,11)
		// 	for(i<- primeList){
		// 		if(i==11){
		// 			return // STOPs the program like a break
		// 		}
		// 		if(i!=1){
		// 			println(i)
		// 		}
		// 	}
		// }

		// printPrimes


	}
}