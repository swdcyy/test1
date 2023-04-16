package f7a.c$b;
import yg5.t0;
import f7a.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import zca.f;
import com.yxcorp.gifshow.event.PipModeStatus;
import brd.y;
import yg5.s0;
import yg5.r0;

public final class c$b implements t0	// class@0022dc
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!p0) {
          c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, c.class, "11")) {
             c w = tb.w;
             if (w == null) {
                a.S("mLogger");
             }
             w.get().exitStayForAiText();
             tb.R8(true);
             Activity activity = tb.getActivity();
             Objects.requireNonNull(activity);
             activity.l3(tb.H);
             w = tb.x;
             if (w == null) {
                a.S("mAiTextFragmentVisiblePublisher");
             }
             Boolean fALSE = Boolean.FALSE;
             w.onNext(fALSE);
             w = tb.y;
             if (w != null) {
                MilanoContainerEventBus i = w.i;
                if (i != null) {
                   i.onNext(fALSE);
                }
             }
             c q = tb.q;
             if (q != null) {
                q.onNext(new f(PipModeStatus.ENABLE, 3));
             }
          }
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       if (p0) {
          c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, c.class, "10")) {
             c w = tb.w;
             if (w == null) {
                a.S("mLogger");
             }
             w.get().enterStayForAiText();
             tb.R8(false);
             Activity activity = tb.getActivity();
             Objects.requireNonNull(activity);
             activity.F2(tb.H);
             w = tb.x;
             if (w == null) {
                a.S("mAiTextFragmentVisiblePublisher");
             }
             Boolean tRUE = Boolean.TRUE;
             w.onNext(tRUE);
             w = tb.y;
             if (w != null) {
                MilanoContainerEventBus i = w.i;
                if (i != null) {
                   i.onNext(tRUE);
                }
             }
             c q = tb.q;
             if (q != null) {
                q.onNext(new f(PipModeStatus.DISABLE, 3));
             }
          }
       }
       return;
    }
}
