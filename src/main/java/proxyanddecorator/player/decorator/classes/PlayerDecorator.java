package proxyanddecorator.player.decorator.classes;

import proxyanddecorator.players.intf.PlayerInterface;

public abstract class PlayerDecorator implements PlayerInterface {
    protected PlayerInterface decoratedPlayer;

    public PlayerDecorator(PlayerInterface decoratedCar) {
        this.decoratedPlayer = decoratedCar;
    }

   
    public void writeoutProperties() {
        decoratedPlayer.writeoutProperties();
    }
}
