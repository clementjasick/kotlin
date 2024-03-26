fun main(){

    val v1 = Voiture("","",vitesse=0)
    val v2 = Voiture("Volvo","V50",0)
    v1.marque = "Peugeot"
    v1.modele = "308"
    //println(v2.marque)
    v1.vitesse = 60
    v2.vitesse = 40
    //println(v1)
    //println(v2.vitesse)

    val nb1 = Nombre(46)
    val nb2 = Nombre(91)
    //println(nb1.diviseurs())
    //println(nb1.estPremier())
    //println(nb1.estAmi(nb1))
    //println(nb2.diviseurs())
    //println(nb2.estPremier())
    //println(nb2.estAmi(nb2))

    val personne1 = Personne("Hugo", 1.80 , 54)
    //println(personne1.imc())
    //println(personne1.signification())

    val client1 = Location("François", "E", 7, 750)
    //println(client1.montantTotal())

    val Youssef = Compte(100.0)
    Youssef.deposer(150.0)
    Youssef.retirer(50.0)
    Youssef.ajouter_Interet(0.05)
    //Youssef.getBalance()

    val employe1 = Employe(1651475,"Kikikoli","Hogo",2023,2000.0)
    employe1.AugmentationDuSalaire()
    employe1.anciennete()
    //employe1.afficherEmployé()

    var lesPays = mutableListOf<String>()
    lesPays.add("France")
    lesPays.add("Italie")
    println(lesPays)
}