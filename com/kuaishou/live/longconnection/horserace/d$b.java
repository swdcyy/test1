package com.kuaishou.live.longconnection.horserace.d$b;
import erd.g;
import com.kuaishou.live.longconnection.horserace.d;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.y;

public class d$b implements g	// class@000c8e
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          d$b tb = this.b;
          tb.k = tb.k + 1;
          p0.subscribe(tb);
       }
       return;
    }
}
