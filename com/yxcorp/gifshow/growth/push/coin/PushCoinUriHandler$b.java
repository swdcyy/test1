package com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler$b;
import qh7.b;
import java.lang.String;
import qh7.c;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PushCoinUriHandler$b implements b	// class@001498
{
    public final String a;
    public final c b;

    public void PushCoinUriHandler$b(String p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PushCoinUriHandler$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.a(p0);
       PatchProxy.onMethodExit(PushCoinUriHandler$b.class, "1");
       return;
    }
}
