package com.kwai.framework.network.keyconfig.TimeRange;
import java.lang.Object;

public class TimeRange	// class@000c1e
{
    public long mEnd;
    public long mStart;

    public void TimeRange(){
       super();
    }
    public void TimeRange(long p0,long p1){
       super();
       this.mStart = p0;
       this.mEnd = p1;
    }
    public boolean a(long p0){
       boolean b = (this.mStart - p0 <= 0 && p0 - this.mEnd <= 0)? true: false;
       return b;
    }
}
