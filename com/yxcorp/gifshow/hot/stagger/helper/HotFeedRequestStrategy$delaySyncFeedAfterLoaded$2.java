package com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.hot.stagger.helper.HotFeedRequestStrategy;
import qrd.p;

public final class HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2 extends Lambda implements a	// class@0018a0
{
    public static final HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2 INSTANCE;

    static {
       HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2.INSTANCE = new HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2();
    }
    public void HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(null, this, HotFeedRequestStrategy$delaySyncFeedAfterLoaded$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, null, HotFeedRequestStrategy.class, "3");
       if (obj == patchProxyRe) {
          obj = HotFeedRequestStrategy.c.getValue();
       }
       return obj.booleanValue();
    }
}
