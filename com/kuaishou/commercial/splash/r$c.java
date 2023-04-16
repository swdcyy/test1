package com.kuaishou.commercial.splash.r$c;
import com.kuaishou.commercial.splash.r$b;
import com.kuaishou.commercial.splash.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.app.Activity;
import lnc.a1;

public final class r$c implements r$b	// class@00161c
{
    public final r a;

    public void r$c(r p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r$c.class, "1")) {
          return;
       }
       this.a.P8();
       this.a.R8();
       return;
    }
    public void b(){
       ViewGroup$LayoutParams layoutParams;
       r or = r.class;
       if (PatchProxy.applyVoid(null, this, r$c.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashEyemaxBottomAdapterPresenter", "exitFullScreen", objArray);
       r$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, or, "6")) {
          Object[] objArray2 = new Object[i];
          j0.f("SplashEyemaxBottomAdapterPresenter", "resizeViewPage", objArray2);
          r s = ta.s;
          if (s != null) {
             r w = ta.w;
             int i1 = (w != null)? w.intValue(): ta.S8();
             r s1 = ta.s;
             if (s1 != null) {
                layoutParams = s1.W0();
                if (layoutParams != null) {
                   layoutParams.height = i1;
                }
             }
             VerticalViewPager verticalView = s.s2();
             if (!verticalView instanceof KwaiGrootViewPager) {
                verticalView = null;
             }
             if (verticalView != null) {
                verticalView.setMaxHeight(i1);
             }
             layoutParams = s.W0();
             if (layoutParams != null) {
                layoutParams.height = i1;
             }
             View view = ta.m8();
             a.o(view, "rootView");
             view.getLayoutParams().height = i1;
             VerticalViewPager verticalView1 = s.s2();
             if (verticalView1 != null) {
                verticalView1.requestLayout();
             }
             Activity activity = ta.getActivity();
             View view1 = (activity != null)? activity.findViewById(R.id.navigation_bar_place_holder): null;
             if (ta.W8()) {
                if (view1 != null) {
                   ViewGroup$LayoutParams layoutParams1 = view1.getLayoutParams();
                   if (layoutParams1 != null) {
                      layoutParams1.height = a1.d(0x7f070bf1);
                   }
                }
                if (view1 != null) {
                   view1.requestLayout();
                }
             }
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, or, "9")) {
          Object[] objArray1 = new Object[i];
          j0.f("SplashEyemaxBottomAdapterPresenter", "resetSolidStatusBar", objArray1);
       }
       return;
    }
}
