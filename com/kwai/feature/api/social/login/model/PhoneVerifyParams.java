package com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import java.io.Serializable;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$a;

public class PhoneVerifyParams implements Serializable	// class@001119
{
    public final boolean mAccountSecurityVerify;
    public final int mAccountVerifyFrom;
    public final boolean mFromAccountSecurity;
    public final boolean mIsLoginProcess;
    public final String mMobileCountryCode;
    public final boolean mNeedMobile;
    public final boolean mNeedVerify;
    public final String mPhoneNumber;
    public final String mPrompt;
    public final boolean mShowResetMobile;
    public final String mTitle;
    public final int mType;
    public final int mVerifyPhoneActionType;
    public final String mVerifyTrustDeviceToken;
    public final String mVerifyUserId;
    public static final long serialVersionUID = 0x988e41cf79d302fd;

    public void PhoneVerifyParams(PhoneVerifyParams$b p0){
       super();
       this.mPrompt = p0.a;
       this.mPhoneNumber = p0.b;
       this.mVerifyTrustDeviceToken = p0.c;
       this.mVerifyUserId = p0.d;
       this.mFromAccountSecurity = p0.e;
       this.mShowResetMobile = p0.f;
       this.mTitle = p0.g;
       this.mType = p0.h;
       this.mNeedMobile = p0.i;
       this.mNeedVerify = p0.j;
       this.mMobileCountryCode = p0.k;
       this.mAccountSecurityVerify = p0.l;
       this.mAccountVerifyFrom = p0.m;
       this.mIsLoginProcess = p0.n;
       this.mVerifyPhoneActionType = p0.o;
    }
    public void PhoneVerifyParams(PhoneVerifyParams$b p0,PhoneVerifyParams$a p1){
       super(p0);
    }
}
