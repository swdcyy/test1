package com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$c;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import java.lang.Runnable;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import rkd.b;
import java.lang.Math;
import androidx.fragment.app.Fragment;
import android.widget.RelativeLayout;
import java.lang.Boolean;
import brd.y;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.h;

public class TrendingListFragmentV2$c extends AnimatorListenerAdapter	// class@001dad
{
    public final Runnable a;
    public final View b;
    public final TrendingListFragmentV2 c;

    public void TrendingListFragmentV2$c(TrendingListFragmentV2 p0,Runnable p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       TrendingListFragmentV2 b;
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingListFragmentV2$c.class, "1")) {
          return;
       }
       TrendingListFragmentV2$c ta = this.a;
       if (ta != null) {
          ta.run();
       }
       int i = n.u(a.b());
       if (b.g()) {
          i = Math.max(i, n.z(a.b()));
       }
       this.b.setTranslationY((float)i);
       if (this.c.getView() != null) {
          this.c.getView().setTranslationY(0);
       }
       b = this.c.B;
       if (b != null) {
          b.setTop(0);
          this.c.B.postInvalidate();
       }
       this.c.H.onNext(Boolean.FALSE);
       RxBus.f.b(new h(0));
       return;
    }
}
