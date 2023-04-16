package com.kwai.framework.perf.phonelevel.PhoneLevelConfig;
import java.io.Serializable;
import java.lang.Object;

public class PhoneLevelConfig implements Serializable	// class@000c5b
{
    public String mCommonPerf;
    public String mRenderPerf;
    public int mStatus;
    public static final long serialVersionUID = 0x842d7938d5a1edd3;

    public void PhoneLevelConfig(){
       super();
       this.mRenderPerf = "";
       this.mCommonPerf = "";
       this.mStatus = -1;
    }
}
