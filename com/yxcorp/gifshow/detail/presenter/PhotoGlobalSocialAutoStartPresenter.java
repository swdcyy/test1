package com.yxcorp.gifshow.detail.presenter.PhotoGlobalSocialAutoStartPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.presenter.h;
import erd.r;
import y4a.q;
import erd.o;
import com.yxcorp.gifshow.detail.presenter.i;
import com.yxcorp.gifshow.detail.presenter.g;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.kwai.framework.model.feed.BaseFeed;
import zic.p0;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class PhotoGlobalSocialAutoStartPresenter extends PresenterV2	// class@0016b0
{
    public PhotoDetailParam p;

    public void PhotoGlobalSocialAutoStartPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, PhotoGlobalSocialAutoStartPresenter.class, "2")) {
          return;
       }
       Uri data = this.getActivity().getIntent().getData();
       if (data == null) {
          return;
       }
       t.just(data).subscribeOn(d.c).filter(h.b).map(new q(this)).filter(i.b).observeOn(d.a).subscribe(new g(this));
       return;
    }
    public final void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoGlobalSocialAutoStartPresenter.class, "5")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       p0.a(activity, p0.mEntity, new StatModel("SMALL_APP_PULL_UP"));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoGlobalSocialAutoStartPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoDetailParam.class);
       return;
    }
}
