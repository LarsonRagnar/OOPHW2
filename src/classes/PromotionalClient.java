package classes;

public class PromotionalClient extends Actor{
    private String namePromo;
    private int id;
    private static int nubersOfParticipantPromo;

    public PromotionalClient(String name,int id) {
        super(name);
        this.id=id;
        
        
    }

    @Override
    String getName() {
        
        return super.name;
    }

    @Override
    void setName(String name) {
        super.name=name;
        
    }

    @Override
    public Actor getActor() {
        
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isCreated) {
        super.isMakeOrder=isCreated;
        
    }

    @Override
    public void setTakeOrder(boolean isCreated) {
        super.isTakeOrder=isCreated;
        
    }
/**
 * @apiNote врзвращает название акции
 * @return название акции 
 */
    public String getNamePromo() {
        return namePromo;
    }
/**
 * @apiNote Задает название акции
 * @param namePromo имя акции
 */
    public void setNamePromo(String namePromo) {
        this.namePromo = namePromo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/**
 * Метод задает колличество учстников акции
 * @return
 */
    public static int getNubersOfParticipantPromo() {
        return nubersOfParticipantPromo;
    }

    public static void setNubersOfParticipantPromo(int nubersOfParticipantPromo) {
        PromotionalClient.nubersOfParticipantPromo = nubersOfParticipantPromo;
    }

    @Override
    public boolean flagNamePromo() {
        return true;
    }
    
}
