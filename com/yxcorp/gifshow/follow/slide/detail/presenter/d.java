package com.yxcorp.gifshow.follow.slide.detail.presenter.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;

public final class d implements Runnable	// class@001144
{
    public final FollowSlidePymiUserItemPresenter$d b;

    public void d(FollowSlidePymiUserItemPresenter$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.b.b.e9();
       return;
    }
}
