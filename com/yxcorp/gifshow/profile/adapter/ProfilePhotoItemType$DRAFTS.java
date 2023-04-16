package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$DRAFTS;
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
import j4c.n;
import com.yxcorp.gifshow.profile.presenter.e;

public final class ProfilePhotoItemType$DRAFTS extends ProfilePhotoItemType	// class@0011fa
{

    public void ProfilePhotoItemType$DRAFTS(String p0,int p1){
       super(p0, p1, 20, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$DRAFTS.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$DRAFTS.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new n());
       p0.U7(new e());
       PatchProxy.onMethodExit(ProfilePhotoItemType$DRAFTS.class, "1");
       return;
    }
}
