package com.kwai.performance.fluency.page.monitor.model.PageStageEvent$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class PageStageEvent$a	// class@0010c1
{
    public long requestEndTs;
    public long requestStartTs;
    public long serverEndTs;
    public long serverStartTs;
    public String url;

    public void PageStageEvent$a(){
       super(0, 0, 0, 0, null, 31, null);
    }
    public void PageStageEvent$a(long p0,long p1,long p2,long p3,String p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       if (p5 & 0x02) {
          p1 = 0;
       }
       if (p5 & 0x04) {
          p2 = 0;
       }
       if (p5 & 0x08) {
          p3 = 0;
       }
       p4 = (p5 & 0x10)? "": null;
       a.p(p4, "url");
       super();
       this.requestStartTs = p0;
       this.serverStartTs = p1;
       this.serverEndTs = p2;
       this.requestEndTs = p3;
       this.url = p4;
       return;
    }
}
