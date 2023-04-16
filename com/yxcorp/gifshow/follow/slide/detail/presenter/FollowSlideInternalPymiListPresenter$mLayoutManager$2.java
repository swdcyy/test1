package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mLayoutManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class FollowSlideInternalPymiListPresenter$mLayoutManager$2 extends Lambda implements a	// class@00111e
{
    public final FollowSlideInternalPymiListPresenter this$0;

    public void FollowSlideInternalPymiListPresenter$mLayoutManager$2(FollowSlideInternalPymiListPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final FeedsLayoutManager invoke(){
       Object obj = PatchProxy.apply(null, this, FollowSlideInternalPymiListPresenter$mLayoutManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FeedsLayoutManager(this.this$0.getContext(), 0, 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
