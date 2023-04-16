package com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameEnergyBalanceResponse;
import com.kuaishou.live.gameinteractive.minigame.bridge.data.LiveMiniGameBridgeCommonResponse;
import com.kuaishou.live.gameinteractive.web.model.GameWebEnergyData;

public class LiveMiniGameEnergyBalanceResponse extends LiveMiniGameBridgeCommonResponse	// class@001be0
{
    public GameWebEnergyData data;
    public static final long serialVersionUID = 0xd65be2d540648cfe;

    public void LiveMiniGameEnergyBalanceResponse(GameWebEnergyData p0){
       super();
       this.data = p0;
    }
}
