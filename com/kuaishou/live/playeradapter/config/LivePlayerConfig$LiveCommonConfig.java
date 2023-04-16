package com.kuaishou.live.playeradapter.config.LivePlayerConfig$LiveCommonConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePlayerConfig$LiveCommonConfig implements Serializable	// class@000d42
{
    public String mLiveAdaptiveConfig;
    public static final long serialVersionUID = 0x4fec8cdf447f5b23;

    public void LivePlayerConfig$LiveCommonConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayerConfig$LiveCommonConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommonConfig{mLiveAdaptiveConfig=\'"+this.mLiveAdaptiveConfig+'''+'}';
    }
}
