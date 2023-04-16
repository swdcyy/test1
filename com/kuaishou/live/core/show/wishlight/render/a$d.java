package com.kuaishou.live.core.show.wishlight.render.a$d;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.render.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import pz2.a;
import com.kuaishou.live.core.show.wishlight.render.a$a;
import gz2.h;
import pz2.c;
import hz2.c;
import zf1.d;

public final class a$d implements Runnable	// class@0012b5
{
    public final a b;
    public final boolean c;
    public final String d;

    public void a$d(a p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "1")) {
          return;
       }
       a e = this.b.e;
       if (e != null) {
          a.l.b("[clearEffect]rending magicFaceId:"+e.b());
          this.b.l().a();
          a$d tb = this.b;
          a f = tb.f;
          if (f != null) {
             f.h(e, this.c, this.d, tb.l().l);
          }
          this.b.e = null;
       }
       return;
    }
}
