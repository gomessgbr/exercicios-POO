package org.example.Animais;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitrSom() {
        System.out.println(nome + " faz: au au!");
    }
}
