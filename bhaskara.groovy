def bhaskara(a, b, c){
    delta = b*b + (-4*a*c)
    
    if (delta < 0)
        println "Não Possui valores Reais"
    else
        if (delta > 0)
            println "X1 = " + (-b+(delta**(1/2)))/2*a + " & X2 = " + (-b-(delta**(1/2)))/2*a
        else
            println "X1 = " + (-b+(delta**(1/2)))/2*a + " & X2 = " + (-b-(delta**(1/2)))/2*a
}

bhaskara(2,2,2)