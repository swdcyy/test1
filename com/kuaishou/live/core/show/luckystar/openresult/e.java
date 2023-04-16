package com.kuaishou.live.core.show.luckystar.openresult.e;
import sfc.a;
import com.kuaishou.live.core.show.luckystar.openresult.f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class e extends a	// class@000ce9
{
    public final f c;

    public void e(f p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.b(p0);
       e tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, f.class, "9")) {
          tc.R8();
          tc.P8();
       }
       return;
    }
}
