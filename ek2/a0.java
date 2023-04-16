package ek2.a0;
import c12.f;
import ek2.a0$a;
import nsd.u;
import ek2.a0$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ek2.b;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$b;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a0 extends f	// class@002741
{
    public LiveAudienceStayInfoRecommendDialog K;
    public a0 L;
    public BaseFragment M;
    public LiveAudienceStayInfoDispatcherPresenter$b N;
    public b O;
    public static final a0$a P;
    public static String sLivePresenterClassName;

    static {
       a0.P = new a0$a(null);
    }
    public void a0(){
       super();
       this.O = new a0$b(this);
    }
    public void Q(boolean p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "3")) {
          return;
       }
       a0 tN = this.N;
       String str = "mLiveAudienceStayInfoDispatcherService";
       if (tN == null) {
          a.S(str);
       }
       tN.a(2, this.O);
       tN = this.N;
       if (tN == null) {
          a.S(str);
       }
       tN.a(3, this.O);
       this.K = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.L = obj;
       obj = this.r8("LIVE_FRAGMENT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_FRAGMENT\)");
       this.M = obj;
       obj = this.q8(LiveAudienceStayInfoDispatcherPresenter$b.class);
       a.o(obj, "inject\(\n        LiveAudi¡­tcherService::class.java\)");
       this.N = obj;
       return;
    }
    public void x(boolean p0){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "2")) {
          return;
       }
       a0 tN = this.N;
       String str = "mLiveAudienceStayInfoDispatcherService";
       if (tN == null) {
          a.S(str);
       }
       tN.b(2, this.O);
       tN = this.N;
       if (tN == null) {
          a.S(str);
       }
       tN.b(3, this.O);
       return;
    }
}
