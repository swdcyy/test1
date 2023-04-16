package com.kuaishou.live.lite.anchorinfo.infov2.LiteAnchorInfoViewModel$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import crd.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiteAnchorInfoViewModel$1 extends Lambda implements a	// class@001e67
{
    public final b $followDisposable;

    public void LiteAnchorInfoViewModel$1(b p0){
       this.$followDisposable = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoViewModel$1.class, "1")) {
          return;
       }
       this.$followDisposable.dispose();
       return;
    }
}
