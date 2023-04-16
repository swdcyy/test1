package com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$c;
import com.kuaishou.live.common.core.basic.tools.g$b;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileResponse$LiveResourceFileInfo;
import java.lang.String;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.util.HashMap;
import java.lang.reflect.Type;
import z83.a;
import com.kuaishou.live.common.core.basic.resource.e;
import java.lang.System;
import java.lang.Throwable;

public class LiveResourceFileUtil$c extends g$b	// class@000eb9
{
    public final LiveResourceFileResponse$LiveResourceFileInfo a;
    public final String b;
    public long c;
    public long d;

    public void LiveResourceFileUtil$c(LiveResourceFileResponse$LiveResourceFileInfo p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(LiveResourceFileUtil$c.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, LiveResourceFileUtil$c.class, "3")) {
          return;
       }
       if (this.d - p2) {
          this.d = p2;
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceFileUtil$c.class, "2")) {
          return;
       }
       LiveResourceFileUtil$c ta = this.a;
       LiveResourceFileUtil$c tc = this.c;
       LiveResourceFileUtil$c tb = this.b;
       LiveResourceFileUtil$c td = this.d;
       _monitor_enter(LiveResourceFileUtil.class);
       if (PatchProxy.isSupport(LiveResourceFileUtil.class) && PatchProxy.applyVoidFourRefs(ta, Long.valueOf(tc), tb, Long.valueOf(td), null, LiveResourceFileUtil.class, "28")) {
          _monitor_exit(LiveResourceFileUtil.class);
       }else {
          HashMap hashMap = a.b(HashMap.class);
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          hashMap.put(ta.mType, ta.mVersion);
          a.e(hashMap);
          e.c(ta, true, tc, tb, td, "");
          _monitor_exit(LiveResourceFileUtil.class);
       }
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveResourceFileUtil$c.class, "1")) {
          return;
       }
       this.c = System.currentTimeMillis();
       return;
    }
    public void d(Throwable p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveResourceFileUtil$c.class, "4")) {
          return;
       }
       e.c(this.a, false, this.c, this.b, this.d, p1);
       return;
    }
}
