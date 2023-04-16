package com.kuaishou.live.longconnection.connector.a$b;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public class a$b implements Runnable	// class@000c5b
{
    public final v b;
    public final a c;

    public void a$b(a p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a c = this.c.c;
       _monitor_enter(c);
       a$b tc = this.c;
       if (tc.b == null) {
          this.b.onNext(tc.f);
          this.b.onComplete();
          this.c.b = true;
       }
       _monitor_exit(c);
       return;
    }
}
