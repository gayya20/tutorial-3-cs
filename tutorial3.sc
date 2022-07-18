
//problem 1
def area(radius:Int):Int=radius*radius*22/7

println(area(5))


//problem 2
def temp(c: Double): Double = c * 1.8 + 32.0

println(temp(35))

//problem 3
def volume(r:Int):Int=(4*22*r*r*r)/(3*7)
println(volume(5))


//problem 4
def bookprice(bp:Int):Double=(24.95*bp*0.6)

def shippingcost(bp:Int):Double=bp match {
  case x if x<=50 => bp*3
  case x =>(50*3) +((bp-50)*.75)
}

def total(bp:Int):Double=(bookprice(bp)+shippingcost(bp))
println((total(60)))


//problem 5
def easypace(x:Int) =(2*x*8)

def Tempo(y:Int) =(y*7)

def totalmin(x:Int,y:Int)=(easypace(x) + Tempo(y))

println(totalmin(2 ,3))