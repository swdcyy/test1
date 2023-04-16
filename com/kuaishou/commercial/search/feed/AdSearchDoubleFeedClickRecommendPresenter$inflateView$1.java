package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$inflateView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.search.b;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import uy.a;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

public final class AdSearchDoubleFeedClickRecommendPresenter$inflateView$1 extends Lambda implements l	// class@001558
{
    public final AdSearchDoubleFeedClickRecommendPresenter this$0;

    public void AdSearchDoubleFeedClickRecommendPresenter$inflateView$1(AdSearchDoubleFeedClickRecommendPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdSearchDoubleFeedClickRecommendPresenter$inflateView$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       int i = 2;
       b.m(AdSearchDoubleFeedClickRecommendPresenter.P8(this.this$0).mEntity, i);
       AdSearchDoubleFeedClickRecommendPresenter$inflateView$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(null, tthis$0, AdSearchDoubleFeedClickRecommendPresenter.class, "25")) {
          AdSearchDoubleFeedClickRecommendPresenter x = tthis$0.x;
          if (x != null) {
             a.m(x);
             float[] uofloatArray = new float[i];
             uofloatArray[0] = 0;
             AdSearchDoubleFeedClickRecommendPresenter x1 = tthis$0.x;
             a.m(x1);
             uofloatArray[1] = (float)x1.getHeight();
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(x, View.TRANSLATION_Y, uofloatArray);
             a.o(objectAnimat, "ObjectAnimator.ofFloat\(\n¡­ntent!!.height.toFloat\(\)\)");
             AdSearchDoubleFeedClickRecommendPresenter x2 = tthis$0.x;
             a.m(x2);
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(x2, View.ALPHA, new float[i]{0x3f800000,0});
             a.o(objectAnimat1, "ObjectAnimator.ofFloat\(\n¡­LPHA,\n      1f,\n      0f\)");
             tthis$0.W8(objectAnimat, objectAnimat1, new a(tthis$0));
          }
       }
       this.this$0.Y8(69);
       return;
    }
}
