public class Main {
    public static void main(String[] args) {
        Finca finca1 = new Finca("la cejita", "armenia", 50, "+57555555");
        System.out.println(finca1.getArea());
        System.out.println(finca1.getNombre());
        Sensor sensor1 = new Sensor();
        sensor1.setPropiaFinca(finca1);
        sensor1.setPresicion(10);
        System.out.println(sensor1.getPropiaFinca());
        System.out.println(sensor1.getPresicion());
    }
}
