package com.kwai.social.startup.follow.model.ProfileGuideFollowConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ProfileGuideFollowConfig	// class@0018a3
{
    public int mLkePhotoThreshold;
    public int mShowFollowGuideFrequency;
    public int mShowFollowGuideIntervalInDay;

    public void ProfileGuideFollowConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileGuideFollowConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileGuideFollowConfig{mLkePhotoThreshold="+this.mLkePhotoThreshold+", mShowFollowGuideFrequency="+this.mShowFollowGuideFrequency+", mShowFollowGuideIntervalInDay="+this.mShowFollowGuideIntervalInDay+'}';
    }
}
