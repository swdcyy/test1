package com.kuaishou.live.core.voiceparty.core.shared.a$f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$f implements g	// class@0013fe
{
    public static final a$f b;

    static {
       a$f.b = new a$f();
    }
    public void a$f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       a.o(p0, "it");
       throw p0;
    }
}
