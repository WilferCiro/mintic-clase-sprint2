// CLASE LLAMADA Finca, existe



class Sensor {
    /*
    * Finca
    * ubicación
    * tipo -> agua, luz
    * presicion
    * */
    private Finca propiaFinca;
    private String ubicacion;
    private float presicion;
    private TipoSensor_Enum tipo;

    public Finca getPropiaFinca() {
        return propiaFinca;
    }

    public void setPropiaFinca(Finca propiaFinca) {
        this.propiaFinca = propiaFinca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPresicion() {
        return presicion;
    }

    public void setPresicion(float presicion) {
        this.presicion = presicion;
    }

    public TipoSensor_Enum getTipo() {
        return tipo;
    }

    public void setTipo(TipoSensor_Enum tipo) {
        this.tipo = tipo;
    }
}
