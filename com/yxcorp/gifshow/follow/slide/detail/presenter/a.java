package com.yxcorp.gifshow.follow.slide.detail.presenter.a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class a implements Callable	// class@001141
{
    public final FollowSlideInternalPymiListPresenter$g b;

    public void a(FollowSlideInternalPymiListPresenter$g p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Boolean uBoolean = PatchProxy.apply(null, this, a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          this.b.b.R8().scrollToPositionWithOffset(0, 0);
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
