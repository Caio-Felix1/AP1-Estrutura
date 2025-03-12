import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void ex1() {
        JOptionPane.showMessageDialog(null, "Conversão de Fahrenheit para Celsius");
        Double farh = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit (double):"));
        Double calculo = (farh - 32) * 5/9;
        String calc_formatado = String.format("%.2f", calculo);
        JOptionPane.showMessageDialog(null, farh + " Fahrenheit em Celsius: " + calc_formatado);
    }

    public static void ex2() {
        JOptionPane.showMessageDialog(null, "Conversão de Celsius para Fahrenheit");
        Double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius (double):"));
        Double calculo = (celsius * 9 / 5) + 32;
        String calc_formatado = String.format("%.2f", calculo);
        JOptionPane.showMessageDialog(null, celsius + " Celsius em Fahrenheit: " + calc_formatado);
    }

    public static void ex3() {
        JOptionPane.showMessageDialog(null, "Cálculo do IMC");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso (double):"));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura (double):"));
        Double calculo = peso / (altura * altura);
        String altura_formatada = String.format("%.2f", altura);
        String calc_formatado = String.format("%.2f", calculo);
        JOptionPane.showMessageDialog(null,  "IMC: " + peso + " / " + altura_formatada + "² = " + calc_formatado);
    }

    public static void ex4() {
        JOptionPane.showMessageDialog(null, "Cálculo do Quadrado e o Cubo do Valor");
        Double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (double):"));
        Double quadrado = numero * numero;
        Double cubo = quadrado * numero;
        JOptionPane.showMessageDialog(null,  "Quadrado de " + numero + ": " + quadrado +
                                                                    "\nCubo de " + numero + ": " + cubo);
    }

    public static void ex5() {
        JOptionPane.showMessageDialog(null, "Cálculo da Área do Triângulo");
        Double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da base do triãngulo (double):"));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura do triângulo (double):"));
        Double calculo = base * altura / 2;
        String calc_formatado = String.format("%.2f", calculo);
        JOptionPane.showMessageDialog(null,  "Área do triãngulo: " + base + " * " + altura + " / 2 =" + calc_formatado);
    }

    public static void ex6() {
        JOptionPane.showMessageDialog(null, "Cálculo do Delta");
        JOptionPane.showMessageDialog(null, "Delta = B² - 4 * A * C");
        Double valor_a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A (double):"));
        Double valor_b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B (double):"));
        Double valor_c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C (double):"));
        Double delta = (valor_b * valor_b) - 4 * valor_a * valor_c;
        JOptionPane.showMessageDialog(null,  "Delta = " + valor_b + "² - 4 * " + valor_a + " * " + valor_c + " = " + delta);
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }
}