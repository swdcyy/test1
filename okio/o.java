package okio.o;
import okio.o$b;
import nsd.u;
import okio.o$a;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import msd.a;
import java.lang.Math;
import nsd.c0;
import java.lang.Thread;
import java.io.InterruptedIOException;
import java.lang.Long;

public class o	// class@0020fd
{
    public long deadlineNanoTime;
    public boolean hasDeadline;
    public long timeoutNanos;
    public static final o$b Companion;
    public static final o NONE;

    static {
       o.Companion = new o$b(null);
       o.NONE = new o$a();
    }
    public void o(){
       super();
    }
    public o clearDeadline(){
       this.hasDeadline = false;
       return this;
    }
    public o clearTimeout(){
       this.timeoutNanos = 0;
       return this;
    }
    public final o deadline(long p0,TimeUnit p1){
       a.q(p1, "unit");
       long l = (p0 > 0)? 1: 0;
       if (l) {
          return this.deadlineNanoTime((System.nanoTime() + p1.toNanos(p0)));
       }else {
          throw new IllegalArgumentException("duration <= 0: "+p0.toString());
       }
    }
    public long deadlineNanoTime(){
       if (this.hasDeadline != null) {
          return this.deadlineNanoTime;
       }
       throw new IllegalStateException("No deadline".toString());
    }
    public o deadlineNanoTime(long p0){
       this.hasDeadline = true;
       this.deadlineNanoTime = p0;
       return this;
    }
    public boolean hasDeadline(){
       return this.hasDeadline;
    }
    public final void intersectWith(o p0,a p1){
       a.q(p0, "other");
       a.q(p1, "block");
       long l = this.timeoutNanos();
       TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
       this.timeout(o.Companion.a(p0.timeoutNanos(), this.timeoutNanos()), nANOSECONDS);
       if (this.hasDeadline()) {
          long l1 = this.deadlineNanoTime();
          if (p0.hasDeadline()) {
             this.deadlineNanoTime(Math.min(this.deadlineNanoTime(), p0.deadlineNanoTime()));
          }
          p1.invoke();
          c0.d(1);
          this.timeout(l, nANOSECONDS);
          if (p0.hasDeadline()) {
             this.deadlineNanoTime(l1);
          }
          c0.c(1);
       }else if(p0.hasDeadline()){
          this.deadlineNanoTime(p0.deadlineNanoTime());
       }
       p1.invoke();
       c0.d(1);
       this.timeout(l, nANOSECONDS);
       if (p0.hasDeadline()) {
          this.clearDeadline();
       }
       c0.c(1);
       return;
    }
    public void throwIfReached(){
       if (!Thread.interrupted()) {
          if (this.hasDeadline == null || (this.deadlineNanoTime - System.nanoTime()) > 0) {
             return;
          }
          throw new InterruptedIOException("deadline reached");
       }else {
          Thread.currentThread().interrupt();
          throw new InterruptedIOException("interrupted");
       }
    }
    public o timeout(long p0,TimeUnit p1){
       a.q(p1, "unit");
       String str = (p0 >= 0)? 1: null;
       if (str) {
          this.timeoutNanos = p1.toNanos(p0);
          return this;
       }else {
          throw new IllegalArgumentException("timeout < 0: "+p0.toString());
       }
    }
    public long timeoutNanos(){
       return this.timeoutNanos;
    }
    public final void waitUntilNotified(Object p0){
       String str = "monitor";
       try{
          a.q(p0, str);
          boolean b = this.hasDeadline();
          long l = this.timeoutNanos();
          int i = 0;
          if (!b && !l - i) {
             p0.wait();
             return;
          }else {
             long l1 = System.nanoTime();
             if (b && l - i) {
                l = Math.min(l, (this.deadlineNanoTime() - l1));
             }else if(b){
                l = this.deadlineNanoTime() - l1;
             }
             if (l - i > 0) {
                long l2 = l / 0xf4240;
                Long.signum(l2);
                p0.wait(l2, (int)(l - (0xf4240 * l2)));
                i = System.nanoTime() - l1;
             }
             if (i - l < 0) {
                return;
             }else {
                throw new InterruptedIOException("timeout");
             }
          }
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          throw new InterruptedIOException("interrupted");
       }
    }
}
