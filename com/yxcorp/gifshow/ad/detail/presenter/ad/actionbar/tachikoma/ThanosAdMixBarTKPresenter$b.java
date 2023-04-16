package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import crd.b;
import lnc.b9;
import android.view.View;
import java.util.Objects;
import crd.a;
import kotlin.jvm.internal.a;
import nz8.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import brd.t;
import tkd.b;
import tkd.d;
import rx4.i;
import nz8.e;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.a;

public final class ThanosAdMixBarTKPresenter$b extends a	// class@00157a
{
    public final ThanosAdMixBarTKPresenter b;

    public void ThanosAdMixBarTKPresenter$b(ThanosAdMixBarTKPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMixBarTKPresenter$b.class, "2")) {
          return;
       }
       this.b.G = false;
       Object[] objArray = new Object[false];
       j0.f("TachikomaMixBarPresenter", "detachedOnScrollEnd", objArray);
       ThanosAdMixBarTKPresenter c = this.b.C;
       if (c != null) {
          c.g();
       }
       this.b.R8();
       ThanosAdMixBarTKPresenter$b tb = this.b;
       tb.J = false;
       b9.a(tb.I);
       return;
    }
    public void k1(){
       ThanosAdMixBarTKPresenter thanosAdMixB = ThanosAdMixBarTKPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosAdMixBarTKPresenter$b.class, "1")) {
          return;
       }
       ThanosAdMixBarTKPresenter$b tb = this.b;
       tb.G = true;
       ThanosAdMixBarTKPresenter y = tb.y;
       if (y == null || y.getVisibility()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, thanosAdMixB, "8")) {
             a uoa = new a();
             tb.I = uoa;
             ThanosAdMixBarTKPresenter h = tb.H;
             if (h == null) {
                a.S("mSimilarPhotoPanelShowObservable");
             }
             uoa.c(h.subscribe(new f(tb), Functions.e));
          }
       }else {
          tb = this.b;
          if (tb.F != null) {
             tb.P8();
          }
       }
       y = this.b.y;
       if (y != null) {
          y.setAlpha(0x3f800000);
       }
       if (this.b.x != null) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          j0.f("TachikomaMixBarPresenter", "attachedOnScrollEnd", objArray1);
          if (d.a(0x256720e1).ei()) {
             ThanosAdMixBarTKPresenter$b tb1 = this.b;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoid(objArray, tb1, thanosAdMixB, "6")) {
                Object[] objArray2 = new Object[i];
                j0.f("TachikomaMixBarPresenter", "initAndLoadActionBar", objArray2);
                thanosAdMixB = tb1.B;
                if (thanosAdMixB != null) {
                   tb1.D.b(thanosAdMixB, new e(tb1));
                }
             }
             thanosAdMixB = this.b.C;
             if (thanosAdMixB != null) {
                thanosAdMixB.h();
             }
          }
       }
       return;
    }
}
