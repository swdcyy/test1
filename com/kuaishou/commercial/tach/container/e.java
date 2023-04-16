package com.kuaishou.commercial.tach.container.e;
import erd.g;
import tx4.f;
import tx4.w;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements g	// class@001683
{
    public final f b;
    public final w c;

    public void e(f p0,w p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          if (tb != null) {
             tb.a(this.c, p0);
          }
       }
       return;
    }
}
