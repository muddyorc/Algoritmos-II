public class ValorEspecifico {
    public static void main(String[]args){
        int lista[] = {20,10,30,40,50,60};

        int maior = lista[0],  menor = lista[0], posicao_maior = 0, posicao_menor = 0;

        for(int contador = 0; contador < 6; contador ++){
            if(lista[contador] > maior){
                maior = lista[contador];
                posicao_maior = contador;
            }else if(lista[contador]< menor){
                menor = lista[contador];
                posicao_menor = contador;
            }
        }
         System.out.printf("O maior valor é %d e está na posição: %d \n", maior, posicao_maior);
         System.out.printf("O menor valor é %d e está na posição: %d \n", menor, posicao_menor);
    }
}
