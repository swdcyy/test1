package com.kwai.performance.fluency.page.monitor.PageMonitorContext$init$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.monitor.base.d;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class PageMonitorContext$init$1 extends Lambda implements l	// class@001098
{
    public final d $commonConfig;

    public void PageMonitorContext$init$1(d p0){
       this.$commonConfig = p0;
       super(1);
    }
    public final File invoke(String p0){
       a.p(p0, "it");
       return this.$commonConfig.e().invoke(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
