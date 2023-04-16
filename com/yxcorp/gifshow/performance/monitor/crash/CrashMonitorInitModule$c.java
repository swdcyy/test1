package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$c;
import pg7.a;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.AnrExtraDump;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kf7.a;
import java.util.Iterator;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import com.kwai.performance.stability.crash.monitor.anr.LogRecordQueue$PackedRecord;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import java.lang.Long;
import java.util.Collection;

public final class CrashMonitorInitModule$c implements a	// class@0012a1
{
    public final AnrMonitorConfig a;

    public void CrashMonitorInitModule$c(AnrMonitorConfig p0){
       this.a = p0;
       super();
    }
    public final void a(AnrExtraDump p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CrashMonitorInitModule$c.class, "1")) {
          return;
       }
       if (p0.packedRecords == null) {
          p0.packedRecords = new ArrayList();
       }
       if (p0.packedRecords.size() >= this.a.maxQueueSize) {
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = a.c().iterator();
          LogRecordQueue$PackedRecord packedRecord = 1;
          LogRecordQueue$PackedRecord packedRecord1 = null;
          while (iterator.hasNext()) {
             DependencyTask uDependencyT = iterator.next();
             if (!uDependencyT.v() && (uDependencyT.x() - null || uDependencyT instanceof BarrierTask)) {
                packedRecord1 = 1;
             }
             if (packedRecord1) {
                packedRecord1 = LogRecordQueue$PackedRecord.newInstance();
                packedRecord1.count = 1;
                packedRecord1.typeFlag = 512;
                packedRecord1.wall = uDependencyT.y();
                packedRecord1.cpu = uDependencyT.p();
                long l = uDependencyT.x() + packedRecord1.wall;
                packedRecord1.now = l;
                packedRecord1.msg = uDependencyT.name();
                if (uDependencyT.r() == packedRecord) {
                   packedRecord1.msg = packedRecord1.msg+"\(Running\)";
                   l = System.currentTimeMillis();
                   packedRecord1.now = l;
                   l = l - uDependencyT.x();
                   packedRecord1.wall = l;
                }else if(uDependencyT.r() == 3){
                   packedRecord1.msg = packedRecord1.msg+"\(Wait\)";
                   if (uDependencyT instanceof BarrierTask) {
                      l = System.currentTimeMillis();
                      packedRecord1.now = l;
                      l = l - uDependencyT.o;
                      packedRecord1.wall = l;
                   }
                }
                packedRecord1.maxWall = packedRecord1.wall;
                uArrayList.add(packedRecord1);
             }else {
                HashMap hashMap = new HashMap();
                hashMap.put("scheduledThread", Integer.valueOf(uDependencyT.v()));
                hashMap.put("startTimestamp", Long.valueOf(uDependencyT.x()));
                hashMap.put("wallTimeCost", Long.valueOf(uDependencyT.y()));
                hashMap.put("cpuTimeCost", Long.valueOf(uDependencyT.p()));
                hashMap.put("state", Integer.valueOf(uDependencyT.r()));
                hashMap.put("name", uDependencyT.name());
                uArrayList1.add(hashMap);
             }
          }
          p0.packedRecords.addAll(packedRecord1, uArrayList);
          if (uArrayList1.isEmpty() ^ packedRecord) {
             p0.addExtraInfo("init_module_not_main_thread", uArrayList1);
          }
          return;
       }
    }
}
