package com.kuaishou.live.longconnection.horserace.b$d;
import erd.o;
import com.kuaishou.live.longconnection.horserace.b;
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

public class b$d implements o	// class@000c87
{
    public final l b;
    public final b c;

    public void b$d(b p0,l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(this.c.d != null){
          p0 = new Object[0];
          b.a("FastestPolicy", "cancelRace, return empty", p0);
          ot = t.empty();
       }else {
          c uoc = new c(p0, this.b);
          this.c.b.add(uoc);
          ot = uoc.b();
       }
       return ot;
    }
}
