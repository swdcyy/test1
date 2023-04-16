package com.kuaishou.live.common.core.component.pendant.pendantgroup.i$c;
import cw1.c0;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;

public class i$c implements c0	// class@001721
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       i$c uoc = i$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       uoc = this.a;
       uoc.m = p0;
       uoc.K5();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$c.class, "1")) {
          return;
       }
       i$c ta = this.a;
       ta.m = -1;
       ta.K5();
       return;
    }
    public void c(long p0){
       if (PatchProxy.isSupport(i$c.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, i$c.class, "2")) {
          return;
       }
       i$c ta = this.a;
       ta.m = -1;
       ta.K5();
       return;
    }
}
