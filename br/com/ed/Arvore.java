package br.com.ed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arvore {
    public No raiz;
    public long tamanho = 0;

    public Arvore() {
        raiz = null;
    }

    public boolean inserir(int info) {
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
                    tamanho++;
                    return true;
                }
            } else {
                atual = atual.direita;
                if (atual == null) {
                    no.pai.direita = no;
                    tamanho++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean inserirADireita(int info) {
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
                tamanho++;
                return true;
            }
        }

        return false;
    }

    public boolean inserirAEsquerda(int info) {
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

            atual = atual.esquerda;
            if (atual == null) {
                no.pai.esquerda = no;
                return true;
            }

        }

        return false;
    }

    public boolean retirarADireita() {
        No atual = raiz;

        if (atual.direita == null) {
            return false;
        }

        while (atual != null) {
            atual = atual.direita;

            if (atual.direita == null) {
                atual.pai.direita = null;
                tamanho--;
                return true;
            }
        }

        return false;
    }

    public boolean retirarAEsquerda() {
        No atual = raiz;

        if (atual.esquerda == null) {
            return false;
        }

        while (atual != null) {
            atual = atual.esquerda;

            if (atual.esquerda == null) {
                atual.pai.esquerda = null;
                tamanho--;
                return true;
            }
        }

        return false;
    }

    public long getTamanho() {
        return tamanho;
    }

    public boolean ehUmaFolha(int info) {
        No atual = raiz;

        if (atual.esquerda == null && atual.direita == null) {
            return true;
        }

        while (atual != null) {
            if (info == atual.info) {
                if (atual.esquerda == null && atual.direita == null) {
                    return true;
                }
            } else if (info < atual.info) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }

        return false;
    }

    public Set<Integer> getSubArvoreEsquerda () {
        Set<Integer> elementos = new HashSet<>();

        No atual = raiz;

        if (atual.esquerda == null) {
            return null;
        }

        while (atual != null) {
            if (atual.direita != null && atual != raiz) {
                elementos.add(atual.direita.info);
            }

            if (atual.esquerda != null) {
                elementos.add(atual.esquerda.info);
            }
            atual = atual.esquerda;
        }

        return elementos;
    }
    
    public Set<Integer> getSubArvoreDireita () {
        Set<Integer> elementos = new HashSet<>();

        No atual = raiz;

        if (atual.direita == null) {
            return null;
        }

        while (atual != null) {
            if (atual.direita != null) {
                elementos.add(atual.direita.info);
            }

            if (atual.esquerda != null && atual != raiz) {
                elementos.add(atual.esquerda.info);
            }
            atual = atual.direita;
        }

        return elementos;
    }

    public List<Integer> getPreOrder () {
        List<Integer> elementos = new ArrayList<Integer>();

        No atual = raiz;

        // Sub árvore esquerda
        while (true) {
            elementos.add(atual.info);
            if (atual.esquerda == null) break;
            atual = atual.esquerda;
        }

        while (atual != raiz) {
            atual = atual.pai;
            if (atual.direita != null)
                elementos.add(atual.direita.info);
        }

        // -------------------------
        // Sub árvore direita
        while (true) {
            atual = atual.direita;
            elementos.add(atual.info);
            if (atual.direita == null) break;
        }

        while (true) {
            atual = atual.pai;
            if (atual == raiz) break;
            if(atual.esquerda != null)
                elementos.add(atual.esquerda.info);
        }
        // --------------------------

        return elementos;
    }

    public ArrayList<Integer> getInOrder () {
        ArrayList<Integer> elementos = new ArrayList<>();



        return elementos;
    }

    public ArrayList<Integer> getPostOrder () {
        ArrayList<Integer> elementos = new ArrayList<>();



        return elementos;
    }

}