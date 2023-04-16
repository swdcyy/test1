package com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.util.ArrayList;
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
import java.lang.System;
import s29.a;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import java.util.Objects;

public final class AdRecoReportContextWrapper$getUnExposedAds$1 extends Lambda implements p	// class@001773
{
    public final ArrayList $removeList;

    public void AdRecoReportContextWrapper$getUnExposedAds$1(ArrayList p0){
       this.$removeList = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0.intValue(), p1));
    }
    public final boolean invoke(int p0,Map$Entry p1){
       Object obj;
       if (PatchProxy.isSupport(AdRecoReportContextWrapper$getUnExposedAds$1.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, AdRecoReportContextWrapper$getUnExposedAds$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "item");
       Objects.requireNonNull(AdNotShownCache.c);
       obj = 1;
       int i = ((System.currentTimeMillis() - p1.getValue().b) - (AdNotShownCache.b * (long)0xea60) > 0)? 1: 0;
       if (i) {
          this.$removeList.add(p1.getKey());
       }
       return (obj ^ i);
    }
}
