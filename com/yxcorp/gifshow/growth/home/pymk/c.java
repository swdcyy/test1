package com.yxcorp.gifshow.growth.home.pymk.c;
import erd.g;
import com.yxcorp.gifshow.growth.home.pymk.d;
import java.lang.Object;
import java.lang.Integer;
import androidx.viewpager2.widget.ViewPager2;
import vna.t;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import android.animation.ValueAnimator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import k6a.u;
import vna.z;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;
import vna.x;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import vna.y;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import lnc.ja;

public final class c implements g	// class@00139e
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       long l1;
       ValueAnimator valueAnimato;
       c b = this.b;
       Integer integer = p0;
       d q = b.q;
       if (q != null) {
          int i = q.getCurrentItem() + 1;
          if (i >= b.p.getItemCount()) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1041b4));
          }else {
             d x = b.x;
             if (x == null || !x.isRunning()) {
                String str = "switch";
                d uod = d.class;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), str, b, uod, "7")) {
                   RecommendUserWrapper recommendUse = b.p.r1(i);
                   if (recommendUse != null && !recommendUse.isShowed()) {
                      recommendUse.setShowed(1);
                      uod = b.t;
                      PhotoDetailParam mPhoto = uod.mPhoto;
                      String photoId = (mPhoto != null)? mPhoto.getPhotoId(): uod.mPhotoId;
                      u.g(b.w, photoId, str);
                   }
                }
                x = b.q;
                long l = (long)integer.intValue();
                if (PatchProxy.isSupport(z.class)) {
                   l1 = l;
                   valueAnimato = PatchProxy.applyFourRefs(x, Integer.valueOf(i), Long.valueOf(500), Long.valueOf(l), null, z.class, "1");
                   if (valueAnimato != PatchProxyResult.class) {
                   label_00f1 :
                      b.x = valueAnimato;
                      ja.a();
                   }
                }else {
                   l1 = l;
                }
                z.a = 0;
                int[] ointArray = new int[]{0,(x.getWidth() - ((x.getChildAt(0).getPaddingStart() * 2) - a1.e(26.00f))) * (i - x.getCurrentItem())};
                valueAnimato = ValueAnimator.ofInt(ointArray);
                valueAnimato.addUpdateListener(new x(x));
                valueAnimato.addListener(new y(x));
                valueAnimato.setInterpolator(new DecelerateInterpolator());
                valueAnimato.setDuration(500);
                valueAnimato.setStartDelay(l1);
                valueAnimato.start();
                goto label_00f1 ;
             }
          }
       }
       return;
    }
}
