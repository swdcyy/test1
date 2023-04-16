package kf0.o$b;
import kf0.f$a;
import kf0.o;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import java.util.Objects;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import java.util.List;

public final class o$b implements f$a	// class@002d17
{
    public final o a;
    public final String b;
    public final CDNUrl[] c;

    public void o$b(o p0,String p1,CDNUrl[] p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "2")) {
          return;
       }
       if (a.g(this.b, this.a.k) ^ 0x01) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "fetchAnimResource "+"onError return, mCurrentAnimKey "+this.a.k, false, 4, null);
          return;
       }else {
          o$b ta = this.a;
          o$b tc = this.c;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(tc, ta, o.class, "5")) {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "onFetchAnimResourceError", false, 4, null);
             ta.e(ta.o, tc);
          }
          return;
       }
    }
    public void onStart(){
       PatchProxy.applyVoid(null, this, o$b.class, "3");
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
       }else {
          a.p(p0, "bitmaps");
          if (a.g(this.b, this.a.k) ^ 0x01) {
             TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "fetchAnimResource "+"onSuccess return, mCurrentAnimKey "+this.a.k, false, 4, null);
          }else {
             o$b ta = this.a;
             o$b tc = this.c;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidTwoRefs(p0, tc, ta, o.class, "4")) {
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "onFetchAnimResourceSuccess", false, 4, null);
                if (p0.isEmpty()) {
                   ta.e(ta.o, tc);
                }else {
                   ta.b(p0);
                }
             }
          }
       }
       return;
    }
}
