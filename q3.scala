def sphereVolume(r:Double, Pi:Double):Double = {
    4/3*Pi*r*r*r
}
val Pi = 3.142
val r = 5
print(sphereVolume(r, Pi))