package com.yxcorp.gifshow.profile.model.ProfileEmptyUserGuideInfo;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yl8.b;

public class ProfileEmptyUserGuideInfo extends DefaultObservableAndSyncable	// class@0013a7
{
    public Map mButtonTextMap;
    public String mDarkIconUrl;
    public String mDarkSubIconUrl;
    public boolean mIsShown;
    public String mLightIconUrl;
    public String mLightSubIconUrl;
    public String mScheme;
    public int mStatus;
    public String mSubTitle;
    public String mTitle;
    public String mType;

    public void ProfileEmptyUserGuideInfo(){
       super();
    }
    public void sync(ProfileEmptyUserGuideInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyUserGuideInfo.class, "1")) {
          return;
       }
       int i = 1;
       int i1 = TextUtils.n(this.mType, p0.mType) ^ i;
       if (this.mStatus == p0.mStatus) {
          i = i1;
       }
       if (i) {
          this.notifyChanged();
       }
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}
