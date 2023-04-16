package com.yxcorp.gifshow.atlas_detail.common.presenter.recommend.PostRecommendPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.atlas_detail.common.presenter.recommend.PostRecommendPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import j8c.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import hn5.n;
import hn5.m;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.atlas_detail.common.presenter.recommend.PostRecommendPresenter$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import com.kwai.feature.post.api.feature.recommend.PostRecommendDataManager;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.util.Pair;
import java.lang.System;
import java.lang.Long;
import java.util.LinkedHashMap;

public class PostRecommendPresenter$1 implements LifecycleObserver	// class@001ba0
{
    public final PostRecommendPresenter b;

    public void PostRecommendPresenter$1(PostRecommendPresenter p0){
       this.b = p0;
       super();
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PostRecommendPresenter$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().s("PostRecommendPresenter", "PostRecommendPresenter  onDestroy ", objArray);
       d.g().f();
       this.b.getActivity().getLifecycle().removeObserver(this);
       return;
    }
    public final void onPause(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PostRecommendPresenter$1.class, str)) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       o.C().s("PostRecommendPresenter", "PostRecommendPresenter  onPause ", objArray1);
       PostRecommendPresenter$1 tb = this.b;
       if (tb.q.mPhoto == null) {
          objArray = new Object[i];
          o.C().s("PostRecommendPresenter", "PostRecommendPresenter Photo is invalid", objArray);
          return;
       }else {
          long actualPlayDu = tb.p.get().getActualPlayDuration();
          d.g().j(this.b.q.mPhoto);
          if (this.b.q.mPhoto.mEntity == null) {
             objArray = new Object[i];
             o.C().s("PostRecommendPresenter", "PostRecommendPresenter BaseFeed is invalid", objArray);
             return;
          }else if(m.a().xK()){
             objArray = new Object[i];
             o.C().s("PostRecommendPresenter", "PostRecommendPresenter HomeUiMode is invalid", objArray);
             return;
          }else {
             TimeUnit sECONDS = TimeUnit.SECONDS;
             PostRecommendPresenter$a uoa = PostRecommendPresenter$a.class;
             PostRecommendPresenter$a uoa1 = PatchProxy.apply(objArray, objArray, uoa, str);
             if (uoa1 == PatchProxyResult.class) {
                uoa1 = a.t().getValue("prePostConsumeRecordConfig", uoa, new PostRecommendPresenter$a());
             }
             if (actualPlayDu - sECONDS.toMillis((long)uoa1.mSingleWatchTime) < 0) {
                objArray = new Object[i];
                o.C().s("PostRecommendPresenter", "PostRecommendPresenter watchTime is invalid", objArray);
                return;
             }else {
                PostRecommendDataManager postRecommen = PostRecommendDataManager.b();
                PostRecommendPresenter q = this.b.q;
                PhotoDetailParam mPhotoId = q.mPhotoId;
                QPhoto mEntity = q.mPhoto.mEntity;
                Objects.requireNonNull(postRecommen);
                if (!PatchProxy.applyVoidTwoRefs(mPhotoId, mEntity, postRecommen, PostRecommendDataManager.class, "2")) {
                   Log.b("PostRecommendDataManager", "addRecommendData photoId: "+mPhotoId);
                   postRecommen.a.put(mPhotoId, new Pair(Long.valueOf(System.currentTimeMillis()), mEntity));
                }
                return;
             }
          }
       }
    }
}
