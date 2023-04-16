package com.kwai.live.gzone.emotion.h;
import sfc.a;
import com.kwai.live.gzone.emotion.f$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.emotion.f;
import com.kwai.library.widget.popup.common.c;

public class h extends a	// class@000ce1
{
    public final f$a c;

    public void h(f$a p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.b(p0);
       f x = this.c.u.x;
       if (x != null) {
          x.q(0);
       }
       return;
    }
}
