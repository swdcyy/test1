package com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord implements Serializable	// class@00107c
{
    public final String id;
    public long lastShowTime;
    public int showInterval;

    public void HomePostBubbleFrequencyControlUtils$OperationBubbleShowRecord(String p0,long p1,int p2){
       a.p(p0, "id");
       super();
       this.id = p0;
       this.lastShowTime = p1;
       this.showInterval = p2;
    }
    public final String getId(){
       return this.id;
    }
    public final long getLastShowTime(){
       return this.lastShowTime;
    }
    public final int getShowInterval(){
       return this.showInterval;
    }
    public final void setLastShowTime(long p0){
       this.lastShowTime = p0;
    }
    public final void setShowInterval(int p0){
       this.showInterval = p0;
    }
}
