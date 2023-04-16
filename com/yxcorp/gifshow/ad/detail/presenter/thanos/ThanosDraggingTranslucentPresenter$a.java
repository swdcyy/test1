package com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ThanosDraggingTranslucentPresenter;
import i19.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import android.animation.ObjectAnimator;

public final class ThanosDraggingTranslucentPresenter$a extends ViewPager$l	// class@0016b7
{
    public final ThanosDraggingTranslucentPresenter b;

    public void ThanosDraggingTranslucentPresenter$a(ThanosDraggingTranslucentPresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       ThanosDraggingTranslucentPresenter r;
       Iterator iterator;
       j oj = j.class;
       ThanosDraggingTranslucentPresenter$a uoa = ThanosDraggingTranslucentPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                r = this.b.r;
                Objects.requireNonNull(r);
                if (!PatchProxy.applyVoid(null, r, oj, "3")) {
                   iterator = r.c.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().start();
                   }
                }
             }
          }else {
             r = this.b.r;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoid(null, r, oj, "2")) {
                iterator = r.b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().start();
                }
             }
          }
       }else {
          this.b.r.b();
       }
       return;
    }
}
