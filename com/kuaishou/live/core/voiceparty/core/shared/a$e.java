package com.kuaishou.live.core.voiceparty.core.shared.a$e;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import ut7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.StateChart;

public final class a$e implements g	// class@0013fd
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a c = this.b.c;
          if (c == null) {
             a.S("stateChart");
          }
          a.o(p0, "it");
          c.l(p0);
       }
       return;
    }
}
