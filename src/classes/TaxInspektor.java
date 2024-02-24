package classes;

import intefeces.iActorBehaviour;
/**
 * @apiNote Класс для покупателя вида НАлоговый инспектор
 */
public class TaxInspektor implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    public TaxInspektor(){
        this.name="Налоговый Инстректор";

    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient("Тайный клиент");
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder=isCreated;
        
    }

    @Override
    public void setTakeOrder(boolean isCreated) {
        isTakeOrder=isCreated;
        
    }

    @Override
    public boolean flagNamePromo() {
        return false;
    }

    
}
