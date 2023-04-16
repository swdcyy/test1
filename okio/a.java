package okio.a;
import okio.o;
import okio.a$a;
import nsd.u;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.Objects;
import okio.a$b;
import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.lang.AssertionError;
import java.lang.IllegalStateException;
import java.lang.String;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.Throwable;
import okio.m;
import okio.a$c;
import okio.n;
import okio.a$d;

public class a extends o	// class@0020ec
{
    public boolean inQueue;
    public a next;
    public long timeoutAt;
    public static final a$a Companion;
    public static final long IDLE_TIMEOUT_MILLIS;
    public static final long IDLE_TIMEOUT_NANOS;
    public static a head;

    static {
       a.Companion = new a$a(null);
       long l = TimeUnit.SECONDS.toMillis(60);
       a.IDLE_TIMEOUT_MILLIS = l;
       a.IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(l);
    }
    public void a(){
       super();
    }
    public final void enter(){
       int i = 1;
       boolean i1 = this.inQueue ^ i;
       if (!i1) {
          throw new IllegalStateException("Unbalanced enter/exit".toString());
       }
       long l = this.timeoutNanos();
       i1 = this.hasDeadline();
       if (!(v6 = l - null) && !i1) {
          return;
       }
       this.inQueue = i;
       Objects.requireNonNull(a.Companion);
       _monitor_enter(a.class);
       if (a.head == null) {
          a.head = new a();
          new a$b().start();
       }
       long l1 = System.nanoTime();
       if (v6 && i1) {
          long l2 = this.deadlineNanoTime() - l1;
          l = Math.min(l, l2) + l1;
          this.timeoutAt = l;
       }else if(v6){
          l = l + l1;
          this.timeoutAt = l;
       }else if(i1){
          this.timeoutAt = this.deadlineNanoTime();
       }else {
          throw new AssertionError();
       }
       l = this.remainingNanos(l1);
       a head = a.head;
       if (head == null) {
          a.L();
       }
       a next = head.next;
       while (next != null && l - next.remainingNanos(l1) >= 0) {
          head = head.next;
          if (head == null) {
             a.L();
          }
       }
       this.next = head.next;
       head.next = this;
       if (head == a.head) {
          a.class.notify();
       }
       _monitor_exit(a.class);
       return;
    }
    public final boolean exit(){
       boolean b = false;
       if (this.inQueue == null) {
          return b;
       }
       this.inQueue = b;
       Objects.requireNonNull(a.Companion);
       _monitor_enter(a.class);
       a head = a.head;
       while (true) {
          if (head != null) {
             a next = head.next;
             if (next == this) {
                head.next = this.next;
                this.next = null;
                _monitor_exit(a.class);
                break ;
             }else {
                head = next;
             }
          }else {
             b = true;
             _monitor_exit(a.class);
             break ;
          }
       }
       return b;
    }
    public final IOException exit$jvm(IOException p0){
       a.q(p0, "cause");
       if (!this.exit()) {
       }else {
          p0 = this.newTimeoutException(p0);
       }
       return p0;
    }
    public final void exit$jvm(boolean p0){
       if (!this.exit() || !p0) {
          return;
       }
       throw this.newTimeoutException(null);
    }
    public IOException newTimeoutException(IOException p0){
       InterruptedIOException interruptedI = new InterruptedIOException("timeout");
       if (p0 != null) {
          interruptedI.initCause(p0);
       }
       return interruptedI;
    }
    public final long remainingNanos(long p0){
       return (this.timeoutAt - p0);
    }
    public final m sink(m p0){
       a.q(p0, "sink");
       return new a$c(this, p0);
    }
    public final n source(n p0){
       a.q(p0, "source");
       return new a$d(this, p0);
    }
    public void timedOut(){
    }
}
