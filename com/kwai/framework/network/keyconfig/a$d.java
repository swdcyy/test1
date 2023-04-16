package com.kwai.framework.network.keyconfig.a$d;
import erd.g;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ob6.h;
import java.util.Objects;
import ob6.s;
import com.kwai.framework.network.keyconfig.BaseConfig;
import java.lang.Runnable;
import t45.c;

public final class a$d implements g	// class@0017e3
{
    public final a b;
    public final String c;
    public final RequestTiming d;

    public void a$d(a p0,String p1,RequestTiming p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$d.class, "1")) {
       }else {
          a$d tb = this.b;
          if (p0 != null) {
             p0 = p0.a();
             if (p0 != null) {
                p0 = p0.mBaseConfig;
             label_001d :
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "10")) {
                   c.a(new s(p0));
                }
                PatchProxy.onMethodExit(a$d.class, "1");
             }
          }
          p0 = null;
          goto label_001d ;
       }
       return;
    }
}
