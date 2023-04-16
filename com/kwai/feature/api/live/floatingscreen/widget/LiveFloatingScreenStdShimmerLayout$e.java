package com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$e;
import java.lang.Runnable;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import java.util.Objects;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class LiveFloatingScreenStdShimmerLayout$e implements Runnable	// class@000fd1
{
    public final LiveFloatingScreenStdShimmerLayout b;

    public void LiveFloatingScreenStdShimmerLayout$e(LiveFloatingScreenStdShimmerLayout p0){
       this.b = p0;
       super();
    }
    public final void run(){
       LiveFloatingScreenStdShimmerLayout$e tb;
       ValueAnimator valueAnimato;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFloatingScreenStdShimmerLayout$e.class, "1")) {
          return;
       }
       ValueAnimator shimmerAnima = this.b.getShimmerAnimator();
       if (shimmerAnima != null) {
          shimmerAnima.removeAllUpdateListeners();
       }
       shimmerAnima = this.b.getShimmerAnimator();
       if (shimmerAnima != null) {
          shimmerAnima.removeAllListeners();
       }
       shimmerAnima = this.b.getShimmerAnimator();
       if (shimmerAnima != null) {
          shimmerAnima.end();
       }
       int i = 2;
       if (this.b.getShimmerType() == i) {
          tb = this.b;
          Objects.requireNonNull(tb);
          valueAnimato = PatchProxy.apply(objArray, tb, LiveFloatingScreenStdShimmerLayout.class, "18");
          if (valueAnimato != patchProxyRe) {
          }else {
             float[] uofloatArray = new float[i];
             uofloatArray[0] = - (float)tb.getWidth();
             uofloatArray[1] = (float)tb.getWidth();
             valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             a.o(valueAnimato, "ValueAnimator.ofFloat\(-w¡­Float\(\), width.toFloat\(\)\)");
          }
          tb.setShimmerAnimator(valueAnimato);
       label_00ba :
          ValueAnimator shimmerAnima1 = this.b.getShimmerAnimator();
          if (shimmerAnima1 != null) {
             shimmerAnima1.setDuration(this.b.getShimmerAnimatorDurationMs());
          }
          shimmerAnima1 = this.b.getShimmerAnimator();
          if (shimmerAnima1 != null) {
             shimmerAnima1.addListener(this.b.r);
          }
          shimmerAnima1 = this.b.getShimmerAnimator();
          if (shimmerAnima1 != null) {
             shimmerAnima1.addUpdateListener(this.b.s);
          }
          shimmerAnima1 = this.b.getShimmerAnimator();
          if (shimmerAnima1 != null) {
             shimmerAnima1.start();
          }
       }else if(this.b.getShimmerType() == 1){
          tb = this.b;
          Objects.requireNonNull(tb);
          valueAnimato = PatchProxy.apply(objArray, tb, LiveFloatingScreenStdShimmerLayout.class, "17");
          if (valueAnimato != patchProxyRe) {
          }else {
             float f = 0;
             float f1 = (float)tb.getWidth();
             LiveFloatingScreenStdShimmerLayout i1 = tb.i;
             if (i1 != null) {
                f = f - (tb.getShimmerBitmapScale() * (float)i1.getWidth());
                f1 = f1 + ((tb.getShimmerBitmapScale() * (float)i1.getWidth()) / (float)i);
             }
             float[] uofloatArray1 = new float[i];
             uofloatArray1[0] = f;
             uofloatArray1[1] = f1;
             valueAnimato = ValueAnimator.ofFloat(uofloatArray1);
             a.o(valueAnimato, "ValueAnimator.ofFloat\(beginValue, endValue\)");
          }
          tb.setShimmerAnimator(valueAnimato);
          goto label_00ba ;
       }
       return;
    }
}
