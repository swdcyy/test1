package d92.k$d;
import com.yxcorp.gifshow.widget.SwipeLayout$c;
import d92.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.jakewharton.rxbinding2.internal.Notification;
import brd.y;
import t02.a0;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import tq5.c;
import android.app.Activity;
import z12.x;

public class k$d extends SwipeLayout$c	// class@0024b2
{
    public final k a;

    public void k$d(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$d.class, "2")) {
          return;
       }
       k$d ta = this.a;
       if (ta.y == null) {
          return;
       }
       ta.w.onNext(Notification.INSTANCE);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k$d.class, "1")) {
          return;
       }
       k$d ta = this.a;
       if (ta.z == null) {
          return;
       }
       ta.x = true;
       ta.p.w1.ub(CloseLiveReason.RIGHT_SWIPE);
       x.x(this.a.v);
       return;
    }
}
