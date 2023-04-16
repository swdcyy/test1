package com.kuaishou.live.core.show.systemfeedback.WatchTaskTips;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class WatchTaskTips implements Serializable	// class@001174
{
    public final int threshold;
    public final String tip;
    public final String watchTaskToken;

    public void WatchTaskTips(){
       super();
    }
    public final int getThreshold(){
       return this.threshold;
    }
    public final String getTip(){
       return this.tip;
    }
    public final String getWatchTaskToken(){
       return this.watchTaskToken;
    }
}
