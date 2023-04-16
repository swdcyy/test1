package com.yxcorp.gifshow.detail.presenter.g;
import erd.g;
import com.yxcorp.gifshow.detail.presenter.PhotoGlobalSocialAutoStartPresenter;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.detail.presenter.PhotoGlobalSocialAutoStartPresenter$ActionClass;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import y4a.p;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import com.kwai.framework.model.channel.HotChannel;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.d;

public final class g implements g	// class@0016d8
{
    public final PhotoGlobalSocialAutoStartPresenter b;

    public void g(PhotoGlobalSocialAutoStartPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if ((PhotoGlobalSocialAutoStartPresenter$ActionClass.DOWNLOAD_ACTION).equals(p0)) {
          if (a.t().d("enableMiniProgramAutoDownloadInApp", false)) {
             p0 = tb.p.mPhoto;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, PhotoGlobalSocialAutoStartPresenter.class, "4") && p0 != null) {
                if (!QCurrentUser.ME.isLogined()) {
                   LoginParams$a uoa = new LoginParams$a();
                   uoa.d(a1.p(R.string.arg_RES_7f103078));
                   d.a(-1712118428).x00(tb.getActivity(), 126, uoa.a(), new p(tb, p0));
                }else {
                   tb.P8(p0);
                }
             }
          }
       }else if((PhotoGlobalSocialAutoStartPresenter$ActionClass.SHARE_ACTION).equals(p0)){
          d.a(tb.getActivity(), tb.p, null, null, null);
       }
       return;
    }
}
