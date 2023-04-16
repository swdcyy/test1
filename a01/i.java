package a01.i;
import im8.g;
import lz0.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import a01.i$a;
import a01.i$b;
import a01.b;
import vg1.c;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a01.j;
import vg1.m$b;
import vg1.m;
import com.kwai.robust.PatchProxyResult;
import vg1.l;
import qk1.a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import a01.m;
import java.util.Map;
import java.util.HashMap;
import qk1.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import vg1.e;
import mk1.h;
import mk1.b;
import t02.a0;
import p91.m;
import brd.t;
import mk1.f;
import a01.f;
import a01.e;
import erd.g;
import crd.b;

public class i extends c implements g	// class@000011
{
    public final List Q;
    public e R;
    public KwaiDialogFragment S;
    public final m T;
    public final a U;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxPrivilegeGiftPresenter";

    public void i(o p0){
       super(p0);
       this.Q = LiveLogTag.GIFT.appendTag("LiveAudienceGiftBoxPrivilegeGiftPresenter");
       this.T = new i$a(this);
       this.U = new i$b(this, new b(this), this.S8());
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "6")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, oi, "7")) {
          this.T.c(new j(this));
       }
       return;
    }
    public c S8(){
       Object obj = PatchProxy.apply(null, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J == null) {
          this.J = new c(this.T);
       }
       return this.J;
    }
    public int V8(){
       return 0x7f0a322f;
    }
    public String W8(){
       return "PRIVILEGE_PANEL";
    }
    public a X8(){
       return this.R;
    }
    public GiftTab Y8(){
       return GiftTab.PrivilegeGift;
    }
    public int Z8(){
       return 0x7f0a234d;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       this.y9(true, 2);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new m());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.j8();
       this.R = this.q8(e.class);
       return;
    }
    public boolean x9(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("hideSendGiftByClickSameItemInCombo", false);
    }
    public void y9(boolean p0,int p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, oi, "9")) {
          return;
       }
       if (!p0) {
          b.P(this.Q, "[loadGift], enableRefreshUI = false");
          return;
       }else if(this.D != null){
          b.P(this.Q, "[loadGift], mIsRequestingGiftData = true");
          return;
       }else {
          c uoc = null;
          i = 1;
          if (p1 == i) {
             uoc = this.S8().y();
          }
          if (this.v.e.d() == GiftTab.PrivilegeGift && !this.t9()) {
             b.P(this.Q, "[loadGift], tryPrepareLoadGift = false");
             return;
          }else {
             this.D = i;
             this.X7(this.v.c.c(this.w.Z2.getLiveStreamId()).subscribe(new f(this, uoc), new e(this)));
             return;
          }
       }
    }
}
