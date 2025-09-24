package application;

import java.util.ArrayList;

import application.lista.ListaSimples;
import application.pilha.PilhaSimples;

public class Main {
    public static void main(String[] args) {
      //Declaração de Vetores
        int[] numeros = new int[5];

      //Declaração de Matrizes
       int [] [] matriz = new int[5][3];

       //Declaração de Lista Simples
       ListaSimples lista = new ListaSimples();
       lista.adicionar("Primeiro");
       lista.adicionar("Segundo");
       lista.adicionar("Terceiro");
       lista.remover(1);

    
       System.out.println(lista);

       PilhaSimples pilha = new PilhaSimples (5);
      pilha.empilhar("Primeiro elemento");
      pilha.empilhar("Segundo elemento");
      
System.out.println(pilha.desempilhar());
       pilha.empilhar("Terceiro Elemento");
System.out.println(pilha.desempilhar());
System.out.println(pilha.desempilhar());
System.out.println(pilha.desempilhar());

    }
}

