package com.yxcorp.gifshow.camera.record.lensdirty.DirtyLensInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.lang.Math;

public class DirtyLensInfo implements Serializable	// class@000e13
{
    public int mCurrentDetectTimes;
    public long mLastDetectionDays;
    public static final long serialVersionUID = 0x7d0598580201dc72;

    public void DirtyLensInfo(){
       super();
    }
    public DirtyLensInfo addCurrentDetectTimes(){
       this.mCurrentDetectTimes = this.mCurrentDetectTimes + 1;
       return this;
    }
    public long getDifferenceDay(){
       Object obj = PatchProxy.apply(null, this, DirtyLensInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.abs((TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()) - this.mLastDetectionDays));
    }
    public DirtyLensInfo setLastDetectionDaysByCurrentTime(){
       Object obj = PatchProxy.apply(null, this, DirtyLensInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLastDetectionDays = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
       return this;
    }
}
