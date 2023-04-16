package com.kuaishou.live.playeradapter.config.LivePlayerConfig$LiveConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LivePlayerConfig$LiveConfig implements Serializable	// class@000d43
{
    public boolean mEnableLiveGameAdaptiveQosCollect;
    public boolean mEnableLiveGameAdaptiveQosPlusCollect;
    public long mLiveGameAdaptiveQosCollectInterval;
    public static final long serialVersionUID = 0xa3c902a8fb08c833;

    public void LivePlayerConfig$LiveConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayerConfig$LiveConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveConfig{mLiveGameAdaptiveQosCollectInterval="+this.mLiveGameAdaptiveQosCollectInterval+", mEnableLiveGameAdaptiveQosCollect="+this.mEnableLiveGameAdaptiveQosCollect+", mEnableLiveGameAdaptiveQosPlusCollect="+this.mEnableLiveGameAdaptiveQosPlusCollect+'}';
    }
}
