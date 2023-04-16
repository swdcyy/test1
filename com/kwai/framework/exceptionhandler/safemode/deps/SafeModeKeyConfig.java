package com.kwai.framework.exceptionhandler.safemode.deps.SafeModeKeyConfig;
import java.io.Serializable;
import java.lang.Object;

public class SafeModeKeyConfig implements Serializable	// class@001550
{
    public SafeModeFeatureConfig mFeatureConfig;
    public int mVersion;

    public void SafeModeKeyConfig(){
       super();
       this.mVersion = 0;
    }
}
