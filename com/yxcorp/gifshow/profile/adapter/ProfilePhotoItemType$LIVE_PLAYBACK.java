package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$LIVE_PLAYBACK;
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
import i4c.v0;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;

public final class ProfilePhotoItemType$LIVE_PLAYBACK extends ProfilePhotoItemType	// class@0011fd
{

    public void ProfilePhotoItemType$LIVE_PLAYBACK(String p0,int p1){
       super(p0, p1, 17, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$LIVE_PLAYBACK.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$LIVE_PLAYBACK.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new v0());
       ProfilePhotoItemType$a companion = ProfilePhotoItemType.Companion;
       companion.b(p0, p1);
       companion.c(p0, p1);
       PatchProxy.onMethodExit(ProfilePhotoItemType$LIVE_PLAYBACK.class, "1");
       return;
    }
}
