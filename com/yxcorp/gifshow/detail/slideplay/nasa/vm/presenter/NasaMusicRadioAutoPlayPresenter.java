package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaMusicRadioAutoPlayPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import fm5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import fx9.c$d;
import brd.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.NullPointerException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import w85.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public final class NasaMusicRadioAutoPlayPresenter extends SlidePlayAutoPlayNextPresenter	// class@0017f2
{
    public y f1;

    public void NasaMusicRadioAutoPlayPresenter(){
       super();
    }
    public void E9(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaMusicRadioAutoPlayPresenter.class, "5")) {
          return;
       }
       if (!TextUtils.x(a.g(this.x))) {
          PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "5");
          return;
       }else {
          NasaMusicRadioAutoPlayPresenter tNasaMusicRa = this.f1;
          if (tNasaMusicRa == null) {
             a.S("mEditorAtOperationObservable");
          }
          tNasaMusicRa.onNext(new c$d());
          super.E9();
          PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "5");
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaMusicRadioAutoPlayPresenter.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("NASA_BOTTOM_EDITOR_OPERATION_OBSERVER");
       a.o(obj, "inject\(AccessIds.NASA_BO¡­DITOR_OPERATION_OBSERVER\)");
       this.f1 = obj;
       PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "1");
       return;
    }
    public void k9(){
       String str = "2";
       if (PatchProxy.applyVoidWithListener(null, this, NasaMusicRadioAutoPlayPresenter.class, str)) {
          return;
       }
       super.k9();
       Context context = this.getContext();
       if (context != null) {
          SlidePlayAutoPlayNextPresenter tq = this.q;
          if (tq != null) {
             a.o(tq, "it");
             int i = n.A(context);
             if (!PatchProxy.isSupport2(NasaMusicRadioAutoPlayPresenter.class, "3") || !PatchProxy.applyVoidTwoRefsWithListener(tq, Integer.valueOf(i), this, NasaMusicRadioAutoPlayPresenter.class, "3")) {
                a.p(tq, "view");
                if (i.c()) {
                   ViewGroup$LayoutParams layoutParams = tq.getLayoutParams();
                   if (layoutParams != null) {
                      layoutParams.topMargin = i;
                      tq.setLayoutParams(layoutParams);
                   }else {
                      PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "3");
                      throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                   }
                }
                PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "3");
             }
          }
       }
       PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, str);
       return;
    }
    public boolean n9(){
       return true;
    }
    public boolean o9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.applyWithListener(objArray, this, NasaMusicRadioAutoPlayPresenter.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.H;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "31");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.R != null){
          b = obj.N;
       }else {
          b = obj.U.getNasaSlideParam().mEnableMusicRadioBackPlay;
       }
       PatchProxy.onMethodExit(NasaMusicRadioAutoPlayPresenter.class, "4");
       return b;
    }
}
