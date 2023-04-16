package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$todayListWrapperAdapterV2$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import com.yxcorp.gifshow.hot.spot.adapter.today.TodayListWrapperAdapterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yua.b;
import qrd.p;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;

public final class HotSpotFragment$todayListWrapperAdapterV2$2 extends Lambda implements a	// class@00183a
{
    public final HotSpotFragment this$0;

    public void HotSpotFragment$todayListWrapperAdapterV2$2(HotSpotFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final TodayListWrapperAdapterV2 invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HotSpotFragment$todayListWrapperAdapterV2$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       HotSpotFragment$todayListWrapperAdapterV2$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "9");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.W0.getValue();
       }
       return new TodayListWrapperAdapterV2(obj1, this.this$0.ai());
    }
    public Object invoke(){
       return this.invoke();
    }
}
