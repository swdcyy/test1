package ek2.c;
import c12.f;
import ek2.c$a;
import t02.a0;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import ek2.b;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;

public final class c extends f	// class@002747
{
    public a K;
    public a0 L;
    public m M;
    public LiveAudienceStayInfoDispatcherPresenter$b N;
    public b O;
    public static String sLivePresenterClassName = "LiveAudienceStayInfoAnchorPortraitStylePresenter";

    public void c(){
       super();
       this.O = new c$a(this);
    }
    public static final a0 a9(c p0){
       p0 = p0.L;
       if (p0 == null) {
          a.S("mLivePlayCallerContext");
       }
       return p0;
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       c tN = this.N;
       if (tN == null) {
          a.S("mLiveAudienceStayInfoDispatcherService");
       }
       tN.a(1, this.O);
       this.K = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.L = obj;
       this.M = this.r8("LIVE_BASIC_CONTEXT");
       obj = this.q8(LiveAudienceStayInfoDispatcherPresenter$b.class);
       a.o(obj, "inject\(\n        LiveAudi¡­tcherService::class.java\)");
       this.N = obj;
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       c tN = this.N;
       if (tN == null) {
          a.S("mLiveAudienceStayInfoDispatcherService");
       }
       tN.b(1, this.O);
       return;
    }
}
