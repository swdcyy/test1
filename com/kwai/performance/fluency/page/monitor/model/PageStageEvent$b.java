package com.kwai.performance.fluency.page.monitor.model.PageStageEvent$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class PageStageEvent$b	// class@0010c2
{
    public final String desc;
    public final long endTs;
    public final String stageName;
    public final long startTs;

    public void PageStageEvent$b(){
       super("", "", 0, 0);
    }
    public void PageStageEvent$b(String p0,String p1,long p2,long p3){
       a.p(p0, "stageName");
       a.p(p1, "desc");
       super();
       this.stageName = p0;
       this.desc = p1;
       this.startTs = p2;
       this.endTs = p3;
    }
}
