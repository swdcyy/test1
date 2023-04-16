package vq.d;
import vq.a;
import android.content.Context;
import tq.f;
import com.kuaishou.android.vader.Channel;
import tq.d;
import er.j;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import er.i;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Enum;
import java.util.concurrent.ScheduledExecutorService;
import xq.c;
import java.lang.Object;
import wq.a;
import vq.e;
import vq.c;
import vq.d$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import er.k;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.vader.config.LogPolicy;
import java.util.List;
import er.l;
import java.util.Collection;
import wq.b;
import com.kuaishou.android.vader.persistent.DBAction;
import com.kuaishou.android.vader.persistent.DBAction$Type;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Math;
import er.g;
import java.lang.Long;
import vq.d$c;
import vq.d$b;
import java.lang.Boolean;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.Number;
import wq.d;
import vq.b;

public class d extends a	// class@0026d7
{
    public final int m;
    public final i n;
    public final Object o;
    public final a p;
    public final a q;
    public ScheduledFuture r;
    public final c s;
    public final a t;
    public final e u;
    public boolean v;
    public b w;
    public boolean x;
    public boolean y;

    public void d(Context p0,f p1,Channel p2,d p3,j p4,a p5,c p6,i p7){
       a uoa = this;
       a uoa1 = p5;
       super(p2, p3, p4, "NORMAL", c.b("LogChannel_"+p2.name()), p7);
       uoa.o = super();
       uoa.t = uoa1;
       uoa.p = a.m(2000);
       uoa.q = a.m(50);
       uoa.u = new e(p3, uoa1);
       c uoc = new c(p0, p2, p1);
       uoa.s = uoc;
       uoa.n = p7;
       uoa.r = uoa.e.schedule(new d$a(this), 0, TimeUnit.MILLISECONDS);
       if (!uoc.b()) {
          uoa.m = 0;
       }else {
          uoc.a();
          uoa.m = p6.c(p2);
       }
       return;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d to = this.o;
       _monitor_enter(to);
       if (this.r.isDone()) {
          this.l(0);
       }else if(this.r.cancel(false) && this.r.getDelay(TimeUnit.MILLISECONDS) > 0){
          this.l(0);
       }
       _monitor_exit(to);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d to = this.o;
       _monitor_enter(to);
       if (this.r.isDone()) {
          this.k(0);
       }else if(this.r.cancel(false) && this.r.getDelay(TimeUnit.MILLISECONDS) > 0){
          this.k(0);
       }
       _monitor_exit(to);
       return;
    }
    public k c(){
       Object obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.a(false);
    }
    public void e(LogPolicy p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       boolean b = true;
       this.x = b;
       if (p0 != LogPolicy.DISCARD) {
          b = false;
       }
       this.y = b;
       this.s.c();
       return;
    }
    public void f(List p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "9")) {
          return;
       }
       if (p1.d()) {
          d to = this.o;
          _monitor_enter(to);
          p0.size();
          this.p.removeAll(p0);
          _monitor_exit(to);
          this.t.a(new DBAction(p0, DBAction$Type.Delete));
          if (p1.b() == LogPolicy.NORMAL) {
             this.z();
          }
       }
       return;
    }
    public void g(List p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "10")) {
          return;
       }
       d to = this.o;
       _monitor_enter(to);
       p0.size();
       this.q.removeAll(p0);
       _monitor_exit(to);
       if (p1.d()) {
          this.t.a(new DBAction(p0, DBAction$Type.Delete));
          if (p1.b() == LogPolicy.NORMAL) {
             this.z();
          }
       }
       return;
    }
    public List h(){
       ArrayList obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next());
       }
       return obj;
    }
    public List i(){
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       _monitor_enter(obj);
       this.p.size();
       ArrayList uArrayList = new ArrayList(Math.min(500, this.p.size()));
       this.v(uArrayList);
       _monitor_exit(obj);
       this.v = this.u.a(uArrayList, this.x());
       return uArrayList;
    }
    public void k(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "12")) {
          return;
       }
       uod = this.o;
       _monitor_enter(uod);
       if (this.x != null) {
          _monitor_exit(uod);
          return;
       }else {
          this.r = this.e.schedule(new d$c(this), p0, TimeUnit.MILLISECONDS);
          _monitor_exit(uod);
          return;
       }
    }
    public void l(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "11")) {
          return;
       }
       uod = this.o;
       _monitor_enter(uod);
       if (this.x != null) {
          _monitor_exit(uod);
          return;
       }else {
          this.r = this.e.schedule(new d$b(this), p0, TimeUnit.MILLISECONDS);
          _monitor_exit(uod);
          return;
       }
    }
    public boolean m(){
       d obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       _monitor_enter(obj);
       boolean b = (!this.p.size() && this.v != null)? true: false;
       _monitor_exit(obj);
       return b;
    }
    public boolean r(){
       return this.y;
    }
    public boolean s(){
       return this.x;
    }
    public void t(LogRecord p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (this.y != null) {
          return;
       }
       d to = this.o;
       _monitor_enter(to);
       this.q.add(p0);
       this.B();
       _monitor_exit(to);
       return;
    }
    public void u(LogRecord p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.y != null) {
          return;
       }
       d to = this.o;
       _monitor_enter(to);
       this.p.add(p0);
       if (this.r.isDone()) {
          this.l(this.h);
       }
       _monitor_exit(to);
       return;
    }
    public final void v(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       int i = 0;
       int i1 = Math.max(i, (this.p.size() - 500));
       Iterator iterator = this.p.iterator();
       for (; i < i1; i = i + 1) {
          iterator.next();
       }
       while (iterator.hasNext()) {
          p0.add(iterator.next());
       }
       return;
    }
    public final int w(){
       d obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o;
       _monitor_enter(obj);
       LogRecord logRecord = this.p.peek();
       int i = (logRecord == null)? Integer.MAX_VALUE: logRecord.channelSeqId();
       _monitor_exit(obj);
       return i;
    }
    public final g x(){
       Object obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b(this.f, (this.m + 1), this.w());
    }
    public a y(){
       return this.p;
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, d.class, "14")) {
          return;
       }
       if (this.w == null && this.m > null) {
          b uob = new b(this.f, this.d, this.c, this.t, this.e, this.m, this.n);
          this.w = v0;
          v0.n();
       }
       return;
    }
}
