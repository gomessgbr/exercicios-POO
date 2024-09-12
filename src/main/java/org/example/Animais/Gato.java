package org.example.Animais;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitrSom() {
        System.out.println(nome + " faz: Miau!");
    }
}
