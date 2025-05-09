package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCanditado(1900.0);
        analisarCanditado(2200.0);
        analisarCanditado(2000.0);
    }
        static void analisarCanditado(double salarioPretendido) {
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDITADO");
            }else if (salarioBase == salarioPretendido)
                System.out.println("LIGAR PARA O CANDITADO COM CONSTRAPROPOSTA");
            else {
                System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            }
        }
}
