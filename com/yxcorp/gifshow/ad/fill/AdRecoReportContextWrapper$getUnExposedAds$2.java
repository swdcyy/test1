package com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AdRecoReportContextWrapper$getUnExposedAds$2 extends Lambda implements p	// class@001774
{
    public final int $idsThreshold;

    public void AdRecoReportContextWrapper$getUnExposedAds$2(int p0){
       this.$idsThreshold = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.intValue(), p1));
    }
    public final boolean invoke(int p0,Map$Entry p1){
       if (PatchProxy.isSupport(AdRecoReportContextWrapper$getUnExposedAds$2.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, AdRecoReportContextWrapper$getUnExposedAds$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "<anonymous parameter 1>");
       boolean b = (p0 < this.$idsThreshold)? true: false;
       return b;
    }
}
