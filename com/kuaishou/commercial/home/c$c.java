package com.kuaishou.commercial.home.c$c;
import java.lang.Runnable;
import com.kuaishou.commercial.home.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.graphics.drawable.Animatable;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;
import tw.j;
import ekd.k1;
import java.lang.System;
import android.animation.ValueAnimator;
import qx.v;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class c$c implements Runnable	// class@0014da
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$c.class, "1")) {
          return;
       }
       c$c tb = this.b;
       if (tb.z != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, c.class, "4")) {
             tb.z.start();
             tb.N = true;
             tb.J = false;
             if (j.m(tb.q) == null || !j.m(tb.q).mCoverDuration) {
                k1.r(tb.S, 2000);
             }else {
                k1.r(tb.S, j.m(tb.q).mCoverDuration);
             }
             tb.G = System.currentTimeMillis();
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x42c80000});
             valueAnimato.setDuration(200);
             valueAnimato.start();
             valueAnimato.addUpdateListener(new v(tb));
          }
       }
       return;
    }
}
