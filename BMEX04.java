public class BMEX04 {
    
String marca;
String tipoDeLuz;
int potencia;
String temperaturaDeCor;
double valor = 15.00;
boolean comprar;

public String verMarca() {
    return marca;
}

public String verTipo() {
    return tipoDeLuz;
}

public int verPotencia() {
    return potencia;
}

public String vercor() {
    return temperaturaDeCor;
}

public double consultarValor(){
    return valor;
}

public String vender(){
    String resposta;
    if(comprar == true){
        resposta = "foi vendida.";
    }
    else{
        resposta = "não foi vendida.";
    }
    return resposta;
}

public void lampadaAVenda(){
    System.out.println("O valor da lâmpada é " + consultarValor());
    System.out.println("A lâmpada " + vender());
}

}
