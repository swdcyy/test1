package com.kwai.sdk.kbar.qrdetection.DecodeRet$Builder;
import java.lang.Object;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DetectType;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$a;
import java.lang.String;

public class DecodeRet$Builder	// class@001617
{
    public KBarConfig$DetectType mDetectType;
    public boolean mIsDetected;
    public String mModelFlag;
    public DecodeRet$DecodeStatus mStatus;
    public DecodeRet$CodeType mType;
    public String mUrl;

    public void DecodeRet$Builder(){
       super();
       this.mIsDetected = false;
       this.mDetectType = KBarConfig$DetectType.DETECT_QRONED;
       this.mType = DecodeRet$CodeType.CODE_NONE;
       this.mStatus = DecodeRet$DecodeStatus.DECODE_FAIL;
       this.mUrl = "";
       this.mModelFlag = "";
    }
    public DecodeRet build(){
       return new DecodeRet(this, null);
    }
    public DecodeRet$Builder setDetectFlag(boolean p0){
       this.mIsDetected = p0;
       return this;
    }
    public DecodeRet$Builder setDetectType(KBarConfig$DetectType p0){
       this.mDetectType = p0;
       return this;
    }
    public DecodeRet$Builder setModelFlag(String p0){
       this.mModelFlag = p0;
       return this;
    }
    public DecodeRet$Builder setStatus(DecodeRet$DecodeStatus p0){
       this.mStatus = p0;
       return this;
    }
    public DecodeRet$Builder setType(DecodeRet$CodeType p0){
       this.mType = p0;
       return this;
    }
    public DecodeRet$Builder setUrl(String p0){
       this.mUrl = p0;
       return this;
    }
}
