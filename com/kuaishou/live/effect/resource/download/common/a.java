package com.kuaishou.live.effect.resource.download.common.a;
import vz2.d;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import java.lang.Long;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.resource.download.common.r;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a03.a$c;
import a03.a;
import vz2.c;
import java.util.Objects;
import vz2.b0;
import msd.l;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;

public class a	// class@001b2e
{
    public final r a;
    public final boolean b;
    public boolean c;
    public a$a d;
    public static final long e;
    public static final long f;

    static {
       a.e = d.a;
       a.f = d.b;
    }
    public void a(boolean p0){
       super();
       long e = a.e;
       long f = a.f;
       b.e0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "LiveEffectDiskLruCleaner init", "isLowDiskMode", Boolean.valueOf(p0), "LOW_DISK_LRU_SIZE", Long.valueOf(e), "NORMAL_DISK_LRU_SIZE", Long.valueOf(f));
       this.b = p0;
       this.a = (p0)? new r(e): new r(f);
       return;
    }
    public boolean a(){
       return this.b;
    }
    public void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (this.c != null) {
          a.a().c("磁盘Lru执行中...");
          return;
       }else {
          _monitor_enter(this);
          if (this.c != null) {
             a.a().c("磁盘Lru执行中...");
             _monitor_exit(this);
             return;
          }else {
             this.c = true;
             _monitor_exit(this);
             a.a().c("开始执行磁盘Lru");
             a ta = this.a;
             c uoc = new c(this);
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidTwoRefs(p0, uoc, ta, r.class, "1") && p0.exists()) {
                ta.b.execute(new b0(ta, p0, uoc));
             }
             return;
          }
       }
    }
    public void c(File p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "6")) {
          return;
       }
       if (!p0.isDirectory()) {
          return;
       }
       if (!p0.setLastModified(p1)) {
          File uFile = new File(p0, "tmpDir");
          if (uFile.mkdirs()) {
             uFile.delete();
          }
       }
       return;
    }
}
