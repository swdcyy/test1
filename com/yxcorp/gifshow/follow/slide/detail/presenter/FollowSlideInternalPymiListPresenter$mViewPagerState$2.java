package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$mViewPagerState$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import cha.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class FollowSlideInternalPymiListPresenter$mViewPagerState$2 extends Lambda implements a	// class@001121
{
    public final FollowSlideInternalPymiListPresenter this$0;

    public void FollowSlideInternalPymiListPresenter$mViewPagerState$2(FollowSlideInternalPymiListPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FollowSlideInternalPymiListPresenter$mViewPagerState$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Activity activity = this.this$0.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       return new a(objArray);
    }
    public Object invoke(){
       return this.invoke();
    }
}
