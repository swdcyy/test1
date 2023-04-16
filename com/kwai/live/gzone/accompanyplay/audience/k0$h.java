package com.kwai.live.gzone.accompanyplay.audience.k0$h;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import w12.a;

public class k0$h	// class@000b91
{
    public final k0 a;

    public void k0$h(k0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       k0$h oh = k0$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "1")) {
          return;
       }
       this.a.z.n(p0);
       return;
    }
}
