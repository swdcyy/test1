package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameOOMConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public class LiveMiniGameOOMConfig implements Serializable	// class@001bd8
{
    public String alert;
    public boolean androidEnabled;
    public float androidMinThreshold;
    public static final long serialVersionUID = 0x4802f2bdadadd8a2;

    public void LiveMiniGameOOMConfig(){
       super();
       this.androidEnabled = false;
    }
    public static LiveMiniGameOOMConfig get(){
       Object obj = PatchProxy.apply(null, null, LiveMiniGameOOMConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("liveMiniGameOOMConfig", LiveMiniGameOOMConfig.class, new LiveMiniGameOOMConfig());
    }
}
