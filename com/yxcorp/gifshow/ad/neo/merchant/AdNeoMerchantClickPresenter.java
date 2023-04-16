package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$mLifecycleObserver$1;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.net.Uri;
import ekd.x0;
import lnc.o5;
import android.view.Window;
import android.view.ViewGroup;
import android.view.View$OnTouchListener;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.utility.f;
import brd.t;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$c;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantClickPresenter$d;
import erd.g;

public final class AdNeoMerchantClickPresenter extends PresenterV2	// class@0017a3
{
    public long p;
    public String q;
    public b r;
    public boolean s;
    public final LifecycleObserver t;
    public final View$OnTouchListener u;
    public View v;
    public String w;
    public static final AdNeoMerchantClickPresenter$a x;

    static {
       AdNeoMerchantClickPresenter.x = new AdNeoMerchantClickPresenter$a(null);
    }
    public void AdNeoMerchantClickPresenter(String p0){
       super();
       this.w = p0;
       this.p = -1;
       this.t = new AdNeoMerchantClickPresenter$mLifecycleObserver$1(this);
       this.u = new AdNeoMerchantClickPresenter$b(this);
    }
    public void E8(){
       AdNeoMerchantClickPresenter uAdNeoMercha = AdNeoMerchantClickPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdNeoMercha, "1")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       View view = new View(this.getActivity());
       view.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       this.v = view;
       Uri uri = x0.f(this.w);
       this.p = o5.c(x0.b(uri, "adNeoBonusTime", "")) * (long)1000;
       this.q = x0.b(uri, "itemId", "");
       if (this.p >= 0 && !PatchProxy.applyVoid(objArray, this, uAdNeoMercha, "3")) {
          uAdNeoMercha = this.v;
          if (uAdNeoMercha != null) {
             Activity activity = this.getActivity();
             if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                   view = window.getDecorView();
                label_006f :
                   if (view instanceof ViewGroup) {
                      objArray = view;
                   }
                   if (objArray != null) {
                      objArray.addView(uAdNeoMercha);
                   }
                   uAdNeoMercha.setOnTouchListener(this.u);
                }
             }
             Object[] objArray1 = objArray;
             goto label_006f ;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantClickPresenter.class, "2")) {
          return;
       }
       this.p = -1;
       b9.a(this.r);
       this.R8();
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       if (activity != null) {
          Lifecycle lifecycle = activity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.t);
          }
       }
       this.v = null;
       this.p = -1;
       this.q = null;
       this.s = false;
       this.w = null;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantClickPresenter.class, "5")) {
          return;
       }
       b9.a(this.r);
       if (this.p - null <= 0) {
          return;
       }
       this.r = f.d().b(this.p, 1000).subscribe(new AdNeoMerchantClickPresenter$c(this), new AdNeoMerchantClickPresenter$d(this));
       return;
    }
    public final void R8(){
       View decorView;
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantClickPresenter.class, "4")) {
          return;
       }
       AdNeoMerchantClickPresenter tv = this.v;
       if (tv != null) {
          Activity activity = this.getActivity();
          if (activity != null) {
             Window window = activity.getWindow();
             if (window != null) {
                decorView = window.getDecorView();
             label_0022 :
                if (!decorView instanceof ViewGroup) {
                   decorView = null;
                }
                if (decorView != null) {
                   decorView.removeView(tv);
                }
                tv.setOnTouchListener(null);
             }
          }
          decorView = null;
          goto label_0022 ;
       }
       return;
    }
}
