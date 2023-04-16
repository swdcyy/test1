package com.kwai.feature.api.social.message.imshare.model.ShareUserInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;

public class ShareUserInfo implements Serializable	// class@00116d
{
    public String mAliasName;
    public String mAliasPinYinName;
    public String mEid;
    public String mFirstLetter;
    public String mHeadUrl;
    public CDNUrl[] mHeadUrls;
    public boolean mIsFriend;
    public String mPinYinName;
    public int mRelationType;
    public String mSecondLetter;
    public String mUserId;
    public String mUserName;
    public String mUserSex;
    public static final long serialVersionUID = 0x2d2602bc5f772a2b;

    public void ShareUserInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ShareUserInfo) {
          return false;
       }
       return d.a(this.mUserId, p0.mUserId);
    }
    public int hashCode(){
       ShareUserInfo obj = PatchProxy.apply(null, this, ShareUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mUserId;
       if (obj != null) {
          return obj.hashCode();
       }
       return super.hashCode();
    }
}
