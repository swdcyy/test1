package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$a;
import erd.g;
import ts2.f;
import msd.l;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ts2.g;
import ts2.c;

public final class IMicSeatStateServiceKt$a implements g	// class@001586
{
    public final f b;
    public final l c;

    public void IMicSeatStateServiceKt$a(f p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMicSeatStateServiceKt$a.class, "1")) {
       }else {
          p0 = this.b;
          IMicSeatStateServiceKt$a tc = this.c;
          if (tc != null) {
             tc = new g(tc);
          }
          p0.c(tc);
       }
       return;
    }
}
