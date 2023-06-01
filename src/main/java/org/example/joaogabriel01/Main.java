package org.example.joaogabriel01;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Mamifero m = new Gato();
        Animal a = m;
        System.out.println(a.getTipo());
        Golfinho g = (Golfinho)a;

        Exemplo exemplo = new Exemplo();
        System.out.println(exemplo.exemplo());

        String nome = "Telefone:12345-6789|País:Brasil";
        System.out.println(nome.substring(9,19));

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0) System.out.println("Touch " + i);
            if (i % 5 == 0) System.out.println("Health " + i);
            if (i % 3 == 0 && i % 5 == 0) System.out.println("Touch Health " + i);
        }
    }
}