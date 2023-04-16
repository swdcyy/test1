package com.yxcorp.gifshow.prettify.makeup.e;
import erd.g;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.util.Objects;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.prettify.makeup.c$b;
import com.yxcorp.gifshow.camera.record.base.b;
import j8c.a;
import java.lang.String;
import com.yxcorp.gifshow.prettify.makeup.i;
import t16.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import f1c.c2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f1c.n;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import f1c.l;
import ekd.k1;

public final class e implements g	// class@001177
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (a.a().c()) {
          tb.d.m(new c$b());
       }
       Object[] objArray = new Object[0];
       a.D().E("MakeupController", "[makeup][keypath][data] ", "did receive data", objArray);
       if (i.d()) {
          i.b(new a(c2.d(tb.q), "pre_download"), tb.q);
       }
       if (!PatchProxy.applyVoid(null, tb, h.class, "16")) {
          c.k(new n(tb));
       }
       k1.o(new l(tb));
       return;
    }
}
