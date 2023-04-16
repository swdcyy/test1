package com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import crd.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.e;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.lang.String;
import java.util.List;
import com.kuaishou.tuna_core.half_screen_webview.c;
import msd.a;
import c15.b;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Float;
import t45.d;
import wz4.h;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import crd.b;
import brd.z;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageTitleParams;
import android.view.View;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.YodaWebView;
import com.kwai.yoda.model.LaunchModel;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsPageButtonParams$Icon;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.app.Dialog;
import android.animation.ValueAnimator;
import wz4.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$LayoutStyle;
import com.kuaishou.tuna_core.half_screen_webview.d;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import wz4.a;
import brd.t;
import wz4.f;
import erd.g;
import by5.a;
import com.kuaishou.tuna_core.half_screen_webview.e;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import q2b.i;
import k2b.k2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import na6.b;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import wz4.g;
import jz6.a;
import r05.b;
import wz4.c;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.activity.x;

public class CommercialDialogWebFragment extends DialogContainerFragment	// class@0010c3
{
    public Context H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public a N;
    public k2 O;
    public Fragment P;
    public final a Q;
    public ValueAnimator R;
    public String S;
    public static final int T = 2131558741;

    public void CommercialDialogWebFragment(){
       super();
       this.K = false;
       this.L = false;
       this.Q = new a();
       this.S = "UNKNOWN";
       int i = n.q(a.b());
       if (e.a() == 1 && i > 0) {
          b.f(KsLogTunaCoreTag.TUNA_HALF_WEB_VIEW.appendTag("CommercialDialogWebFragment"), c.b);
          this.uh(0x1030011);
       }
       return;
    }
    public static CommercialDialogWebFragment Nh(CommercialDialogWebFragment$a p0){
       CommercialDialogWebFragment obj = PatchProxy.applyOneRefs(p0, null, CommercialDialogWebFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommercialDialogWebFragment();
       if (!PatchProxy.applyVoidOneRefs(p0, obj, CommercialDialogWebFragment.class, "10")) {
          obj.lh("LayoutStyle", p0.a);
          obj.mh("NeedLoadingView", p0.j);
          obj.lh("ext_map", p0.n);
          obj.mh("ForceDisableImmersive", p0.i);
          obj.mh("HeightPixelConfig", p0.h);
          obj.kh("HeightPixel", p0.g);
          obj.lh("WebUrl", p0.b);
          obj.lh("PageUri", p0.c);
          obj.mh("disableJsSetHeight", p0.k);
          obj.lh("DialogToken", p0.l);
          obj.lh("DimAmount", Float.valueOf(p0.m));
          obj.mh("dimBackgroundEnabled", p0.o);
       }
       return obj;
    }
    public void Oh(){
       if (PatchProxy.applyVoid(null, this, CommercialDialogWebFragment.class, "15")) {
          return;
       }
       d.a.e(new h(this), 500, TimeUnit.MILLISECONDS);
       return;
    }
    public void Ph(KwaiYodaWebViewFragment p0,boolean p1){
       if (PatchProxy.isSupport(CommercialDialogWebFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, CommercialDialogWebFragment.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c uoc = p0.vh();
       if (uoc != null) {
          if (!p1) {
             uoc.l(new JsPageTitleParams());
          }
          View view = uoc.b();
          YodaBaseWebView yodaBaseWebV = p0.Ch();
          if (view != null && (yodaBaseWebV != null && !p1)) {
             boolean b = q.h(yodaBaseWebV.getLaunchModel());
             if (view instanceof StateListImageView) {
                View view1 = view;
                JsPageButtonParams$Icon cLOSE = JsPageButtonParams$Icon.CLOSE;
                view1.b(cLOSE.getStableDrawable(n.d(view), b));
                view1.d(cLOSE.getStableDrawable(n.d(view), b));
             }
          }
       }
    label_0061 :
       return;
    }
    public final boolean Qh(int p0){
       CommercialDialogWebFragment obj;
       if (PatchProxy.isSupport(CommercialDialogWebFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CommercialDialogWebFragment.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.J == null) {
          return b;
       }else if(this.K != null){
          return b;
       }else {
          obj = this.N;
          if (obj == null) {
             return b;
          }else {
             obj.dismiss();
             obj = this.R;
             if (obj != null) {
                obj.cancel();
             }
             int[] ointArray = new int[2];
             ointArray[b] = b;
             ointArray[1] = p0;
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             this.R = valueAnimato;
             valueAnimato.addUpdateListener(new b(this));
             this.R.setDuration(50);
             this.R.setInterpolator(new LinearInterpolator());
             this.R.start();
             this.K = true;
             return 1;
          }
       }
    }
    public int getLayoutResId(){
       return this.I;
    }
    public void onCreate(Bundle p0){
       boolean intx;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialDialogWebFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.H = this.getContext();
       if (!PatchProxy.applyVoid(null, this, CommercialDialogWebFragment.class, "11")) {
          p0 = this.getArguments();
          if (p0 != null) {
             this.I = 0x7f0d04ac;
             String str = "LayoutStyle";
             if (SerializableHook.getSerializable(p0, str) instanceof CommercialDialogWebFragment$LayoutStyle && SerializableHook.getSerializable(p0, str) == CommercialDialogWebFragment$LayoutStyle.STYLE_ROUND_CORNER) {
                this.I = CommercialDialogWebFragment.T;
             }
             this.J = p0.getBoolean("NeedLoadingView");
             this.L = p0.getBoolean("disableJsSetHeight");
             this.S = p0.getString("DialogToken", "UNKNOWN");
             this.nh(p0.getBoolean("ForceDisableImmersive"));
             if (p0.getBoolean("HeightPixelConfig")) {
                intx = p0.getInt("HeightPixel");
                this.M = intx;
                this.Kh(intx);
             }
             intx = p0.getBoolean("dimBackgroundEnabled", true);
             this.vh(intx);
             if (intx) {
                this.Mh(p0.getFloat("DimAmount"));
             }
             this.Lh(new d(this, p0));
          }
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.Q.c(f.f(a.class).observeOn(a).subscribe(new f(this)));
       this.Q.c(f.f(a.class).observeOn(a).subscribe(new e(this)));
       return;
    }
    public void onDestroy(){
       FragmentActivity activity;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommercialDialogWebFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       this.Q.dispose();
       i oi = this.O.d();
       if (!TextUtils.n(oi.p(), "UNKNOWN2") && oi.b()) {
          b.a(0x4b316083).Y0(this.O.d());
       }
       if (!PatchProxy.applyVoid(objArray, this, CommercialDialogWebFragment.class, "9") && this.P != null) {
          activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             activity.S2(this.P);
          }
       }
       CommercialDialogWebFragment tR = this.R;
       if (tR != null) {
          tR.cancel();
          this.R = objArray;
       }
       activity = this.getActivity();
       if (activity != null) {
          RxBus.f.b(new b(activity, 2, this.S));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CommercialDialogWebFragment.class, "6")) {
          return;
       }
       super.onPause();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().getWindow().setWindowAnimations(R.style.arg_RES_7f1103db);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CommercialDialogWebFragment.class, "5")) {
          return;
       }
       super.onResume();
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          RxBus.f.b(new b(activity, 1, this.S));
       }
       d.a.e(new g(this), 300, TimeUnit.MILLISECONDS);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommercialDialogWebFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, CommercialDialogWebFragment.class, "14")) {
          if (this.getActivity() instanceof GifshowActivity) {
             this.O = b.a(0x4b316083).f();
          }
          if (this.J != null) {
             this.Kh(0);
             if (this.N == null) {
                a uoa = b.a(this.H);
                this.N = uoa;
                uoa.setOnCancelListener(new c(this));
             }
             if (!this.N.isShowing()) {
                this.N.show();
             }
          }
       }
    label_005a :
       if (!PatchProxy.applyVoid(objArray, this, CommercialDialogWebFragment.class, "8")) {
          FragmentActivity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             this.P = activity.N2().c();
          }
       }
       return;
    }
}
