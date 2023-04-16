package com.kwai.feature.api.live.base.service.router.LivePreviewRouterHost;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePreviewRouterHost extends Enum	// class@000fa8
{
    public final String mValue;
    public static final LivePreviewRouterHost[] $VALUES;
    public static final LivePreviewRouterHost ENTER_CURRENT_LIVE;

    static {
       LivePreviewRouterHost livePreviewR = new LivePreviewRouterHost("ENTER_CURRENT_LIVE", 0, "enterCurrentLive");
       LivePreviewRouterHost.ENTER_CURRENT_LIVE = livePreviewR;
       LivePreviewRouterHost[] livePreviewR1 = new LivePreviewRouterHost[]{livePreviewR};
       LivePreviewRouterHost.$VALUES = livePreviewR1;
    }
    public void LivePreviewRouterHost(String p0,int p1,String p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LivePreviewRouterHost valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePreviewRouterHost.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePreviewRouterHost.class, p0);
    }
    public static LivePreviewRouterHost[] values(){
       Object obj = PatchProxy.apply(null, null, LivePreviewRouterHost.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePreviewRouterHost.$VALUES.clone();
    }
}
