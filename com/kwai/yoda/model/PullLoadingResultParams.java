package com.kwai.yoda.model.PullLoadingResultParams;
import java.io.Serializable;
import java.lang.Object;

public class PullLoadingResultParams implements Serializable	// class@0012c5
{
    public boolean mAnimated;
    public long mDuration;
    public String mInterpolateType;
    public boolean mResult;

    public void PullLoadingResultParams(){
       super();
       this.mDuration = 300;
       this.mInterpolateType = "linear";
    }
}
