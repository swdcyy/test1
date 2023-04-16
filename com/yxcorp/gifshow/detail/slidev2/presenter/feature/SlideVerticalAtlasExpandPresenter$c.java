package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import uw9.c;
import com.yxcorp.gifshow.widget.popup.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import android.view.View;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.content.Context;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;

public final class SlideVerticalAtlasExpandPresenter$c extends RecyclerView$r	// class@00192c
{
    public final SlideVerticalAtlasExpandPresenter a;

    public void SlideVerticalAtlasExpandPresenter$c(SlideVerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SlideVerticalAtlasExpandPresenter$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlideVerticalAtlasExpandPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (this.a.U0 != null) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             this.a.j9(layoutManage);
             SlideVerticalAtlasExpandPresenter$c ta = this.a;
             Objects.requireNonNull(ta);
             Object[] objArray = null;
             SlideVerticalAtlasExpandPresenter slideVertica = PatchProxy.apply(objArray, ta, SlideVerticalAtlasExpandPresenter.class, "18");
             if (slideVertica != patchProxyRe) {
             }else {
                slideVertica = ta.N;
                if (slideVertica == null) {
                   a.S("mIsAtlasDetailModeRef");
                }
             }
             Object obj = slideVertica.get();
             a.o(obj, "mIsAtlasDetailModeRef.get\(\)");
             if (obj.booleanValue()) {
                obj = 1;
                if ((float)(layoutManage.i0() + obj) - ((float)this.a.b9().getAtlasList().size() * 0.30f) > 0) {
                   SlideVerticalAtlasExpandPresenter$c ta1 = this.a;
                   Objects.requireNonNull(ta1);
                   if (!PatchProxy.applyVoid(objArray, ta1, SlideVerticalAtlasExpandPresenter.class, "41")) {
                      slideVertica = ta1.M;
                      if (slideVertica == null) {
                         a.S("mPhoto");
                      }
                      if (slideVertica.canDownload() && (ta1.V0 != null && ta1.W0 == null)) {
                         Activity obj1 = PatchProxy.apply(objArray, ta1, SlideVerticalAtlasExpandPresenter.class, "42");
                         boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): c.j();
                         if (!b) {
                            ta1.W0 = obj;
                            obj1 = ta1.getActivity();
                            a.m(obj1);
                            a uoa = new a(obj1);
                            uoa.I0(0x271b);
                            uoa.K0(KwaiBubbleOption.e);
                            uoa.C0(a1.d(R.dimen.arg_RES_7f07031b));
                            uoa.F0(a1.p(R.string.arg_RES_7f101adc));
                            slideVertica = ta1.V0;
                            a.m(slideVertica);
                            uoa.o0(slideVertica);
                            uoa.T(3000);
                            uoa.A(false);
                            uoa.P(obj);
                            a.o(uoa, "KwaiBubbleBuilder\(activi\x20\x02nt<Bubble.Builder?>\(true\)\x00");
                            ta1.r = p.e(uoa);
                            if (!PatchProxy.applyVoid(objArray, ta1, SlideVerticalAtlasExpandPresenter.class, "43")) {
                               c.E(obj);
                            }
                         }
                      }
                   }
                }
             }
          }
       label_0118 :
          InvalidGestureChecker.h.b(this.a.getContext(), AnswerType.SLIDE_LONG_ALAS);
       }
       return;
    }
}
