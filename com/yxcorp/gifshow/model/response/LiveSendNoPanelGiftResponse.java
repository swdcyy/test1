package com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse$ExtraInfo;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.response.WalletResponse$ExtraInfo;

public class LiveSendNoPanelGiftResponse implements Serializable	// class@001f45
{
    public JsonElement mCsLogCorrelateInfo;
    public LiveSendNoPanelGiftResponse$ExtraInfo mExtraInfo;
    public String mGiftSentInfo;
    public boolean mHasRechargeActivity;
    public String mKtraceId;
    public long mKwaiCoin;
    public long mKwaiShell;
    public String mMessage;
    public boolean mNeedBindMobile;
    public String mRechargeActivityHint;
    public String mRechargeActivityType;
    public long mServerTimeStamp;
    public boolean mShowAccountProtectAlert;
    public boolean mShowBindPhoneAlert;
    public int mStarLevel;
    public int mStyleType;
    public int mSubStarLevel;
    public long mVersion;
    public long mWithdrawAmount;
    public long mYellowDiamond;
    public static final long serialVersionUID = 0xae3ba9f539676525;

    public void LiveSendNoPanelGiftResponse(){
       super();
       this.mKwaiShell = -1;
       this.mNeedBindMobile = false;
    }
    public String getIntimacyIncreaseToast(){
       LiveSendNoPanelGiftResponse tmExtraInfo = this.mExtraInfo;
       String str = (tmExtraInfo == null)? "": tmExtraInfo.mIntimacyIncreaseToastMessage;
       return str;
    }
    public WalletResponse getWalletResponse(){
       WalletResponse obj = PatchProxy.apply(null, this, LiveSendNoPanelGiftResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WalletResponse();
       obj.mYellowDiamond = this.mYellowDiamond;
       obj.mKwaiCoin = this.mKwaiCoin;
       obj.mKwaiShell = this.mKwaiShell;
       obj.mWithdrawAmount = this.mWithdrawAmount;
       obj.mMessage = this.mMessage;
       obj.mVersion = this.mVersion;
       obj.mShowAccountProtectAlert = this.mShowAccountProtectAlert;
       obj.mShowBindPhoneAlert = this.mShowBindPhoneAlert;
       obj.mStarLevel = this.mStarLevel;
       obj.mSubStarLevel = this.mSubStarLevel;
       obj.mStyleType = this.mStyleType;
       obj.mNeedBindMobile = this.mNeedBindMobile;
       obj.mKwaiShellServerTimeStamp = this.mServerTimeStamp;
       obj.mGiftSentInfo = this.mGiftSentInfo;
       obj.mHasRechargeActivity = this.mHasRechargeActivity;
       obj.mRechargeActivityHint = this.mRechargeActivityHint;
       obj.mRechargeActivityType = this.mRechargeActivityType;
       obj.mCsLogCorrelateInfo = this.mCsLogCorrelateInfo;
       WalletResponse$ExtraInfo uExtraInfo = new WalletResponse$ExtraInfo();
       obj.mExtraInfo = uExtraInfo;
       uExtraInfo.mIntimacyIncreaseToastMessage = this.getIntimacyIncreaseToast();
       return obj;
    }
}
