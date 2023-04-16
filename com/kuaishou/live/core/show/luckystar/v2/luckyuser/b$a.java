package com.kuaishou.live.core.show.luckystar.v2.luckyuser.b$a;
import sfc.a;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import mkc.b;
import mkc.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.luckystar.util.b;
import ic2.d;
import java.lang.Runnable;

public class b$a extends a	// class@000d03
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       super.b(p0);
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, b.class, "8")) {
          tc.w.setVisibility(8);
          b[] uobArray = new b[]{b.d};
          c.d(tc.B, uobArray);
          b.I(LiveLogTag.LUCKY_STAR, "requestOpenResult failed", p0);
          b.j(tc.B, b.f(p0), new d(tc));
       }
       return;
    }
}
