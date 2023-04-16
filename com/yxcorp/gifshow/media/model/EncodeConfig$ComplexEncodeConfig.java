package com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeConfig;
import java.io.Serializable;
import java.lang.Object;

public class EncodeConfig$ComplexEncodeConfig implements Serializable	// class@001d0a
{
    public boolean mEnableAdaptiveX264Params;
    public String mPipelineX264Params;
    public int mPriority;
    public EncodeConfig$SkipTranscodingConfig mSkipTranscodingConfig;
    public String mX264Params;
    public static final long serialVersionUID = 0x5a90c59ae075ce81;

    public void EncodeConfig$ComplexEncodeConfig(){
       super();
       this.mX264Params = "";
       this.mEnableAdaptiveX264Params = false;
    }
}
