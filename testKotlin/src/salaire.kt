fun salaire(pf:Int,pi:Int,nbrepas:Int): Double{
    var salaire:Double = 900.0
    var commfr: Double = 0.0
    if (pf > 1500){
        commfr += (pf-1500)*0.07+1500*0.05
    }
    else {
        commfr += pf*0.05
    }
    var commim: Double = 0.0
    if (pi>1800){
        commim += (pi-1800)*0.05+(1800-1000)*0.04+1000*0.03
    }
    else if (pi>1000){
        commim += (pi-1000)*0.04+1000*0.03
    }
    else {
        commim += pi*0.03
    }
    val repas: Int = 9*nbrepas
    salaire += commfr+commim+repas 
    return salaire
}

fun main(){
    println(salaire(1600,2000,9))
}