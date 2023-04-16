package com.kuaishou.live.longconnection.horserace.b$b;
import erd.g;
import com.kuaishou.live.longconnection.horserace.b;
import java.lang.Object;
import com.kuaishou.live.longconnection.horserace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import mf3.b;
import com.kuaishou.android.live.model.Horse;
import java.util.List;
import java.util.Iterator;

public class b$b implements g	// class@000c85
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.a("FastestPolicy", "raceSuccess, "+p0.a, objArray);
          c a = p0.a;
          a.mSuccess = true;
          a.mChosen = true;
          b$b tb = this.b;
          if (tb.c != null) {
             tb.b.remove(p0);
             Iterator iterator = this.b.b.iterator();
             while (iterator.hasNext()) {
                iterator.next().c("other horse success");
             }
             this.b.b.clear();
             this.b.b.add(p0);
          }
       }
       return;
    }
}
