package com.kuaishou.live.core.voiceparty.core.shared.a$g;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$g implements Runnable	// class@0013ff
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$g.class, "1")) {
          return;
       }
       this.b.j();
       return;
    }
}
