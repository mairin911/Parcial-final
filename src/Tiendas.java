public class Tiendas { 
  
    public static int contarVentasAltas(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int venta : fila) {
                if (venta > 500000) {
                    contador++;
                }
            }
        }
        return contador;
    }

     public static double promedioVentasBajas(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int venta : fila) {
                if (venta < 100000) {
                    suma += venta;
                    contador++;
                }
            }
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }
     public static void imprimirVentasSinActividad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    System.out.println("Venta sin actividad en posición [" + i + "][" + j + "]");
                }
            }
        }
    }
    public static int[] posicionMayorVenta(int[][] matriz) {
        int maxVenta = Integer.MIN_VALUE;
        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxVenta) {
                    maxVenta = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
     public static void main(String[] args) {
        int[][] ventas = {
            {200000, 0, 550000, 80000},
            {1000000, 400000, 50000, 0},
            {0, 750000, 120000, 300000}
        };
    
              System.out.println("Ventas mayores a $500.000: " + contarVentasAltas(ventas));
        System.out.println("Promedio de ventas menores a $100.000: " + promedioVentasBajas(ventas));

        imprimirVentasSinActividad(ventas);

        int[] posicionMax = posicionMayorVenta(ventas);
        System.out.println("Mayor venta en posición [" + posicionMax[0] + "][" + posicionMax[1] + "]");
    }
}

