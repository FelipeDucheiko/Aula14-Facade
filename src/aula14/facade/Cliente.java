package aula14.facade;
import java.lang.String;
import java.lang.*;
import java.util.ArrayList;
import java.util.*;

public class Cliente {
        
        public static void main(String[] args) {
            System.out.println("WebSite:");
            WebSite webSite = new WebSite();
            
            webSite.login("Teste", 123321);
            webSite.Comprar("Camiseta", 50.5);
            webSite.Comprar("Perfume", 20.2);
            
            webSite.verFatura();
            
            webSite.pagar(150);
            
            webSite.logout();
            
            System.out.println("-----------------------");
            System.out.println("AppCartao:");
            
            AppCartao appCartao = new AppCartao();
            
            webSite.login("Teste", 123321); //Logando com o mesmo usuário em na versão App
            webSite.Comprar("Colar", 10);
            webSite.Comprar("Pulseira", 10);
            
            webSite.verFatura();
            
            webSite.pagar(20);
            
            webSite.logout();
            
        }

}
