package intefeces;

import java.util.List;

import classes.Actor;
/**
 * @apiNote Интерефейс методов Маркета
 */
public interface iMarketBehavior {
    public void acceptToMarket(iActorBehaviour actor);
    public void releaseFromMarket(List<Actor>actors);
    public void update();

}
