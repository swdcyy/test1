package com.kuaishou.live.gameinteractive.web.a$p;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.MotionEvent;
import lq5.a;
import pp.a;
import q87.c;

public class a$p implements g	// class@001c09
{
    public final c b;
    public final a c;

    public void a$p(a p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$p.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.c.p.V;
          if (p0 != null) {
             p0.A(null);
             this.b.onSuccess();
          }else {
             this.b.onError(-1, "livePlayCallerContext.mLikeService invalid");
          }
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "request permission failed!", objArray);
          this.b.onError(-2, "request permission failed!");
       }
       return;
    }
}
