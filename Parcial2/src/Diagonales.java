public class Diagonales {

    // Método principal para determinar si un ADN es mutante
    public static boolean isMutant(String[] dna) throws letrasEquivocadas {
        int e = dna.length;  // Obtener el tamaño de la matriz (debe ser cuadrada)
        char[][] dnMatriz = new char[e][e];  // Crear una matriz cuadrada para almacenar el ADN
        int contador = 0;  // Contador de secuencias mutantes

        try {
            // Rellenar la matriz de ADN
            for (int i = 0; i < e; i++) {
                dnMatriz[i] = dna[i].toCharArray();  // Convertir cada cadena de ADN en un arreglo de caracteres
            }

            // Validar que los caracteres en el ADN son válidos (A, C, T, G)
            for (int i = 0; i < e; i++) {
                for (char a : dna[i].toCharArray()) {
                    if (a == 'A' || a == 'C' || a == 'T' || a == 'G') {

                    } else {
                        throw new letrasEquivocadas();  // Lanzar una excepción si se encuentra un caracter inválido
                    }
                }
            }

            // Recorrer la matriz para buscar secuencias mutantes en direcciones vertical, horizontal y diagonales
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < e; j++) {
                    // Buscar secuencias mutantes en dirección vertical
                    if (j + 3 < e && dnMatriz[i][j] == dnMatriz[i][j + 1] &&
                            dnMatriz[i][j] == dnMatriz[i][j + 2] &&
                            dnMatriz[i][j] == dnMatriz[i][j + 3]) {
                        contador++;
                    }
                    // Buscar secuencias mutantes en dirección horizontal
                    if (i + 3 < e && dnMatriz[i][j] == dnMatriz[i + 1][j] &&
                            dnMatriz[i][j] == dnMatriz[i + 2][j] &&
                            dnMatriz[i][j] == dnMatriz[i + 3][j]) {
                        contador++;
                    }
                    // Buscar secuencias mutantes en dirección diagonal principal
                    if (i + 3 < e && j + 3 < e && dnMatriz[i][j] == dnMatriz[i + 1][j + 1] &&
                            dnMatriz[i][j] == dnMatriz[i + 2][j + 2] &&
                            dnMatriz[i][j] == dnMatriz[i + 3][j + 3]) {
                        contador++;
                    }
                    // Buscar secuencias mutantes en dirección diagonal secundaria
                    if (i + 3 < e && j - 3 >= 0 && dnMatriz[i][j] == dnMatriz[i + 1][j - 1] &&
                            dnMatriz[i][j] == dnMatriz[i + 2][j - 2] &&
                            dnMatriz[i][j] == dnMatriz[i + 3][j - 3]) {
                        contador++;
                    }
                }
            }

            // Mostrar la matriz
            mostrar(dnMatriz);

        } catch (letrasEquivocadas a) {
            System.out.println("El ADN contiene un error");
        }

        // Si se encuentra más de una secuencia mutante, retornar verdadero, de lo contrario, falso
        if (contador > 1) {
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar la matriz de ADN
    public static void mostrar(char matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
        }
    }

    // Método para comprobar si el ADN es mutante o no
    public static void comprobar(String[] dna) throws letrasEquivocadas {
        if (isMutant(dna)) {
            System.out.println("Es mutante");
        } else {
            System.out.println("No es mutante");
        }
    }
}