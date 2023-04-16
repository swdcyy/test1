package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$ARTICLE;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType;
import java.lang.String;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s1c.r0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.x;
import ja5.a;
import com.kwai.component.feedstaggercard.presenter.ArticleHtmlDownloadPresenter;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;

public final class ProfilePhotoItemType$ARTICLE extends ProfilePhotoItemType	// class@0011f9
{

    public void ProfilePhotoItemType$ARTICLE(String p0,int p1){
       super(p0, p1, 18, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$ARTICLE.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$ARTICLE.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new x());
       p0.U7(new a());
       p0.U7(new ArticleHtmlDownloadPresenter());
       ProfilePhotoItemType.Companion.b(p0, p1);
       PatchProxy.onMethodExit(ProfilePhotoItemType$ARTICLE.class, "1");
       return;
    }
}
