package com.kuaishou.live.core.show.subscribe.edit.o$b;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.edit.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wk2.a;

public class o$b extends a	// class@00111f
{
    public final o c;

    public void o$b(o p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
          return;
       }
       super.b(p0);
       a.b();
       return;
    }
}
