package com.kwai.component.tti.TTIStrategyType;
import java.io.Serializable;
import java.lang.Object;

public class TTIStrategyType implements Serializable	// class@000bc5
{
    public String mTTIBlackList;
    public long mTTIDelayTime;
    public boolean mTTIHuiDuReasonStacktrace;
    public int mTTIMonitorDiffValue;
    public int mTTIMonitorFpsThresholdValue;
    public int mTTIMonitorTime;
    public int mTTIMonitorType;
    public boolean mTTIReasonStacktrace;
    public int mTTIReasonStacktraceSampleInterval;
    public long mTTIWorkThreadIntervalTime;
    public boolean mUploadHuiDuLog;
    public boolean mUploadLog;
    public boolean mUploadTouchLog;

    public void TTIStrategyType(){
       super();
       this.mTTIMonitorType = 1;
       this.mUploadLog = false;
       this.mUploadTouchLog = true;
       this.mUploadHuiDuLog = false;
       this.mTTIMonitorDiffValue = 5;
       this.mTTIMonitorFpsThresholdValue = 50;
       this.mTTIBlackList = "";
       this.mTTIDelayTime = 0x2710;
       this.mTTIMonitorTime = 30;
       this.mTTIWorkThreadIntervalTime = 200;
       this.mTTIReasonStacktrace = false;
       this.mTTIHuiDuReasonStacktrace = false;
       this.mTTIReasonStacktraceSampleInterval = 83;
    }
}
