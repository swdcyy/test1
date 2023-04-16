package com.kwai.framework.network.keyconfig.KeyConfigInitModule$b;
import erd.g;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public final class KeyConfigInitModule$b implements g	// class@0017d8
{
    public final KeyConfigInitModule b;

    public void KeyConfigInitModule$b(KeyConfigInitModule p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KeyConfigInitModule$b.class, "1")) {
       }else {
          a.p(p0, "event");
          KeyConfigInitModule$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, KeyConfigInitModule.class, "5")) {
             tb.l0(RequestTiming.LOGOUT);
          }
       }
       return;
    }
}
