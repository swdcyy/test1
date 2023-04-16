package com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$SkipTranscodingConfig;

public class EncodeConfig$ComplexEncodeProfile implements Serializable	// class@001d0b
{
    public String mKey;
    public EncodeConfig$ComplexEncodeConfig mValue;
    public static final long serialVersionUID = 0x900417091efd3b60;

    public void EncodeConfig$ComplexEncodeProfile(){
       super();
       this.mKey = "";
    }
    public String getKey(){
       return this.mKey;
    }
    public String getPipelineX264Params(){
       EncodeConfig$ComplexEncodeProfile tmValue = this.mValue;
       EncodeConfig$ComplexEncodeConfig mPipelineX26 = (tmValue != null)? tmValue.mPipelineX264Params: null;
       return mPipelineX26;
    }
    public EncodeConfig$SkipTranscodingConfig getSkipEncodeConfig(){
       EncodeConfig$ComplexEncodeProfile tmValue = this.mValue;
       EncodeConfig$ComplexEncodeConfig mSkipTransco = (tmValue != null)? tmValue.mSkipTranscodingConfig: null;
       return mSkipTransco;
    }
    public String getX264Params(){
       EncodeConfig$ComplexEncodeProfile tmValue = this.mValue;
       EncodeConfig$ComplexEncodeConfig mX264Params = (tmValue != null)? tmValue.mX264Params: null;
       return mX264Params;
    }
    public boolean isEnableAdaptiveX264Params(){
       EncodeConfig$ComplexEncodeProfile tmValue = this.mValue;
       boolean b = (tmValue != null && tmValue.mEnableAdaptiveX264Params != null)? true: false;
       return b;
    }
}
