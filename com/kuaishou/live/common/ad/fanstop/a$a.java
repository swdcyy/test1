package com.kuaishou.live.common.ad.fanstop.a$a;
import erd.g;
import com.kuaishou.live.common.ad.fanstop.a;
import h91.a;
import java.lang.Object;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopAuthorityResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a implements g	// class@000e63
{
    public final a b;
    public final a c;

    public void a$a(a p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          this.b.onSuccess(p0);
       }
       return;
    }
}
