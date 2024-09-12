package org.example.Animais;

public class Vaca extends Animal{
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitrSom() {
        System.out.println(nome + " faz: Muuuu!");
    }
}
