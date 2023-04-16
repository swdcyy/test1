package com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$a;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveSubscribeFragment$a extends a	// class@0010da
{
    public final LiveSubscribeFragment c;

    public void LiveSubscribeFragment$a(LiveSubscribeFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeFragment$a.class, "1")) {
          return;
       }
       this.c.hh(false);
       return;
    }
}
