package com.yxcorp.gifshow.model.response.WalletResponse;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.WalletResponse$ExtraInfo;

public class WalletResponse implements Serializable, Cloneable	// class@001f6f
{
    public JsonElement mCsLogCorrelateInfo;
    public WalletResponse$ExtraInfo mExtraInfo;
    public String mGiftSentInfo;
    public boolean mHasDeposited;
    public boolean mHasRechargeActivity;
    public long mKwaiCoin;
    public long mKwaiShell;
    public long mKwaiShellServerTimeStamp;
    public String mMessage;
    public boolean mNeedBindMobile;
    public String mRechargeActivityHint;
    public String mRechargeActivityType;
    public boolean mShowAccountProtectAlert;
    public boolean mShowBindPhoneAlert;
    public int mStarLevel;
    public int mStyleType;
    public int mSubStarLevel;
    public long mVersion;
    public long mWithdrawAmount;
    public long mYellowDiamond;
    public static final long serialVersionUID = 0x57622a9479ca750;

    public void WalletResponse(){
       super();
       this.mKwaiShell = -1;
       this.mNeedBindMobile = false;
    }
    public void WalletResponse(WalletResponse p0){
       super();
       this.mKwaiShell = -1;
       this.mNeedBindMobile = false;
       this.mYellowDiamond = p0.mYellowDiamond;
       this.mKwaiCoin = p0.mKwaiCoin;
       this.mWithdrawAmount = p0.mWithdrawAmount;
       this.mVersion = p0.mVersion;
       this.mShowAccountProtectAlert = p0.mShowAccountProtectAlert;
       this.mShowBindPhoneAlert = p0.mShowBindPhoneAlert;
       this.mStarLevel = p0.mStarLevel;
       this.mSubStarLevel = p0.mSubStarLevel;
       this.mKwaiShell = p0.mKwaiShell;
       this.mKwaiShellServerTimeStamp = p0.mKwaiShellServerTimeStamp;
       this.mGiftSentInfo = p0.mGiftSentInfo;
       this.mCsLogCorrelateInfo = p0.mCsLogCorrelateInfo;
    }
    public WalletResponse clone(){
       Object obj = PatchProxy.apply(null, this, WalletResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WalletResponse(this);
    }
    public Object clone(){
       return this.clone();
    }
    public String getIntimacyIncreaseToast(){
       WalletResponse tmExtraInfo = this.mExtraInfo;
       if (tmExtraInfo != null) {
          return tmExtraInfo.mIntimacyIncreaseToastMessage;
       }
       return null;
    }
}
