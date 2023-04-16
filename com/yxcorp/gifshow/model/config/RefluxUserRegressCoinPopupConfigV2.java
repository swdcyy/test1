package com.yxcorp.gifshow.model.config.RefluxUserRegressCoinPopupConfigV2;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RefluxUserRegressCoinPopupConfigV2 implements Serializable	// class@001edf
{
    public int mAmount;
    public String mBgImageUrl;
    public String mBigTitle;
    public String mBtnText;
    public String mLinkUrl;
    public String mPopupType;
    public int mRewardType;
    public List mRotationList;
    public int mShowIntervalDays;
    public String mSmallContent;
    public String mSmallTitle;
    public int mStatus;
    public String mToast;
    public static final long serialVersionUID = 0x15f6ce958fe3aeb8;

    public void RefluxUserRegressCoinPopupConfigV2(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RefluxUserRegressCoinPopupConfigV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RefluxUserRegressCoinPopupConfigV2{mPopupType=\'"+this.mPopupType+'''+", mShowIntervalDays="+this.mShowIntervalDays+", mBtnText=\'"+this.mBtnText+'''+", mToast=\'"+this.mToast+'''+", mStatus="+this.mStatus+", mBigTitle=\'"+this.mBigTitle+'''+", mSmallTitle=\'"+this.mSmallTitle+'''+", mAmount="+this.mAmount+", mRewardType="+this.mRewardType+", mSmallContent=\'"+this.mSmallContent+'''+", mRotationList="+this.mRotationList+'}';
    }
}
