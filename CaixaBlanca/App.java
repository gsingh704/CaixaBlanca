package CaixaBlanca;
public class App{
    public static void main(String[] args) {
//  Feu un petit algorisme en Java i amb l'entorn NetBeans que ens doni resposta a una petició que ha fet Trànsit referent a la retirada de circulació de cotxes massa contaminants.
// L'algorisme ha de tenir un Array[] d'entrada amb tots els vehicles que s'han de verificar. Aquests vehicles tindran una matrícula, una data de matriculació i tipus de carburant GASOLINA | GASOIL.



    String[][] vehicles  = {
        {"0000 AAA", "29-10-2015", "Diesel"},
        {"8698 AAA", "29-10-2019", "Gasolina"},
        {"0000 AAA", "29-10-2009", "Diesel"},
        {"8698 AAA", "29-10-2006", "Gasolina"},
        {"0000 AAA", "29-10-2015", "Diesel"},
        {"8698 AAA", "29-10-2001", "Diesel"}
        
    };

        System.out.println("---------------------LListar vehicles---------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s%-30s%-20s \n", "Matricula", "Data de matriculacio", "Carburant");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.printf("%-25s%-26s%-10s \n", vehicles[i][0], vehicles[i][1], vehicles[i][2]);
        }
        // Hem de recórrer el vector i a cada pas mirar si el vehicle  va ser matriculat abans de 2010. Sí és així, quedarà marcat i afegit a un comptador. Seguidament, caldrà mirar si el vehicle  funciona amb DIESEL, i si és així, caldrà retirar el vehicle  de circulació. És a dir, els vehicles més antics del 2010 i que siguin motor DIESEL, s'hauran d'incloure a un Array nou que es dirà vehiclesRetirats[]. 
// La funció haurà de retornar aquest Array ple amb els vehicles retirats.
       String[][] vehiclesretirat = null;
        int contador = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i][2].equals("Diesel") && Integer.parseInt(vehicles[i][1].substring(6)) < 2010) {
                contador++;
            }
        }
        vehiclesretirat = new String[contador][3];
        int j = 0;
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i][2].equals("Diesel") && Integer.parseInt(vehicles[i][1].substring(6)) < 2010) {
                vehiclesretirat[j][0] = vehicles[i][0];
                vehiclesretirat[j][1] = vehicles[i][1];
                vehiclesretirat[j][2] = vehicles[i][2];
                j++;
            }
        }
        System.out.println("---------------------LListar vehicles retirats---------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s%-30s%-20s \n", "Matricula", "Data de matriculacio", "Carburant");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < vehiclesretirat.length; i++) {
            System.out.printf("%-25s%-26s%-10s \n", vehiclesretirat[i][0], vehiclesretirat[i][1], vehiclesretirat[i][2]);
    }
   }
}
