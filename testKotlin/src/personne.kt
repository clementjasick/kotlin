class personne {
    var nom: String = ""
    var taille: Double = 0.0
    var poids: Int = 0

    constructor() {}
    constructor(nom: String, taille: Double, poids: Int) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }

    fun imc(): Double = this.poids / (this.taille * this.taille)

    fun signification(): String{
        var imc = this.imc()
        if (imc<18.5){
            return "maigreur"
        }
        else if (imc<25){
            return "normal"
        }
        else if (imc<30){
            return "surpoids"
        }
        else if (imc<35){
            return "obesite"
        }
            return "hors categorie"
    }
}