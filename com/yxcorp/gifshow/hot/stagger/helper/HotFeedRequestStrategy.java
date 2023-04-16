package com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy$feedCacheObtainAfterDelay$2;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy$isLaunchOptAbEnable$2;
import java.lang.Object;

public final class HotFeedRequestStrategy	// class@0018a3
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final HotFeedRequestStrategy d;

    static {
       HotFeedRequestStrategy.d = new HotFeedRequestStrategy();
       HotFeedRequestStrategy.a = s.c(HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2.INSTANCE);
       HotFeedRequestStrategy.b = s.c(HotFeedRequestStrategy$feedCacheObtainAfterDelay$2.INSTANCE);
       HotFeedRequestStrategy.c = s.c(HotFeedRequestStrategy$isLaunchOptAbEnable$2.INSTANCE);
    }
    public void HotFeedRequestStrategy(){
       super();
    }
}
