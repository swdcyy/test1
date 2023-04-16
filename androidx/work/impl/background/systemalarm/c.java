package androidx.work.impl.background.systemalarm.c;
import q3.c;
import l3.b;
import v3.p$b;
import java.lang.String;
import k3.h;
import android.content.Context;
import androidx.work.impl.background.systemalarm.d;
import java.lang.Object;
import x3.a;
import q3.d;
import java.lang.Throwable;
import v3.p;
import android.os.PowerManager$WakeLock;
import java.util.List;
import java.lang.Boolean;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.background.systemalarm.d$b;
import java.lang.Runnable;
import l3.d;
import java.lang.Integer;
import v3.m;
import l3.i;
import androidx.work.impl.WorkDatabase;
import u3.s;
import u3.r;
import java.util.Collections;
import java.lang.Iterable;

public class c implements c, b, p$b	// class@000a7d
{
    public final Context b;
    public final int c;
    public final String d;
    public final d e;
    public final d f;
    public final Object g;
    public int h;
    public PowerManager$WakeLock i;
    public boolean j;
    public static final String k;

    static {
       c.k = h.f("DelayMetCommandHandler");
    }
    public void c(Context p0,int p1,String p2,d p3){
       super();
       this.b = p0;
       this.c = p1;
       this.e = p3;
       this.d = p2;
       this.f = new d(p0, p3.f(), this);
       this.j = false;
       this.h = 0;
       this.g = new Object();
    }
    public void a(String p0){
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(c.k, String.format("Exceeded time limits on execution for %s", objArray), throwableArr);
       this.g();
    }
    public final void b(){
       c tg = this.g;
       _monitor_enter(tg);
       this.f.e();
       this.e.h().c(this.d);
       c ti = this.i;
       if (ti != null && ti.isHeld()) {
          Object[] objArray = new Object[]{this.i,this.d};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(c.k, String.format("Releasing wakelock %s for WorkSpec %s", objArray), throwableArr);
          this.i.release();
       }
       _monitor_exit(tg);
       return;
    }
    public void c(List p0){
       this.g();
    }
    public void d(String p0,boolean p1){
       c te;
       Object[] objArray = new Object[]{p0,Boolean.valueOf(p1)};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(c.k, String.format("onExecuted %s, %s", objArray), throwableArr);
       this.b();
       if (p1) {
          te = this.e;
          te.k(new d$b(te, a.f(this.b, this.d), this.c));
       }
       if (this.j != null) {
          te = this.e;
          te.k(new d$b(te, a.a(this.b), this.c));
       }
       return;
    }
    public void e(List p0){
       Object[] objArray;
       Throwable[] throwableArr;
       if (!p0.contains(this.d)) {
          return;
       }
       c tg = this.g;
       _monitor_enter(tg);
       int i = 1;
       int i1 = 0;
       if (this.h == null) {
          this.h = i;
          objArray = new Object[i];
          objArray[i1] = this.d;
          throwableArr = new Throwable[i1];
          h.c().a(c.k, String.format("onAllConstraintsMet for %s", objArray), throwableArr);
          if (this.e.e().j(this.d)) {
             this.e.h().b(this.d, 0x927c0, this);
          }else {
             this.b();
          }
       }else {
          objArray = new Object[i];
          objArray[i1] = this.d;
          throwableArr = new Throwable[i1];
          h.c().a(c.k, String.format("Already started work for %s", objArray), throwableArr);
       }
       _monitor_exit(tg);
       return;
    }
    public void f(){
       Object[] objArray = new Object[]{this.d,Integer.valueOf(this.c)};
       this.i = m.b(this.b, String.format("%s \(%s\)", objArray));
       String k = c.k;
       Object[] objArray1 = new Object[]{this.i,this.d};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(k, String.format("Acquiring wakelock %s for WorkSpec %s", objArray1), throwableArr);
       this.i.acquire();
       r or = this.e.g().H().O().j(this.d);
       if (or == null) {
          this.g();
          return;
       }else {
          boolean b = or.b();
          this.j = b;
          if (!b) {
             objArray1 = new Object[]{this.d};
             throwableArr = new Throwable[0];
             h.c().a(k, String.format("No constraints for %s", objArray1), throwableArr);
             this.e(Collections.singletonList(this.d));
          }else {
             this.f.d(Collections.singletonList(or));
          }
          return;
       }
    }
    public final void g(){
       Object[] objArray1;
       Throwable[] throwableArr1;
       c tg = this.g;
       _monitor_enter(tg);
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if (this.h < i) {
          this.h = i;
          String k = c.k;
          Object[] objArray = new Object[i1];
          objArray[i2] = this.d;
          Throwable[] throwableArr = new Throwable[i2];
          h.c().a(k, String.format("Stopping work for WorkSpec %s", objArray), throwableArr);
          c te = this.e;
          te.k(new d$b(te, a.g(this.b, this.d), this.c));
          if (this.e.e().g(this.d)) {
             objArray1 = new Object[i1];
             objArray1[i2] = this.d;
             throwableArr1 = new Throwable[i2];
             h.c().a(k, String.format("WorkSpec %s needs to be rescheduled", objArray1), throwableArr1);
             c te1 = this.e;
             te1.k(new d$b(te1, a.f(this.b, this.d), this.c));
          }else {
             objArray1 = new Object[i1];
             objArray1[i2] = this.d;
             throwableArr1 = new Throwable[i2];
             h.c().a(k, String.format("Processor does not have WorkSpec %s. No need to reschedule ", objArray1), throwableArr1);
          }
       }else {
          objArray1 = new Object[i1];
          objArray1[i2] = this.d;
          throwableArr1 = new Throwable[i2];
          h.c().a(c.k, String.format("Already stopped work for %s", objArray1), throwableArr1);
       }
       _monitor_exit(tg);
       return;
    }
}
