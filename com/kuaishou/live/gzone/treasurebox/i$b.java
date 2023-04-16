package com.kuaishou.live.gzone.treasurebox.i$b;
import r53.b$a;
import com.kuaishou.live.gzone.treasurebox.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m67.p;
import m67.p$b;

public class i$b implements b$a	// class@001c6c
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "2")) {
          return;
       }
       p.b().d(this.a.K);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       p.b().c(this.a.K);
       return;
    }
}
