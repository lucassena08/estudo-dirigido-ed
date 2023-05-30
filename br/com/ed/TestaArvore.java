package br.com.ed;

import java.util.List;

public class TestaArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int[] info = { 5, 7, 2, 1, 8, 9, 8, 7, 3, 0};

        for (int i = 0; i < 10; i++) {
            boolean inseriu = arvore.inserir(info[i]);

            System.out.println("Inseriu: " + info[i] + " : " + inseriu);
        }

        List<Integer> elementos = arvore.getPreOrder();

        elementos.forEach(e -> {
            System.out.println("Elemento: " + e);
        });
    }
}
