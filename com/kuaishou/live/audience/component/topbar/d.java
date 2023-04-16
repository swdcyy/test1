package com.kuaishou.live.audience.component.topbar.d;
import g31.o;
import im8.g;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import ms5.a;
import ms5.a$b;
import android.view.View;
import android.view.ViewStub;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import g31.k;
import android.view.View$OnLayoutChangeListener;
import g31.j;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.audience.component.topbar.d$c;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import android.animation.Animator;
import e93.f;
import g31.i;
import java.lang.Runnable;
import lnc.a1;
import android.widget.LinearLayout;
import g31.n;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.audience.component.topbar.b;
import lnc.c3$a;
import lnc.c3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kg1.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public class d extends f implements o, g	// class@000bea
{
    public LiveStreamFeedWrapper K;
    public o L;
    public e M;
    public ViewStub N;
    public LivePkShimmerLayout O;
    public KwaiImageView P;
    public Animator Q;
    public Animator R;
    public a S;
    public a$b T;
    public d$c U;
    public b V;
    public static final int[] W;
    public static final float[] X;
    public static String sLivePresenterClassName;

    static {
       int[] ointArray = new int[]{0,d.c9(0x7f061be3),d.c9(0x7f060620),d.c9(0x7f061be3),0};
       d.W = ointArray;
       d.X = new float[5]{0x3e99999a,0x3ecccccd,0x3f000000,0x3f19999a,0x3f333333};
    }
    public void d(){
       super();
       this.L = this;
    }
    public static int c9(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uod, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return a.b().getResources().getColor(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void F5(a p0,a$b p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "8") && this.S == null) {
          this.S = p0;
          this.T = p1;
          if (!PatchProxy.applyVoid(null, this, uod, "9") && this.O == null) {
             LivePkShimmerLayout livePkShimme = this.N.inflate();
             this.O = livePkShimme;
             livePkShimme.setGradientColors(d.W);
             this.O.setGradientPosition(d.X);
             this.P = m1.f(this.O, 0x7f0a1978);
             View view = m1.f(this.O, R.id.live_audience_info_slide_item_img_container);
             if (!PatchProxy.applyVoidOneRefs(view, this, uod, "10")) {
                view.addOnLayoutChangeListener(new k(this, view));
             }
          }
          this.P.setOnClickListener(new j(this));
          d$c uoc = new d$c(this);
          this.U = uoc;
          this.P.b0(this.S.h, uoc, 0, 0);
       }
       return;
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, d.class, "7")) {
          return;
       }
       this.e9();
       b9.a(this.V);
       return;
    }
    public final void a9(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       if (p0 != null) {
          p0.removeAllListeners();
          if (p0.isRunning()) {
             p0.cancel();
          }
       }
       return;
    }
    public void b9(a p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "12")) {
          return;
       }
       f.g(this);
       long l = (p1)? 0: p0.f;
       this.a9(this.R);
       this.R = null;
       f.k("delayStartExitAnimation", new i(this, p1), this, l);
       return;
    }
    public int d9(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0705ca);
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, d.class, "4");
    }
    public final void e9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "16")) {
          return;
       }
       d tT = this.T;
       if (tT != null) {
          d tS = this.S;
          if (tS != null) {
             tT.da(tS);
          }
       }
       this.S = objArray;
       this.T = objArray;
       f.g(this);
       tT = this.U;
       if (tT != null) {
          tT.b = objArray;
          this.U = objArray;
       }
       this.a9(this.Q);
       this.Q = objArray;
       this.a9(this.R);
       this.R = objArray;
       tT = this.O;
       if (tT != null) {
          tT.n();
          this.O.setVisibility(8);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new n());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, d.class, "20")) {
          return;
       }
       c3.c(this.M, new b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       super.j8();
       this.M = this.r8("LIVE_FANS_GROUP_SERVICE");
       this.K = this.r8("LIVE_PHOTO");
       return;
    }
    public void m0(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.e9();
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.e9();
       return;
    }
    public void x(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "6")) {
          return;
       }
       this.N = m1.f(this.m8(), 0x7f0a1977);
       return;
    }
}
