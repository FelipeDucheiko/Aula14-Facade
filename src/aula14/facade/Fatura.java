package aula14.facade;

import java.lang.String;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class Fatura {

    private String vencimento;
    private double valor;
    private ArrayList<Produto> produtos;
    private boolean quitada;
    
    public Fatura(){
        this.vencimento = "10/11/2017";
        this.valor = 0;
        this.produtos = new ArrayList<Produto>();
        this.quitada = false;
    }

    public boolean efetuarPagamento(double valor) {
        if (this.valor <= valor) {
            quitada = true;
            double troco = valor - (this.valor);
            System.out.println("Fatura quitada. Troco de R$" + troco);
            return true;
        } else {
            System.out.println("Fatura não quitada.");
            return false;
        }
    }

    public void visualizarFatura() {
        System.out.println("Vencimento: " + vencimento);
        System.out.println("Valor: " + valor);

        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$" + p.getValor());
        }
    }

    public boolean Comprar(String nome, double valor) {
        Produto p = new Produto();
        p.setNome(nome);
        p.setValor(valor);
        
        produtos.add(p);
        this.valor = this.valor + valor;
        return true;
    }

}
