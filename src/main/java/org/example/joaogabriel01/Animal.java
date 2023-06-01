package org.example.joaogabriel01;

class Animal {
    public String getTipo() {
        return "Animal";
    }
}

class Mamifero extends Animal {
    public String getTipo() {
        return "Mamifero";
    }
}

class Gato extends Mamifero {
    public String getTipo() {
        return "Gato";
    }
}

class Golfinho extends Mamifero {
    public String getTipo() {
        return "Gato";
    }
}

