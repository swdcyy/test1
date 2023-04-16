package com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig;
import java.lang.Long;

public final class HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2 extends Lambda implements a	// class@00107f
{
    public static final HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2 INSTANCE;

    static {
       HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2.INSTANCE = new HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2();
    }
    public void HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, HomePostBubbleFrequencyControlUtils$minShowInterValInMills$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return ((long)HomePostBubbleFrequencyControlUtils.g.d().getShowInterval() * 0xea60);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
