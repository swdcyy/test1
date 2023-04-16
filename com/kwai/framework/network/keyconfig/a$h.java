package com.kwai.framework.network.keyconfig.a$h;
import erd.g;
import rb6.b;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import ob6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import ob6.p$b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a$h implements g	// class@0017e7
{
    public final b b;
    public final a c;
    public final String d;
    public final RequestTiming e;

    public void a$h(b p0,a p1,String p2,RequestTiming p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$h.class, "1")) {
       }else {
          p0.a = true;
          a$h tc = this.c;
          a$h tb = this.b;
          a.o(p0, "config");
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(tb, p0, tc, a.class, "13")) {
             tb.c(p0.mVersion);
             Iterator iterator = tc.d.iterator();
             while (iterator.hasNext()) {
                p$b uob = iterator.next();
                try{
                   uob.a(p0);
                }catch(java.lang.Exception e3){
                   ExceptionHandler.handleCaughtException(e3);
                   goto label_0032 ;
                }
             }
          }
          PatchProxy.onMethodExit(a$h.class, "1");
       }
       return;
    }
}
