package com.kwai.video.waynelive.qosmoniter.QosMonitorConfig;
import java.lang.Object;

public class QosMonitorConfig	// class@000e12
{
    public int mEmptyReadSizeDurationSec;
    public boolean mEnableAutoSwitchCDN;
    public int mStalledDurationSecInOneMinute;

    public void QosMonitorConfig(){
       super();
       this.mEmptyReadSizeDurationSec = 10;
       this.mStalledDurationSecInOneMinute = 15;
    }
}
