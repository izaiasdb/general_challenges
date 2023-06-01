package org.example.joaogabriel01;

import java.util.Arrays;
import java.util.List;

public class Exemplo {

    public static class Registro {
        boolean ativo;
        int valor;
        List<Registro> filhos;

        public Registro(boolean ativo, int valor, Registro... filhos) {
            this.ativo = ativo;
            this.valor = valor;
            this.filhos = Arrays.asList(filhos);
        }
    }

    public static int calcular(Registro registro) {
        if (!registro.ativo) {
            return 0;
        }

        int total = registro.valor;

        for (Registro filho : registro.filhos) {
            total = total + calcular(filho);
        }

        return total;
    }

    public static int exemplo() {
        Registro registro =
                new Registro(true, 100,
                    new Registro(true, 10,
                        new Registro(false, 1),
                        new Registro(true, 2)
                ),
                new Registro(false, 20,
                    new Registro(true, 3),
                    new Registro(true, 4)),
                new Registro(true, 30));

        return calcular(registro);
    }

}
