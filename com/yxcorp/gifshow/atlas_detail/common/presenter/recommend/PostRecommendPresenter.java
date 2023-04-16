package com.yxcorp.gifshow.atlas_detail.common.presenter.recommend.PostRecommendPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.atlas_detail.common.presenter.recommend.PostRecommendPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import im8.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class PostRecommendPresenter extends PresenterV2	// class@001ba2
{
    public f p;
    public PhotoDetailParam q;
    public NormalDetailBizParam r;
    public LifecycleObserver s;

    public void PostRecommendPresenter(){
       super();
       this.s = new PostRecommendPresenter$1(this);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, PostRecommendPresenter.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("PostRecommendPresenter", "PostRecommendPresenter  onCreate ", objArray);
       this.getActivity().getLifecycle().addObserver(this.s);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, PostRecommendPresenter.class, "3")) {
          return;
       }
       this.getActivity().getLifecycle().removeObserver(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PostRecommendPresenter.class, "1")) {
          return;
       }
       this.p = this.x8("DETAIL_LOGGER");
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.q8(NormalDetailBizParam.class);
       return;
    }
}
