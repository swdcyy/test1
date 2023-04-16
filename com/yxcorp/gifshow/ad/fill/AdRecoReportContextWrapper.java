package com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hn5.n;
import hn5.m;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$a;
import java.util.Map;
import androidx.collection.LruCache;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import wsd.m;
import trd.u0;
import com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$1;
import msd.p;
import kotlin.sequences.SequencesKt___SequencesKt;
import com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$2;
import com.yxcorp.gifshow.ad.fill.AdRecoReportContextWrapper$getUnExposedAds$3;
import msd.l;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import s29.a;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Long;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.Throwable;
import yx.j0;
import java.lang.Iterable;
import java.lang.CharSequence;

public final class AdRecoReportContextWrapper	// class@001776
{
    public static final AdRecoReportContextWrapper a;

    static {
       AdRecoReportContextWrapper.a = new AdRecoReportContextWrapper();
    }
    public void AdRecoReportContextWrapper(){
       super();
    }
    public final String a(){
       int i;
       n obj = PatchProxy.apply(null, this, AdRecoReportContextWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = m.a();
       a.o(obj, "HomePagePlugin.getInstance\(\)");
       String str = "";
       if (obj.GG() && AdNotShownCache.c.a().snapshot().isEmpty()) {
          return str;
       }
       String str1 = "";
       ArrayList uArrayList = new ArrayList();
       try{
          i = 0;
          Map map = AdNotShownCache.c.a().snapshot();
          a.o(map, "AdNotShownCache.INSTANCE.snapshot\(\)");
          Iterator iterator = SequencesKt___SequencesKt.b1(SequencesKt___SequencesKt.j0(SequencesKt___SequencesKt.j0(u0.P0(map), new AdRecoReportContextWrapper$getUnExposedAds$1(uArrayList)), new AdRecoReportContextWrapper$getUnExposedAds$2(a.t().a("unexposedAdUploadCount", i))), AdRecoReportContextWrapper$getUnExposedAds$3.INSTANCE).iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             PhotoAdvertisement obj1 = iterator.next();
             int i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (i1) {
                str1 = str1+",";
             }
             i3 oi3 = i3.f();
             PhotoAdvertisement photoAdverti = k.B(obj1.a());
             a.m(photoAdverti);
             oi3.c("creativeId", Long.valueOf(photoAdverti.mCreativeId));
             obj1 = k.B(obj1.a());
             a.m(obj1);
             oi3.c("posId", Long.valueOf(obj1.mAdData.mPosId));
             str1 = str1+oi3.e();
             i1 = i2;
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[i];
          j0.d("AdRecoReportContextWrapper", e4, objArray);
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          AdNotShownCache.c.a().remove(Long.valueOf(iterator1.next().longValue()));
       }
       iterator1 = (!str1.length())? 1: 0;
       if (iterator1) {
          return str;
       }else {
          str1.insert(i, "[");
          str1 = str1+"]";
          a.o(str1, "sb.toString\(\)");
          return str1;
       }
    }
}
