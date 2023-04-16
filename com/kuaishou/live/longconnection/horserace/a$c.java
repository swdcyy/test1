package com.kuaishou.live.longconnection.horserace.a$c;
import erd.o;
import com.kuaishou.live.longconnection.horserace.a;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import com.kuaishou.android.live.model.Horse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import mf3.b;
import com.kuaishou.live.longconnection.horserace.c;
import java.util.List;

public class a$c implements o	// class@000c82
{
    public final l b;
    public final a c;

    public void a$c(a p0,l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, a$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(this.c.e != null){
          p0 = new Object[0];
          b.a("BarrierPolicy", "cancelRace, return empty", p0);
          ot = t.empty();
       }else {
          c uoc = new c(p0, this.b);
          this.c.c.add(uoc);
          ot = uoc.b();
       }
       return ot;
    }
}
