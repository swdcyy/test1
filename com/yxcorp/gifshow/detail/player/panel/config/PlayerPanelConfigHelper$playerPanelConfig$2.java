package com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper$playerPanelConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uw9.c;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.yxcorp.gifshow.detail.player.panel.config.SimplePlayerPanelElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SpeedElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SaveTrafficElementConfig;
import com.yxcorp.gifshow.detail.player.panel.config.SmallWindowElementConfig;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import l3a.b;

public final class PlayerPanelConfigHelper$playerPanelConfig$2 extends Lambda implements a	// class@00161c
{
    public static final PlayerPanelConfigHelper$playerPanelConfig$2 INSTANCE;

    static {
       PlayerPanelConfigHelper$playerPanelConfig$2.INSTANCE = new PlayerPanelConfigHelper$playerPanelConfig$2();
    }
    public void PlayerPanelConfigHelper$playerPanelConfig$2(){
       super(0);
    }
    public final SlidePlayerPanelConfig invoke(){
       boolean b;
       Object[] objArray = null;
       SlidePlayerPanelConfig obj = PatchProxy.apply(objArray, this, PlayerPanelConfigHelper$playerPanelConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SlidePlayerPanelConfig.class;
       String str = "";
       String str1 = c.a.getString("PlayerPanelConfig", str);
       if (str1 != null && str1 != str) {
          objArray = b.a(str1, obj);
       }
       if (objArray == null) {
          SlidePlayerPanelConfig slidePlayerP = new SlidePlayerPanelConfig(false, null, null, null, null, null, null, null, null, 510, null);
       }
       if (!objArray.isPanelEnable()) {
          b = false;
          c.C(b);
          if (NasaExperimentUtils.B()) {
             b.a = b;
          }else {
             c.B(b);
          }
          c.G("original");
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
