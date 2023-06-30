package main;

import java.util.Scanner;

public class CalculaSalario {

  public static double calculaDescontoINSS(double salario) {
    double desconto = 0;

    if (salario <= 1212) {
      desconto = salario * 0.075;
    } else {
      desconto += 1212 * 0.075;
      if (salario > 1212 && salario <= 2427.35) {
        desconto += (salario - 1212) * 0.09;
      } else {
        desconto += (2427.35 - 1212) * 0.09;
        if (salario > 2427.35 && salario <= 3641.03) {
          desconto += (salario - 2427.35) * 0.12;
        } else {
          desconto += (3641.03 - 2427.35) * 0.12;
          if (salario > 3641.04 && salario < 7087.22) {
            desconto += (salario - 3641.03) * 0.14;
          } else {
            desconto += (7087.22 - 3641.03) * 0.14;
          }
        }
      }
    }

    return desconto;
  }

  public static double calculaDescontoIR(double salario) {
    double desconto = 0;

    if (salario > 1903.98) {
      if (salario <= 2826.65) {
        desconto += (salario - 1903.98) * 0.075;
      } else {
        desconto += (2826.65 - 1903.98) * 0.075;
        if (salario > 2826.65 && salario <= 3751.05) {
          desconto += (salario - 2826.65) * 0.15;
        } else {
          desconto += (3751.05 - 2826.65) * 0.15;
          if (salario > 3751.05 && salario <= 4664.68) {
            desconto += (salario - 3751.05) * 0.225;
          } else {
            desconto += ((4664.68 - 3751.05) * 0.225 + (salario - 4664.68) * 0.275);
          }
        }
      }
    }

    return desconto;
  }

  public static double calculaSalarioLiquido(double salario) {
    double descontoINSS = calculaDescontoINSS(salario);
    double descontoIR = calculaDescontoIR(salario);

    return salario - descontoINSS - descontoIR;
  }

  public static void retornoPorSalario(double salario) {
    double descontoINSS = calculaDescontoINSS(salario);
    double descontoIR = calculaDescontoIR(salario);
    double salarioLiquido = calculaSalarioLiquido(salario);

    System.out.printf("Salário bruto: %.2f %n", salario);
    System.out.printf("Quanto pagou ao INSS: %.2f %n", descontoINSS);
    System.out.printf("Quanto pagou de Imposto de Renda: %.2f %n", descontoIR);
    System.out.printf("Salário líquido: %.2f %n", salarioLiquido);
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro salário:");
    double primeiro = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double segundo = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double terceiro = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double quarto = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double quinto = scan.nextDouble();

    System.out.println("Primeiro sálario:");
    retornoPorSalario(primeiro);
    System.out.println("  -----  ");
    System.out.println("Segundo sálario:");
    retornoPorSalario(segundo);
    System.out.println("  -----  ");
    System.out.println("Terceiro sálario:");
    retornoPorSalario(terceiro);
    System.out.println("  -----  ");
    System.out.println("Quarto sálario:");
    retornoPorSalario(quarto);
    System.out.println("  -----  ");
    System.out.println("Quinto sálario:");
    retornoPorSalario(quinto);

    scan.close();

  }

}
