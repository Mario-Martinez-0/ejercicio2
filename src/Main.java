public class Main {
    public static void main(String[] args) {

        int numeroIf = -3;

        if (numeroIf > 0) {
            System.out.println("el numero es posifivo");
        } else {
            System.out.println("el numero es negativo");
        }
        System.out.println("");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("numeroWhile " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("");

        int numeroDo = 2;
        do {
            System.out.println("numeroDo " + numeroDo);
            numeroDo = numeroDo + 1;

        }while (numeroDo < 3);

        System.out.println("");

        for (int numeroFor = 0; numeroFor <=3 ; numeroFor++){
            System.out.println("NumeroFor " + numeroFor);
        }

        System.out.println("");

        String Estacion = "invierno";
        switch (Estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primaver");
                break;
            case  "otono":
                System.out.println("es otroño");
                break;
            default:
                System.out.println("el valor no es un estacion");

        }

    }
}