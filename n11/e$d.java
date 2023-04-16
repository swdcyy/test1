package n11.e$d;
import android.view.GestureDetector$SimpleOnGestureListener;
import n11.e;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import lq5.a;
import pb1.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;

public class e$d extends GestureDetector$SimpleOnGestureListener	// class@003279
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       a0 obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.K.V;
       if (obj != null) {
          obj.A(p0);
       }
       return super.onDoubleTap(p0);
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "3")) {
          return;
       }
       e o = this.b.O;
       if (o != null) {
          o.a((int)p0.getRawY());
       }
       return;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.K;
       obj.U.w0(f.o(obj.c.getUser()), LiveStreamClickType.LIVE_LINE, 0, false, 129);
       return super.onSingleTapConfirmed(p0);
    }
}
