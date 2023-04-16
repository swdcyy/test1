package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$f;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import u99.d;

public final class LiveAutoPlayModule$f implements LivePlayerErrorListener	// class@001c03
{
    public final LiveAutoPlayModule a;

    public void LiveAutoPlayModule$f(LiveAutoPlayModule p0){
       this.a = p0;
       super();
    }
    public final boolean onError(int p0,int p1){
       LiveAutoPlayModule$f uof = LiveAutoPlayModule$f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       d.h("LiveAutoPlayModule", "mOnLivePlayerErrorListener", this.a.Q());
       this.a.b0();
       return this.a.C;
    }
}
