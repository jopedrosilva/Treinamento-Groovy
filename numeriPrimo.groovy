def numeroPrimo(x){
    cont = 1
    soma = 0
    while(x>=cont){
        if (x%cont == 0){
            soma++
        }
        cont++
    }
    
    if (soma == 2){
        "primo"
    } else {
        "N�o Primo"
    }
}

snumeroPrimo(11)