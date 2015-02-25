import java.util.Scanner;

public class CalcularIMC{
	public static void main(String[] args){
		/*Declarações de variavel*/
		String nome;
		Float peso;
		Float altura;
		Float resultado;

		/*Chamada do Scanner*/
		Scanner pegaDados = new Scanner(System.in);
		
		/*Processamento*/
		System.out.println("Bem vindo ao programa de Calculo de IMC, Qual o seu nome?");
		nome = pegaDados.nextLine();

		System.out.println("Qual o seu Peso em kg "+nome+"?");
		peso = pegaDados.nextFloat();

		System.out.println("Qual a sua altura em metros "+nome+"? (ex: altura,centimetros)");
		altura = pegaDados.nextFloat();

		resultado = peso/(altura*altura);
		
		/*Saída*/
		System.out.println("Seu Indice de Massa Corporal (IMC): "+resultado);
		
		/*Condições*/
		if(resultado <= 18){
			System.out.println(nome+" voce esta abaixo do peso");
		}
		if(resultado > 18 && resultado < 25){
			System.out.println(nome+" voce esta com seu peso normal");
		}
		if(resultado > 25){
			System.out.println(nome+" voce esta acima do peso");
		}
		
	}
}
