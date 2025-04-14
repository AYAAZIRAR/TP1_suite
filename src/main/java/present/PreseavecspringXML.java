package present;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PreseavecspringXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");//charge la configuration Spring à partir du fichier spring-config.xml, qui contient la définition des beans
        IMetier metier=(IMetier) context.getBean("metier");//permet d'obtenir un objet du type spécifié par son nom et son interface ou classe.
        System.out.println("RES="+metier.calcul());
    }
}
