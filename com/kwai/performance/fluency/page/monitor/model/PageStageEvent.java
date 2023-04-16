package com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import nsd.u;
import java.util.List;

public final class PageStageEvent implements Serializable	// class@0010c3
{
    public List b;
    public boolean c;
    public Map customParams;
    public boolean d;
    public long finishDrawTs;
    public long firstFrameTs;
    public boolean isDynamicPage;
    public boolean isFromCache;
    public List networkStages;
    public long onCreateTs;
    public long onInitTs;
    public long onResumeTs;
    public long onStartTs;
    public long onViewCreatedTs;
    public String pageCode;
    public String pageDesc;
    public String pageName;
    public List pageStages;
    public String reason;
    public long requestEndTs;
    public long requestStartTs;
    public String resultCode;
    public float samplingRate;
    public String source;
    public String uuid;

    public void PageStageEvent(String p0,boolean p1){
       a.p(p0, "pageName");
       super();
       this.pageName = p0;
       this.isDynamicPage = p1;
       this.pageCode = "";
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.uuid = str;
       this.source = "";
       this.pageDesc = "";
       this.resultCode = "success";
       this.reason = "";
       this.pageStages = new CopyOnWriteArrayList();
       this.networkStages = new CopyOnWriteArrayList();
       this.customParams = new ConcurrentHashMap();
       this.b = new CopyOnWriteArrayList();
    }
    public void PageStageEvent(String p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final List getMoments(){
       return this.b;
    }
    public final boolean isCheckingFullyDraw(){
       return this.c;
    }
    public final boolean isRealShow(){
       return this.d;
    }
    public final void setCheckingFullyDraw(boolean p0){
       this.c = p0;
    }
    public final void setMoments(List p0){
       a.p(p0, "<set-?>");
       this.b = p0;
    }
    public final void setRealShow(boolean p0){
       this.d = p0;
    }
}
