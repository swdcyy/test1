package com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopRightPendantFlipperConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;

public class LiveTopRightPendantFlipperConfig implements Serializable	// class@0016ce
{
    public int mFlipperIntervalInMs;
    public int mTopRightPendantMaxCount;
    public static final long serialVersionUID = 0x20871b0e653cf5c5;

    public void LiveTopRightPendantFlipperConfig(){
       super();
       this.mTopRightPendantMaxCount = 3;
       this.mFlipperIntervalInMs = 5000;
    }
    public static int getFlipperIntervalInMs(){
       Object obj = PatchProxy.apply(null, null, LiveTopRightPendantFlipperConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().u("SOURCE_LIVE").getValue("tempIndicatorWidgetConfig", LiveTopRightPendantFlipperConfig.class, new LiveTopRightPendantFlipperConfig()).mFlipperIntervalInMs;
    }
    public static int getTopRightPendantMaxCount(){
       Object obj = PatchProxy.apply(null, null, LiveTopRightPendantFlipperConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().u("SOURCE_LIVE").getValue("tempIndicatorWidgetConfig", LiveTopRightPendantFlipperConfig.class, new LiveTopRightPendantFlipperConfig()).mTopRightPendantMaxCount;
    }
}
