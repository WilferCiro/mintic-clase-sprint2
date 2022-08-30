// ASUMIR que clase Sensor ya existe;

class MovimientoSensor {

    /*
        sensor
        cantidad -> o positiva o negativa

     */

    private float cantidad;
    private Sensor sensorAsociado;

    public MovimientoSensor(float cantidad, Sensor sensorAsociado) {
        this.cantidad = cantidad;
        this.sensorAsociado = sensorAsociado;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Sensor getSensorAsociado() {
        return sensorAsociado;
    }

    public void setSensorAsociado(Sensor sensorAsociado) {
        this.sensorAsociado = sensorAsociado;
    }
}