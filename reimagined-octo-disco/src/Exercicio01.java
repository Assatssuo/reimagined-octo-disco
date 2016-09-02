import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {

	private static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int acao = 1;
		Fila fila = new Fila();
		while (acao != 0) {

			acao = definirAcao();

			switch (acao) {
			case 1:
				atenderCliente(fila);
				break;

			case 2:
				entrarFila(fila);
				break;
			}
		}
	}

	public static int definirAcao() {

		System.out.println("Digite o numero correpondente a ação que deseja executar");
		System.out.println("0 - Cancelar");
		System.out.println("1 - Atendente - Receber próximo cliente");
		System.out.println("2 - Cliente - Registrar-se para entrar na fila");

		return ler.nextInt();
	}

	public static void entrarFila(Fila fila) {
		System.out.println("Nome:");
		String nome = ler.next();

		System.out.println("Idade:");
		int idade = ler.nextInt();

		fila.addCliente(new Cliente(nome, idade));
	}

	public static void atenderCliente(Fila fila) {
		if (fila.getFila().size() < 1) {
			System.out.println("Não há clientes na fila");
		} else {
			System.out.println("Numero do caixa:");
			int numCaixa = ler.nextInt();

			if (numCaixa > 0 && numCaixa < 6) {
				int maior = fila.getFila().get(0).getIdade();
				int index = 0;
				for (int i = 1; i < fila.getFila().size(); i++) {
					if (fila.getFila().get(i).getIdade() > maior) {
						maior = fila.getFila().get(i).getIdade();
						index = i;
					}
				}
				fila.removeCliente(index);
			} else {
				fila.removeCliente(0);
			}
		}

	}

}
