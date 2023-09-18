public class VetorMesclado {
    public static void main(String[] args) {
        int[] vetorA = {1, 5, 9, 0, 4};
        int[] vetorB = {2, 3, 7, 6, 8};
        int[] vetorC = new int[5];

        int indiceC = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (i % 2 == 0) {
                vetorC[indiceC] = vetorA[i];
            } else {
                vetorC[indiceC] = vetorB[i];
            }
            indiceC++;
        }

        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
