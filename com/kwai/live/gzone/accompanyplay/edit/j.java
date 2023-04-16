package com.kwai.live.gzone.accompanyplay.edit.j;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j extends a	// class@000c03
{
    public final g c;

    public void j(g p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.a(p0);
       this.c.h();
       return;
    }
}
