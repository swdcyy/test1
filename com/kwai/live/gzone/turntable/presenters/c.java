package com.kwai.live.gzone.turntable.presenters.c;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.turntable.presenters.c$c;
import mrd.a;
import o77.b;
import com.kwai.live.gzone.turntable.presenters.c$a;
import o77.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.turntable.presenters.c$b;
import mq5.h;
import mq5.b;
import com.kwai.live.gzone.turntable.presenters.a;
import h47.b;
import j47.d;
import o77.d;
import erd.g;
import crd.b;
import brd.t;
import k67.p;
import k67.g;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import aq5.d;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewStub;
import android.view.View;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import k67.e$a;
import java.util.Objects;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import f37.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Boolean;
import ekd.m1;
import o77.h;
import java.util.Map;
import java.util.HashMap;
import y43.a;
import fq5.b;
import k67.l;
import k67.b;
import vq5.d;
import tj3.e;

public class c extends PresenterV2 implements g	// class@000e5f
{
    public ViewStub A;
    public View B;
    public e$a C;
    public final a D;
    public int E;
    public k0 F;
    public LiveGzoneConfigResponse G;
    public b H;
    public b I;
    public h J;
    public e K;
    public View$OnClickListener L;
    public String M;
    public LiveGzoneTurntableLogger N;
    public boolean O;
    public p P;
    public String p;
    public a q;
    public b r;
    public b s;
    public b t;
    public l u;
    public d v;
    public g w;
    public d x;
    public d y;
    public l0 z;

    public void c(){
       super();
       this.z = new c$c(this);
       this.D = a.g();
       this.E = -1;
       this.J = new b(this);
       this.L = new c$a(this);
       this.P = new c(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       this.N = new c$b(this);
       this.s.Km(this.J);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6")) {
          uoc = this.x;
          if (uoc != null) {
             a uoa = new a(this);
             this.H = uoa;
             uoc.Q1(uoa);
          }
       }
       this.X7(this.D.subscribe(new d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "16")) {
          return;
       }
       c tx = this.x;
       if (tx != null) {
          tx.H8(this.H);
       }
       this.w.j3(this.P);
       this.s.le(this.J);
       this.P8();
       tx = this.I;
       if (tx != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.RED_PACK_RAIN_ING};
          this.y.G5(tx, uoaArray);
       }
       this.G = null;
       this.M = null;
       this.E = -1;
       this.O = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       this.R8();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "18")) {
          return;
       }
       c tF = this.F;
       if (tF != null && tF.K()) {
          this.F.q(0);
       }
       return;
    }
    public final int S8(){
       Object obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.E > null && !TextUtils.x(this.M)) {
          i = 3;
       }else if(this.E > null){
          i = 1;
       }else if(!TextUtils.x(this.M)){
          i = 2;
       }
       return i;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       if (this.C == null) {
          c tA = this.A;
          if (tA != null) {
             tA.setLayoutResource(R.layout.arg_RES_7f0d0b97);
             View view = this.A.inflate();
             view.setOnClickListener(this.L);
             this.B = view.findViewById(0x7f0a1acd);
             e$a uoa = this.w.Sc(LiveGzoneAudienceFeatureEntranceItem.TURN_TABLE, view);
             this.C = uoa;
             uoa.h(true);
          }
       }
       return;
    }
    public void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "14")) {
          return;
       }
       int i = this.S8();
       if (i > 0) {
          c tN = this.N;
          Objects.requireNonNull(tN);
          LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
          if (!PatchProxy.isSupport(liveGzoneTur) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tN, liveGzoneTur, "33")) {
             u1.M("2457739", null, 6, tN.c(i), tN.g(), null);
          }
       }
       if (TextUtils.x(this.M)) {
          return;
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("live_turntable_already_showed_red_point_id", this.M);
          g.a(uEditor);
          this.M = objArray;
          if (this.E == null) {
             this.D.onNext(Boolean.FALSE);
          }
          return;
       }
    }
    public void X8(int p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "12")) {
          return;
       }
       if (this.E == p0 && !p1) {
          return;
       }
       this.E = p0;
       if (!TextUtils.x(this.M) || p0 > 0) {
          this.D.onNext(Boolean.TRUE);
          c tN = this.N;
          int i = this.S8();
          Objects.requireNonNull(tN);
          LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
          if (!PatchProxy.isSupport(liveGzoneTur) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tN, liveGzoneTur, "32")) {
             u1.D0("2457738", null, 6, tN.c(i), tN.g(), null);
          }
       }else {
          this.D.onNext(Boolean.FALSE);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a1ace);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new h());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.u = this.s8(l.class);
       this.w = this.q8(g.class);
       this.x = this.s8(d.class);
       this.y = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.t = this.s8(b.class);
       this.v = this.r8("LIVE_ROUTER_SERVICE");
       this.K = this.r8("LIVE_LOG_REPORTER");
       return;
    }
}
