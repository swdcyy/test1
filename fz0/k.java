package fz0.k;
import im8.g;
import c12.f;
import androidx.lifecycle.MutableLiveData;
import mk1.a0;
import fz0.k$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import x61.c;
import lp3.c;
import lp3.e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import fz0.i;
import lnc.c3$a;
import lnc.c3;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import fz0.o;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uw1.m;
import ry1.b;
import ok1.c;
import z61.b;
import fz0.d;
import fz0.f;
import fz0.e;
import fz0.c;
import ok.x;
import wh5.c;
import fz0.b;
import brd.t;
import fz0.j;
import erd.g;
import crd.b;

public class k extends f implements g	// class@0023e7
{
    public a0 K;
    public m L;
    public e M;
    public a N;
    public b O;
    public boolean P;
    public boolean Q;
    public i R;
    public c S;
    public final MutableLiveData T;
    public final MutableLiveData U;
    public LiveTimeConsumingUserStatusResponse$LiveGiftPanelWarningConfig V;
    public a0 W;
    public LiveAudienceGiftBottomBarEntryService X;
    public static String Y = "live_gift_click_frequency_control";
    public static int Z = 3000;
    public static String sLivePresenterClassName = "LiveAudienceGiftBottomBarEntryPresenterV2";

    public void k(){
       super();
       this.T = new MutableLiveData();
       this.U = new MutableLiveData();
       this.W = new a0();
       this.X = new k$a(this);
    }
    public void Q(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "5")) {
          return;
       }
       this.M.a(c.class).O0(1003);
       ok = this.R;
       if (ok != null) {
          ok.b(p0);
       }
       c3.c(this.W, i.a);
       return;
    }
    public final void a9(String p0,String p1,int p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, k.class, "9")) {
          return;
       }
       if (!this.M.b()) {
          this.N.yk(this.N.o6()).d(p0).f("PRE_SEND_GIFT").g(p2).e(p1).a();
       }else {
          b.P(b.a, "[LiveAudienceGiftBottomBarEntryPresenterV2][logTraceInfo]service manager cleared");
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new o());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.s8(m.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.M = uoe;
       this.N = uoe.a(a.class);
       this.P = this.v8("LIVE_IS_SLIDE_CONTAINER", uBoolean).booleanValue();
       this.Q = this.v8("LIVE_IS_SLIDE_AVAILABLE", uBoolean).booleanValue();
       this.O = this.r8("LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE");
       return;
    }
    public void x(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "4")) {
          return;
       }
       c uoc = PatchProxy.apply(null, this, ok, "8");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
          uoc.mFeatureId = 1003;
          uoc.mIsVisible = Boolean.TRUE;
          uoc.mClickCallback = new d(this);
          uoc.mShowCallback = new f(this);
          uoc.mHiddenCallback = new e(this);
          uoc.m(R.drawable.arg_RES_7f0810dd);
          uoc.setClickLogParams(new c(this));
          if (c.b()) {
             uoc.a(R.drawable.arg_RES_7f08111a);
          }else {
             uoc.a(R.drawable.arg_RES_7f08111b);
          }
          if (!c.b()) {
             uoc.c = new b(this);
          }
       }
       this.S = uoc;
       this.T.setValue(uoc);
       this.M.a(c.class).v1(this.T);
       this.X7(this.O.W().subscribe(new j(this)));
       return;
    }
}
