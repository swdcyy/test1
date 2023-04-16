package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$b;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class FollowSlidePymiUserItemPresenter$b extends ValueAnimator	// class@001125
{
    public final ValueAnimator b;
    public final FollowSlidePymiUserItemPresenter c;

    public void FollowSlidePymiUserItemPresenter$b(FollowSlidePymiUserItemPresenter p0,ValueAnimator p1){
       a.p(p1, "actual");
       this.c = p0;
       super();
       this.b = p1;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter$b.class, "1")) {
          return;
       }
       if (this.c.Z8()) {
          return;
       }
       this.b.cancel();
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, FollowSlidePymiUserItemPresenter$b.class, "2")) {
          return;
       }
       if (this.c.Z8()) {
          return;
       }
       this.b.start();
       return;
    }
}
