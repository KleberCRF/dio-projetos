package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();

    }
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");
        for (int indice = 0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String canditado: candidatos) {
            System.out.println("O candidato selecionado foi " + canditado);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendito = valorPretendito();

            System.out.println("O canditado " + candidato + " solicitiou este valor de salário " + salarioPretendito);
            if (salarioBase >= salarioPretendito) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendito() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCanditado(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDITADO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDITADO COM CONSTRAPROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
