package com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.io.Serializable;
import java.lang.Object;

public class LoginUserResponse implements Serializable	// class@001f95
{
    public String mApiServiceToken;
    public boolean mBindPhoneRequired;
    public BindVerifyTokenInfo mBindVerifyTokenInfo;
    public String mCodeKey;
    public String mCodeUri;
    public String mDestroyAccountButtonTextLeft;
    public String mDestroyAccountButtonTextRight;
    public String mDestroyAccountPopupText;
    public boolean mForwardQQ;
    public String mH5ServiceToken;
    public boolean mIsNewRegisterUser;
    public boolean mIsNewThirdPlatformUser;
    public int mLoginSource;
    public String mMobile;
    public String mMobileCountryCode;
    public List mMultiRetrieveUserInfo;
    public List mMultiUserInfo;
    public String mNewTokenClientSalt;
    public String mPassToken;
    public PlatformTokenInfo mPlatformTokenInfo;
    public int mPsdErrorCount;
    public String mQuickLoginToken;
    public long mQuickloginTokenExpireTime;
    public String mResetPasswordMobile;
    public String mResetPasswordMobileCountryCode;
    public String mSecurityToken;
    public String mSid;
    public boolean mSkipBindPhone;
    public boolean mSkipFillUserInfo;
    public boolean mSkipResetAfterSucc;
    public boolean mSkipUploadContact;
    public String mToken;
    public String mTokenClientSalt;
    public Map mTokenLoginInfo;
    public Map mTokenResetInfo;
    public String mUserId;
    public UserInfo mUserInfo;
    public boolean mVerifyTrustDevice;
    public String mVerifyTrustDeviceToken;
    public static final long serialVersionUID = 0xf051430dddb67560;

    public void LoginUserResponse(){
       super();
    }
}
