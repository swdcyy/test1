package com.kwai.framework.krn.init.preload.c$d;
import a96.r;
import com.kwai.framework.krn.init.preload.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$d extends r	// class@001604
{
    public final Object[] a;
    public final c b;

    public void c$d(c p0,Object[] p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void resolve(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       this.a[0] = p0;
       return;
    }
}
