package com.kwai.feature.api.social.login.model.LoginParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.feature.api.social.login.model.LoginPageStatus;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.UUID;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;

public class LoginParams implements Serializable	// class@001116
{
    public boolean mCurrentPhoneInput;
    public String mExtraInfoParams;
    public boolean mHideUserBindPhone;
    public boolean mIsPasswordLogin;
    public int mLoginSource;
    public LoginPageStatus mLoginStatus;
    public String mLoginTitle;
    public boolean mNeedPrefetchCode;
    public Map mPreFillData;
    public boolean mPublishVideo;
    public String mSourcePage;
    public String mSourcePageSessionId;
    public BaseFeed mSourcePhoto;
    public QPreInfo mSourcePrePhoto;
    public static final long serialVersionUID = 0x2dccadc2760ef086;

    public void LoginParams(){
       super();
       this.mPreFillData = new HashMap();
       this.mLoginStatus = LoginPageStatus.PHONE_ACCOUNT_INPUT;
    }
    public static String generateLoginSessionId(){
       Object obj = PatchProxy.apply(null, null, LoginParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UUID.randomUUID().toString();
    }
    public static String getStartPage(){
       String str;
       k2 obj = PatchProxy.apply(null, null, LoginParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x4b316083).Q();
       obj = (obj != null)? obj.d: "";
       return obj;
    }
}
