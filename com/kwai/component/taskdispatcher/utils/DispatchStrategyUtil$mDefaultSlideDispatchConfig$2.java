package com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil$mDefaultSlideDispatchConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import lh5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import com.kwai.sdk.switchconfig.a;

public final class DispatchStrategyUtil$mDefaultSlideDispatchConfig$2 extends Lambda implements a	// class@000bbf
{
    public static final DispatchStrategyUtil$mDefaultSlideDispatchConfig$2 INSTANCE;

    static {
       DispatchStrategyUtil$mDefaultSlideDispatchConfig$2.INSTANCE = new DispatchStrategyUtil$mDefaultSlideDispatchConfig$2();
    }
    public void DispatchStrategyUtil$mDefaultSlideDispatchConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, DispatchStrategyUtil$mDefaultSlideDispatchConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(TimeUnit.MILLISECONDS.toNanos(a.t().b("slide_vsync_threshold", 16)), -1);
    }
}
