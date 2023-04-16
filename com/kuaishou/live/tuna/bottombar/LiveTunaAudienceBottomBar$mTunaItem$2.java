package com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar;
import java.lang.Object;
import pp3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z61.b;
import java.lang.Boolean;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2$a;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2$b;
import com.kuaishou.live.tuna.bottombar.LiveTunaAudienceBottomBar$mTunaItem$2$c;

public final class LiveTunaAudienceBottomBar$mTunaItem$2 extends Lambda implements a	// class@000f91
{
    public final LiveTunaAudienceBottomBar this$0;

    public void LiveTunaAudienceBottomBar$mTunaItem$2(LiveTunaAudienceBottomBar p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       c obj = PatchProxy.apply(null, this, LiveTunaAudienceBottomBar$mTunaItem$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.mFeatureId = 1017;
       obj.mIsVisible = Boolean.FALSE;
       obj.mShouldReportLogWithBottomBar = false;
       obj.mIconRes = 0x7f081135;
       obj.mTextRes = 0x7f10040d;
       obj.mClickCallback = new LiveTunaAudienceBottomBar$mTunaItem$2$a(this);
       obj.mShowCallback = new LiveTunaAudienceBottomBar$mTunaItem$2$b(this);
       obj.mHiddenCallback = new LiveTunaAudienceBottomBar$mTunaItem$2$c(this);
       return obj;
    }
}
