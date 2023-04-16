package com.kwai.plugin.dva.work.c$b;
import sj7.b;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import com.kwai.plugin.dva.work.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.work.c$b$a;
import java.lang.Exception;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class c$b implements b	// class@0013a5
{
    public final Executor a;
    public final c$c b;

    public void c$b(Executor p0,c$c p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c$b$a uob$a = new c$b$a(this, p0.g(), p0.f, p0.e, p0.c);
       this.a.execute(v0);
       return;
    }
    public boolean equals(Object p0){
       c$b uob = c$b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || uob != p0.getClass()) {
          return false;
       }
       return p0.b.equals(this.b);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
}
