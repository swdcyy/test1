package com.yxcorp.gifshow.model.response.ulk.UserSimResp;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import com.yxcorp.gifshow.model.response.ulk.UnLoginResp;
import com.kwai.framework.model.user.UserInfo;

public class UserSimResp implements Serializable	// class@001f9d
{
    public CurrentAttribute mAttribute;
    public String mConfigId;
    public String mHistoryId;
    public String mLat;
    public LoginUserResponse mLoginResp;
    public String mLon;
    public UnLoginResp mUnLoginResp;
    public int maxRepeatCount;
    public int result;
    public static final long serialVersionUID = 0xa42b8f58b4f6fd47;

    public void UserSimResp(){
       super();
       this.maxRepeatCount = 0;
    }
    public boolean available(){
       UserSimResp obj = PatchProxy.apply(null, this, UserSimResp.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!TextUtils.isEmpty(this.mConfigId) && !TextUtils.isEmpty(this.mHistoryId)) {
          obj = this.mLoginResp;
          if (obj == null && this.mUnLoginResp == null) {
             return b;
          }else if(obj != null && (TextUtils.isEmpty(obj.mToken) && (TextUtils.isEmpty(this.mLoginResp.mH5ServiceToken) && TextUtils.isEmpty(this.mLoginResp.mApiServiceToken)))){
             return b;
          }else if(this.isLoginUser() && TextUtils.isEmpty(this.getLoginUserId())){
             return b;
          }else {
             obj = this.mUnLoginResp;
             if (obj != null && TextUtils.isEmpty(obj.mUserId)) {
                return b;
             }else if(this.result == 1){
                b = true;
             }
          }
       }
       return b;
    }
    public String getLoginUserId(){
       LoginUserResponse obj = PatchProxy.apply(null, this, UserSimResp.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isLoginUser()) {
          obj = this.mLoginResp.mUserInfo;
          if (obj != null) {
             return obj.mId;
          }
       }
       return "";
    }
    public String getUnLoginUserId(){
       UserSimResp tmUnLoginRes = this.mUnLoginResp;
       if (tmUnLoginRes != null) {
          return tmUnLoginRes.mUserId;
       }
       return "";
    }
    public boolean isLocationSelected(){
       Object obj = PatchProxy.apply(null, this, UserSimResp.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mLon) && (!TextUtils.isEmpty(this.mLat) && (!TextUtils.equals(this.mLat, "-1") && !TextUtils.equals(this.mLon, "-1"))))? true: false;
       return b;
    }
    public boolean isLoginUser(){
       boolean b = (this.mLoginResp != null)? true: false;
       return b;
    }
}
