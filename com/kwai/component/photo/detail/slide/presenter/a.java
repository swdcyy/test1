package com.kwai.component.photo.detail.slide.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import android.view.View;
import joc.y;
import of5.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.Locale;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Boolean;
import android.app.Activity;
import android.content.Intent;
import vm5.f;
import of5.b;
import java.lang.Runnable;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import ekd.m1;

public class a extends PresenterV2	// class@000a90
{
    public View p;
    public View q;
    public t r;
    public PhotoDetailParam s;
    public final boolean t;

    public void a(boolean p0){
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "LiveSquareSideBarLayoutPresenter";
       a.C().w(str, "onBindStart", objArray);
       if (this.q != null) {
          a tp = this.p;
          if (tp != null) {
             y.c(tp);
             this.q.setVisibility(i);
             this.P8(i);
             this.X7(this.r.subscribe(new a(this), Functions.e));
             Object[] objArray1 = new Object[i];
             a.C().w(str, "onBindEnd", objArray1);
             return;
          }
       }
       Locale uS = Locale.US;
       objArray = new Object[4];
       boolean b = (this.s.getBizType() == 9)? true: false;
       objArray[i] = Boolean.valueOf(b);
       objArray[1] = Boolean.valueOf(this.t);
       objArray[2] = Boolean.valueOf(f.g(this.getActivity().getIntent()));
       objArray[3] = Boolean.valueOf(this.s.isThanos());
       String.format(uS, "cannot find side bar layout! isMusicStation: %b, isEnterLiveFromFollow: %b, IsLiveSlideSquareFromScheme: %b, isThanos: %b", objArray);
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (p0) {
          this.p.post(new b(this));
       }else {
          float f = (float)n.z(this.getActivity());
          Object[] objArray = new Object[0];
          a.C().w("LiveSquareSideBarLayoutPresenter", "setTranslationX for PORTRAIT, translation = "+f, objArray);
          this.p.setTranslationX(f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a25ba);
       this.q = m1.f(p0, 0x7f0a25b9);
       Object[] objArray = new Object[0];
       a.C().w("LiveSquareSideBarLayoutPresenter", "bindView, mSquareSideBarLayout = "+this.p+", mSquareSideBarContainerLayout = "+this.q, objArray);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.s = this.q8(PhotoDetailParam.class);
       return;
    }
}
