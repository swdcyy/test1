package com.kuaishou.pagedy.request.c;
import erd.g;
import com.kuaishou.pagedy.request.d;
import com.kuaishou.pagedy.request.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ro4.a;
import java.lang.StringBuilder;
import nv.c;

public class c implements g	// class@000a9b
{
    public final a b;
    public final d c;

    public void c(d p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.c.a.remove(this.b.f);
          a uoa = this.c.b.remove(this.b.f);
          if (uoa != null) {
             uoa.onError(p0);
             c.f("pre req error throwable"+p0.getMessage());
          }
       }
       return;
    }
}
