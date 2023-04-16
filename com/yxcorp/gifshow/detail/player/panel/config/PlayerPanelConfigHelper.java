package com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper$playerPanelConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayerPanelConfigHelper	// class@00161d
{
    public static final p a;
    public static final PlayerPanelConfigHelper b;

    static {
       PlayerPanelConfigHelper.b = new PlayerPanelConfigHelper();
       PlayerPanelConfigHelper.a = s.c(PlayerPanelConfigHelper$playerPanelConfig$2.INSTANCE);
    }
    public void PlayerPanelConfigHelper(){
       super();
    }
    public static final SlidePlayerPanelConfig a(){
       Object obj = PatchProxy.apply(null, null, PlayerPanelConfigHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerPanelConfigHelper.a.getValue();
    }
}
