package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$onPause$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;

public final class AutoTracker$onPause$$inlined$let$lambda$1 extends Lambda implements a	// class@0010c6
{
    public final String $pageKey$inlined;
    public final Object $pageObj$inlined;

    public void AutoTracker$onPause$$inlined$let$lambda$1(Object p0,String p1){
       this.$pageObj$inlined = p0;
       this.$pageKey$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       AutoTracker.INSTANCE.checkJumpOut(this.$pageKey$inlined);
    }
}
