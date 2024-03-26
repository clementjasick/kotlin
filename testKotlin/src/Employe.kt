import java.time.LocalDate
class Employe {
    var Matricule : Int = 0
    var Nom : String = ""
    var Prenom : String = ""
    var anneeEmbauche : Int = 2000
    var Salaire : Double = 2000.0
    constructor()
    constructor(Matricule: Int, Nom: String, Prenom: String, anneeEmbauche: Int, Salaire: Double) {
        this.Matricule = Matricule
        this.Nom = Nom
        this.Prenom = Prenom
        this.anneeEmbauche = anneeEmbauche
        this.Salaire = Salaire
    }
    fun anciennete():Int{
        var anciennete : Int = LocalDate.now().year - this.anneeEmbauche
        return anciennete
    }
    fun AugmentationDuSalaire():Double{
        if (this.anciennete() < 5){
            this.Salaire=this.Salaire * 1.02
        }
        else if (this.anciennete() < 5){
            this.Salaire=this.Salaire * 1.05
        }
        else {
            this.Salaire=this.Salaire * 1.10
        }
        return this.Salaire
    }
    fun afficherEmployé(){
        println("matricule ${this.Matricule}")
        println("Nom complet ${this.Nom} ${this.Prenom}")
        println("Ancienneté ${anciennete()}")
        println("Salaire ${this.Salaire}")
    }

}