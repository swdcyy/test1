package nx1.i;
import tx4.o;
import nx1.j;
import cxd.c;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.System;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import java.lang.Integer;

public class i implements o	// class@003412
{
    public final c a;
    public final j b;

    public void i(j p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(e p0,w p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       LiveLogTag lIVE_SCENE_A = LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET;
       Long longx = Long.valueOf((System.currentTimeMillis() - this.b.h));
       p1 = (p1 != null)? p1.g: "UNKNOWN";
       b.d0(lIVE_SCENE_A, "load tkContainer success", "cost", longx, "source", p1);
       this.a.onNext(p0);
       this.a.onComplete();
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i.class, "2")) {
          return;
       }
       this.a.onError(p1);
       return;
    }
}
