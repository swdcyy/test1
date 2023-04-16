package com.kuaishou.live.core.show.modifycover.b$a;
import lc2.c;
import com.kuaishou.live.core.show.modifycover.b;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lc2.k;
import java.util.Objects;
import com.kuaishou.live.core.show.modifycover.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm6.i;

public class b$a implements c	// class@000d19
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.a.e.c(p0);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "8")) {
          ta.a.d();
          ta.e.e();
          RxBus.f.b(new i());
       }
       return;
    }
}
