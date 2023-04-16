package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$j;
import t2c.f;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import xl8.b;
import m4c.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;

public final class ProfileHeaderBackgroundImagePresenterV3$j implements f	// class@0014ad
{
    public final ProfileHeaderBackgroundImagePresenterV3 a;

    public void ProfileHeaderBackgroundImagePresenterV3$j(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.a = p0;
       super();
    }
    public Object getValue(){
       Long longx = PatchProxy.apply(null, this, ProfileHeaderBackgroundImagePresenterV3$j.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          ProfileBgVideoInfo profileBgVid = ProfileHeaderBackgroundImagePresenterV3.P8(this.a).a().e();
          long clipStart = (profileBgVid != null)? profileBgVid.getClipStart(): 0;
          longx = Long.valueOf(clipStart);
       }
       return longx;
    }
}
