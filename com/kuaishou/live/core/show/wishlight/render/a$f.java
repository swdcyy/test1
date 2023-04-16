package com.kuaishou.live.core.show.wishlight.render.a$f;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.render.a;
import xy2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.wishlight.render.a$a;
import gz2.h;
import pz2.c;

public final class a$f implements Runnable	// class@0012b7
{
    public final a b;
    public final a c;

    public void a$f(a p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$f.class, "1")) {
          return;
       }
       if (!this.b.m()) {
          a.l.b("[bindEffect]taskId:"+this.c.N());
          this.b.l().e(this.c);
          this.b.e = this.c;
       }
       return;
    }
}
