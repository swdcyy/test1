package com.kuaishou.commercial.tach.container.c;
import oo8.h;
import tx4.f;
import tx4.w;
import java.lang.Object;
import oo8.g;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.StringBuilder;

public final class c implements h	// class@001681
{
    public final f a;
    public final w b;

    public void c(f p0,w p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onBundleLoadFinish(w p0){
       g.a(this, p0);
    }
    public void onLoadBundleError(int p0,String p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "1")) {
          return;
       }
       a.p(p1, "errorType");
       a.p(p2, "errorMsg");
       c ta = this.a;
       if (ta != null) {
          ta.a(this.b, new Throwable("loadBundleError, errorType: "+p1+", errorMsg: "+p2));
       }
       return;
    }
}
