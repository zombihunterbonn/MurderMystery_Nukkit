package cn.lanink.murdermystery.event;

import cn.lanink.murdermystery.room.base.BaseRoom;
import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;

public class MurderMysteryPlayerDamageEvent extends MurderMysteryRoomPlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private Player damage;

    public static HandlerList getHandlers() {
        return handlers;
    }

    public MurderMysteryPlayerDamageEvent(BaseRoom room, Player damage, Player player) {
        this.room = room;
        this.damage = damage;
        this.player = player;
    }

    public Player getDamage() {
        return this.damage;
    }

}
