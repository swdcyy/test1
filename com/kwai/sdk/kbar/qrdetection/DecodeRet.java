package com.kwai.sdk.kbar.qrdetection.DecodeRet;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$Builder;
import java.lang.Object;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$a;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;
import com.kwai.sdk.kbar.qrdetection.KBarConfig$DetectType;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Enum;

public class DecodeRet	// class@00161b
{
    public final KBarConfig$DetectType mDetectType;
    public final boolean mIsDetected;
    public final String mModelFlag;
    public final DecodeRet$DecodeStatus mStatus;
    public final DecodeRet$CodeType mType;
    public final String mUrl;

    public void DecodeRet(DecodeRet$Builder p0){
       super();
       this.mDetectType = p0.mDetectType;
       this.mModelFlag = p0.mModelFlag;
       this.mIsDetected = p0.mIsDetected;
       this.mType = p0.mType;
       this.mStatus = p0.mStatus;
       this.mUrl = p0.mUrl;
    }
    public void DecodeRet(DecodeRet$Builder p0,DecodeRet$a p1){
       super(p0);
    }
    public DecodeRet$DecodeStatus getDecodeStatus(){
       return this.mStatus;
    }
    public DecodeRet$CodeType getDecodeType(){
       return this.mType;
    }
    public boolean getDetectFlag(){
       return this.mIsDetected;
    }
    public KBarConfig$DetectType getDetectType(){
       return this.mDetectType;
    }
    public String getModelFlag(){
       return this.mModelFlag;
    }
    public String getUrl(){
       return this.mUrl;
    }
    public JsonObject toJsonObject(){
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("detectType", Integer.valueOf(this.mDetectType.val()));
       jsonObject.H("boolis_detected", Boolean.valueOf(this.mIsDetected));
       jsonObject.a0("code_type", Integer.valueOf(this.transDecodeType()));
       jsonObject.a0("decodes_status", Integer.valueOf(this.transDecodeStatus()));
       jsonObject.c0("string_url", this.mUrl);
       return jsonObject;
    }
    public int transDecodeStatus(){
       int i = DecodeRet$a.b[this.mStatus.ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             i1 = 2;
          }
       }else {
          i1 = 0;
       }
       return i1;
    }
    public int transDecodeType(){
       int i = DecodeRet$a.a[this.mType.ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             i1 = 2;
          }
       }else {
          i1 = 0;
       }
       return i1;
    }
}
