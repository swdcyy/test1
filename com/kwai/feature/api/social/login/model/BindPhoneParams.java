package com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.io.Serializable;
import com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.BindPhoneParams$a;

public final class BindPhoneParams implements Serializable	// class@001113
{
    public final String mAuthToken;
    public final boolean mBindForAccountSecurity;
    public final BindPhoneParams$ActionBarType mBindPhoneBarType;
    public final String mBindReason;
    public final String mBindToken;
    public final int mCategory;
    public Map mCommonPageParams;
    public final int mCountDownNumber;
    public final String mCountryCode;
    public final String mDialogDesc;
    public final String mDialogTitle;
    public final BindPhoneParams$FirstStepPageStyle mFirstStepPageStyle;
    public final String mForceBindTips;
    public final boolean mFromRegister;
    public final int mFromWhere;
    public final boolean mHasNotification;
    public final String mIdentityToken;
    public final int mLogTrigger;
    public final String mLoginEntry;
    public final boolean mNewVerifyCodePage;
    public final String mPhone;
    public final BindPhoneParams$ActionBarType mPhoneOneKeyBindBarType;
    public final int mPlatformId;
    public final String mPlatformUserId;
    public final boolean mReadContacts;
    public final boolean mShowReturnBtn;
    public final boolean mShowSkipGuideBtn;
    public final int mThirdPartyPlatform;
    public final long mUserId;
    public static final long serialVersionUID = 0x1bd16d26534d752a;

    public void BindPhoneParams(BindPhoneParams$b p0){
       super();
       this.mLogTrigger = p0.a;
       this.mReadContacts = p0.b;
       this.mBindForAccountSecurity = p0.c;
       this.mForceBindTips = p0.d;
       this.mShowSkipGuideBtn = p0.e;
       this.mShowReturnBtn = p0.f;
       this.mHasNotification = p0.g;
       this.mNewVerifyCodePage = p0.h;
       this.mFromWhere = p0.i;
       this.mBindToken = p0.j;
       this.mPlatformId = p0.k;
       this.mPlatformUserId = p0.l;
       this.mAuthToken = p0.m;
       this.mIdentityToken = p0.n;
       this.mUserId = p0.o;
       this.mBindReason = p0.p;
       this.mFromRegister = p0.q;
       this.mCountryCode = p0.r;
       this.mPhone = p0.s;
       this.mCountDownNumber = p0.t;
       this.mPhoneOneKeyBindBarType = p0.u;
       this.mBindPhoneBarType = p0.v;
       this.mLoginEntry = p0.w;
       this.mThirdPartyPlatform = p0.x;
       this.mFirstStepPageStyle = p0.z;
       this.mCommonPageParams = p0.C;
       this.mDialogDesc = p0.A;
       this.mDialogTitle = p0.B;
       this.mCategory = p0.y;
    }
    public void BindPhoneParams(BindPhoneParams$b p0,BindPhoneParams$a p1){
       super(p0);
    }
}
