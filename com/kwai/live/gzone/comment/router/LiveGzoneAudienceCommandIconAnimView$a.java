package com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$a;
import java.lang.Runnable;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.LinkedBlockingQueue;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import android.animation.ValueAnimator;
import com.kwai.live.gzone.comment.router.LiveGzoneAudienceCommandIconAnimView$c;
import android.graphics.PointF;
import java.util.Random;
import android.animation.TypeEvaluator;
import g47.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import g47.b;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ekd.k1;

public class LiveGzoneAudienceCommandIconAnimView$a implements Runnable	// class@000ca0
{
    public final LiveGzoneAudienceCommandIconAnimView b;

    public void LiveGzoneAudienceCommandIconAnimView$a(LiveGzoneAudienceCommandIconAnimView p0){
       this.b = p0;
       super();
    }
    public void run(){
       KwaiImageView kwaiImageVie;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceCommandIconAnimView$a.class, "1")) {
          return;
       }
       LiveGzoneAudienceCommandIconAnimView$a tb = this.b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, tb, LiveGzoneAudienceCommandIconAnimView.class, "5")) {
          if (tb.j.isEmpty()) {
             kwaiImageVie = new KwaiImageView(tb.getContext());
             RelativeLayout$LayoutParams layoutParams = PatchProxy.apply(objArray, tb, LiveGzoneAudienceCommandIconAnimView.class, "7");
             if (layoutParams != patchProxyRe) {
             }else {
                RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(tb.getRandomBitmapSize(), tb.getRandomBitmapSize());
                layoutParams1.setMargins(tb.k, tb.k, tb.k, tb.k);
                layoutParams1.addRule(10, -1);
                layoutParams = layoutParams1;
             }
             kwaiImageVie.setLayoutParams(layoutParams);
             kwaiImageVie.L(tb.e);
             tb.a(kwaiImageVie);
          }else {
             kwaiImageVie = tb.j.poll();
             tb.a(kwaiImageVie);
          }
          tb.addView(kwaiImageVie);
          ValueAnimator valueAnimato = PatchProxy.applyOneRefs(kwaiImageVie, tb, LiveGzoneAudienceCommandIconAnimView.class, "12");
          if (valueAnimato != patchProxyRe) {
          }else {
             LiveGzoneAudienceCommandIconAnimView$c uoc = new LiveGzoneAudienceCommandIconAnimView$c(tb);
             Object[] objArray1 = new Object[2];
             int i = 0;
             PointF pointF = PatchProxy.apply(objArray, tb, LiveGzoneAudienceCommandIconAnimView.class, "13");
             if (pointF != patchProxyRe) {
             }else {
                pointF = new PointF();
                int i1 = tb.g - tb.c;
                LiveGzoneAudienceCommandIconAnimView i2 = tb.i;
                if (i2 >= 0 && i2 - (float)(i1 / 2) < 0) {
                   LiveGzoneAudienceCommandIconAnimView i3 = tb.i;
                   float f = (float)tb.c;
                   pointF.x = ((tb.h.nextFloat() * (((float)i1 - i3) - f)) + i3) + f;
                }else if(i2 - (float)(i1 / 2) >= 0 && i2 - (float)i1 < 0){
                   pointF.x = tb.h.nextFloat() * (tb.i - (float)tb.c);
                }else {
                   pointF.x = tb.h.nextFloat() * (float)i1;
                }
                pointF.y = (float)(- tb.b);
                tb.i = pointF.x;
             }
             objArray1[i] = pointF;
             PointF pointF1 = PatchProxy.apply(objArray, tb, LiveGzoneAudienceCommandIconAnimView.class, "14");
             if (pointF1 != patchProxyRe) {
             }else {
                pointF1 = new PointF((tb.h.nextFloat() * (float)(tb.g - tb.c)), (float)tb.f);
             }
             objArray1[1] = pointF1;
             valueAnimato = ValueAnimator.ofObject(uoc, objArray1);
             valueAnimato.addUpdateListener(new a(tb, valueAnimato, kwaiImageVie));
             valueAnimato.addListener(new b(tb, kwaiImageVie));
             valueAnimato.setInterpolator(new LinearInterpolator());
             valueAnimato.setTarget(kwaiImageVie);
             valueAnimato.setDuration((long)(tb.h.nextInt(3000) + 4000));
          }
          valueAnimato.start();
       }
       k1.r(this, (long)(this.b.h.nextInt(400) + 200));
       return;
    }
}
