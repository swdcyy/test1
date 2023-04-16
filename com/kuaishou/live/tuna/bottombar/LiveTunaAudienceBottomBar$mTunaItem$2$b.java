package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2$b;
import a71.c;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar;
import pp3.b$a;

public final class LiveTunaAudienceBottomBar$mTunaItem$2$b implements c	// class@000f8f
{
    public final LiveTunaAudienceBottomBar$mTunaItem$2 a;

    public void LiveTunaAudienceBottomBar$mTunaItem$2$b(LiveTunaAudienceBottomBar$mTunaItem$2 p0){
       this.a = p0;
       super();
    }
    public final void onShow(){
       if (PatchProxy.applyVoidWithListener(null, this, LiveTunaAudienceBottomBar$mTunaItem$2$b.class, "1")) {
          return;
       }
       LiveTunaAudienceBottomBar$mTunaItem$2 this$0 = this.a.this$0;
       this$0.d = true;
       LiveTunaAudienceBottomBar e = this$0.e;
       if (e != null) {
          e.onShow();
       }
       PatchProxy.onMethodExit(LiveTunaAudienceBottomBar$mTunaItem$2$b.class, "1");
       return;
    }
}
