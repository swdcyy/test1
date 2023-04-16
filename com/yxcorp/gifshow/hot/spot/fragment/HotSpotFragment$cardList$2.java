package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$cardList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HotSpotFragment$cardList$2 extends Lambda implements a	// class@001832
{
    public static final HotSpotFragment$cardList$2 INSTANCE;

    static {
       HotSpotFragment$cardList$2.INSTANCE = new HotSpotFragment$cardList$2();
    }
    public void HotSpotFragment$cardList$2(){
       super(0);
    }
    public final HotSpotFeedPageList invoke(){
       Object obj = PatchProxy.apply(null, this, HotSpotFragment$cardList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HotSpotFeedPageList();
    }
    public Object invoke(){
       return this.invoke();
    }
}
