public class BMEX03 {
   
    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    public void abreConta(String nome, double deposito, boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    public void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0;
        contaEspecial = false;
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
