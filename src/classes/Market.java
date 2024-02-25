package classes;

import java.util.ArrayList;
import java.util.List;

import intefeces.iActorBehaviour;
import intefeces.iMarketBehavior;
import intefeces.iQueueBehaviour;
import intefeces.iReturnOrder;
/**
 * @apiNote Класс инициализирующий процесс покупки и выводящий этот самый процесс на экран 
 */ 
public class Market implements iMarketBehavior,iQueueBehaviour,iReturnOrder {
    private List<iActorBehaviour> queue;

public Market() {
this.queue = new ArrayList<iActorBehaviour>();
}

@Override
public void acceptToMarket(iActorBehaviour actor) {
System.out.println("клиент "+actor.getActor().getName() + " пришел в магазин ");
takeInQueue(actor);
}

@Override
public void takeInQueue(iActorBehaviour actor) {
this.queue.add(actor.getActor());
System.out.println("клиент "+actor.getActor().getName() + " добавлен в очередь ");
}

@Override
public void releaseFromMarket(List<Actor> actors) {
    for (Actor actor : actors) {
        System.out.println("клиент "+actor.getName() + " ушел из магазина ");
    }


}

@Override
public void update() {
takeOrder();
giveOrder();
returnOrder();
releaseFromQueue();
}

@Override
public void giveOrder() {
for (iActorBehaviour actor : queue) {
if (actor.isMakeOrder()) {
actor.setTakeOrder(true);
System.out.println("клиент "+actor.getActor().getName() + " получил свой заказ ");
}

}
}




@Override
public void releaseFromQueue() {
List<Actor> releaseActors = new ArrayList<>();
for (iActorBehaviour actor : queue) {
if (actor.isTakeOrder()) {
releaseActors.add(actor.getActor());
System.out.println("клиент "+actor.getActor().getName() + " ушел из очереди ");
}
}
releaseFromMarket(releaseActors);
}

@Override
public void takeOrder() {
for (iActorBehaviour actor : queue) {
if (!actor.isMakeOrder()) {
actor.setMakeOrder(true);
System.out.println("клиент "+actor.getActor().getName() + " сделал заказ ");

}
}

}

// @Override
// public void returnOrder() {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
// }
/**
 * @apiNote МЕтод который в идеале должен делать возврат через флаг flagNamePromo но что то пошло не так
 */
@Override
public void returnOrder() {
    int clientAction=0;
    for (iActorBehaviour actor:queue){
        if (clientAction<=PromotionalClient.getNubersOfParticipantPromo()) {   // TODO доделать реализацию возврата
            if (actor.flagNamePromo()) {
                actor.setTakeOrder(true);
                System.out.println("клиент "+actor.getActor().getName() + " получил свой заказ ");
                clientAction++;
                }else{
                    System.out.println("клиент "+actor.getActor().getName() + " получил получил возврат по причине ограничения ");
                }
        }

    }
        
}
}




