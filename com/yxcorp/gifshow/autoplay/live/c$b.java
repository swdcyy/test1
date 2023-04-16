package com.yxcorp.gifshow.autoplay.live.c$b;
import com.kwai.video.waynelive.listeners.LivePlayerErrorListener;
import com.yxcorp.gifshow.autoplay.live.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import u99.d;

public class c$b implements LivePlayerErrorListener	// class@001c11
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public boolean onError(int p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       d.h("LiveAutoPlayController", "mOnLivePlayerErrorListener", this.a.C());
       return this.a.x;
    }
}
