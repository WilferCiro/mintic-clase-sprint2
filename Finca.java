public class Finca {
    /*
        nombre
        ciudad
        area m2
        telefono
     */
    /*
     * IMPORTANTE: las variables, métodos y atributos van con camel case
     * las clases van con la primer letra en mayúscula
     * */

    private String nombre;
    private String ciudad;
    private float area;
    private String telefono;

    public Finca(String nombre, String ciudad, float area, String telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.area = area;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
