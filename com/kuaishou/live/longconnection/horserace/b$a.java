package com.kuaishou.live.longconnection.horserace.b$a;
import erd.g;
import com.kuaishou.live.longconnection.horserace.b;
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

public class b$a implements g	// class@000c84
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          p0 = c.a(p0);
          b$a tb = this.b;
          if (tb.c != null) {
             Iterator iterator = tb.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().c(p0);
             }
             this.b.b.clear();
          }
          Object[] objArray = new Object[0];
          b.a("FastestPolicy", "closeAllRunner, error: "+p0, objArray);
       }
       return;
    }
}
