public class Main {
    public static void main(String[] args) {
        //crear parqueadero
        Parqueadero parqueadero = new Parqueadero(5,10,250);

        //crear carros
        Carro carroHonda = new Carro("PBC125","Honda","centrium");
        Carro carroToyota = new Carro("CTT257","Toyota","Caprico II");
        Carro carroFord = new Carro("TRE447", "Ford","Centellum I");
        Carro carroWingo= new Carro("DRD158","Wingo","Saturno");
        Carro carroSpica = new Carro("STAR647","Spica","Star I");
        Carro carroSubaru = new Carro("Star789","Subaru","Star IV");

        //parquear carros nuevos espacios y ocupados
         parqueadero.parquearCarro(carroHonda,2,3);
         parqueadero.parquearCarro(carroToyota,0,9);
         parqueadero.parquearCarro(carroFord,2,3);
         parqueadero.parquearCarro(carroWingo,1,2);
         parqueadero.parquearCarro(carroSpica,0,1);
         parqueadero.parquearCarro(carroSubaru,2,4);

         //cobro por horas
        double CostocarroHonda = parqueadero.cobraPorTiempo(carroHonda,4);
        double CostocarroToyota = parqueadero.cobraPorTiempo(carroToyota,2);
        double CostocarroWingo = parqueadero.cobraPorTiempo(carroWingo,6);
        double CostocarroSpica = parqueadero.cobraPorTiempo(carroSpica,7);
        double CostocarroSubaru = parqueadero.cobraPorTiempo(carroSubaru,8);

        //imprimir costo estacionamiento
        System.out.println("costo por tiempo de estacionamiento");
        System.out.println(carroHonda +": $"+CostocarroHonda);
        System.out.println(carroToyota +": $"+CostocarroToyota);
        System.out.println(carroWingo +": $"+CostocarroWingo);
        System.out.println(carroSpica +": $"+CostocarroSpica);
        System.out.println(carroSubaru+": $"+CostocarroSubaru);

        //estado del parqueadero
        System.out.println("estado del parqueadero");
        parqueadero.mostrarEstadoParqueadero();







    }
}