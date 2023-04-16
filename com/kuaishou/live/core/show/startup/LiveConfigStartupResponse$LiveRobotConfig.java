package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRobotConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveRobotConfig implements Serializable	// class@00107a
{
    public long mLocalAwakeTimeoutMs;
    public int mNumberOf100msForDataProcessCallbackInterval;
    public long mServerAwakeTimeoutMs;
    public long mSessionOverTimeoutMs;
    public static final long serialVersionUID = 0x6ee016d84ec9bcf8;

    public void LiveConfigStartupResponse$LiveRobotConfig(){
       super();
       this.mLocalAwakeTimeoutMs = 5000;
       this.mServerAwakeTimeoutMs = 0x3a98;
       this.mSessionOverTimeoutMs = 0x3a98;
       this.mNumberOf100msForDataProcessCallbackInterval = 1;
    }
}
