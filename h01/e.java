package h01.e;
import im8.g;
import k51.c;
import h01.e$a;
import lm1.i;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hm2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.models.Gift;
import lm1.f;
import java.lang.Boolean;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import lm1.c;
import fq5.b;
import w91.a;
import lp3.c;
import java.util.Map;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import java.lang.Runnable;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u07.t$a;
import java.lang.CharSequence;
import lnc.a1;
import h01.a;
import u07.u;
import h01.b;
import u07.t;
import u07.j;
import com.kwai.robust.PatchProxyResult;
import h01.h;
import mk1.b;
import mk1.h;
import h01.j;
import m01.m;
import om1.a;

public class e extends c implements g	// class@0025e7
{
    public a0 p;
    public b q;
    public e r;
    public a s;
    public h t;
    public j u;
    public m v;
    public i w;
    public static String sLivePresenterClassName = "LivePrivilegeGiftSendPresenter";

    public void e(){
       super();
       this.w = new e$a(this);
    }
    public final void P8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, e.class, "6")) {
          return;
       }
       if (!this.r.b()) {
          this.s.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[LivePrivilegeGiftSendPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public final void R8(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "5")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), liveStreamPa, null, k.class, "6")) {
          ClientEvent$ElementPackage uElementPack = k.c("LIVE_LEVEL_NOT_ENOUGH_BUTTON");
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("user_level", Integer.valueOf(p0));
          jsonObject.a0("index", Integer.valueOf(p1));
          uElementPack.params = jsonObject.toString();
          u1.u(1, uElementPack, k.b(liveStreamPa));
       }
       return;
    }
    public final void S8(Gift p0,int p1,boolean p2,String p3,String p4,int p5,f p6){
       e uoe = this;
       object oobject = p6;
       e uoe1 = e.class;
       if (PatchProxy.isSupport(uoe1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Boolean.valueOf(p2),p3,p4,Integer.valueOf(p5),oobject};
          if (PatchProxy.applyVoid(objArray, this, uoe1, "7")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       hashMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       c uoc = new c("", 0, hashMap, uoe.p.b().t5().a(a.class).d6(), null);
       b uob = new b(uoe.p.Z2.getLiveStreamId(), GiftMessage.createSelfGiftMessage(p0, p1), p0, p1, false, true, 4);
       uoc.c(new d(oobject, uoe1, p6.g(), g.a(p5, "")));
       uoe.p.V1.G4(uoc);
       return;
    }
    public final void V8(LiveWealthGradeInfo p0,String p1,Runnable p2,Runnable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "4")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          p0 = p0.mCurrentGrade;
          ClientContent$LiveStreamPackage liveStreamPa = this.p.Z2.a();
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), liveStreamPa, null, ok, "5")) {
             k.f(p0, liveStreamPa, "LIVE_LEVEL_NOT_ENOUGH_POPUP", 4);
          }
          t$a uoa = new t$a(this.getActivity());
          uoa.z0(p1);
          uoa.R0(a1.p(R.string.arg_RES_7f102eb6));
          uoa.T0(a1.p(R.string.arg_RES_7f1007e2));
          uoa.t0(new a(this, p2));
          uoa.u0(new b(p3));
          j.d(uoa);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(b.class);
       this.t = this.q8(h.class);
       this.u = this.q8(j.class);
       this.v = this.q8(m.class);
       e uoe = this.r8("LIVE_SERVICE_MANAGER");
       this.r = uoe;
       this.s = uoe.a(a.class);
       return;
    }
}
