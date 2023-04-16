package com.kuaishou.live.common.core.component.multiline.model.LiveLineExtraInfo$ExtraInfoUserInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.Boolean;

public class LiveLineExtraInfo$ExtraInfoUserInfo implements Serializable	// class@0014ed
{
    public String mDisplayLocation;
    public CDNUrl[] mHeadIcons;
    public String mHourDistrictRankTag;
    public boolean mIsAnchor;
    public String mOnlineCount;
    public String mRelation;
    public String mUserId;
    public String mUserName;
    public String mUserSex;
    public static final long serialVersionUID = 0x9088b20368882ae6;

    public void LiveLineExtraInfo$ExtraInfoUserInfo(){
       super();
    }
    public static LiveLineExtraInfo$ExtraInfoUserInfo transformFromUser(User p0){
       LiveLineExtraInfo$ExtraInfoUserInfo obj = PatchProxy.applyOneRefs(p0, null, LiveLineExtraInfo$ExtraInfoUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveLineExtraInfo$ExtraInfoUserInfo();
       obj.mUserName = p0.mName;
       User mExtraInfo = p0.mExtraInfo;
       if (mExtraInfo != null) {
          obj.mDisplayLocation = mExtraInfo.mCityName;
       }
       obj.mUserId = p0.mId;
       obj.mUserSex = p0.mSex;
       obj.mHeadIcons = p0.mAvatars;
       return obj;
    }
    public boolean isMale(){
       Object obj = PatchProxy.apply(null, this, LiveLineExtraInfo$ExtraInfoUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("M").equals(this.mUserSex);
    }
}
