package com.kwai.feature.post.api.feature.memory.MemoryLogger;
import com.kwai.feature.post.api.feature.memory.MemoryCustomEvent;
import java.lang.String;
import java.lang.Object;
import com.kwai.feature.post.api.feature.memory.MemoryStageEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Objects;
import com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent;
import com.kwai.feature.post.api.feature.memory.MemoryLogger$LogContent$EntranceInfo;
import com.kwai.sdk.switchconfig.a;
import k2b.u1;

public final class MemoryLogger	// class@0013b4
{
    public static MemoryCustomEvent a;
    public static final MemoryLogger b;

    static {
       MemoryLogger.b = new MemoryLogger();
       MemoryLogger.a = new MemoryCustomEvent("MemoryLogger");
    }
    public void MemoryLogger(){
       super();
    }
    public static synchronized final void c(MemoryStageEvent p0){
       _monitor_enter(MemoryLogger.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, MemoryLogger.class, "1")) {
          _monitor_exit(MemoryLogger.class);
          return;
       }else {
          a.p(p0, "stageEvent");
          Object[] objArray = new Object[0];
          p3.D().w("MemoryLogger", "logCustomEventStage\(\) called with: stageEvent = "+p0, objArray);
          MemoryLogger.a.add(p0);
          _monitor_exit(MemoryLogger.class);
          return;
       }
    }
    public static final void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, MemoryLogger.class, "6")) {
          return;
       }
       a.p(p0, "taskType");
       a.p(p1, "taskId");
       MemoryLogger b = MemoryLogger.b;
       MemoryLogger$LogContent$a logContent$a = new MemoryLogger$LogContent$a(p0);
       p0 = PatchProxy.applyOneRefs(p1, logContent$a, MemoryLogger$LogContent$a.class, "3");
       if (p0 != PatchProxyResult.class) {
          logContent$a = p0;
       }else {
          a.p(p1, "taskId");
          logContent$a.f = p1;
       }
       b.b(logContent$a, "POST_2023ANNUAL_ALBUM_STATS");
       return;
    }
    public final void a(String p0,boolean p1,long p2,String p3){
       if (PatchProxy.isSupport(MemoryLogger.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), p3, this, MemoryLogger.class, "7")) {
          return;
       }
       a.p(p0, "taskType");
       a.p(p3, "error");
       MemoryLogger$LogContent$a logContent$a = new MemoryLogger$LogContent$a(p0);
       logContent$a.c = p1;
       logContent$a.b = p2;
       p0 = PatchProxy.applyOneRefs(p3, logContent$a, MemoryLogger$LogContent$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          logContent$a = p0;
       }else {
          a.p(p3, "error");
          logContent$a.d = p3;
       }
       this.b(logContent$a, "POST_2023ANNUAL_ALBUM_STATS");
       return;
    }
    public final void b(MemoryLogger$LogContent$a p0,String p1){
       MemoryLogger memoryLogger = MemoryLogger.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, memoryLogger, "8")) {
          return;
       }
       a.p(p0, "builder");
       String str = "logKey";
       a.p(p1, str);
       Objects.requireNonNull(p0);
       MemoryLogger$LogContent logContent = PatchProxy.apply(null, p0, MemoryLogger$LogContent$a.class, "4");
       if (logContent != PatchProxyResult.class) {
       }else {
          MemoryLogger$LogContent logContent1 = new MemoryLogger$LogContent(p0.i, p0.a, p0.b, p0.c, p0.d, new MemoryLogger$LogContent$EntranceInfo(p0.e, p0.f, p0.g, p0.h));
       }
       if (!PatchProxy.applyVoidTwoRefs(logContent, p1, this, memoryLogger, "9")) {
          a.p(logContent, "logContent");
          a.p(p1, str);
          boolean b = false;
          if (a.g("POST_CLIENT_2023ANNUAL_ALBUM_TASK", p1)) {
             b = a.t().d("annualAlbumTableEnabled", b);
          }else if(a.g("POST_2023ANNUAL_ALBUM_STATS", p1)){
             b = a.t().d("annualAlbumLinkTableEnabled", b);
          }
          if (b) {
             u1.R(p1, logContent.toString(), 2);
          }
       }
       return;
    }
}
