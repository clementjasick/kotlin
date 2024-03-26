fun bonjour(nom:String): String {
    return("bonjour $nom")
}
fun nombre(n1: Int, n2: Int ): String{
    return("somme: $n1 + $n2 = ${n1 + n2} difference : $n1 - $n2 = ${n1 - n2} multiplication : $n1 * $n2 = ${n1 * n2} division : $n1 / $n2 = ${n1 / n2} ")
}
fun tarif_reduit(): String{
    var a: String = "a"
    println("entrer votre age")
    var age = readln().toInt()
    if (age<26){
         a = "tarif reduit"
    }
    else {
        a = "tarif normal"
    }
    return a
}
fun produit(n1: Int, n2: Int): String{
    if (n1<0 && n2<0){
        return "positif"
    }
    else if (n1>0 && n2>0){
        return "positif"
    }
    else {
        return "negatif"
    }
}
fun bissextile(annee: Int): Boolean {
    if (annee%400==0){
        return true
    }
    else if (annee%100==0){
        return false
    }
    else if (annee%4==0){
        return true
    }
    else{
        return false
    }
}
fun compteur(n:Int) {
    var i: Int = 0
    while (i<=n){
        println(i)
        i++
    }
}
fun pair(n: Int){
    var z:Int = n
    if (n%2==0){
        println("pair")
    }
    else {
        println("impair")
    }
    for (i in 1..10) {
        z += 2
        println("$z")
    }
}
fun multiple(nb:Int, nbmax:Int){
    var z:Int=0
    var i:Int=0
    while (z<nbmax){
        z=nb*i
        println("$nb*$i=$z")
        i++

    }

}
fun devinette():String{
    val aleatoire = (0..10).random()
    for (i in 1..7){
        println("devinner le nombre")
        var nb = readln().toInt()
        if (nb == aleatoire){
            return "vous avez gagne en $i essaie"
        }
        else if (nb<aleatoire){
            println("plus grand")
        }
        else{
            println("plus petit")
        }
    }
    return "perdu nombre d'essaie depasse"
}
fun main(){
    //println(bonjour("clement"))
    //println(nombre(5,7))
    //println(tarif_reduit())
    //println(produit(5,5))
    //println(bissextile(1604))
    //println(compteur(20))
    //println(pair(10))
    //println(multiple(5,50))
    //println(devinette())
    println(125/10)
}