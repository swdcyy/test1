package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2$a;
import a71.a;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar;
import pp3.b$a;

public final class LiveTunaAudienceBottomBar$mTunaItem$2$a implements a	// class@000f8e
{
    public final LiveTunaAudienceBottomBar$mTunaItem$2 a;

    public void LiveTunaAudienceBottomBar$mTunaItem$2$a(LiveTunaAudienceBottomBar$mTunaItem$2 p0){
       this.a = p0;
       super();
    }
    public final boolean a(int p0){
       LiveTunaAudienceBottomBar obj;
       if (PatchProxy.isSupport2(LiveTunaAudienceBottomBar$mTunaItem$2$a.class, "1")) {
          obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, LiveTunaAudienceBottomBar$mTunaItem$2$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.this$0.e;
       if (obj != null) {
          obj.onClick();
       }
       PatchProxy.onMethodExit(LiveTunaAudienceBottomBar$mTunaItem$2$a.class, "1");
       return false;
    }
}
