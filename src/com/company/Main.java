package com.company;

public class Main {

    public static void main(String[] args) {
        Motocicleta moto1 = new Motocicleta("Suzuki Kawasaki", "Suzuki", "0", 3800.0, "nuevo", "120 kg");
        System.out.println(moto1.toString());
        moto1.pagarCuota(500.0);
        System.out.println(moto1.toString());
    }
}
