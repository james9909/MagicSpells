package com.nisovin.magicspells.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MinionTargetEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private Player owner;
    private LivingEntity target;
    private LivingEntity minion;
    private boolean cancelled;

    public MinionTargetEvent(Player owner, LivingEntity target, LivingEntity minion) {
        this.owner = owner;
        this.target = target;
        this.minion = minion;
    }

    public Player getOwner() {
        return this.owner;
    }

    public LivingEntity getTarget() {
        return this.target;
    }

    public LivingEntity getMinion() {
        return this.minion;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
