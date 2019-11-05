package aula14.facade;
import java.lang.String;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class Usuario {
	private String username;
	private int password;
	private boolean logged;
	private Fatura fatura;
        
        public Usuario(){
            this.username = "Teste";
            this.password = 123321;
            this.logged = false;
        }

	public boolean realizarLogin(String username, int password) {
            if (this.username == username && this.password == password){
                this.logged = true;
                System.out.println("Login efetuado");
                return true;
            } else {
                System.out.println("Erro no Login");
                return false;
            }	
	}

	public void realizarLogout() {
            if (isLogged()){
                this.logged = false;
            }
	}

	public boolean isLogged() {
		return this.logged;
	}

}
