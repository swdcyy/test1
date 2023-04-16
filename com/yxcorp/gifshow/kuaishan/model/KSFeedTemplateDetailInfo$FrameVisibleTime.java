package com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$FrameVisibleTime;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class KSFeedTemplateDetailInfo$FrameVisibleTime implements Serializable	// class@0019f9
{
    public float mDuration;
    public float mDurationAfterShifting;
    public String mId;
    public float mStart;
    public static final long serialVersionUID = 0x890b9ff200852e74;

    public void KSFeedTemplateDetailInfo$FrameVisibleTime(){
       super();
    }
    public float getRealFrameDuration(){
       Object obj = PatchProxy.apply(null, this, KSFeedTemplateDetailInfo$FrameVisibleTime.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.max(this.mDuration, this.mDurationAfterShifting);
    }
}
