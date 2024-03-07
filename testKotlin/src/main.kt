fun main(){

    val v1 = Voiture()
    val v2 = Voiture("Volvo","V50",0)
    v1.marque = "Peugeot"
    v1.modele = "308"
    //println(v2.marque)
    v1.vitesse = 60
    v2.vitesse = 40
    //println(v1.vitesse)
    //println(v2.vitesse)

    val nb1 = nombre(46)
    val nb2 = nombre(91)
    //println(nb1.diviseurs())
    //println(nb1.estPremier())
    //println(nb1.estAmi(nb2))
    //println(nb2.diviseurs())
    //println(nb2.estPremier())
    //println(nb2.estAmi(nb2))

    val personne1 = personne("hugo", 1.80 , 54)
    //println(personne1.imc())
    //println(personne1.signification())


}