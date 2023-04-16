package com.kwai.nearby.local.detail.label.LocalSimpleLabelElement$b;
import erd.g;
import com.kwai.nearby.local.detail.label.LocalSimpleLabelElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LocalSimpleLabelElement$b implements g	// class@000f89
{
    public final LocalSimpleLabelElement b;

    public void LocalSimpleLabelElement$b(LocalSimpleLabelElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalSimpleLabelElement$b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.J = p0.intValue();
       }
       return;
    }
}
