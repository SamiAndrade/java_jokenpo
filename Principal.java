package principal;

import java.util.Scanner;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String menu = """
				----------------------
				1 - Papel
				
				2 - Pedra
				
				3 - Tesoura
				
				----------------------
				""";
		Random gerador = new Random();
		int escolhaUsuario;
		int escolhaComputador;
		int minhasVitorias = 0;
		int vitoriasComputador = 0;
		int empates = 0;
		System.out.println("\n*****************************");
		System.out.println("Jogo - Pedra, Papel e Tesoura");
		System.out.println("\n*****************************");
		System.out.println("Escolha uma das opções para jogar: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(menu);
			escolhaUsuario = leitura.nextInt();
			escolhaComputador = gerador.nextInt(3) + 1;
		
		switch(escolhaComputador) {
		case 1:
			System.out.println("O computador escolheu papel.");
			break;
		case 2:
			System.out.println("O computador escolheu pedra.");
			break;
		case 3:
			System.out.println("O computador escolheu tesoura.");
			break;
		}
		
		if(escolhaUsuario == escolhaComputador) {
			System.out.println("O jogo deu em empate.\n");
			empates++;
		}
		else if((escolhaUsuario - escolhaComputador) == -1 ||
				(escolhaUsuario - escolhaComputador) == 2){
			System.out.println("Parabéns, você ganhou!\n");
			minhasVitorias++;
			
		} else {
			System.out.println("O computador venceu!\n");
			vitoriasComputador++;
			
			}
		}
		System.out.println("Placar: Suas vitórias:["+minhasVitorias+"]" + " Computador:[" 
		+vitoriasComputador +"]" +" Empates:["+ empates+ "]");
	}
	
}
