package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$f;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class FollowSlideInternalPymiListPresenter$f implements g	// class@00111c
{
    public final FollowSlideInternalPymiListPresenter b;

    public void FollowSlideInternalPymiListPresenter$f(FollowSlideInternalPymiListPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter$f.class, "1")) {
       }else {
          FollowSlideInternalPymiListPresenter t = this.b.t;
          if (t != null) {
             a.o(p0, "it");
             int i = (p0.booleanValue())? 0: 8;
             t.setVisibility(i);
          }
       }
       return;
    }
}
