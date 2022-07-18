def cost(dis:Double, ship:Double):Double = {
    dis + ship
}

def shipping(n:Double):Double = {
    if(n>50){
        return (3)
    }else{
        return (3 + (n-50)*0.75)
    }
}

def discount(n:Double, d:Double, price:Double):Double = {
    (price - (price * d)) * n
}

val n = 60
val d = 0.4
val price = 29.95
print(cost(discount(n,d,price), shipping(n)))