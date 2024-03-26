class Compte {
    var soldeInitial: Double= 0.0
    constructor()
    constructor(soldeInitial: Double){
        this.soldeInitial = soldeInitial
    }
    fun getBalance(){
        println(this.soldeInitial)
    }
    fun deposer(somme:Double):Double{
        this.soldeInitial=this.soldeInitial + somme
        return this.soldeInitial
    }
    fun retirer(somme:Double):Double{
        this.soldeInitial=this.soldeInitial - somme
        return this.soldeInitial
    }
    fun ajouter_Interet(interet:Double):Double{
        this.soldeInitial=this.soldeInitial * (1 + interet)
        return this.soldeInitial
    }

}