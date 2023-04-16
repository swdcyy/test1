package com.kuaishou.live.gameinteractive.web.a$r;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import pj2.c0;
import com.kuaishou.live.core.show.share.f$b;
import pp.a;
import q87.c;

public class a$r implements g	// class@001c0b
{
    public final c b;
    public final a c;

    public void a$r(a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$r.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.c.p.o1;
          if (p0 != null) {
             p0.w1(null);
             this.b.onSuccess();
          }else {
             this.b.onError(-1, "livePlayCallerContext.mLiveAudienceShareService invalid");
          }
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "request permission failed!", objArray);
          this.b.onError(-2, "request permission failed!");
       }
       return;
    }
}
