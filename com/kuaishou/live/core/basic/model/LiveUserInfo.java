package com.kuaishou.live.core.basic.model.LiveUserInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveUserInfo implements Serializable	// class@00089e
{
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public boolean mIsVerified;
    public long mUserId;
    public String mUserName;
    public String mUserSex;
    public String mUserText;
    public String mVerifiedUrl;
    public static final long serialVersionUID = 0x1c47f9528bb727b0;

    public void LiveUserInfo(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
    }
    public static UserInfo convertToUserInfo(LiveUserInfo p0){
       UserInfo obj = PatchProxy.applyOneRefs(p0, null, LiveUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new UserInfo();
       obj.mId = String.valueOf(p0.mUserId);
       obj.mSex = p0.mUserSex;
       obj.mName = p0.mUserName;
       obj.isVerified = p0.mIsVerified;
       obj.mHeadUrl = p0.mHeadUrl;
       obj.mHeadUrls = p0.mHeadUrls;
       obj.mText = p0.mUserText;
       obj.mVerifiedUrl = p0.mVerifiedUrl;
       return obj;
    }
}
