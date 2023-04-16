package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.util.Objects;
import yx.j0;
import nz8.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.a;
import wy8.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import wy8.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import ekd.k1;

public final class ThanosAdActionBarTKPresenter$b extends a	// class@00156e
{
    public final ThanosAdActionBarTKPresenter b;

    public void ThanosAdActionBarTKPresenter$b(ThanosAdActionBarTKPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, ThanosAdActionBarTKPresenter$b.class, "2")) {
          return;
       }
       ThanosAdActionBarTKPresenter g = this.b.G;
       if (g != null) {
          g.g();
       }
       ThanosAdActionBarTKPresenter$b tb = this.b;
       tb.J = true;
       g = tb.z;
       if (g != null) {
          ViewGroup$LayoutParams layoutParams = g.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = 0;
          }
       }
       g = this.b.z;
       if (g != null) {
          g.requestLayout();
       }
       this.b.Q.removeAllUpdateListeners();
       this.b.Q.removeAllListeners();
       g = this.b.A;
       if (g != null) {
          g.removeAllViews();
       }
       this.b.Z8();
       return;
    }
    public void i2(){
       ThanosAdActionBarTKPresenter d;
       ThanosAdActionBarTKPresenter d1;
       ThanosAdActionBarTKPresenter e;
       ThanosAdActionBarTKPresenter$b uob = ThanosAdActionBarTKPresenter$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       ThanosAdActionBarTKPresenter g = this.b.G;
       if (g != null) {
          g.h();
       }
       ThanosAdActionBarTKPresenter$b tb = this.b;
       boolean b = false;
       tb.I = b;
       tb.J = b;
       tb.K = b;
       g = tb.z;
       if (g != null) {
          ViewGroup$LayoutParams layoutParams = g.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = b;
          }
       }
       g = this.b.z;
       if (g != null) {
          g.requestLayout();
       }
       this.b.W8();
       if (this.b.S8() == null) {
          return;
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, ThanosAdActionBarTKPresenter.class, "5")) {
             Object[] objArray2 = new Object[b];
             j0.f("TachikomaActionBar", "initAndLoadActionBar", objArray2);
             e = tb.E;
             if (e != null) {
                tb.H.b(e, new b(tb));
             }
          }
          e uoe = new e(this.b.R).e(ThanosAdActionBarTKPresenter.P8(this.b)).d(1);
          Object[] objArray1 = PatchProxy.apply(objArray, this, uob, "3");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             uob = this.b;
             long l1 = 2000;
             if (uob.Y8(uob.C)) {
                uob = this.b;
                d = uob.D;
                if (d == null || (d.mDownloadedBarLoadTime == null && uob.X8())) {
                   objArray = Long.valueOf(l1);
                }else {
                   d1 = this.b.D;
                   if (d1 != null) {
                      objArray = Long.valueOf((long)d1.mDownloadedBarLoadTime);
                   }
                }
             }else {
                uob = this.b;
                d = uob.D;
                if (d == null || (d.mActionBarLoadTime == null && uob.X8())) {
                   objArray = Long.valueOf(l1);
                }else {
                   d1 = this.b.D;
                   if (d1 != null) {
                      objArray = Long.valueOf((long)d1.mActionBarLoadTime);
                   }
                }
             }
             objArray1 = objArray;
          }
          long l = (objArray1 != null)? objArray1.longValue(): 0;
          Objects.requireNonNull(uoe);
          e uoe1 = e.class;
          if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), uoe, uoe1, "2")) {
             uoe.b();
             k1.r(uoe.c, l);
          }
          return;
       }
    }
}
