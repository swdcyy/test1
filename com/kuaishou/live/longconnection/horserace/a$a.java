package com.kuaishou.live.longconnection.horserace.a$a;
import erd.g;
import com.kuaishou.live.longconnection.horserace.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.horserace.c;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;
import mf3.b;

public class a$a implements g	// class@000c80
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = c.a(p0);
          a$a tb = this.b;
          if (tb.d != null) {
             Iterator iterator = tb.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().c(p0);
             }
             this.b.c.clear();
          }
          Object[] objArray = new Object[0];
          b.a("BarrierPolicy", "closeAllRunner, error: "+p0, objArray);
       }
       return;
    }
}
