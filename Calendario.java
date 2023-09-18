import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
        String[][] calendario = new String[5][7];

        System.out.println("Informe o dia da semana para o primeiro dia do mês (0 - Dom, 1 - Seg, ..., 6 - Sáb):");
        int primeiroDia = ler.nextInt();

        int diaAtual = 1;

        for (int semana = 0; semana < calendario.length; semana++) {
            for (int diaSemana = 0; diaSemana < calendario[semana].length; diaSemana++) {
                if (diaAtual <= 30 && (semana > 0 || diaSemana >= primeiroDia)) {
                    calendario[semana][diaSemana] = Integer.toString(diaAtual);
                    diaAtual++;
                }
            }
        }

        System.out.println("Calendário:");
        for (String dia : diasDaSemana) {
            System.out.print(dia + "\t");
        }
        System.out.println();

        for (String[] semana : calendario) {
            for (String dia : semana) {
                if (dia == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(dia + "\t");
                }
            }
            System.out.println();
        }
        ler.close();
    }
}
