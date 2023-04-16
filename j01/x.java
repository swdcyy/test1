package j01.x;
import im8.g;
import j01.i0;
import k01.a;
import j01.s;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import j01.x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import brd.z;
import brd.t;
import j01.t;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lm1.f;
import com.yxcorp.gifshow.model.response.WalletResponse;
import ik1.h0;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import lm1.d;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.lang.Integer;
import lm1.c;
import java.util.Map;
import lm1.e;
import com.kuaishou.live.common.core.component.gift.gift.p;
import mk1.h;
import mk1.w;
import lm1.g;
import zb6.a;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import lm1.i;
import lp3.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import t02.a0;
import p91.m;
import j01.b0;
import om1.a;
import lp3.c;
import sk1.a;
import mrd.c;

public class x extends i0 implements g	// class@002a10
{
    public x$b A;
    public c t;
    public a0 u;
    public i v;
    public a w;
    public a x;
    public LiveGiftSortType y;
    public c z;
    public static String sLivePresenterClassName = "GiftBoxSendGiftToAudiencePresenter";

    public void x(a p0){
       super(p0);
       this.t = s.b;
       this.y = LiveGiftSortType.DEFAULT;
       this.A = new x$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       this.X7(this.z.observeOn(d.a).subscribe(new t(this)));
       return;
    }
    public d R8(f p0,WalletResponse p1,h0 p2,JsonElement p3,Throwable p4){
       Object obj;
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, ox, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       HashMap hashMap = new HashMap();
       String str = "type";
       if (this.p.d() == GiftTab.NormalGift) {
          hashMap.put(str, Integer.valueOf(this.y.getType()));
       }else {
          hashMap.put(str, Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       }
       c uoc = new c(p2.c, p2.g, hashMap, null, null);
       e uoe = new e(p.a(this.p.d()), p2.f, w.g(this.p, this.q));
       int i = a.b(p4);
       String str1 = (p4 != null)? a.i(p4): "";
       g og = new g(p1, null, i, str1, p3);
       return new d(p0, obj, uoe, p2.f);
    }
    public void S8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(x.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, x.class, "4")) {
          return;
       }
       if (!this.v.b()) {
          this.w.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
       }else {
          b.P(b.a, "[GiftBoxSendGiftToAudiencePresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, x.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.Z2.getLiveStreamId();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, x.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(x.class, new b0());
       }else {
          obj.put(x.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.q8(a0.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.v = oi;
       this.w = oi.a(a.class);
       this.x = this.q8(a.class);
       this.z = this.r8("current_sort_type_subject");
       return;
    }
}
