package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$e$a;
import android.animation.Animator$AnimatorListener;

public final class VerticalAtlasExpandPresenter$e implements Runnable	// class@001bd3
{
    public final VerticalAtlasExpandPresenter b;
    public final LottieAnimationView c;

    public void VerticalAtlasExpandPresenter$e(VerticalAtlasExpandPresenter p0,LottieAnimationView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VerticalAtlasExpandPresenter$e.class, "1")) {
          return;
       }
       this.c.setSpeed(0x3fa66666);
       this.c.a(new VerticalAtlasExpandPresenter$e$a(this));
       this.c.s();
       return;
    }
}
