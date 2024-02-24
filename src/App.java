import classes.Actor;
import classes.Market;
import classes.OrdinaryClient;
import classes.PromotionalClient;
import classes.SpecialClient;
import classes.TaxInspektor;
/**
 * @apiNote Класс добавляет клиентов и инициализирует весь цикл покупки 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Market perekrestok=new Market();
        Actor client1=new OrdinaryClient("Misha");
        Actor client2=new OrdinaryClient("Kiti");
        Actor client3=new SpecialClient("Putin", 777);
        TaxInspektor client4=new TaxInspektor();
        PromotionalClient client5=new PromotionalClient("Vasya",  12);
        PromotionalClient client6=new PromotionalClient("Alesha", 13);
        PromotionalClient client7=new PromotionalClient("zheka", 14);
        PromotionalClient.setNubersOfParticipantPromo(2);
        client5.setNamePromo("50%");
        client6.setNamePromo("50%");
        client7.setNamePromo("50%");

        perekrestok.acceptToMarket(client3);
        perekrestok.acceptToMarket(client2);
        perekrestok.acceptToMarket(client1);
        perekrestok.acceptToMarket(client4);
        perekrestok.acceptToMarket(client5);
        perekrestok.acceptToMarket(client6);
        perekrestok.acceptToMarket(client7);




        perekrestok.update();

        
    }
}
