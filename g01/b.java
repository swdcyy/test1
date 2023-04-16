package g01.b;
import im8.g;
import k51.c;
import g01.a;
import h01.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h01.t;
import h01.e;
import i01.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.h;
import android.view.View;
import lm1.i;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.models.Gift;
import ik1.h0;
import java.lang.Integer;
import java.lang.Boolean;
import z12.e;
import k2b.u1;
import cl1.c;
import mk1.b0;
import bl1.a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import h01.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import g01.e;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import h01.x;
import h01.i;
import i01.n;
import mk1.b;
import qk1.d;
import qk1.e;
import om1.a;
import lp3.c;

public class b extends c implements g	// class@0023f2
{
    public final a A;
    public a p;
    public a0 q;
    public h r;
    public h s;
    public j t;
    public x u;
    public i v;
    public n w;
    public b x;
    public d y;
    public e z;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxComboSendHandlerPresenter";

    public void b(){
       super();
       this.A = new a(this);
       this.U7(new o());
       this.U7(new t());
       this.U7(new e());
       this.U7(new j());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.doBindView(this.s.k);
       return;
    }
    public final void P8(i p0,int p1,UserInfo p2,boolean p3,Gift p4,h0 p5){
       b uob = this;
       object oobject = p0;
       object oobject1 = p4;
       object oobject2 = p5;
       b uob1 = b.class;
       int i = 3;
       int i1 = 0;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),p2,Boolean.valueOf(p3),oobject1,oobject2};
          if (PatchProxy.applyVoid(objArray, this, uob1, "12")) {
             return;
          }
       }
       if (oobject1 == null) {
          String[] stringArray = new String[i1];
          e.b("LiveAudienceGiftBox", " handleNormalGiftComboSend gift == null", stringArray);
          u1.R("gift_send_error", "handleNormalGiftComboSend gift == null", i);
          this.S8(p0, "CLIENT_SEND_PRE_CHECK", "[LiveAudienceGiftBoxComboSendHandlerPresenter][handleNormalGiftComboSend]gift is null", 0x18707);
          return;
       }else {
          oobject2.d = oobject1;
          oobject2.f = uob.s.o.B2(oobject1).a;
          p5.a(uob.s.t.g(), false, GiftTab.NormalGift, p3, p2, true);
          uob.t.d(p0, p1, p4, p2, p3, true);
          return;
       }
    }
    public final boolean R8(UserInfo p0,UserInfo p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.equals(p0.mId, p1.mId);
    }
    public final void S8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, b.class, "4")) {
          return;
       }
       this.V8(p0, "SENDING_GIFT", p1, p2, p3);
       return;
    }
    public final void V8(i p0,String p1,String p2,String p3,int p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "5")) {
             return;
          }
       }
       if (!this.s.n.b()) {
          this.p.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveAudienceGiftBoxComboSendHandlerPresenter][logTraceInfo]service manager cleared");
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, b.class, "2");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.r = this.q8(oh);
       this.s = this.q8(oh);
       this.t = this.q8(j.class);
       this.u = this.q8(x.class);
       this.v = this.q8(i.class);
       this.w = this.q8(n.class);
       this.x = this.q8(b.class);
       this.y = this.q8(d.class);
       this.z = this.q8(e.class);
       this.p = this.s.n.a(a.class);
       return;
    }
}
