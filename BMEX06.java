public class BMEX06 {
   
    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    public void abreConta(String nome, double deposito, boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    public void abreContaSimples(String nome, double deposito) {
        if(deposito < 100){
            System.out.println("A conta não pode ser aberta, valor inferior a R$100,00");
        }
        else{
            nomeDoCorrentista = nome;
            saldo = deposito;
            contaEspecial = false;
        }
    }

    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public boolean retira(double valor) {
        if (contaEspecial == false) {
            if (valor <= saldo) {
                saldo = saldo - valor; 
                return true;
            }
            else {
                return false; 
            }
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    void mostrarDados() {
        System.out.println("O nome do correntista é" + nomeDoCorrentista);
        System.out.println("O saldo é " + saldo);

        if (saldo < 0) {
            System.out.println("Atenção! Seu saldo está negativo!");
        }
        if (contaEspecial) {
            System.out.println("Essa conta é especial.");
        } else {
            System.out.println("Essa conta é comum.");
        }
}

}
