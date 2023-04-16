package com.kuaishou.live.lite.performance.LiveViewPerformanceModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import ec3.v;

public class LiveViewPerformanceModel implements Serializable	// class@000a3f
{
    public long b;
    public long c;
    public long d;
    public final String mTag;
    public int mViewDrawAvgDuration;
    public int mViewDrawTotalCount;
    public int mViewDrawTotalCountOneVsync;
    public int mViewLayoutAvgDuration;
    public int mViewLayoutTotalCount;
    public int mViewLayoutTotalCountOneVsync;
    public long mViewMaxDrawDuration;
    public long mViewMaxLayoutDuration;
    public long mViewMaxMeasureDuration;
    public int mViewMeasureAvgDuration;
    public int mViewMeasureTotalCount;
    public int mViewMeasureTotalCountOneVsync;
    public static final long serialVersionUID = 0x4c9d0fa78bfaa316;

    public void LiveViewPerformanceModel(String p0){
       super();
       this.mTag = p0;
    }
    public void calculateAvgDuration(){
       if (PatchProxy.applyVoid(null, this, LiveViewPerformanceModel.class, "4")) {
          return;
       }
       this.mViewMeasureAvgDuration = (int)(this.b / (long)Math.max(1, this.mViewMeasureTotalCount));
       this.mViewLayoutAvgDuration = (int)(this.c / (long)Math.max(1, this.mViewLayoutTotalCount));
       this.mViewDrawAvgDuration = (int)(this.d / (long)Math.max(1, this.mViewDrawTotalCount));
       return;
    }
    public void updateDrawRecord(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewPerformanceModel.class, "2")) {
          return;
       }
       this.mViewDrawTotalCount = this.mViewDrawTotalCount + 1;
       this.mViewMaxDrawDuration = Math.max(p0.c, this.mViewMaxDrawDuration);
       this.d = this.d + p0.c;
       return;
    }
    public void updateLayoutRecord(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewPerformanceModel.class, "3")) {
          return;
       }
       this.mViewLayoutTotalCount = this.mViewLayoutTotalCount + 1;
       this.mViewMaxLayoutDuration = Math.max(p0.c, this.mViewMaxLayoutDuration);
       this.c = this.c + p0.c;
       return;
    }
    public void updateMeasureRecord(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewPerformanceModel.class, "1")) {
          return;
       }
       this.mViewMeasureTotalCount = this.mViewMeasureTotalCount + 1;
       this.mViewMaxMeasureDuration = Math.max(p0.c, this.mViewMaxMeasureDuration);
       this.b = this.b + p0.c;
       return;
    }
}
