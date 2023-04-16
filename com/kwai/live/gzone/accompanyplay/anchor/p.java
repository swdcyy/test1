package com.kwai.live.gzone.accompanyplay.anchor.p;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.anchor.p$c;
import h37.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import h37.j;
import h47.b;
import j47.d;
import com.kwai.live.gzone.accompanyplay.anchor.q;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyStateRefresh;
import lf3.g;
import hf3.a;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceHide;
import h37.k;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceShow;
import h37.l;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.accompanyplay.anchor.l;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.anchor.p$a;
import com.kwai.live.gzone.accompanyplay.anchor.l$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.g;
import com.kwai.live.gzone.accompanyplay.anchor.f0$c;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import oq5.a;
import java.util.Objects;
import java.lang.Boolean;
import mrd.a;
import java.lang.Integer;
import h37.f0;
import com.kwai.live.gzone.accompanyplay.anchor.p$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import h37.n0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import h37.o;
import java.util.Map;
import java.util.HashMap;
import g37.d;
import nl8.m;

public class p extends PresenterV2 implements g	// class@000b2d
{
    public boolean A;
    public g B;
    public h C;
    public b p;
    public d q;
    public l r;
    public b s;
    public g t;
    public d u;
    public b v;
    public a w;
    public f0$c x;
    public a y;
    public f z;

    public void p(){
       super();
       this.z = new p$c(this);
       this.C = new i(this);
    }
    public void E8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, op, "4")) {
          if (!TextUtils.n(this.p.d(), QCurrentUser.ME.getId())) {
             this.V8(8);
          }else if(this.u != null){
             j oj = new j(this);
             this.s = oj;
             this.u.Q1(oj);
          }
          q oq = new q(this);
          this.B = oq;
          this.w.u0(742, SCGzoneAccompanyStateRefresh.class, oq);
          this.w.u0(741, SCGzoneAccompanyEntranceHide.class, new k(this));
          this.w.u0(740, SCGzoneAccompanyEntranceShow.class, new l(this));
       }
       this.v.Km(this.C);
       this.P8().b();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "7")) {
          return;
       }
       this.S8();
       p ts = this.s;
       if (ts != null) {
          p tu = this.u;
          if (tu != null) {
             tu.H8(ts);
          }
       }
       this.v.le(this.C);
       this.w.o(742, this.B);
       this.P8().a();
       return;
    }
    public l P8(){
       Object obj = PatchProxy.apply(null, this, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r == null) {
          this.r = new l$a(new p$a(this));
       }
       return this.r;
    }
    public void R8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p.class, "6")) {
          return;
       }
       if (this.t == null) {
          this.t = this.x.a();
       }
       this.P8().k(false);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"live_gzone_anchor_accompany_red_dot_showed", true);
       g.a(uEditor);
       p tt = this.t;
       String liveStreamId = this.p.getLiveStreamId();
       b = this.y.H2();
       Objects.requireNonNull(tt);
       g og = g.class;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(liveStreamId, Boolean.valueOf(b), tt, og, "1")) {
          if (!tt.k.i().intValue()) {
             tt.o(liveStreamId, b);
          }else if(tt.k.i().intValue() == 1){
             tt.p(tt.n);
          }
       }
       this.t.o = new p$b(this);
       String str = "live_watch";
       ClientContent$LiveStreamPackage liveStreamPa = this.p.a();
       if (!PatchProxy.applyVoidTwoRefs(str, liveStreamPa, objArray, n0.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ACCOMPANY_PLAY_FLEET_ENTRANCE";
          i3 oi3 = i3.f();
          oi3.d("entrance_source", str);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(true, uElementPack, uContentPack);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       p tt = this.t;
       if (tt != null) {
          tt.n();
       }
       return;
    }
    public void V8(int p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, op, "5")) {
          return;
       }
       l ol = this.P8();
       boolean b = (!p0)? true: false;
       ol.setVisible(b);
       if (!p0 && !a.a.getBoolean(b.d("user")+"live_gzone_anchor_accompany_red_dot_showed", false)) {
          this.P8().k(true);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new o());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.x = this.q8(f0$c.class);
       this.q = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       this.u = this.s8(d.class);
       this.w = this.r8("LIVE_LONG_CONNECTION");
       this.v = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.y = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.P8().e(this);
       return;
    }
}
