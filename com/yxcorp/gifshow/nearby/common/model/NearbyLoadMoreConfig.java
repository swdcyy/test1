package com.yxcorp.gifshow.nearby.common.model.NearbyLoadMoreConfig;
import java.io.Serializable;
import java.lang.Object;

public class NearbyLoadMoreConfig implements Serializable	// class@002128
{
    public NearbyLoadMoreConfig$NativeOpt mK;
    public NearbyLoadMoreConfig$NativeOpt mLowLine;
    public NearbyLoadMoreConfig$NativeOpt mStartLine;

    public void NearbyLoadMoreConfig(){
       super();
    }
    public boolean isValid(){
       boolean b = (this.mStartLine != null && (this.mLowLine != null && this.mK != null))? true: false;
       return b;
    }
}
