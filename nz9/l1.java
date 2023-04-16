package nz9.l1;
import nz9.z0;
import jh5.a;
import hs7.d;
import rp7.a;
import com.kwai.robust.PatchProxyResult;
import ms7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import xzc.a;
import qp7.x0;
import qp7.b;
import os7.a;
import wzc.a;
import nz9.j1;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import erd.g;
import brd.t;
import nz9.k1;
import qp7.d;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View$OnClickListener;
import nz9.i1;

public class l1 extends z0	// class@003230
{

    public void l1(a p0){
       super(d.d, p0);
    }
    public void j0(boolean p0){
       a uoa = a.class;
       l1 ol1 = l1.class;
       if (PatchProxy.isSupport(ol1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol1, "1")) {
          return;
       }
       super.j0(p0);
       g og = FeedWolverinePerformanceHolder.c.c();
       WolverinePerformanceLevel wolverinePer = FeedWolverinePerformanceHelper.a("feed_wolverine_live_guide_anim_demotion_grade");
       if (og != null && wolverinePer != null) {
          WolverinePerformanceLevel wolverinePer1 = og.a();
          boolean b = wolverinePer1.isAtMost(wolverinePer);
          if (b) {
             a.a("avatarLiveAnimation", wolverinePer1);
          }
          this.E().l(Boolean.valueOf(b));
       }else {
          this.E().l(Boolean.valueOf(a.a()));
       }
       b ti = this.i;
       j1 oj1 = new j1(this);
       g e = Functions.e;
       Objects.requireNonNull(ti);
       b uob = PatchProxy.applyTwoRefs(oj1, e, ti, uoa, "22");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(oj1, "onNext");
          a.p(e, "onError");
          uob = ti.g.subscribe(oj1, e);
          a.o(uob, "liveTipsClickSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob);
       ti = this.i;
       k1 ok1 = new k1(this);
       Objects.requireNonNull(ti);
       b uob1 = PatchProxy.applyTwoRefs(ok1, e, ti, uoa, "26");
       if (uob1 != PatchProxyResult.class) {
       }else {
          a.p(ok1, "onNext");
          a.p(e, "onError");
          uob1 = ti.k.subscribe(ok1, e);
          a.o(uob1, "liveWindowClickSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       return;
    }
    public d q(){
       k ok = PatchProxy.apply(null, this, l1.class, "3");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k();
       }
       return ok;
    }
    public View$OnClickListener s0(QPhoto p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l1.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new i1(this);
    }
}
