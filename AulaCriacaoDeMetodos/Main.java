package AulaCriacaoDeMetodos;

public class Main {

    public static void main(String[] args) {

        System.out.println("AulaCriacaoDeMetodos.Calculadora: ");
        Calculadora.soma(4, 8);
        Calculadora.subtracao(20, 7);
        Calculadora.multiplicacao(6, 17.3);
        Calculadora.divisao(24, 3);

        System.out.println("AulaCriacaoDeMetodos.Mensagem: ");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
