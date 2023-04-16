package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$m;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveBaseLongConnectionManager$m implements g	// class@000a21
{
    public final l b;

    public void LiveBaseLongConnectionManager$m(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBaseLongConnectionManager$m.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.invoke(p0);
       }
       return;
    }
}
