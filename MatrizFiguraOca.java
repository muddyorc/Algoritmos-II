public class MatrizFiguraOca {
    public static void main(String[]args){
        char[][] matriz_figura = new char[4][4];


        for(int i = 0; i < matriz_figura.length; i++){
            for(int j = 0; j < matriz_figura.length; j++){
                if (i == 0 || i == matriz_figura.length - 1 || j == 0 || j == matriz_figura.length - 1) {
                    matriz_figura[i][j] = '*';
                }else{
                    matriz_figura[i][j] = ' ';
                }
            }
        }
        for(int i = 0; i < matriz_figura.length; i++){
            for(int j = 0; j < matriz_figura.length; j++){
                System.out.print(matriz_figura[i][j] + " ");
            }
            System.out.println();
        }
    }
}
