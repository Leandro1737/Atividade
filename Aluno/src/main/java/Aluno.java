import java.util.Scanner; // Importação da classe Scanner para entrada de dados

/**
 * A classe Aluno contém métodos para calcular a média aritmética das notas de um aluno
 * e verificar se ele foi aprovado ou reprovado com base em uma média mínima.
 */
public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    /**
     * Construtor padrão da classe Aluno.
     */
    public Aluno() {
    }

    /**
     * Método para definir as notas do aluno.
     * 
     * @param nota1 A primeira nota do aluno.
     * @param nota2 A segunda nota do aluno.
     * @param nota3 A terceira nota do aluno.
     * @param nota4 A quarta nota do aluno.
     */
    public void definirNotas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Calcula a média aritmética das 4 notas do aluno.
     * 
     * @return A média aritmética das notas.
     */
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    /**
     * Verifica se o aluno foi aprovado ou reprovado com base na média.
     * A média mínima para aprovação é 6.0.
     * 
     * @return "Aprovado" se a média for maior ou igual a 6, caso contrário, retorna "Reprovado".
     */
    public String verificarAprovacao() {
        double media = calcularMedia();
        return (media >= 6) ? "Aprovado" : "Reprovado";
    }

    /**
     * Exibe as notas do aluno.
     */
    public void exibirNotas() {
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        // Solicitando as notas do usuário
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Definindo as notas no objeto aluno
        aluno.definirNotas(nota1, nota2, nota3, nota4);

        // Exibindo as notas
        aluno.exibirNotas();

        // Calculando e exibindo a média e o resultado
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Resultado: " + aluno.verificarAprovacao());

        scanner.close();
    }
}
