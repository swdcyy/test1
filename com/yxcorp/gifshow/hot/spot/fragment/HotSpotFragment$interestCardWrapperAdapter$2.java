package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$interestCardWrapperAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import xua.a;
import qrd.p;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;

public final class HotSpotFragment$interestCardWrapperAdapter$2 extends Lambda implements a	// class@001837
{
    public final HotSpotFragment this$0;

    public void HotSpotFragment$interestCardWrapperAdapter$2(HotSpotFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final InterestCardWrapperAdapter invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, HotSpotFragment$interestCardWrapperAdapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       HotSpotFragment$interestCardWrapperAdapter$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, HotSpotFragment.class, "11");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.Y0.getValue();
       }
       return new InterestCardWrapperAdapter(obj1, this.this$0.ai());
    }
    public Object invoke(){
       return this.invoke();
    }
}
