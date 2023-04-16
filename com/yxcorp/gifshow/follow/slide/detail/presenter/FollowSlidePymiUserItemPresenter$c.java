package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$c;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FollowSlidePymiUserItemPresenter$c implements View$OnAttachStateChangeListener	// class@001126
{
    public final FollowSlidePymiUserItemPresenter b;

    public void FollowSlidePymiUserItemPresenter$c(FollowSlidePymiUserItemPresenter p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlidePymiUserItemPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       this.b.b9();
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlidePymiUserItemPresenter$c.class, "2")) {
          return;
       }
       a.p(p0, "v");
       this.b.e9();
       return;
    }
}
