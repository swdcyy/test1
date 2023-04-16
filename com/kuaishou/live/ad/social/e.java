package com.kuaishou.live.ad.social.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.social.e$a;
import zl0.i;
import com.kuaishou.live.ad.social.d;
import com.kuaishou.live.ad.social.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.social.u;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import x61.c;
import lp3.c;
import lp3.e;
import hf3.a;
import fq5.b;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import com.kuaishou.live.ad.social.c;
import lf3.g;
import com.kuaishou.live.ad.social.v;
import com.kuaishou.live.ad.social.w;
import com.kuaishou.live.ad.social.y;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import zl0.a1;
import km9.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.c;
import lp3.i;
import java.lang.Boolean;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$ControlInfo;
import zl0.p;
import java.util.Map;
import java.util.HashMap;
import sr5.a;
import nl8.m;

public class e extends PresenterV2 implements g	// class@000a0f
{
    public b p;
    public a q;
    public a r;
    public i s;
    public u t;
    public boolean u;
    public final Runnable v;
    public final Runnable w;
    public final Runnable x;
    public a y;

    public void e(){
       super();
       this.v = new e$a(this);
       this.w = new i(this);
       this.x = new d(this);
       this.y = new e$b(this);
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       u ou = this.P8();
       Objects.requireNonNull(ou);
       if (!PatchProxy.applyVoid(objArray, ou, u.class, "5")) {
          ou.b.setValue(ou.c);
          ou.a.a(c.class).v1(ou.b);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.p.u().u0(641, LiveExtraMessages$SCLiveCommonStateSignal.class, new c(this));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       this.P8().setVisible(false);
       u ou = this.P8();
       Objects.requireNonNull(ou);
       if (!PatchProxy.applyVoid(objArray, ou, u.class, "6")) {
          ou.c.a.k.e();
          ou.a.a(c.class).O0(1016);
       }
       k1.m(this.w);
       this.m8().removeCallbacks(this.x);
       return;
    }
    public u P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t == null) {
          this.t = new u(this.v);
       }
       return this.t;
    }
    public void R8(){
       boolean b;
       u ou = u.class;
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "12")) {
          return;
       }
       a1 uoa1 = this.r.pn();
       e ts = this.s;
       if (ts != null) {
          ts.a(c.class).show();
       }
       ts = this.r;
       a1 obj = PatchProxy.applyTwoRefs(ts, uoa1, this, uoe, "13");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = false;
          if (uoa1 != null) {
             if (this.P8().n() == this.u) {
                boolean b1 = this.P8().isVisible();
                if (!ts.qk() || (!b1 && (ts.qk() || b1))) {
                }
             }
          }
       }
       if (!b) {
          return;
       }else {
          obj = uoa1.k;
          if (obj != null && obj.mControlInfo != null) {
             u ou1 = this.P8();
             LiveAdConversionTaskDetail mControlInfo = uoa1.k.mControlInfo;
             Objects.requireNonNull(ou1);
             if (!PatchProxy.applyVoidOneRefs(mControlInfo, ou1, ou, "9")) {
                ou1.c.a.k.c(mControlInfo);
             }
          }
          b = this.r.qk();
          u ou2 = this.P8();
          ts = this.u;
          Objects.requireNonNull(ou2);
          if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ts), ou2, ou, "2")) {
             ou2.c.a.k.g = ts;
          }
          this.P8().setVisible(b);
          k1.r(this.x, 100);
          if (b) {
             this.r.bf(2);
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new p());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.r = this.q8(a.class);
       this.s = this.t8("LIVE_SERVICE_MANAGER");
       this.P8().e(this);
       return;
    }
}
