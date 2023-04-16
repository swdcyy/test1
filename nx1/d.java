package nx1.d;
import erd.g;
import nx1.j;
import sx4.e$a;
import cxd.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.System;
import java.lang.Long;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nx1.i;
import tx4.o;
import rx4.a;
import java.lang.Throwable;

public final class d implements g	// class@00340d
{
    public final j b;
    public final e$a c;
    public final c d;

    public void d(j p0,e$a p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "EvaluateScript Success", "cost", Long.valueOf((System.currentTimeMillis() - tb.h)));
          if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, j.class, "2")) {
             Object[] objArray = new Object[]{tb.c};
             tb.e.k(tc, new i(tb, td), tb.b, objArray);
          }
       }else {
          td.onError(new Throwable("tk load failed"));
          b.Z(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "on load failed to create view");
       }
       return;
    }
}
