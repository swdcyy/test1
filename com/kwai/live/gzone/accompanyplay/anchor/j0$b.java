package com.kwai.live.gzone.accompanyplay.anchor.j0$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.j0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class j0$b implements g	// class@000b17
{
    public final j0 b;

    public void j0$b(j0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$b.class, "1")) {
       }else {
          this.b.V8();
          b.I(LiveLogTag.LIVE_GZONE_ACCOMPANY, "requestBindAccountApi", p0);
       }
       return;
    }
}
