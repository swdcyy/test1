package yb6.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.System;
import android.os.SystemClock;

public class c	// class@002876
{
    public Long a;
    public long b;
    public long c;

    public void c(){
       super();
    }
    public synchronized void a(long p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoc, "1")) {
          return;
       }
       p0 = p0 + (p1 / 2);
       this.b = p0;
       this.a = Long.valueOf((p0 - System.currentTimeMillis()));
       this.c = SystemClock.elapsedRealtime();
       return;
    }
}
