package br.com.ed;

public class Arvore {
    public No raiz;

    public Arvore () {
        raiz = null;
    }

    public boolean inserir (int info) {
        No atual = raiz;

        No no = new No(info);

        if (raiz == null) {
            raiz = no;
            return true;
        }

        while (atual != null) {
            no.pai = atual;

            if (info == atual.info) {
                return false;
            } else if (info < atual.info) {
                atual = atual.esquerda;
                if (atual == null) {
                    no.pai.esquerda = no;
                    return true;
                }
            } else {
                atual = atual.direita;
                if (atual == null) {
                    no.pai.direita = no;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean inserirADireita (int info) {
        No atual = raiz;

        No no = new No(info);

        if (raiz == null) {
            raiz = no;
            return true;
        }

        while (atual != null) {
            no.pai = atual;

            if (info == atual.info) {
                return false;
            }

            atual = atual.direita;
            if (atual == null) {
                no.pai.direita = no;
                return true;
            }
        }

        return false;
    }

    public boolean inserirAEsquerda (int info) {
        No atual = raiz;

        No no = new No(info);

        if (raiz == null) {
            raiz = no;
            return true;
        }

        while (atual != null) {
            no.pai = atual;

            if (info == atual.info) {

            }
        }

        return false;
    }
}
