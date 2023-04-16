package com.kwai.component.misc.livestatusquery.v2.LiveEndStatusCheckV3Config;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveEndStatusCheckV3Config implements Serializable	// class@0009cf
{
    public long mActiveAndBackgroundIntervalMs;
    public long mInactiveAndBackgroundIntervalMs;
    public long mInactiveAndForegroundIntervalMs;
    public static final long serialVersionUID = 0x6517d350206bdbd7;

    public void LiveEndStatusCheckV3Config(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveEndStatusCheckV3Config.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEndStatusCheckV3Config{mInactiveAndBackgroundIntervalMs="+this.mInactiveAndBackgroundIntervalMs+", mActiveAndBackgroundIntervalMs="+this.mActiveAndBackgroundIntervalMs+", mInactiveAndForegroundIntervalMs="+this.mInactiveAndForegroundIntervalMs+'}';
    }
}
