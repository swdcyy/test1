package com.kwai.performance.overhead.battery.monitor.model.BaseException;
import java.io.Serializable;
import java.lang.Object;
import java.lang.System;
import java.util.UUID;
import java.lang.String;
import java.util.HashMap;
import com.kwai.performance.overhead.battery.monitor.model.BaseException$a;

public class BaseException implements Serializable	// class@00113c
{
    public String mAbi;
    public String mCrashDetail;
    public String mCrashType;
    public String mCurrentActivity;
    public long mCurrentTimeStamp;
    public String mIsAppOnForeground;
    public String mLaunched;
    public String mLogUUID;
    public BaseException$a mMemoryInfo;
    public String mPage;
    public String mScene;
    public Map mStatusMap;
    public String mTaskId;
    public String mVersionCode;

    public void BaseException(){
       super();
       this.mAbi = "Unknown";
       this.mCrashType = "CPU_EXCEPTION";
       this.mCurrentActivity = "Unknown";
       this.mCurrentTimeStamp = System.currentTimeMillis();
       this.mLogUUID = UUID.randomUUID().toString();
       this.mPage = "Unknown";
       this.mScene = "Unknown";
       this.mTaskId = "Unknown";
       this.mVersionCode = "Unknown";
       this.mLaunched = "Unknown";
       this.mIsAppOnForeground = "Unknown";
       this.mStatusMap = new HashMap();
       this.mMemoryInfo = new BaseException$a();
    }
}
