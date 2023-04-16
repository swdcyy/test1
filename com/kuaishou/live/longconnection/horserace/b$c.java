package com.kuaishou.live.longconnection.horserace.b$c;
import erd.o;
import com.kuaishou.live.longconnection.horserace.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import brd.t;

public class b$c implements o	// class@000c86
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.just(p0.get(0));
       }
       return ot;
    }
}
