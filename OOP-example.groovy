// groovy oop learning.

class Ball{
    def type = "basketball"
    def diameter = 9
    def inflated = false
    
    // this is constructor, method name is same as class name
    // Groovy we dont have to write constructor as groovy by default creates constructor
    /*def Ball(type, diameter){
        this.type = type
        this.diameter = diameter
    }*/
    
    def inflate(){
       inflated = true 
   }
}


//def ball = new Ball("Basketball",9)
//println ball.inflated
//println "ball..inflated"
//ball.inflate()

def ball2 = new Ball(type: "base", diameter:3, inflated:true)

println ball2.type
println ball2.diameter
println ball2.inflated

