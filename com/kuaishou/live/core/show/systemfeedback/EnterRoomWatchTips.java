package com.kuaishou.live.core.show.systemfeedback.EnterRoomWatchTips;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class EnterRoomWatchTips implements Serializable	// class@00116c
{
    public final int clickThreshold;
    public final int displayLimit;
    public final int slideThreshold;
    public final String tip;

    public void EnterRoomWatchTips(){
       super();
    }
    public final int getClickThreshold(){
       return this.clickThreshold;
    }
    public final int getDisplayLimit(){
       return this.displayLimit;
    }
    public final int getSlideThreshold(){
       return this.slideThreshold;
    }
    public final String getTip(){
       return this.tip;
    }
}
