package com.kuaishou.live.effect.resource.download.common.e$c;
import e03.a$a;
import com.kuaishou.live.effect.resource.download.common.e;
import iy2.b;
import e03.a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sz2.a;
import f03.a;
import java.lang.Boolean;

public class e$c implements a$a	// class@001b36
{
    public final b a;
    public final boolean b;
    public final a c;
    public final e d;

    public void e$c(e p0,b p1,boolean p2,a p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "2")) {
          return;
       }
       if (this.c.b() != null && p0 != null) {
          this.c.b().b(p0);
       }
       return;
    }
    public void b(boolean p0){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       p0 = (p0 && this.b != null)? true: false;
       uoc.a(p0);
       return;
    }
}
