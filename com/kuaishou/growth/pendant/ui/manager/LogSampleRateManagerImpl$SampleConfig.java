package com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$SampleConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$SampleConfig$a;
import nsd.u;
import java.lang.Object;

public final class LogSampleRateManagerImpl$SampleConfig implements Serializable	// class@0006f3
{
    public int mErrorSample;
    public int mSuccessSample;
    public static final LogSampleRateManagerImpl$SampleConfig$a Companion;
    public static final long serialVersionUID;

    static {
       LogSampleRateManagerImpl$SampleConfig.Companion = new LogSampleRateManagerImpl$SampleConfig$a(null);
    }
    public void LogSampleRateManagerImpl$SampleConfig(){
       super();
    }
    public final int getMErrorSample(){
       return this.mErrorSample;
    }
    public final int getMSuccessSample(){
       return this.mSuccessSample;
    }
    public final void setMErrorSample(int p0){
       this.mErrorSample = p0;
    }
    public final void setMSuccessSample(int p0){
       this.mSuccessSample = p0;
    }
}
