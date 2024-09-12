package org.example.Meiodetransporte;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta está freando");
    }
}
