package com.reactnativepagerview.PagerViewViewManager$e;
import androidx.viewpager2.widget.ViewPager2$j;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class PagerViewViewManager$e implements ViewPager2$j	// class@000b72
{
    public final int a;
    public final ViewPager2 b;

    public void PagerViewViewManager$e(int p0,ViewPager2 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(View p0,float p1){
       a.q(p0, "page");
       float f = (float)this.a * p1;
       if (!this.b.getOrientation()) {
          int i = 1;
          if (this.b.getLayoutDirection() != i) {
             i = 0;
          }
          if (i) {
             f = - f;
          }
          p0.setTranslationX(f);
       }else {
          p0.setTranslationY(f);
       }
       return;
    }
}
