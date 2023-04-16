package com.yxcorp.gifshow.OnlineSystraceManager$OnlineSystraceConfigModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class OnlineSystraceManager$OnlineSystraceConfigModel implements Serializable	// class@001300
{
    public Long mBeginTime;
    public Long mCreateTime;
    public Long mEndTime;
    public Long mFreqency;
    public Boolean mIsAutoUpload;
    public String mParams;
    public Long mSamplingCountLimit;
    public Long mSamplingThreadPolicy;
    public String mScene;
    public int mSource;
    public Long mTimeLimit;
    public Long mType;
    public Boolean mUseFastUnwind;
    public String mVersion;
    public Long samplingRate;

    public void OnlineSystraceManager$OnlineSystraceConfigModel(){
       super();
       this.mScene = "unknow";
       Long longx = Long.valueOf(1);
       this.mType = longx;
       this.mVersion = "none";
       Long longx1 = Long.valueOf(0);
       this.samplingRate = longx1;
       this.mFreqency = Long.valueOf(100);
       this.mTimeLimit = Long.valueOf(5);
       this.mSamplingCountLimit = Long.valueOf(10);
       this.mBeginTime = longx1;
       this.mEndTime = longx1;
       this.mSamplingThreadPolicy = longx;
       Boolean tRUE = Boolean.TRUE;
       this.mIsAutoUpload = tRUE;
       this.mUseFastUnwind = tRUE;
       this.mParams = "{}";
       this.mSource = 1;
       this.mCreateTime = longx1;
    }
}
