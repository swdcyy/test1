package com.kwai.feature.api.social.login.model.SwitchAccountModel;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;

public class SwitchAccountModel implements Serializable	// class@00111b
{
    public String mApiServiceToken;
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public String mH5ServiceToken;
    public String mKwaiId;
    public long mLastTimeRefreshServiceToken;
    public int mLoginType;
    public String mNickName;
    public String mPassToken;
    public String mProfileBgUrl;
    public CDNUrl[] mProfileBgUrls;
    public String mQuickLoginToken;
    public long mQuickloginTokenExpireTime;
    public String mSecurityToken;
    public String mSex;
    public String mToken;
    public String mTokenClientSalt;
    public String mUserId;
    public static final long serialVersionUID = 0xd89640dcf5238a9f;

    public void SwitchAccountModel(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mAvatars = uCDNUrlArray;
       CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
       this.mProfileBgUrls = uCDNUrlArray1;
    }
    public void updateSwitchAccountModel(String p0,CDNUrl[] p1,String p2,String p3,String p4,String p5,CDNUrl[] p6,String p7,long p8){
       if (PatchProxy.isSupport(SwitchAccountModel.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Long.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, SwitchAccountModel.class, "1")) {
             return;
          }
       }
       if (!TextUtils.isEmpty(p0)) {
          this.mNickName = p0;
       }
       if (p1 != null) {
          this.mAvatars = p1;
       }
       if (!TextUtils.isEmpty(p2)) {
          this.mAvatar = p2;
       }
       if (!TextUtils.isEmpty(p3)) {
          this.mSex = p3;
       }
       if (!TextUtils.isEmpty(p4)) {
          this.mProfileBgUrl = p4;
       }
       if (!TextUtils.isEmpty(p5)) {
          this.mKwaiId = p5;
       }
       if (!TextUtils.isEmpty(p7)) {
          this.mQuickLoginToken = p7;
       }
       if (p8 > 0) {
          this.mQuickloginTokenExpireTime = p8;
       }
       if (p6 != null) {
          this.mProfileBgUrls = p6;
       }
       return;
    }
}
