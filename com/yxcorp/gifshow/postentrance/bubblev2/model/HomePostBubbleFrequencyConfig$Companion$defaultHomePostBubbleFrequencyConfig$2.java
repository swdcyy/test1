package com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.bubblev2.model.HomePostBubbleFrequencyConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2 extends Lambda implements a	// class@00100a
{
    public static final HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2 INSTANCE;

    static {
       HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2.INSTANCE = new HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2();
    }
    public void HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2(){
       super(0);
    }
    public final HomePostBubbleFrequencyConfig invoke(){
       HomePostBubbleFrequencyConfig obj = PatchProxy.apply(null, this, HomePostBubbleFrequencyConfig$Companion$defaultHomePostBubbleFrequencyConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HomePostBubbleFrequencyConfig();
       obj.setDailyShowTimes(3);
       obj.setLifeCycleShowTimes(2);
       obj.setShowInterval(60);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
