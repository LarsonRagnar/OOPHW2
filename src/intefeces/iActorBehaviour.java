package intefeces;

import classes.Actor;

/**
 * @apiNote Интрефейс методов покупателей (действующих лиц)
 */
public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean isCreated);
    public void setMakeOrder(boolean isCreated);
    public Actor getActor();
    public boolean flagNamePromo();
    

    
}
