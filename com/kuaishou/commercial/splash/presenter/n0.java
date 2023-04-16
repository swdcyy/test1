package com.kuaishou.commercial.splash.presenter.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import gz.i4;
import gz.h4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import tjc.c;
import gz.l4;
import erd.g;
import crd.b;
import brd.t;
import gz.j4;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import t45.d;
import brd.z;
import gz.k4;
import ujc.e;
import gz.a4;
import com.kuaishou.commercial.splash.presenter.l0;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.view.GestureDetector;
import java.lang.Boolean;
import android.view.View;
import android.view.ViewGroup;
import gz.s;
import android.view.View$OnTouchListener;
import gz.d4;
import android.view.View$OnClickListener;
import gz.z3;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewConfiguration;
import com.kuaishou.commercial.splash.presenter.m0;
import android.view.GestureDetector$OnGestureListener;
import gz.g4;
import gz.e4;
import gz.f4;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import java.lang.Integer;
import gz.b4;
import java.lang.Runnable;
import im8.f;
import com.kuaishou.commercial.splash.SplashUtils;
import yx.j0;
import yy.x0;
import bz.a;
import io.reactivex.subjects.PublishSubject;
import mrd.c;

public abstract class n0 extends PresenterV2	// class@0015fb
{
    public s A;
    public boolean B;
    public f C;
    public int D;
    public int E;
    public boolean F;
    public f G;
    public c H;
    public boolean I;
    public final a J;
    public View$OnTouchListener K;
    public View p;
    public View q;
    public f r;
    public PublishSubject s;
    public c t;
    public TextView u;
    public View v;
    public View w;
    public View x;
    public GestureDetector y;
    public boolean z;

    public void n0(){
       super();
       this.I = a.t().d("splashRegisterBackKeyDelay", true);
       this.J = new i4(this);
       this.K = new h4(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "3")) {
          return;
       }
       if (!b.a(-1608526086).S()) {
          return;
       }
       this.S8();
       if (this.A == null) {
          return;
       }
       this.X7(this.t.subscribe(new l4(this)));
       this.s.subscribe(new j4(this));
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(x.class).observeOn(a).subscribe(new k4(this)));
       this.X7(f.f(e.class).observeOn(a).subscribe(new a4(this)));
       this.X7(this.H.observeOn(a).subscribe(new l0(this)));
       if (this.I == null) {
          this.W8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "4")) {
          return;
       }
       this.c9();
       n0 ty = this.y;
       if (ty != null) {
          n0 tx = this.x;
          if (tx instanceof ScaleHelpView) {
             tx.j(ty);
          }
       }
       return;
    }
    public abstract int P8(Boolean p0);
    public abstract View R8(View p0);
    public abstract void S8();
    public void V8(ViewGroup p0){
       View view1;
       n0 on0 = n0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on0, "6")) {
          return;
       }
       if (this.B != null) {
          return;
       }
       boolean b = true;
       this.B = b;
       n0 tA = this.A;
       if (tA.x != null) {
          if (!PatchProxy.applyVoid(null, this, on0, "19")) {
             view1 = this.m8().findViewById(R.id.splash_action_bar_layout);
             this.q = view1;
             if (this.A.x != null && view1 != null) {
                view1.setOnTouchListener(this.K);
                this.q.setOnClickListener(new d4(this));
             }
          }
       }else if(tA.B == null || PatchProxy.applyVoid(null, this, on0, "18")){
          view1 = this.m8().findViewById(R.id.splash_button_layout);
          this.w = view1;
          if (view1 != null) {
             this.p = view1.findViewById(0x7f0a3ae6);
          }
          if (this.A.B != null) {
             tA = this.p;
             if (tA != null) {
                tA.setOnTouchListener(this.K);
                this.p.setOnClickListener(new z3(this));
             }
          }
       }
    label_0088 :
       tA = this.A;
       Context obj = PatchProxy.applyOneRefs(tA, this, on0, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(s.e(tA) && tA.k == 8){
          obj = 1;
       }else {
          obj = null;
       }
       if (tA.H == null && !obj) {
          b = false;
       }
       if (b && !PatchProxy.applyVoidOneRefs(p0, this, on0, "11")) {
          this.y = new GestureDetector(this.getContext(), new m0(this, (ViewConfiguration.get(this.getContext()).getScaledTouchSlop() * 2)));
          View view = this.R8(p0);
          this.x = view;
          if (view instanceof ScaleHelpView) {
             view.e(this.y);
          }else if(view != null){
             view.setOnTouchListener(new g4(this));
          }
       }
       if (!PatchProxy.applyVoid(null, this, on0, "10")) {
          this.v.setOnClickListener(new e4(this));
          this.u.setOnClickListener(new f4(this));
          this.v.setOnTouchListener(this.K);
          this.u.setOnTouchListener(this.K);
       }
       if (this.I != null) {
          this.W8();
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "16")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.F2(this.J);
       }
       return;
    }
    public void X8(int p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on0, "12")) {
          return;
       }
       if (this.z == null && this.A.H != null) {
          this.m8().post(new b4(this, p0));
       }
       return;
    }
    public void Y8(int p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on0, "8")) {
          return;
       }
       if (SplashUtils.z(this.C)) {
          return;
       }
       SplashUtils.O(this.C);
       Object[] objArray = new Object[0];
       j0.f("SplashTouchControl", "splash clicked", objArray);
       x0 ox0 = this.r.get();
       if (ox0 != null) {
          ox0.u(p0, this.D, this.E);
       }
       this.s.onNext(new a(this.P8(Boolean.TRUE)));
       return;
    }
    public void Z8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTouchControl", "delayDisplayFinish", objArray);
       return;
    }
    public void a9(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, n0.class, "20")) {
          return;
       }
       if (this.A != null && !SplashUtils.z(this.C)) {
          SplashUtils.O(this.C);
          n0 tA = this.A;
          int i = 0;
          if (tA.x != null) {
             objArray = new Object[i];
             j0.f("SplashTouchControl", "share button clicked", objArray);
          }else if(tA.B != null){
             objArray = new Object[i];
             j0.f("SplashTouchControl", "splash button clicked", objArray);
          }else {
             objArray = new Object[i];
             j0.f("SplashTouchControl", "action bar clicked", objArray);
          }
          x0 ox0 = this.r.get();
          if (ox0 != null) {
             ox0.n(this.D, this.E);
          }
          this.s.onNext(new a(this.P8(Boolean.FALSE)));
       }
       return;
    }
    public void b9(int p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on0, "9")) {
          return;
       }
       x0 ox0 = this.r.get();
       if (ox0 != null) {
          ox0.t(p0, this.D, this.E);
       }
       this.s.onNext(new a());
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, n0.class, "17")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          activity.l3(this.J);
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, n0.class, "14")) {
          return;
       }
       if (this.x instanceof ScaleHelpView) {
          Object[] objArray = new Object[0];
          j0.f("SplashTouchControl", "resetSplashTouchControl", objArray);
          n0 ty = this.y;
          if (ty != null) {
             this.x.j(ty);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "2")) {
          return;
       }
       this.u = p0.findViewById(0x7f0a3aff);
       this.v = p0.findViewById(0x7f0a3996);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       this.r = this.x8("SPLASH_AD_LOG");
       this.s = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.C = this.x8("SPLASH_CONVERTED");
       this.G = this.x8("SPLASH_SLIDE_LISTENER");
       this.t = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.H = this.r8("SPLASH_CARD_TITLE_CLICKABLE");
       return;
    }
    public void onEventMainThread(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "15")) {
          return;
       }
       this.d9();
       this.c9();
       return;
    }
}
