public class ContaCorrente extends Conta {

    double imprestimo;

    public ContaCorrente(Cliente cliente){
        super(cliente);


    }


    public void pedirImprestimo(double valor){
        if(imprestimo > 2000){
            System.out.println("Limite atigindo pague o imprestimo");
        } else {
            super.saldo += valor;
            imprestimo += valor ;
        }
    }


    @Override
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente ===" );
        imprimirAtributos();
    }

}
