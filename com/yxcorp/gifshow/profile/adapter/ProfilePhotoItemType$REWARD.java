package com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$REWARD;
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
import i4c.h1;
import com.yxcorp.gifshow.profile.adapter.ProfilePhotoItemType$a;

public final class ProfilePhotoItemType$REWARD extends ProfilePhotoItemType	// class@0011fe
{

    public void ProfilePhotoItemType$REWARD(String p0,int p1){
       super(p0, p1, 10, null);
    }
    public void addPresenter(PresenterV2 p0,r0 p1,int p2){
       if (PatchProxy.isSupport2(ProfilePhotoItemType$REWARD.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, ProfilePhotoItemType$REWARD.class, "1")) {
          return;
       }
       a.p(p0, "presenter");
       a.p(p1, "profilePageParam");
       p0.U7(new h1());
       ProfilePhotoItemType.Companion.b(p0, p1);
       PatchProxy.onMethodExit(ProfilePhotoItemType$REWARD.class, "1");
       return;
    }
}
