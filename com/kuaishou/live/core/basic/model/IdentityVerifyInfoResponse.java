package com.kuaishou.live.core.basic.model.IdentityVerifyInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class IdentityVerifyInfoResponse implements Serializable	// class@000846
{
    public String mIdCardVerifyUrl;
    public boolean mIsNeedIdCardVerify;
    public String mLiveAuthApplyUrl;
    public int mResult;
    public static final long serialVersionUID = 0xe0ca0f4d5d2692d7;

    public void IdentityVerifyInfoResponse(){
       super();
       this.mIsNeedIdCardVerify = false;
       this.mIdCardVerifyUrl = "";
       this.mLiveAuthApplyUrl = "";
    }
}
