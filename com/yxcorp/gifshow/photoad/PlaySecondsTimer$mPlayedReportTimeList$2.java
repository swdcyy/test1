package com.yxcorp.gifshow.photoad.PlaySecondsTimer$mPlayedReportTimeList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.photoad.PlaySecondsTimer;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.Collection;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.util.Objects;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.Math;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class PlaySecondsTimer$mPlayedReportTimeList$2 extends Lambda implements a	// class@000f6b
{
    public final PlaySecondsTimer this$0;

    public void PlaySecondsTimer$mPlayedReportTimeList$2(PlaySecondsTimer p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList uArrayList;
       PlaySecondsTimer playSecondsT = PlaySecondsTimer.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, PlaySecondsTimer$mPlayedReportTimeList$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = k.B(this.this$0.g);
       if (obj != null) {
          PhotoAdvertisement mAdData = obj.mAdData;
          PhotoAdvertisement$AdData mPlayedTotal = (mAdData != null)? mAdData.mPlayedTotalReportTime: objArray;
          int i = 1;
          String str = (mPlayedTotal == null || mPlayedTotal.isEmpty())? 1: null;
          if (!str) {
             uArrayList = new ArrayList(obj.mAdData.mPlayedTotalReportTime);
          }else {
             mAdData = obj.mAdLiveForFansTop;
             if (mAdData != null) {
                PhotoAdvertisement$FanstopLiveInfo mAdData1 = mAdData.mAdData;
                if (mAdData1 != null) {
                   objArray = mAdData1.mPlayedTotalReportTime;
                }
             }
             uArrayList = (objArray == null || objArray.isEmpty())? 1: null;
             if (!uArrayList) {
                uArrayList = new ArrayList(obj.mAdLiveForFansTop.mAdData.mPlayedTotalReportTime);
             }else {
                uArrayList = new ArrayList();
             }
          }
          PlaySecondsTimer$mPlayedReportTimeList$2 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(uArrayList, tthis$0, playSecondsT, "5");
          if (uArrayList1 != patchProxyRe) {
          }else if(uArrayList.size() > 15){
             uArrayList = new ArrayList(uArrayList.subList(0, 15));
          }
          uArrayList1 = uArrayList;
          Objects.requireNonNull(tthis$0);
          Iterator obj1 = PatchProxy.applyOneRefs(uArrayList1, tthis$0, playSecondsT, "6");
          if (obj1 != patchProxyRe) {
             uArrayList1 = obj1;
          }else if(uArrayList1.size() > i){
             obj1 = uArrayList1.iterator();
             a.o(obj1, "list.iterator\(\)");
             int i1 = obj1.next().intValue();
             while (obj1.hasNext()) {
                int i2 = obj1.next().intValue();
                i = i2 - i1;
                if (2000 > Math.abs(i)) {
                   obj1.remove();
                   objArray = new Object[0];
                   j0.l("PlaySecondsTimer", "filter config point , duration: "+i2, objArray);
                }else {
                   i1 = i2;
                }
             }
          }
          objArray = CollectionsKt___CollectionsKt.G5(uArrayList1);
       }
       return objArray;
    }
}
