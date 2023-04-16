package com.yxcorp.gifshow.homepage.presenter.splash.c;
import eua.b;
import com.yxcorp.gifshow.homepage.presenter.splash.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zf6.k;
import cw9.b;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.TypedValue;
import android.util.DisplayMetrics;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import tra.b;
import q87.c;
import nta.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.rx.RxBus;
import gp5.b;
import brd.t;
import t45.d;
import brd.z;
import dua.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ujc.e;
import com.yxcorp.gifshow.homepage.presenter.splash.b;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.RomUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.n;
import wkd.b;
import tjc.e;
import java.util.Objects;
import java.util.Queue;
import android.animation.Animator;
import tkd.b;
import tkd.d;
import xl9.a;
import tjc.c;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import dua.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import dua.e;
import android.animation.Animator$AnimatorListener;
import java.lang.Throwable;
import yx.j0;
import uv8.m1;
import tyc.w4;
import com.kwai.written.view.IWrittenLayout;
import i2b.a;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;

public class c extends b	// class@0017dd
{
    public boolean A;
    public boolean B;
    public int C;
    public final e$a D;
    public Animator E;
    public int z;

    public void c(){
       super();
       this.B = false;
       this.C = 0;
       this.D = new a(this);
    }
    public static void e9(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "21")) {
          return;
       }
       p0 = p0.findViewById(R.id.default_splash_root);
       if (k.f()) {
          p0.setBackgroundResource(R.color.arg_RES_7f061d74);
       }else {
          p0.setBackgroundResource(R.color.arg_RES_7f061e52);
       }
       return;
    }
    public static void h9(View p0){
       int i;
       Drawable drawable;
       c uoc = c.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoc, "18")) {
          return;
       }
       if (!b.g()) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ImageView imageView = p0.findViewById(R.id.center_logo);
       ViewGroup$MarginLayoutParams layoutParams = imageView.getLayoutParams();
       Resources resources = p0.getResources();
       ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
       if (PatchProxy.isSupport2(uoc, "19")) {
          TypedValue obj1 = PatchProxy.applyThreeRefsWithListener(resources, Integer.valueOf(R.dimen.arg_RES_7f070eef), Integer.valueOf(topMargin), null, c.class, "19");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else {
             try{
             label_0053 :
                obj1 = new TypedValue();
                resources.getValue(R.dimen.arg_RES_7f070eef, obj1, true);
                DisplayMetrics uDisplayMetr = new DisplayMetrics();
                uDisplayMetr.density = b.b();
                float dimension = obj1.getDimension(uDisplayMetr);
                i = (int)(dimension + 0x3f000000);
                PatchProxy.onMethodExit(uoc, "19");
             }catch(java.lang.Exception e0){
                PatchProxy.onMethodExit(e0, "19");
             }
          }
       }else {
          goto label_0053 ;
       }
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c.class, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          Object[] objArray1 = new Object[0];
          b.C().w("SplashPresenter", "init", objArray1);
          if (this.j9()) {
             if (!PatchProxy.applyVoid(objArray, this, c.class, "7")) {
                super.d9();
                a.a("SplashPresenter", "showSplash");
                this.b9(true);
                this.S8().findViewById(R.id.center_logo).setTranslationY((float)this.z);
             }
          }else {
             this.a9();
          }
       }
       if (this.y != null) {
          this.X7(RxBus.f.k(b.class, true).observeOn(d.a).subscribe(new b(this)));
       }
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new b(this)));
       PatchProxy.onMethodExit(c.class, "3");
       return;
    }
    public void F8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c.class, "1")) {
          return;
       }
       super.F8();
       String str = "SplashPresenter";
       a.b(str, "onCreate");
       e obj = PatchProxy.apply(objArray, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.b(str, "needSetCenterLogoOffset isOppoRom: "+RomUtils.s());
          boolean b1 = false;
          b = (RomUtils.s() && (l1.a(a.a().a()) && a.t().d("enable_rectify_oppo_splash_logo", b1)))? true: false;
       }
       if (b) {
          this.z = n.A(this.getContext());
       }
       obj = b.a(0x1967ec3b);
       c tD = this.D;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(tD, obj, e.class, "3") && tD != null) {
          obj.b.add(tD);
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "2")) {
          return;
       }
       e uoe = b.a(0x1967ec3b);
       c tD = this.D;
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoidOneRefs(tD, uoe, e.class, "4") && tD != null) {
          uoe.b.remove(tD);
       }
       PatchProxy.onMethodExit(c.class, "2");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "16")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(null, this, c.class, "4")) {
          this.A = false;
          c tE = this.E;
          if (tE != null && tE.isRunning()) {
             this.E.end();
             this.E = null;
          }
       }
       PatchProxy.onMethodExit(c.class, "16");
       return;
    }
    public void Y8(int p0){
       boolean b;
       Object[] objArray1;
       if (PatchProxy.isSupport2(c.class, "11") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("SplashPresenter", "onAboutToEnd, is splash end : "+this.A+", hasSplashAd:"+p0, objArray);
       int i = 2;
       if (this.X8()) {
          this.c9(i, p0);
          PatchProxy.onMethodExit(c.class, "11");
          return;
       }else if(this.A != null){
          PatchProxy.onMethodExit(c.class, "11");
          return;
       }else {
          b = true;
          if (b.a(0x1967ec3b).b()) {
             this.B = b;
             this.C = p0;
             d.a(-1650306540).kz(b);
             objArray1 = new Object[0];
             b.C().s("SplashPresenter", "block splash finish", objArray1);
             PatchProxy.onMethodExit(c.class, "11");
             return;
          }else {
             Object[] objArray2 = new Object[0];
             b.C().s("SplashPresenter", "not block splash finish", objArray2);
             this.B = false;
             this.A = b;
             int i1 = -1608526086;
             if (b.a(i1).X() && (p0 == b && !PatchProxy.applyVoidWithListener(null, this, c.class, "14"))) {
                Object[] objArray3 = new Object[0];
                b.C().w("SplashPresenter", "splash exit animation called.", objArray3);
                if (b.a(i1).getState() == 3) {
                   p0 = b.a(i1).getState();
                   if (!PatchProxy.isSupport2(c.class, "10") || !PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, c.class, "10")) {
                      Object[] objArray4 = new Object[0];
                      b.C().w("SplashPresenter", "startExitAnimation "+p0, objArray4);
                      if (this.v != null) {
                         PatchProxy.onMethodExit(c.class, "10");
                      }else {
                         c tE = this.E;
                         if (tE != null && tE.isRunning()) {
                            PatchProxy.onMethodExit(c.class, "10");
                         }else {
                            int i2 = 400;
                            try{
                               float[] uofloatArray = new float[i];
                               uofloatArray[0] = 0x3f800000;
                               uofloatArray[b] = 0;
                               ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                               valueAnimato.setDuration((long)i2);
                               valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
                               valueAnimato.addUpdateListener(new a(this));
                               valueAnimato.addListener(new e(this, p0));
                               valueAnimato.start();
                               this.E = valueAnimato;
                            }catch(java.lang.Exception e12){
                               Object[] objArray5 = new Object[0];
                               j0.d("SplashPresenter", e12, objArray5);
                            }
                            PatchProxy.onMethodExit(c.class, "10");
                         }
                      }
                   }
                }else if(this.W8()){
                   objArray1 = new Object[0];
                   b.C().t("SplashPresenter", "strange case exit frame directly", objArray1);
                   this.b9(0);
                }
                PatchProxy.onMethodExit(c.class, "14");
             }
             PatchProxy.onMethodExit(c.class, "11");
             return;
          }
       }
    }
    public void Z8(ViewGroup p0){
       View view;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "17")) {
          return;
       }
       String str = "SplashPresenter";
       a.a(str, "onCreateSplash");
       Context context = this.getContext();
       if (context == null) {
          a.a(str, "onCreateSplash context is null");
          PatchProxy.onMethodExit(c.class, "17");
          return;
       }else if(m1.g()){
          view = new w4(context).l1();
          this.S8().addView(view);
       }else {
          view = a.d(context, R.layout.arg_RES_7f0d08b7, this.S8(), true);
       }
       c.e9(view);
       c.h9(view);
       PatchProxy.onMethodExit(c.class, "17");
       return;
    }
    public void b9(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       a.a("SplashPresenter", "setFrameVisible "+p0);
       super.b9(p0);
       return;
    }
    public final boolean j9(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = b.a(-1608526086).Y();
       Activity activity = this.getActivity();
       int i = 1;
       int i1 = (activity != null)? c.a(activity).m(activity) ^ i: false;
       Object[] objArray = new Object[0];
       b.C().w("SplashPresenter", "needSplashByAd : "+b+"  needSplashByRealTab:  "+i1, objArray);
       if (!b && !i1) {
          i = false;
       }
       return i;
    }
}
