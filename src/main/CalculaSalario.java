package main;

import java.util.Scanner;

public class CalculaSalario {

  public static double calculaDescontoINSS(double salary) {
    double desconto = 0;

    if (salary <= 1212) {
      desconto = salary * 0.075;
    } else {
      desconto += 1212 * 0.075;
      if (salary > 1212 && salary <= 2427.35) {
        desconto += (salary - 1212.01) * 0.09;
      } else {
        desconto += (2427.35 - 1212.01) * 0.09;
        if (salary > 2427.35 && salary <= 3641.03) {
          desconto += (salary - 2427.36) * 0.12;
        } else {
          desconto += (3641.03 - 2427.36) * 0.12;
          if (salary > 3641.04 && salary < 7087.22) {
            desconto += (salary - 3641.04) * 0.14;
          } else {
            desconto += (7087.22 - 3641.04) * 0.14;
          }
        }
      }
    }

    return desconto;
  }

  public static double calculaDescontoIR(double salary) {
    double desconto = 0;

    if (salary > 1903.98) {
      if (salary <= 2826.65) {
        desconto += (salary - 1903.99) * 0.075;
      } else {
        desconto += (2826.65 - 1903.99) * 0.075;
        if (salary > 2826.65 && salary <= 3751.05) {
          desconto += (salary - 2826.66) * 0.15;
        } else {
          desconto += (3751.05 - 2826.66) * 0.15;
          if (salary > 3751.05 && salary <= 4664.68) {
            desconto += (salary - 3751.06) * 0.225;
          } else {
            desconto += ((4664.68 - 3751.06) * 0.225 + (salary - 4664.68) * 0.275);
          }
        }
      }
    }

    return desconto;
  }

  public static double calculaSalarioLiquido(double salary) {
    double descontoINSS = calculaDescontoINSS(salary);
    double descontoIR = calculaDescontoIR(salary);

    return salary - descontoINSS - descontoIR;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro salário:");
    double first = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double second = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double third = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double fourth = scan.nextDouble();

    System.out.println("Digite o primeiro salário:");
    double fifth = scan.nextDouble();

    scan.close();

  }

}
