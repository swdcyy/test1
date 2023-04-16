package com.kwai.feature.post.api.encode.compatibility.EncodeSchemeHelper$AverageValue;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.p3;
import q87.c;

public class EncodeSchemeHelper$AverageValue implements Serializable	// class@00130f
{
    public long mAverageValue;
    public long mCount;
    public long mMaxValue;
    public long mMinValue;
    public static final long serialVersionUID = 0x1;

    public void EncodeSchemeHelper$AverageValue(){
       super();
    }
    public EncodeSchemeHelper$AverageValue addNewValue(long p0){
       EncodeSchemeHelper$AverageValue obj;
       if (PatchProxy.isSupport(EncodeSchemeHelper$AverageValue.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, EncodeSchemeHelper$AverageValue.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Long.valueOf(this.mCount),Long.valueOf(this.mAverageValue),Long.valueOf(p0)};
       Object[] objArray1 = new Object[0];
       p3.D().w("Recorder", String.format("addNewValue old:%d %d, add %d", objArray), objArray1);
       EncodeSchemeHelper$AverageValue tmCount = this.mCount;
       this.mAverageValue = ((this.mAverageValue * tmCount) + p0) / (tmCount + 1);
       this.mCount = tmCount + 1;
       obj = this.mMinValue;
       if (obj <= 0 || obj - p0 > 0) {
          this.mMinValue = p0;
       }
       obj = this.mMaxValue;
       if (obj <= 0 || obj - p0 < 0) {
          this.mMaxValue = p0;
       }
       Object[] objArray2 = new Object[]{Long.valueOf(this.mCount),Long.valueOf(this.mAverageValue)};
       Object[] objArray3 = new Object[0];
       p3.D().w("Recorder", String.format("addNewValue new:%d %d", objArray2), objArray3);
       return this;
    }
    public long getAverageValue(){
       return this.mAverageValue;
    }
    public long getCount(){
       return this.mCount;
    }
    public long getMaxValue(){
       return this.mMaxValue;
    }
    public long getMinValue(){
       return this.mMinValue;
    }
}
