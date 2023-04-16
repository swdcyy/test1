package com.kwai.yoda.function.b;
import xz7.a;
import com.kwai.yoda.function.c;
import java.lang.Object;
import erd.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b extends a	// class@0011cb
{
    public final g c;
    public final c d;

    public void b(c p0,Object p1,g p2){
       this.d = p0;
       this.c = p2;
       super(p1);
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.accept(p0);
       return;
    }
}
