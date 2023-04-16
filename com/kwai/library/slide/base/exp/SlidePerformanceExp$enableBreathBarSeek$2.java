package com.kwai.library.slide.base.exp.SlidePerformanceExp$enableBreathBarSeek$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SlidePerformanceExp$enableBreathBarSeek$2 extends Lambda implements a	// class@0008e4
{
    public static final SlidePerformanceExp$enableBreathBarSeek$2 INSTANCE;

    static {
       SlidePerformanceExp$enableBreathBarSeek$2.INSTANCE = new SlidePerformanceExp$enableBreathBarSeek$2();
    }
    public void SlidePerformanceExp$enableBreathBarSeek$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SlidePerformanceExp$enableBreathBarSeek$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableBreatheBarSeek", false);
    }
}
