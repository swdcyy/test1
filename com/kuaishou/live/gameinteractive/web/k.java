package com.kuaishou.live.gameinteractive.web.k;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import v43.c;

public class k implements g	// class@001c16
{
    public final a$k b;

    public void k(a$k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.C().t("GameInteractiveCommonBridgeImpl", "sendGiftToAnchor failed! Request giftToken Failed!", objArray);
          p0 = this.b.c;
          if (p0 != null) {
             p0.onError(-1, "request GiftToken Failed!");
          }
       }
       return;
    }
}
