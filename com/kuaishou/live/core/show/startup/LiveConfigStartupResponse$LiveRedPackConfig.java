package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveRedPackConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveRedPackConfig implements Serializable	// class@001074
{
    public int mActivityRedPacketMaxShowTimes;
    public long mTokenRequestDelayMs;
    public int mTokenRequestMaxRetryTimes;
    public long mTokenRequestRetryIntervalMs;
    public static final long serialVersionUID = 0x423094745422b5bc;

    public void LiveConfigStartupResponse$LiveRedPackConfig(){
       super();
       this.mTokenRequestDelayMs = 0x2710;
       this.mTokenRequestMaxRetryTimes = 3;
       this.mTokenRequestRetryIntervalMs = 5000;
       this.mActivityRedPacketMaxShowTimes = 0;
    }
}
