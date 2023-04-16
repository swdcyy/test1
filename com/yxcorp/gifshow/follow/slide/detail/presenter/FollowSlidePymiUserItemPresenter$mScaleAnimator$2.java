package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$mScaleAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import kotlin.jvm.internal.a;

public final class FollowSlidePymiUserItemPresenter$mScaleAnimator$2 extends Lambda implements a	// class@00112b
{
    public final FollowSlidePymiUserItemPresenter this$0;

    public void FollowSlidePymiUserItemPresenter$mScaleAnimator$2(FollowSlidePymiUserItemPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final FollowSlidePymiUserItemPresenter$b invoke(){
       Object obj = PatchProxy.apply(null, this, FollowSlidePymiUserItemPresenter$mScaleAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f8ccccd,0x3f800000});
       valueAnimato.setDuration(1160);
       valueAnimato.setRepeatCount(-1);
       valueAnimato.addUpdateListener(new FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a(this));
       a.o(valueAnimato, "ValueAnimator.ofFloat\(1.бн\)\n        }\n      }\n    }");
       return new FollowSlidePymiUserItemPresenter$b(this.this$0, valueAnimato);
    }
    public Object invoke(){
       return this.invoke();
    }
}
