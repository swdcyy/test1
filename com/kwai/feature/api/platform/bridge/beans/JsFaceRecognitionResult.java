package com.kwai.feature.api.platform.bridge.beans.JsFaceRecognitionResult;
import java.io.Serializable;
import java.util.Map;
import java.lang.Object;
import java.lang.String;

public class JsFaceRecognitionResult implements Serializable	// class@00105d
{
    public String mOldToken;
    public String mOldType;
    public String mToken;
    public String mType;
    public final int result;
    public static final long serialVersionUID = 0x7afbb46e62387df9;

    public void JsFaceRecognitionResult(Map p0){
       super();
       this.result = 1;
       this.mType = p0.get("ztIdentityVerificationType");
       String str = p0.get("ztIdentityVerificationCheckToken");
       this.mToken = str;
       this.mOldType = this.mType;
       this.mOldToken = str;
    }
}
