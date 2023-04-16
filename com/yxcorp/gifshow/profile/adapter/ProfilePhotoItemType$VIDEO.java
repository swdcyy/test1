package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$VIDEO;
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
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;

public final class ProfilePhotoItemType$VIDEO extends ProfilePhotoItemType	// class@001200
{

    public void ProfilePhotoItemType$VIDEO(String p0,int p1){
       super(p0, p1, 2, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$VIDEO.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$VIDEO.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       ProfilePhotoItemType$a companion = ProfilePhotoItemType.Companion;
       companion.a(p0, p1, p2);
       companion.b(p0, p1);
       PatchProxy.onMethodExit(ProfilePhotoItemType$VIDEO.class, "1");
       return;
    }
}
