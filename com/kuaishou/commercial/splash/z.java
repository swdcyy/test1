package com.kuaishou.commercial.splash.z;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.commercial.splash.d0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yy.h2;
import java.lang.Runnable;

public final class z implements View$OnLayoutChangeListener	// class@00163b
{
    public final d0 b;

    public void z(d0 p0){
       this.b = p0;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       ViewGroup$LayoutParams layoutParams1;
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (p4 != p8 && (p4 && (p8 && p7))) {
          p4 = p4 - p8;
          ViewGroup$LayoutParams layoutParams = -1;
          if (tb.X8().getLayoutParams().height != layoutParams) {
             layoutParams1 = tb.X8().getLayoutParams();
             layoutParams1.height = layoutParams1.height + p4;
          }
          if (tb.m8().getLayoutParams().height != layoutParams) {
             layoutParams1 = tb.m8().getLayoutParams();
             layoutParams1.height = layoutParams1.height + p4;
          }
          if (tb.L.getLayoutParams().height != layoutParams) {
             layoutParams1 = tb.L.getLayoutParams();
             layoutParams1.height = layoutParams1.height + p4;
          }
          if (tb.M.getLayoutParams().height != layoutParams) {
             layoutParams1 = tb.M.getLayoutParams();
             layoutParams1.height = layoutParams1.height + p4;
          }
          tb.X8().requestLayout();
          tb.m8().post(new h2(tb));
       }
    label_007e :
       return;
    }
}
