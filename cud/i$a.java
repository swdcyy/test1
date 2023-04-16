package cud.i$a;
import okio.m;
import cud.i;
import java.lang.Object;
import okio.o;
import okio.b;
import java.io.IOException;
import java.lang.String;
import qrd.l1;
import okio.o$b;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import kotlin.TypeCastException;
import java.lang.IllegalStateException;
import kotlin.jvm.internal.a;

public final class i$a implements m	// class@000c8a
{
    public final o b;
    public final i c;

    public void i$a(i p0){
       this.c = p0;
       super();
       this.b = new o();
    }
    public void close(){
       b uob = this.c.a();
       _monitor_enter(uob);
       if (this.c.c()) {
          _monitor_exit(uob);
          return;
       }else {
          m om = this.c.b();
          if (om == null) {
             if (!this.c.d() || this.c.a().p() <= 0) {
                i$a tc = this.c;
                tc.b = true;
                b uob1 = tc.a();
                if (uob1 != null) {
                   uob1.notifyAll();
                   om = null;
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
             }else {
                throw new IOException("source is closed");
             }
          }
          _monitor_exit(uob);
          if (om != null) {
             o oo = om.timeout();
             o oo1 = this.c.e().timeout();
             long l = oo.timeoutNanos();
             TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
             oo.timeout(o.Companion.a(oo1.timeoutNanos(), oo.timeoutNanos()), nANOSECONDS);
             if (oo.hasDeadline()) {
                long l1 = oo.deadlineNanoTime();
                if (oo1.hasDeadline()) {
                   oo.deadlineNanoTime(Math.min(oo.deadlineNanoTime(), oo1.deadlineNanoTime()));
                }
                om.close();
                oo.timeout(l, nANOSECONDS);
                if (oo1.hasDeadline()) {
                   oo.deadlineNanoTime(l1);
                }
             }else if(oo1.hasDeadline()){
                oo.deadlineNanoTime(oo1.deadlineNanoTime());
             }
             om.close();
             oo.timeout(l, nANOSECONDS);
             if (oo1.hasDeadline()) {
                oo.clearDeadline();
             }
          }
          return;
       }
    }
    public void flush(){
       b uob = this.c.a();
       _monitor_enter(uob);
       if (!(this.c.c() ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       m om = this.c.b();
       if (om == null) {
          if (!this.c.d() || this.c.a().p() <= 0) {
             om = null;
          }else {
             throw new IOException("source is closed");
          }
       }
       _monitor_exit(uob);
       if (om != null) {
          o oo = om.timeout();
          o oo1 = this.c.e().timeout();
          long l = oo.timeoutNanos();
          TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
          oo.timeout(o.Companion.a(oo1.timeoutNanos(), oo.timeoutNanos()), nANOSECONDS);
          if (oo.hasDeadline()) {
             long l1 = oo.deadlineNanoTime();
             if (oo1.hasDeadline()) {
                oo.deadlineNanoTime(Math.min(oo.deadlineNanoTime(), oo1.deadlineNanoTime()));
             }
             om.flush();
             oo.timeout(l, nANOSECONDS);
             if (oo1.hasDeadline()) {
                oo.deadlineNanoTime(l1);
             }
          }else if(oo1.hasDeadline()){
             oo.deadlineNanoTime(oo1.deadlineNanoTime());
          }
          om.flush();
          oo.timeout(l, nANOSECONDS);
          if (oo1.hasDeadline()) {
             oo.clearDeadline();
          }
       }
       return;
    }
    public o timeout(){
       return this.b;
    }
    public void write(b p0,long p1){
       m om;
       long l;
       a.q(p0, "source");
       b uob = this.c.a();
       _monitor_enter(uob);
       if (!(this.c.c() ^ 0x01)) {
       label_010c :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          l1 ol1 = null;
          if (p1 - ol1 > 0) {
             om = this.c.b();
             if (om != null) {
             label_0075 :
                _monitor_exit(uob);
                if (om != null) {
                   o oo = om.timeout();
                   o oo1 = this.c.e().timeout();
                   l = oo.timeoutNanos();
                   TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
                   oo.timeout(o.Companion.a(oo1.timeoutNanos(), oo.timeoutNanos()), nANOSECONDS);
                   if (oo.hasDeadline()) {
                      long l1 = oo.deadlineNanoTime();
                      if (oo1.hasDeadline()) {
                         oo.deadlineNanoTime(Math.min(oo.deadlineNanoTime(), oo1.deadlineNanoTime()));
                      }
                      om.write(p0, p1);
                      oo.timeout(l, nANOSECONDS);
                      if (oo1.hasDeadline()) {
                         oo.deadlineNanoTime(l1);
                         break ;
                      }
                   }else if(oo1.hasDeadline()){
                      oo.deadlineNanoTime(oo1.deadlineNanoTime());
                   }
                   om.write(p0, p1);
                   oo.timeout(l, nANOSECONDS);
                   if (oo1.hasDeadline()) {
                      oo.clearDeadline();
                      break ;
                   }
                }
                break ;
             }else if(!this.c.d()){
                i$a tc = this.c;
                l = tc.g - tc.a().p();
                if (!l - ol1) {
                   this.b.waitUntilNotified(this.c.a());
                }else {
                   long l2 = Math.min(l, p1);
                   this.c.a().write(p0, l2);
                   p1 = p1 - l2;
                   b uob1 = this.c.a();
                   if (uob1 == null) {
                      throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                   }
                   uob1.notifyAll();
                }
             }else {
                throw new IOException("source is closed");
             }
          }else {
             om = null;
             goto label_0075 ;
          }
       }
       return;
    }
}
