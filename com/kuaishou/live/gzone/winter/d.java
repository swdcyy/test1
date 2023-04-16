package com.kuaishou.live.gzone.winter.d;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import m63.m;
import com.kuaishou.live.gzone.winter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m63.n;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m63.o;
import t02.a0;
import oq5.c;
import jv1.b;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.animation.RotateAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import iz1.a;
import p91.m;
import m63.x;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import h61.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import m63.q;
import android.os.CountDownTimer;
import ekd.m1;
import android.app.Activity;
import va1.i0;
import android.view.ViewStub;
import m63.l;
import android.view.ViewStub$OnInflateListener;
import m63.u;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends c implements g	// class@001d09
{
    public boolean A;
    public TextView B;
    public TextView C;
    public TextView D;
    public View E;
    public List F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final c I;
    public m J;
    public a0 K;
    public final ViewTreeObserver$OnGlobalLayoutListener L;
    public String M;
    public String N;
    public int O;
    public PublishSubject p;
    public PublishSubject q;
    public PublishSubject r;
    public LiveWinterListFragment s;
    public CountDownTimer t;
    public final int u;
    public boolean v;
    public BaseFragment w;
    public ViewStub x;
    public View y;
    public View z;
    public static String sLivePresenterClassName = "LiveWinterListPresenter";

    public void d(){
       super();
       this.p = PublishSubject.g();
       this.q = PublishSubject.g();
       this.r = PublishSubject.g();
       this.u = 5000;
       this.v = false;
       this.A = false;
       this.G = new AtomicBoolean(false);
       this.H = new AtomicBoolean(false);
       this.I = new m(this);
       this.L = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.X7(this.q.subscribe(new n(this)));
       this.X7(this.p.subscribe(new o(this)));
       this.K.x.W0(this.I, true);
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, d.class, "14");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       this.K.x.Q0(this.I);
       return;
    }
    public final void P8(boolean p0){
       RotateAnimation rotateAnimat;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "12")) {
          return;
       }
       if (this.z == null) {
          return;
       }
       if (p0) {
          this.B.setText(a1.p(R.string.arg_RES_7f1004cc));
          rotateAnimat = new RotateAnimation(0, 180.00f, 1, 0x3f000000, 1, 0x3f000000);
       }else {
          this.B.setText(a1.p(R.string.arg_RES_7f1004d1));
          rotateAnimat = new RotateAnimation(180.00f, 0, 1, 0x3f000000, 1, 0x3f000000);
       }
       this.B.setFillAfter(true);
       this.B.setInterpolator(new LinearInterpolator());
       this.B.setDuration(300);
       this.z.startAnimation(this.B);
       return;
    }
    public final int R8(){
       return this.O;
    }
    public int S8(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (!TextUtils.x(this.N))? Color.parseColor(this.N): a.a();
    }
    public String V8(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.M)) {
          return this.M;
       }
       return a1.p(0x7f103a8c);
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       if (this.v != null && this.s != null) {
          this.v = false;
          x.a(this.J.getLiveStreamId(), this.v);
          e uoe = this.w.getChildFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f01010c, 0x7f010115);
          uoe.s(this.s);
          uoe.m();
          this.P8(false);
       }
       return;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       String str = this.V8();
       int i = this.R8();
       ClientContent$LiveStreamPackage liveStreamPa = this.J.a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(p0, str, Integer.valueOf(i), liveStreamPa, null, a.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_PHOTO_BAR_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("type", p0);
          oi3.d("module_name", str);
          oi3.c("module_content_num", Integer.valueOf(i));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public void Y8(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "8")) {
          return;
       }
       if (this.v == null && this.s != null) {
          this.r.onNext(Boolean.TRUE);
          this.v = true;
          x.a(this.J.getLiveStreamId(), this.v);
          c childFragmen = this.w.getChildFragmentManager();
          int i = 0x7f0a45c2;
          Fragment uFragment = childFragmen.findFragmentById(i);
          e uoe = childFragmen.beginTransaction();
          uoe.y(R.anim.arg_RES_7f01010c, 0x7f010115);
          if (uFragment == null) {
             uoe.v(i, this.s);
          }else {
             uoe.E(this.s);
          }
          uoe.m();
          if (!this.K.x.H2()) {
             this.E.setVisibility(0);
          }
          this.P8(true);
          if (!PatchProxy.applyVoid(null, this, uod, "11") && (this.y == null || (!this.H.get() && (this.G.getAndSet(0) && this.F != null)))) {
             if (this.t == null) {
                q oq = new q(this, 5000, 1000);
                this.t = uod;
             }
             this.C.setVisibility(0);
             this.t.start();
             this.H.set(true);
          }
       }
    label_00aa :
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tD = this.D;
       if (tD != null) {
          tD.setText(this.V8());
       }
       tD = this.y;
       if (tD != null) {
          tD.setBackgroundColor(this.S8());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a45c3);
       i0.b(this.getActivity(), this.E);
       ViewStub viewStub = m1.f(p0, R.id.x_stream_indicator_container);
       this.x = viewStub;
       viewStub.setOnInflateListener(new l(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new u());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.w = this.r8("LIVE_FRAGMENT");
       this.J = this.r8("LIVE_BASIC_CONTEXT");
       this.K = this.q8(a0.class);
       return;
    }
}
