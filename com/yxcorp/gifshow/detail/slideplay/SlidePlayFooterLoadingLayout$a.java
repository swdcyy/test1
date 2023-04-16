package com.yxcorp.gifshow.detail.slideplay.SlidePlayFooterLoadingLayout$a;
import xtd.f$a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFooterLoadingLayout;
import xtd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import k2b.k0;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.widget.FrameLayout;
import android.content.res.Resources;
import cw9.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.library.slide.base.widget.a$a;

public class SlidePlayFooterLoadingLayout$a extends f$a	// class@001714
{
    public final SlidePlayFooterLoadingLayout b;

    public void SlidePlayFooterLoadingLayout$a(SlidePlayFooterLoadingLayout p0){
       this.b = p0;
       super();
    }
    public void c(b p0,int p1,int p2){
       SlidePlayFooterLoadingLayout b;
       if (PatchProxy.isSupport(SlidePlayFooterLoadingLayout$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlayFooterLoadingLayout$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       k0.C().w("SlidePlayFooterLoading", "oldState:"+p1+"|newState:"+p2, objArray);
       SlidePlayFooterLoadingLayout$a tb = this.b;
       if (tb.f != null) {
          if (tb.b == null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, SlidePlayFooterLoadingLayout.class, "2")) {
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, c.b(tb.getContext().getResources(), 0x7f0702e8));
                layoutParams.bottomMargin = c.b(tb.getContext().getResources(), 0x7f070295);
                layoutParams.gravity = 81;
                KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(tb.getContext());
                tb.b = kwaiLoadingV;
                kwaiLoadingV.setLoadingStyle(LoadingStyle.GRAY);
                tb.b.setLayoutParams(layoutParams);
                tb.b.setVisibility(8);
                tb.addView(tb.b);
             }
          }
          b = this.b.b;
          if (!p2) {
             i = 8;
          }
          b.setVisibility(i);
       }
       if (p2 == 3) {
          b = this.b.e;
          if (b != null) {
             b.b();
          }
       }
       if (p2 == 2) {
          b = this.b.e;
          if (b != null) {
             b.c();
          }
       }
       return;
    }
}
