 package switch1;




    public class Main {
        public static void main(String[] args) {
            var estacion = "invierno";
            switch (estacion) {
                case "verano":
                    System.out.println("es verano");
                    break;

                case "invierno":
                    System.out.println("es invierno");
                    break;

                case "otoño":
                    System.out.println("es otoño");
                    break;

                case "primavera":
                    System.out.println("es primavera");
                    break;
                default:
                    System.out.println("es otra estacion");

            }

        }
    }