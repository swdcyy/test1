package com.yxcorp.dynamicfeature.video.redpack.a$b;
import erd.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.kwai.video.editorsdk2.TailEffectGenerator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$b implements f	// class@0011d9
{
    public final Ref$BooleanRef a;
    public final TailEffectGenerator b;

    public void a$b(Ref$BooleanRef p0,TailEffectGenerator p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       if (this.a.element != null) {
          this.b.cancel();
       }
       return;
    }
}
