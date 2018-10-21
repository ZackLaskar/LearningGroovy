//https://www.youtube.com/watch?v=FXI7VuurpCg&index=7&list=PLzerMl1XZ0X3Q5kdY2jtACBmEZSxbD-RA

//closures

def even = {number ->
    return number % 2 == 0
} 

def odd = {number ->
    return number % 2 != 0
}

//println odd(3)

Good example :-

def selectNumbers(list,selector){
    list.each{
        if(selector(it)){
            println it
            }
        }
    }  

selectNumbers([1,2,3,4], even)
selectNumbers([1,2,3,4], odd)