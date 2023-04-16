package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$UNKNOWN;
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

public final class ProfilePhotoItemType$UNKNOWN extends ProfilePhotoItemType	// class@0011ff
{

    public void ProfilePhotoItemType$UNKNOWN(String p0,int p1){
       super(p0, p1, -1, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$UNKNOWN.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$UNKNOWN.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       PatchProxy.onMethodExit(ProfilePhotoItemType$UNKNOWN.class, "1");
       return;
    }
}
