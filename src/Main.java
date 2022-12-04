public class Main {
    public static void main(String[] args){
    BmiService service = new BmiService ();
        System.out.println();
        System.out.println("80 кг/1.90 м");
        System.out.println (service.calculate(80,1.90));

        System.out.println();
        System.out.println("90 кг/1.50 м");
        System.out.println (service.calculate(90,1.50));

        System.out.println();
        System.out.println("84кг /1.77 м");
        System.out.println (service.calculate(84,1.77));
    }
}