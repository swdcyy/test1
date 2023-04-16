package l3.j;
import java.lang.Runnable;
import java.lang.String;
import k3.h;
import l3.j$c;
import java.lang.Object;
import androidx.work.ListenableWorker$a;
import w3.a;
import u3.s;
import androidx.work.impl.WorkDatabase;
import u3.b;
import u3.v;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Iterator;
import xk.d;
import androidx.work.ListenableWorker$a$c;
import java.lang.Throwable;
import u3.r;
import androidx.work.ListenableWorker$a$b;
import java.util.concurrent.Future;
import androidx.work.ListenableWorker;
import java.util.LinkedList;
import androidx.work.WorkInfo$State;
import java.util.Collection;
import androidx.room.RoomDatabase;
import u3.p;
import l3.e;
import k3.a;
import l3.f;
import java.lang.System;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import android.content.Context;
import java.lang.Class;
import v3.e;
import t3.a;
import java.lang.Boolean;
import k3.g;
import k3.f;
import java.util.ArrayList;
import androidx.work.a;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import k3.n;
import v3.o;
import x3.a;
import v3.n;
import androidx.work.WorkerParameters$a;
import k3.j;
import k3.e;
import l3.j$a;
import l3.j$b;
import v3.i;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.ListenableWorker$a$a;

public class j implements Runnable	// class@00250c
{
    public Context b;
    public String c;
    public List d;
    public WorkerParameters$a e;
    public r f;
    public ListenableWorker g;
    public ListenableWorker$a h;
    public a i;
    public a j;
    public a k;
    public WorkDatabase l;
    public s m;
    public b n;
    public v o;
    public List p;
    public String q;
    public a r;
    public d s;
    public boolean t;
    public static final String u;

    static {
       j.u = h.f("WorkerWrapper");
    }
    public void j(j$c p0){
       super();
       this.h = ListenableWorker$a.a();
       this.r = a.N();
       this.s = null;
       this.b = p0.a;
       this.j = p0.d;
       this.k = p0.c;
       this.c = p0.g;
       this.d = p0.h;
       this.e = p0.i;
       this.g = p0.b;
       this.i = p0.e;
       p0 = p0.f;
       this.l = p0;
       this.m = p0.O();
       this.n = this.l.F();
       this.o = this.l.P();
    }
    public final String a(List p0){
       StringBuilder str = "Work [ id="+this.c+", tags={ ";
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (i) {
             i = 0;
          }else {
             str = str+", ";
          }
          str = str+str1;
       }
       return str+" } ]";
    }
    public d b(){
       return this.r;
    }
    public final void c(ListenableWorker$a p0){
       Object[] objArray;
       Throwable[] throwableArr;
       int i = 1;
       int i1 = 0;
       if (p0 instanceof ListenableWorker$a$c) {
          objArray = new Object[i];
          objArray[i1] = this.q;
          throwableArr = new Throwable[i1];
          h.c().d(j.u, String.format("Worker result SUCCESS for %s", objArray), throwableArr);
          if (this.f.d()) {
             this.h();
          }else {
             this.m();
          }
       }else if(p0 instanceof ListenableWorker$a$b){
          objArray = new Object[i];
          objArray[i1] = this.q;
          throwableArr = new Throwable[i1];
          h.c().d(j.u, String.format("Worker result RETRY for %s", objArray), throwableArr);
          this.g();
       }else {
          objArray = new Object[i];
          objArray[i1] = this.q;
          throwableArr = new Throwable[i1];
          h.c().d(j.u, String.format("Worker result FAILURE for %s", objArray), throwableArr);
          if (this.f.d()) {
             this.h();
          }else {
             this.l();
          }
       }
       return;
    }
    public void d(){
       boolean b1;
       boolean b = true;
       this.t = b;
       this.n();
       j ts = this.s;
       int i = 0;
       if (ts != null) {
          b1 = ts.isDone();
          this.s.cancel(b);
       }else {
          b1 = false;
       }
       j tg = this.g;
       if (tg != null && !b1) {
          tg.stop();
       }else {
          Object[] objArray = new Object[b];
          objArray[i] = this.f;
          Throwable[] throwableArr = new Throwable[i];
          h.c().a(j.u, String.format("WorkSpec %s is already done. Not interrupting.", objArray), throwableArr);
       }
       return;
    }
    public final void e(String p0){
       LinkedList linkedList = new LinkedList();
       linkedList.add(p0);
       while (!linkedList.isEmpty()) {
          p0 = linkedList.remove();
          if (this.m.c(p0) != WorkInfo$State.CANCELLED) {
             String[] stringArray = new String[]{p0};
             this.m.a(WorkInfo$State.FAILED, stringArray);
          }
          linkedList.addAll(this.n.a(p0));
       }
       return;
    }
    public void f(){
       if (!this.n()) {
          this.l.e();
          WorkInfo$State state = this.m.c(this.c);
          this.l.N().b(this.c);
          if (state == null) {
             this.i(false);
          }else if(state == WorkInfo$State.RUNNING){
             this.c(this.h);
          }else if(!state.isFinished()){
             this.g();
          }
          this.l.C();
          this.l.k();
       }
       j td = this.d;
       if (td != null) {
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             iterator.next().cancel(this.c);
          }
          f.b(this.i, this.l, this.d);
       }
       return;
    }
    public final void g(){
       this.l.e();
       String[] stringArray = new String[]{this.c};
       this.m.a(WorkInfo$State.ENQUEUED, stringArray);
       this.m.x(this.c, System.currentTimeMillis());
       this.m.l(this.c, -1);
       this.l.C();
       this.l.k();
       this.i(1);
    }
    public final void h(){
       this.l.e();
       this.m.x(this.c, System.currentTimeMillis());
       String[] stringArray = new String[]{this.c};
       this.m.a(WorkInfo$State.ENQUEUED, stringArray);
       this.m.h(this.c);
       this.m.l(this.c, -1);
       this.l.C();
       this.l.k();
       this.i(0);
    }
    public final void i(boolean p0){
       this.l.e();
       List list = this.l.O().g();
       boolean b = false;
       j oj = (list == null || list.isEmpty())? 1: null;
       if (oj) {
          e.a(this.b, RescheduleReceiver.class, b);
       }
       if (p0) {
          this.m.l(this.c, -1);
       }
       if (this.f != null) {
          oj = this.g;
          if (oj != null && oj.isRunInForeground()) {
             this.k.b(this.c);
          }
       }
       this.l.C();
       this.l.k();
       this.r.J(Boolean.valueOf(p0));
       return;
    }
    public final void j(){
       WorkInfo$State state = this.m.c(this.c);
       int i = 1;
       int i1 = 0;
       if (state == WorkInfo$State.RUNNING) {
          Object[] objArray = new Object[i];
          objArray[i1] = this.c;
          Throwable[] throwableArr = new Throwable[i1];
          h.c().a(j.u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", objArray), throwableArr);
          this.i(i);
       }else {
          Object[] objArray1 = new Object[]{this.c,state};
          Throwable[] throwableArr1 = new Throwable[i1];
          h.c().a(j.u, String.format("Status for %s is %s; not doing any work", objArray1), throwableArr1);
          this.i(i1);
       }
       return;
    }
    public final void k(){
       Object[] objArray;
       Throwable[] throwableArr1;
       j f;
       j j;
       Throwable[] throwableArr2;
       a uoa;
       j oj = this;
       if (this.n()) {
          return;
       }
       oj.l.e();
       r or = oj.m.j(oj.c);
       oj.f = or;
       int i = 1;
       int i1 = 0;
       if (or == null) {
          objArray = new Object[i];
          objArray[i1] = oj.c;
          Throwable[] throwableArr = new Throwable[i1];
          h.c().b(j.u, String.format("Didn\'t find WorkSpec for id %s", objArray), throwableArr);
          oj.i(i1);
          oj.l.k();
          return;
       }else if(or.b != WorkInfo$State.ENQUEUED){
          this.j();
          oj.l.C();
          objArray = new Object[i];
          objArray[i1] = oj.f.c;
          throwableArr1 = new Throwable[i1];
          h.c().a(j.u, String.format("%s is not in ENQUEUED state. Nothing more to do.", objArray), throwableArr1);
          oj.l.k();
          return;
       }else if(or.d() || oj.f.c()){
          long l = System.currentTimeMillis();
          f = oj.f;
          long l1 = (!f.n - null)? 1: 0;
          if (!l1 && l - f.a() < 0) {
             Object[] objArray1 = new Object[i];
             objArray1[i1] = oj.f.c;
             throwableArr1 = new Throwable[i1];
             h.c().a(j.u, String.format("Delaying execution for %s because it is being executed before schedule.", objArray1), throwableArr1);
             oj.i(i);
             oj.l.k();
             return;
          }
       }
    label_00b4 :
       oj.l.C();
       oj.l.k();
       if (oj.f.d()) {
          or = oj.f.e;
       }else {
          f uof = oj.i.c().b(oj.f.d);
          if (uof == null) {
             objArray = new Object[i];
             objArray[i1] = oj.f.d;
             throwableArr1 = new Throwable[i1];
             h.c().b(j.u, String.format("Could not create Input Merger %s", objArray), throwableArr1);
             this.l();
             return;
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(oj.f.e);
             uArrayList.addAll(oj.m.d(oj.c));
             uoa = uof.b(uArrayList);
          }
       }
       r or1 = or;
       j l2 = oj.l;
       j = oj.j;
       o oo = new o(l2, j);
       n on = new n(l2, oj.k, j);
       WorkerParameters workerParame = new WorkerParameters(UUID.fromString(oj.c), or1, oj.p, oj.e, oj.f.k, oj.i.b(), oj.j, oj.i.j(), oo, on);
       if (oj.g == null) {
          oj.g = oj.i.j().b(oj.b, oj.f.c, or);
       }
       f = oj.g;
       if (f == null) {
          objArray = new Object[i];
          objArray[0] = oj.f.c;
          throwableArr2 = new Throwable[0];
          h.c().b(j.u, String.format("Could not create Worker %s", objArray), throwableArr2);
          this.l();
          return;
       }else if(f.isUsed()){
          objArray = new Object[i];
          objArray[0] = oj.f.c;
          throwableArr2 = new Throwable[0];
          h.c().b(j.u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", objArray), throwableArr2);
          this.l();
          return;
       }else {
          oj.g.setUsed();
          if (this.o()) {
             if (this.n()) {
                return;
             }else {
                uoa = a.N();
                oj.j.c().execute(new j$a(oj, uoa));
                uoa.u(new j$b(oj, uoa, oj.q), oj.j.b());
             }
          }else {
             this.j();
          }
          return;
       }
    }
    public void l(){
       this.l.e();
       this.e(this.c);
       this.m.m(this.c, this.h.e());
       this.l.C();
       this.l.k();
       this.i(false);
    }
    public final void m(){
       this.l.e();
       String[] stringArray = new String[]{this.c};
       this.m.a(WorkInfo$State.SUCCEEDED, stringArray);
       this.m.m(this.c, this.h.e());
       long l = System.currentTimeMillis();
       Iterator iterator = this.n.a(this.c).iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.m.c(str) == WorkInfo$State.BLOCKED && this.n.b(str)) {
             Object[] objArray = new Object[]{str};
             Throwable[] throwableArr = new Throwable[0];
             h.c().d(j.u, String.format("Setting status to enqueued for %s", objArray), throwableArr);
             String[] stringArray1 = new String[]{str};
             this.m.a(WorkInfo$State.ENQUEUED, stringArray1);
             this.m.x(str, l);
          }
       }
       this.l.C();
       this.l.k();
       this.i(0);
       return;
    }
    public final boolean n(){
       if (this.t == null) {
          return 0;
       }
       Object[] objArray = new Object[]{this.q};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(j.u, String.format("Work interrupted for %s", objArray), throwableArr);
       WorkInfo$State state = this.m.c(this.c);
       if (state == null) {
          this.i(0);
       }else {
          this.i((state.isFinished() ^ 1));
       }
       return 1;
    }
    public final boolean o(){
       this.l.e();
       int i = 1;
       if (this.m.c(this.c) == WorkInfo$State.ENQUEUED) {
          String[] stringArray = new String[i];
          stringArray[0] = this.c;
          this.m.a(WorkInfo$State.RUNNING, stringArray);
          this.m.E(this.c);
       }else {
          i = false;
       }
       this.l.C();
       this.l.k();
       return i;
    }
    public void run(){
       List list = this.o.a(this.c);
       this.p = list;
       this.q = this.a(list);
       this.k();
    }
}
