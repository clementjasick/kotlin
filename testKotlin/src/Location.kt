class Location {
    var nom: String = ""
    var categorie: String = ""
    var nb_jours: Int = 0
    var nb_km: Int = 0

    constructor(nom: String, categorie: String, nb_jours: Int, nb_km: Int) {
        this.nom = nom
        this.categorie = categorie
        this.nb_jours = nb_jours
        this.nb_km = nb_km
    }

    constructor()

    fun montantjour(): Int {
        var prix : Int = 0
        if (this.categorie == "E"){
            prix = 30
        }
        else if (this.categorie == "C"){
            prix = 50
        }
        else {
            prix = 75
        }
        return prix*this.nb_jours
    }

    fun kmSupplementaire(): Int{
        var km = 100 * this.nb_jours
        return this.nb_km-km
    }
    fun pxKmSupplementaire(): Double{
        var nbkmApaye = kmSupplementaire()
        return nbkmApaye*0.5
    }
    fun montantTotal(): Double{
        var a = montantjour()
        var b=pxKmSupplementaire()
        return a+b
    }
}