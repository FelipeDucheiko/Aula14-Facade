package aula14.facade;
import java.lang.String;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class AppCartao {
	private Usuario usuario;
	private Fatura fatura;
	private Produto produto;
        
        public AppCartao(){
            this.usuario = new Usuario();
            this.fatura = new Fatura();
        }

	public boolean login(String username, int password) {
            return usuario.realizarLogin(username, password);
	}

	public void logout() {
            usuario.realizarLogout();
	}

	public boolean pagar(double valor) {
            if (usuario.isLogged()){
                return fatura.efetuarPagamento(valor);
            } else {
                System.out.println("Faça login");
                return false;
            }
	}

	public void verFatura() {
            if (usuario.isLogged()){
                fatura.visualizarFatura();
            } else {
                System.out.println("Faça login");
            }
	}

	public boolean Comprar(String nome, double valor) {
            if (usuario.isLogged()){
                return fatura.Comprar(nome, valor);
            } else {
                System.out.println("Faça login");
                return false;
            }
	}

}
