package com.kwai.logger.upload.retrieve.azeroth.f;
import java.lang.Object;
import java.util.HashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import x87.c;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$ConfigItem;
import x87.b;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Enum;
import com.kwai.logger.upload.retrieve.azeroth.f$a;
import com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Config;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import brd.t;
import x87.e;
import erd.r;
import x87.d;
import erd.o;
import com.kwai.logger.upload.retrieve.azeroth.d;
import erd.g;
import crd.b;

public class f	// class@000d39
{
    public final Queue a;
    public final g b;
    public b c;
    public final Set d;
    public boolean e;

    public void f(){
       super();
       this.d = new HashSet();
       this.a = new ConcurrentLinkedQueue();
       this.b = new c(this);
       AzerothConfigPuller$ConfigItem cHECK_INTERV = AzerothConfigPuller$ConfigItem.CHECK_INTERVAL;
       b uob = new b(this);
       EnumMap a = AzerothConfigPuller.a;
       Set set = a.get(cHECK_INTERV);
       if (set == null) {
          set = new CopyOnWriteArraySet();
          a.put(cHECK_INTERV, set);
       }
       set.add(uob);
       return;
    }
    public static f b(){
       return f$a.a;
    }
    public final void a(){
       this.c = t.interval(0, (long)AzerothConfigPuller.b.checkInterval, TimeUnit.SECONDS, b.d()).filter(new e(this)).map(new d(this)).subscribe(this.b, d.b);
    }
    public synchronized void c(){
       this.e = false;
       if (this.c == null || this.c.isDisposed()) {
          this.a();
       }
       return;
    }
}
