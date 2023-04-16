package com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt$b;
import erd.a;
import ts2.f;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ts2.g;
import ts2.c;

public final class IMicSeatStateServiceKt$b implements a	// class@001588
{
    public final f b;
    public final l c;

    public void IMicSeatStateServiceKt$b(f p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IMicSeatStateServiceKt$b.class, "1")) {
          return;
       }
       IMicSeatStateServiceKt$b tb = this.b;
       IMicSeatStateServiceKt$b tc = this.c;
       if (tc != null) {
          tc = new g(tc);
       }
       tb.a(tc);
       return;
    }
}
