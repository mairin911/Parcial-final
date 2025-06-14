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

    public static void main(String[] args) {
        int[][] ventas = {
            {200000, 0, 550000, 80000},
            {1000000, 400000, 50000, 0},
            {0, 750000, 120000, 300000}
        };
    
            System.out.println("Ventas mayores a $500.000 : " + contarVentasAltas(ventas));
            System.out.println("Promedio de ventas menores a $100.000 : " + promedioVentasBajas(ventas));
}}
        

