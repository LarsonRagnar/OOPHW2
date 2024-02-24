package classes;

import intefeces.iActorBehaviour;
/**
 * @apiNote Абстрактый класс для родитель всех покупателей и других лиц
 */
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public Actor(String name) {
        this.name = name;
    }
    abstract String getName();
    abstract void setName(String name);
}
