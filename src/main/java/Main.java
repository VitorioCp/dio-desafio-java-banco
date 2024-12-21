public class Main {
    public static void main(String[] args){
        Cliente vitorio = new Cliente();
        vitorio.setNome("vitorio");

        Conta cc = new ContaCorrente(vitorio);

        if(cc instanceof ContaCorrente){
            ((ContaCorrente) cc).pedirImprestimo(100);
        }
        cc.imprimirExtrato();
    }
}
