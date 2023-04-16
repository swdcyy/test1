package com.yxcorp.gifshow.media.model.BaseEncodeConfig$AdaptiveX264Config;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class BaseEncodeConfig$AdaptiveX264Config implements Serializable	// class@001cff
{
    public String mExtraX264Params;
    public double mInterThreshold;
    public static final long serialVersionUID = 0xcfe190be6ca89d3f;

    public void BaseEncodeConfig$AdaptiveX264Config(){
       super();
       this.mInterThreshold = 0;
       this.mExtraX264Params = "";
    }
    public String getExtraX264Params(){
       return this.mExtraX264Params;
    }
    public double getInterThreshold(){
       return this.mInterThreshold;
    }
}
