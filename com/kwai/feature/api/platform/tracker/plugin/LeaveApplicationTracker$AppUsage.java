package com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker$AppUsage;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;

public class LeaveApplicationTracker$AppUsage implements Serializable	// class@001073
{
    public long mAppUsageTime;
    public List mPageStays;
    public long mPageTotal;
    public List mTimePageStays;
    public static final long serialVersionUID = 0x340a7a7c6021802e;

    public void LeaveApplicationTracker$AppUsage(long p0,long p1,List p2,List p3){
       super();
       this.mPageTotal = p0;
       this.mAppUsageTime = p1;
       this.mPageStays = p2;
       this.mTimePageStays = p3;
    }
}
