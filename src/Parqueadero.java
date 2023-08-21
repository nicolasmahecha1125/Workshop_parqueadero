public class Parqueadero {
    private Carro[][] espacioEstacionamiento;
    private  double tarifaXhora;
    public Parqueadero(int filas, int columnas, double tarifaXhora){
        espacioEstacionamiento = new Carro[filas][columnas];
        this.tarifaXhora = tarifaXhora;
    }
    public boolean parquearCarro(Carro carro, int fila,int columna){
        if(fila < 0 || fila >= espacioEstacionamiento.length || columna < 0 ||columna>= espacioEstacionamiento[0].length){
            return false;
        }
        if(espacioEstacionamiento[fila][columna] == null){
          espacioEstacionamiento[fila][columna] = carro;
          System.out.println("El carro se pudo estacionar");
          return true;
        }else{
            System.out.println("El carro no se pudo estacionar");
            return false;
        }

    }
    public  double cobraPorTiempo(Carro carro, int horas){
        return horas * tarifaXhora;
    }
    public void mostrarEstadoParqueadero(){
        for (int fila = 0; fila < espacioEstacionamiento.length; fila++){
            for (int columna = 0;columna < espacioEstacionamiento[0].length;columna++){
                if(espacioEstacionamiento[fila][columna]==null){
                    System.out.print("| |");
                }
                else{
                    System.out.print("|X|");
                }
            }
            System.out.println();
        }
    }
}
