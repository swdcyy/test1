package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$d;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiImageView;
import yha.a;
import android.view.View;
import a2.i0;
import com.yxcorp.gifshow.follow.slide.detail.presenter.d;
import java.lang.Runnable;
import android.widget.ImageView;

public final class FollowSlidePymiUserItemPresenter$d implements g	// class@001127
{
    public final FollowSlidePymiUserItemPresenter b;

    public void FollowSlidePymiUserItemPresenter$d(FollowSlidePymiUserItemPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       FollowSlidePymiUserItemPresenter$d uod = FollowSlidePymiUserItemPresenter$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uod, "1")) {
          if (i == 1) {
             if (i0.X(this.b.R8())) {
                this.b.R8().postDelayed(new d(this), (long)150);
             }
          }else if(!i){
             this.b.b9();
          }
       }
       return;
    }
}
