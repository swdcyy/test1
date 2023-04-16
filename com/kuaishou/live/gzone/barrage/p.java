package com.kuaishou.live.gzone.barrage.p;
import im8.g;
import k51.c;
import com.kuaishou.live.gzone.barrage.p$a;
import com.kuaishou.live.gzone.barrage.p$b;
import com.kuaishou.live.gzone.barrage.p$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.android.live.model.QLivePlayConfig;
import z12.w;
import io.reactivex.subjects.PublishSubject;
import kg1.g;
import brd.a0;
import brd.t;
import com.kuaishou.live.gzone.barrage.n;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oq5.c;
import jv1.b;
import ekd.k1;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.animation.AnimatorSet;
import android.view.ViewStub;
import oq5.b;
import b53.l0;
import java.lang.Runnable;
import pm8.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import android.widget.TextView;
import b53.h0;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import z12.x;
import b53.u0;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kuaishou.live.gzone.barrage.m;
import com.kwai.robust.PatchProxyResult;
import b53.q0;
import java.util.Map;
import java.util.HashMap;

public class p extends c implements g	// class@001c46
{
    public AnimatorSet A;
    public final c B;
    public a C;
    public final View$OnLayoutChangeListener D;
    public boolean p;
    public boolean q;
    public boolean r;
    public a0 s;
    public LiveGzoneColorBarrageResponse t;
    public View u;
    public ViewStub v;
    public View w;
    public View x;
    public boolean y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveGzoneAudienceColorBarragePresenter";

    public void p(){
       super();
       this.B = new p$a(this);
       this.C = new p$b(this);
       this.D = new p$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       a0 e = this.s.e;
       if (e == null || (e.isLandscape() && !w.a(this.s.e))) {
          this.X7(this.s.r1.Xf().firstOrError().R(new n(this), Functions.e));
       }
    label_003d :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "10")) {
          return;
       }
       this.s.x.Q0(this.B);
       k1.n(this);
       this.y = false;
       this.z = false;
       p tw = this.w;
       if (tw != null) {
          tw.removeOnLayoutChangeListener(this.D);
       }
       tw = this.A;
       if (tw != null) {
          tw.cancel();
          this.A = null;
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, p.class, "6")) {
          return;
       }
       View view = this.v.inflate();
       this.w = view;
       this.x = view.findViewById(0x7f0a1ea9);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, p.class, "9")) {
          return;
       }
       p ts = this.s;
       if (ts.p1 != null && ts.x.H2()) {
          this.s.p1.d();
          k1.s(new l0(this), this, 0);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, p.class, "8")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean(b.d("user")+"is_live_gzone_color_barrage_landscape_tip_displayed", true);
       g.a(uEditor);
       if (this.w == null) {
          this.P8();
       }
       this.w.setVisibility(0);
       this.w.findViewById(R.id.live_gzone_color_barrage_tip_text_view).setText(R.string.arg_RES_7f100766);
       TextView textView = this.w.findViewById(R.id.live_gzone_color_barrage_tip_navigate_view);
       textView.setText(R.string.arg_RES_7f100763);
       this.w.setOnClickListener(new h0(this, textView));
       this.w.addOnLayoutChangeListener(this.D);
       String str = (textView.getText() == null)? "": textView.getText().toString();
       u0.f(str, this.s.Z2.a(), x.p(this.getActivity()));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, p.class, "7")) {
          return;
       }
       if (this.v != null && !this.s.N().r2(AudienceBizRelation.PK)) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"is_live_gzone_color_barrage_portrait_tip_displayed", true);
          g.a(uEditor);
          if (this.w == null) {
             this.P8();
          }
          this.w.setVisibility(0);
          this.w.findViewById(R.id.live_gzone_color_barrage_tip_text_view).setText(R.string.arg_RES_7f100765);
          TextView textView = this.w.findViewById(R.id.live_gzone_color_barrage_tip_navigate_view);
          textView.setText(R.string.arg_RES_7f100762);
          this.w.setOnClickListener(new m(this, textView));
          this.w.addOnLayoutChangeListener(this.D);
          String str = (textView.getText() == null)? "": textView.getText().toString();
          u0.f(str, this.s.Z2.a(), x.p(this.getActivity()));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.v = p0.findViewById(0x7f0a1eac);
       this.u = p0.findViewById(0x7f0a30e6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new q0());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.s = this.q8(a0.class);
       return;
    }
}
