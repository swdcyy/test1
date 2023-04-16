package com.kuaishou.live.basic.liveslide.loadmore.LiveSlideLoadMoreView$a;
import xtd.f$a;
import com.kuaishou.live.basic.liveslide.loadmore.LiveSlideLoadMoreView;
import xtd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.content.Context;
import android.widget.FrameLayout;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import f51.a;

public class LiveSlideLoadMoreView$a extends f$a	// class@000cd2
{
    public final LiveSlideLoadMoreView b;

    public void LiveSlideLoadMoreView$a(LiveSlideLoadMoreView p0){
       this.b = p0;
       super();
    }
    public void c(b p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveSlideLoadMoreView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveSlideLoadMoreView$a.class, "1")) {
          return;
       }
       LiveSlideLoadMoreView$a tb = this.b;
       int i = 8;
       if (tb.b == null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, LiveSlideLoadMoreView.class, "2")) {
             FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, a1.d(0x7f0702e8));
             layoutParams.bottomMargin = a1.d(0x7f070295);
             layoutParams.gravity = 81;
             KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(tb.getContext());
             tb.b = kwaiLoadingV;
             kwaiLoadingV.setLoadingStyle(LoadingStyle.GRAY);
             tb.b.setLayoutParams(layoutParams);
             tb.b.setVisibility(i);
             tb.addView(tb.b);
          }
       }
       LiveSlideLoadMoreView b = this.b.b;
       if (p2) {
          i = 0;
       }
       b.setVisibility(i);
       if (p2 == 3) {
          b = this.b.e;
          if (b != null) {
             b.b();
          }
       }else if(p2 == 2){
          b = this.b.e;
          if (b != null) {
             b.c();
          }
       }
       return;
    }
}
