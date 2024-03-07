class nombre {
    var nb: Int = 0
    constructor(nb: Int){
        this.nb=nb
    }
    constructor(){}
    fun diviseurs(): List<Int>{
        val liste= mutableListOf<Int>()
        for (i in 1..this.nb){
            if (this.nb%i==0){
                liste.add(i)
            }
        }
        return liste
    }
    fun estAmi(nb2: nombre): Boolean{
        if (this.sommeChiffres()==nb2.sommeChiffres()){return true} else {return false}
    }
    fun estPremier(): Boolean{
        var res = true
        if (listediviseurs(this.nb).size == 2){
            res = true
        }
        else {
            res = false
        }
        return res
    }
    fun sommeChiffres(): Int{
        val liste= mutableListOf<Int>()
        var r = 0
        var q = this.nb
        while (q!=0){
            r=q%10
            q=q/10
            liste.add(r)
        }
        return liste.sum()
    }
}
