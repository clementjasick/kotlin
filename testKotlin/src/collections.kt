fun tab(){
val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
    "Uranus", "Neptune")
println(planetes.first())
println(planetes.last())
println(planetes.get(0))
println(planetes.get(7))
    println(planetes.indexOf("terre"))
planetes[2]= "La Terre "
    println(planetes.filter { it.uppercase().startsWith('M') })
    for (planete in planetes){
        println(planete.lowercase().capitalize())
    }
}
fun ent(){
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    println(entiers)
    var min = entiers.min()
    var max = entiers.max()
    var total = entiers.sum()
    val listepair = mutableListOf<Int>()
    val listeimpair = mutableListOf<Int>()
    for (nb in entiers){
        if (nb%2==0){
            listepair.add(nb)
        }
        else {
            listeimpair.add(nb)
        }
    }
    println(min)
    println(max)
    println(total)
    println(listepair)
    println(listeimpair)
}
fun map(){
    val notes = mutableMapOf<String, MutableList<Int>>("Adrien" to mutableListOf(15,12,
        10),"Bertrand" to mutableListOf(12,10))
    notes.getOrPut("Toto") { mutableListOf() }.add(8)// ajoute la clé Toto avec une note de 8
    notes.getOrPut("Adrien") { mutableListOf() }.add(6)//ajoute une note de 6 à la clé Adrien
    for (el in notes){
        print(el.key)
        println(el.value)
        val moyenne = el.value.sum().toDouble()/el.value.size
        println(moyenne)
        if (moyenne >= 10){
            println(el.key)
        }
    }
}
fun serie(n : Int): List<Int> {
    val liste = mutableListOf<Int>()
    for (i in 1..n) {
        liste.add(i)
    }
    return liste
}
fun serieInverse(n : Int): List<Int> = serie(n).reversed()
fun listepair(list:List<Int>): List<Int>{
    val listepair = mutableListOf<Int>()
    for (nb in list){
        if (nb%2==0){
            listepair.add(nb)
        }
    }
    return listepair
}
fun listeimpair(list:List<Int>): List<Int>{
    val listeimpair = mutableListOf<Int>()
    for (nb in list){
        if (nb%2==1){
            listeimpair.add(nb)
        }
    }
    return listeimpair
}
fun listediviseurs(nb: Int): List<Int>{
    val liste= mutableListOf<Int>()
    for (i in 1..nb){
        if (nb%i==0){
            liste.add(i)
        }
    }
    return liste
}
fun estpremier(nb: Int): Boolean{
    var res = true
    if (listediviseurs(nb).size == 2){
        res = true
    }
    else {
        res = false
    }
    return res
}
fun estparfait(nb: Int): Boolean{
    val liste= mutableListOf<Int>()
    var res = true
    for (i in 1..nb-1){
        if (nb%i==0){
            liste.add(i)
        }
    }
    if (liste.sum() == nb){
        res = true
    }
    else {
        res = false
    }
    return res
}
fun sommeChiffres(n: Int): Int{
    val liste= mutableListOf<Int>()
    var q = n
    var r = 0
    while (q!=0){
        r=q%10
        q=q/10
        liste.add(r)
    }
    return liste.sum()
}
fun nombreAmi(nb1: Int,nb2: Int): Boolean{
    if (sommeChiffres(nb1)==sommeChiffres(nb2)){return true} else {return false}

}

fun main(){
    //println(tab())
    //println(ent())
    //println(map())
    //println(serieInverse(5))
    //println(listepair(listOf(25,47,96,54)))
    //println(listeimpair(listOf(25,47,96,54)))
    //println(listediviseurs(11))
    //println(estpremier(10))
    //println(estparfait(8))
    //println(sommeChiffres(125))
    //println(nombreAmi(93,667))
}
