package com.kwai.performance.stability.crash.monitor.message.BackTraceStatistics;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Long;
import java.util.List;
import com.kwai.apm.message.FastUnwindBackTraceElement;
import java.lang.String;

public class BackTraceStatistics implements Serializable	// class@0011f6
{
    public List mAnrRecordDumpCostTimes;
    public int mDiscardFrame;
    public long mGetTraceAvgCostTime;
    public long mGetTraceFailTimes;
    public long mGetTraceTimes;
    public String mMaxFrameInfo;
    public long mMaxGetTraceCostTime;
    public FastUnwindBackTraceElement mMaxTraceElement;
    public long mMaxUnwindCostTime;
    public long mMaxUnwindTaskCostTime;
    public int mRemainTaskCount;
    public long mTotalDumpCostTime;
    public long mUnwindAvgCostTime;
    public List mUnwindFailElements;
    public long mUnwindFailTimes;
    public final HashMap mUnwindInfoMap;
    public long mUnwindTaskAvgCostTime;
    public long mUnwindTaskTimes;
    public long mUnwindTimes;
    public static BackTraceStatistics b;
    public static final long serialVersionUID;

    static {
       BackTraceStatistics.b = new BackTraceStatistics();
    }
    public void BackTraceStatistics(){
       super();
       this.mMaxGetTraceCostTime = 0;
       this.mGetTraceAvgCostTime = 0;
       this.mGetTraceTimes = 0;
       this.mGetTraceFailTimes = 0;
       this.mMaxUnwindCostTime = 0;
       this.mUnwindAvgCostTime = 0;
       this.mMaxUnwindTaskCostTime = 0;
       this.mUnwindTaskAvgCostTime = 0;
       this.mUnwindTaskTimes = 0;
       this.mUnwindTimes = 0;
       this.mUnwindFailTimes = 0;
       this.mUnwindFailElements = new ArrayList();
       this.mTotalDumpCostTime = 0;
       this.mAnrRecordDumpCostTimes = new ArrayList();
       this.mUnwindInfoMap = new HashMap();
       this.mDiscardFrame = 0;
       this.mRemainTaskCount = 0;
    }
    public static BackTraceStatistics getQualityStatistics(){
       return BackTraceStatistics.b;
    }
    public void addAnrRecordDumpCostTime(long p0){
       this.mAnrRecordDumpCostTimes.add(Long.valueOf(p0));
    }
    public void addUnwindFailTrace(FastUnwindBackTraceElement p0){
       this.mUnwindFailTimes = this.mUnwindFailTimes + 1;
       this.mUnwindFailElements.add(p0);
    }
    public void setDumpCostTime(long p0){
       this.mTotalDumpCostTime = p0;
    }
    public void setRemainTaskCount(int p0){
       this.mRemainTaskCount = p0;
    }
    public void setUnwindInfo(String p0,String p1){
       this.mUnwindInfoMap.put(p0, p1);
    }
    public void updateDiscardFrame(int p0){
       this.mDiscardFrame = this.mDiscardFrame + p0;
    }
    public void updateGetTraceFailTimes(){
       this.mGetTraceFailTimes = this.mGetTraceFailTimes + 1;
    }
    public void updateGetTraceTime(String p0,long p1){
       if (p1 - this.mMaxGetTraceCostTime > 0) {
          this.mMaxGetTraceCostTime = p1;
          this.mMaxFrameInfo = p0;
       }
       BackTraceStatistics tmGetTraceTi = this.mGetTraceTimes;
       this.mGetTraceAvgCostTime = ((this.mGetTraceAvgCostTime * tmGetTraceTi) + p1) / (tmGetTraceTi + 1);
       this.mGetTraceTimes = tmGetTraceTi + 1;
       return;
    }
    public void updateUnwindTaskTime(long p0){
       if (p0 - this.mMaxUnwindTaskCostTime > 0) {
          this.mMaxUnwindTaskCostTime = p0;
       }
       BackTraceStatistics tmUnwindTask = this.mUnwindTaskTimes;
       this.mUnwindTaskAvgCostTime = ((this.mUnwindTaskAvgCostTime * tmUnwindTask) + p0) / (tmUnwindTask + 1);
       this.mUnwindTaskTimes = tmUnwindTask + 1;
       return;
    }
    public void updateUnwindTime(FastUnwindBackTraceElement p0,long p1){
       if (p1 - this.mMaxUnwindCostTime > 0) {
          this.mMaxUnwindCostTime = p1;
          this.mMaxTraceElement = p0;
       }
       BackTraceStatistics tmUnwindTime = this.mUnwindTimes;
       this.mUnwindAvgCostTime = ((this.mUnwindAvgCostTime * tmUnwindTime) + p1) / (tmUnwindTime + 1);
       this.mUnwindTimes = tmUnwindTime + 1;
       return;
    }
}
