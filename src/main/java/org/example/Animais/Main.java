package org.example.Animais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Diana"));
        animais.add(new Gato("Aurora"));
        animais.add(new Vaca("Juriscleusa"));

        for(Animal animal : animais){
            animal.emitrSom();
        }
    }
}
