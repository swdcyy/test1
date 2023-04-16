package com.yxcorp.utility.f$c;
import crd.b;
import brd.v;
import com.yxcorp.utility.f$a;
import java.lang.Object;
import android.os.SystemClock;
import com.yxcorp.utility.f;
import java.util.Queue;

public class f$c implements b	// class@0009bf
{
    public boolean b;
    public final long c;
    public final long d;
    public long e;
    public final v f;

    public void f$c(long p0,long p1,long p2,v p3,f$a p4){
       super();
       this.c = p1;
       long l = SystemClock.elapsedRealtime();
       long l1 = 0;
       if (!p1 - l1) {
       }else {
          l1 = p0 % p1;
       }
       this.e = (l + l1) + p2;
       this.d = (SystemClock.elapsedRealtime() + p0) + p2;
       this.f = p3;
       return;
    }
    public void dispose(){
       f uof = f.d();
       _monitor_enter(uof);
       uof.b.remove(this);
       if (!uof.b.size()) {
          uof.a();
       }
       _monitor_exit(uof);
       this.b = true;
       return;
    }
    public boolean isDisposed(){
       return this.b;
    }
}
