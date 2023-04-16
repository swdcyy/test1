package com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map$Entry;
import s29.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AdRecoReportContextWrapper$getUnExposedAds$3 extends Lambda implements l	// class@001775
{
    public static final AdRecoReportContextWrapper$getUnExposedAds$3 INSTANCE;

    static {
       AdRecoReportContextWrapper$getUnExposedAds$3.INSTANCE = new AdRecoReportContextWrapper$getUnExposedAds$3();
    }
    public void AdRecoReportContextWrapper$getUnExposedAds$3(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(Map$Entry p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AdRecoReportContextWrapper$getUnExposedAds$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0.getValue();
    }
}
