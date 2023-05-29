package br.com.ed;

import java.util.Set;

public class TestaArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int[] info = { 5, 7, 2, 1, 8, 9, 8, 7, 3, 0};

        for (int i = 0; i < 10; i++) {
            boolean inseriu = arvore.inserir(info[i]);
        }

        Set<Integer> elementos = arvore.getSubArvoreEsquerda();

        elementos.forEach(e -> {
            System.out.println("Elemento: " + e);
        });
    }
}
