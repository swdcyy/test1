package c11.b;
import c12.f;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import c11.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import c11.b$a;
import java.util.Objects;
import x61.c;
import lp3.c;
import lp3.e;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnClickListener;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl8.m;
import androidx.lifecycle.MutableLiveData;
import brd.t;
import ry1.b;
import c11.b$c;
import erd.g;

public final class b extends f	// class@00044f
{
    public final List K;
    public b L;
    public b$a M;
    public String N;
    public a0 O;
    public final long P;
    public final View$OnClickListener Q;
    public static String sLivePresenterClassName = "LiveAudienceBottomBarGiftRewardManagerPresenter";

    public void b(){
       super();
       List list = LiveLogTag.LIVE_AUDIENCE_BOTTOM_BAR.appendTag("LiveAudienceBottomBarGiftRewardManagerPresenter");
       a.o(list, "LiveLogTag.LIVE_AUDIENCE¡­tRewardManagerPresenter\"\)");
       this.K = list;
       this.P = 500;
       this.Q = new b$b(this);
    }
    public void Q(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       b$a uoa = this.a9();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, b$a.class, "3")) {
          uoa = uoa.a;
          if (uoa == null) {
             a.S("liveServiceManager");
          }
          uoa.a(c.class).O0(1040);
       }
       b tL = this.L;
       if (tL != null) {
          tL.dispose();
       }
       return;
    }
    public final b$a a9(){
       b obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.M == null) {
          this.M = new b$a(this.Q);
       }
       obj = this.M;
       a.m(obj);
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.O = obj;
       this.a9().e(this);
       return;
    }
    public void x(boolean p0){
       b$a a;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       b$a uoa = this.a9();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, b$a.class, "2")) {
          uoa.b.setValue(uoa.c);
          a = uoa.a;
          if (a == null) {
             a.S("liveServiceManager");
          }
          a.a(c.class).v1(uoa.b);
       }
       b tL = this.L;
       if (tL != null) {
          tL.dispose();
       }
       tL = this.O;
       if (tL == null) {
          a.S("livePlayCallerContext");
       }
       a0 b3 = tL.b3;
       a.o(b3, "livePlayCallerContext.mL¡­dienceStatusObtainService");
       this.L = b3.W().subscribe(new b$c(this));
       return;
    }
}
