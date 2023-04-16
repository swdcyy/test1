package com.kuaishou.live.core.show.subscribe.d$a$a;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.d$a;
import ok2.i;
import ps5.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class d$a$a extends a	// class@0010d6
{
    public final i c;
    public final b d;
    public final d$a e;

    public void d$a$a(d$a p0,i p1,b p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a$a.class, "1")) {
          return;
       }
       super.b(p0);
       d$a$a tc = this.c;
       if (tc != null) {
          tc.c(p0);
       }
       d$a$a td = this.d;
       if (td != null) {
          td.accept(Boolean.FALSE);
       }
       return;
    }
}
