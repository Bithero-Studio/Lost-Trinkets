package owmii.losttrinkets.client.handler.hud;

import owmii.losttrinkets.api.trinket.ITrinket;
import owmii.losttrinkets.lib.util.Ticker;

public class Toast {
    private final ITrinket trinket;
    private Ticker ticker = new Ticker(120);

    public Toast(ITrinket trinket) {
        this.trinket = trinket;
    }

    public ITrinket getTrinket() {
        return this.trinket;
    }

    public Ticker getTicker() {
        return this.ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }
}
