package com.kwai.framework.network.keyconfig.a$l;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.network.degrade.g;
import java.util.Objects;
import fb6.c;
import java.lang.Runnable;
import t45.c;

public final class a$l implements g	// class@0017eb
{
    public static final a$l b;

    static {
       a$l.b = new a$l();
    }
    public void a$l(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$l.class, "1")) {
       }else {
          p0 = g.i();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, g.class, "4")) {
             c.a(new c(p0));
          }
       }
       return;
    }
}
