package tc.u;
import tc.l;
import tc.v;
import ta.a;
import tc.b0;
import tc.v$a;
import ab.h;
import tc.l$b;
import tc.k$a;
import java.lang.Object;
import java.util.WeakHashMap;
import tc.k;
import ab.e;
import tc.w;
import android.os.SystemClock;
import tc.l$a;
import tc.u$a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.String;
import ab.d$b;
import ab.d$a;
import com.facebook.common.references.a;
import java.lang.Math;
import java.util.Map;
import ab.f;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Iterator;
import tc.u$b;
import fb.c;
import java.util.Set;
import java.lang.IllegalStateException;
import java.lang.Integer;

public class u implements l, v, a	// class@0024c9
{
    public final l$b a;
    public final k b;
    public final k c;
    public final Map d;
    public final b0 e;
    public final v$a f;
    public final h g;
    public w h;
    public long i;
    public final boolean j;

    public void u(b0 p0,v$a p1,h p2,l$b p3,boolean p4,k$a p5){
       super();
       this.d = new WeakHashMap();
       this.e = p0;
       k ok = new k(this.A(p0));
       ok.d = p5;
       this.b = ok;
       this.c = new k(this.A(p0));
       this.f = p1;
       this.g = p2;
       p0 = p2.get();
       e.e(p0, "mMemoryCacheParamsSupplier returned null");
       this.h = p0;
       this.i = SystemClock.uptimeMillis();
       this.a = p3;
       this.j = p4;
    }
    public static void v(l$a p0){
       if (p0 != null) {
          l$a e = p0.e;
          if (e != null) {
             e.a(p0.a, false);
          }
       }
       return;
    }
    public final b0 A(b0 p0){
       return new u$a(this, p0);
    }
    public k b(){
       return this.c;
    }
    public synchronized int c(){
       return this.b.d();
    }
    public void clear(){
       _monitor_enter(this);
       ArrayList uArrayList = this.c.a();
       this.s(uArrayList);
       _monitor_exit(this);
       this.t(uArrayList);
       this.u(this.b.a());
       this.w();
    }
    public synchronized boolean contains(Object p0){
       u tc = this.c;
       _monitor_enter(tc);
       _monitor_exit(tc);
       return tc.b.containsKey(p0);
    }
    public synchronized String d(){
       d$b uob = new d$b("CountingMemoryCache", null);
       uob.a("cached_entries_count", this.c.b());
       uob.a("cached_entries_size_bytes", this.c.d());
       uob.a("exclusive_entries_count", this.b.b());
       uob.a("exclusive_entries_size_bytes", this.b.d());
       return uob.toString();
    }
    public a e(Object p0){
       e.d(p0);
       _monitor_enter(this);
       l$a uoa = this.b.g(p0);
       int i = 1;
       boolean b = false;
       if (uoa != null) {
          p0 = this.c.g(p0);
          e.d(p0);
          if (p0.c == null) {
             b = true;
          }
          e.f(b);
          p0 = p0.b;
       }else {
          p0 = null;
          i = 0;
       }
       _monitor_exit(this);
       if (i) {
          u.v(uoa);
       }
       return p0;
    }
    public void f(){
       _monitor_enter(this);
       u th = this.h;
       u th1 = this.h;
       ArrayList uArrayList = this.z(Math.min(th.d, (th.b - this.q())), Math.min(th1.c, (th1.a - this.l())));
       this.s(uArrayList);
       _monitor_exit(this);
       this.t(uArrayList);
       this.u(uArrayList);
    }
    public Map g(){
       return this.d;
    }
    public a get(Object p0){
       e.d(p0);
       _monitor_enter(this);
       l$a uoa = this.b.g(p0);
       u tc = this.c;
       _monitor_enter(tc);
       p0 = tc.b.get(p0);
       _monitor_exit(tc);
       p0 = (p0 != null)? this.x(p0): null;
       _monitor_exit(this);
       u.v(uoa);
       this.w();
       this.f();
       return p0;
    }
    public synchronized int getCount(){
       return this.c.b();
    }
    public synchronized int getSizeInBytes(){
       return this.c.d();
    }
    public a h(Object p0,a p1,l$b p2){
       a uoa3;
       e.d(p0);
       e.d(p1);
       this.w();
       _monitor_enter(this);
       l$a uoa = this.b.g(p0);
       l$a uoa1 = this.c.g(p0);
       l$a uoa2 = null;
       if (uoa1 != null) {
          this.r(uoa1);
          uoa3 = this.y(uoa1);
       }else {
          uoa1 = uoa2;
       }
       _monitor_enter(this);
       int i = this.e.a(p1.j());
       int i1 = 1;
       if (i > this.h.e || (this.q() > (this.h.b - i1) || this.l() > (this.h.a - i))) {
          i1 = 0;
       }
       _monitor_exit(this);
       if (i1) {
          uoa2 = new l$a(p0, p1, p2);
          if (this.j != null) {
             uoa2.f = this.e.a(p1.j());
          }
          this.c.f(p0, uoa2);
          uoa2 = this.x(uoa2);
       }
       _monitor_exit(this);
       a.f(uoa3);
       u.v(uoa);
       this.f();
       return uoa2;
    }
    public void i(Object p0){
       e.d(p0);
       _monitor_enter(this);
       l$a uoa = this.b.g(p0);
       if (uoa != null) {
          this.b.f(p0, uoa);
       }
       _monitor_exit(this);
       return;
    }
    public a j(Object p0,a p1){
       return this.h(p0, p1, this.a);
    }
    public w k(){
       return this.h;
    }
    public synchronized int l(){
       return (this.c.d() - this.b.d());
    }
    public synchronized boolean m(f p0){
       return (this.c.c(p0).isEmpty() ^ 0x01);
    }
    public synchronized int n(){
       return this.b.b();
    }
    public void o(MemoryTrimType p0){
       _monitor_enter(this);
       ArrayList uArrayList = this.z(Integer.MAX_VALUE, Math.max(0, ((int)((double)this.c.d() * (0x3ff0000000000000 - this.f.a(p0))) - this.l())));
       this.s(uArrayList);
       _monitor_exit(this);
       this.t(uArrayList);
       this.u(uArrayList);
       this.w();
       this.f();
    }
    public int p(f p0){
       _monitor_enter(this);
       ArrayList uArrayList = this.c.h(p0);
       this.s(uArrayList);
       _monitor_exit(this);
       this.t(uArrayList);
       this.u(this.b.h(p0));
       this.w();
       this.f();
       return uArrayList.size();
    }
    public synchronized int q(){
       return (this.c.b() - this.b.b());
    }
    public synchronized final void r(l$a p0){
       e.d(p0);
       boolean b = (p0.d == null)? true: false;
       e.f(b);
       p0.d = true;
       return;
    }
    public synchronized final void s(ArrayList p0){
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             this.r(iterator.next());
          }
       }
       return;
    }
    public final void t(ArrayList p0){
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             a.f(this.y(iterator.next()));
          }
       }
       return;
    }
    public final void u(ArrayList p0){
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             u.v(iterator.next());
          }
       }
       return;
    }
    public synchronized final void w(){
       if ((this.i + this.h.f) - SystemClock.uptimeMillis() > 0) {
          return;
       }
       this.i = SystemClock.uptimeMillis();
       Object obj = this.g.get();
       e.e(obj, "mMemoryCacheParamsSupplier returned null");
       this.h = obj;
       return;
    }
    public synchronized final a x(l$a p0){
       e.d(p0);
       int i = 1;
       boolean b = (p0.d == null)? true: false;
       e.f(b);
       p0.c = p0.c + i;
       return a.p(p0.b.j(), new u$b(this, p0));
    }
    public synchronized final a y(l$a p0){
       a uoa;
       e.d(p0);
       p0 = (p0.d != null && p0.c == null)? p0.b: null;
       return p0;
    }
    public synchronized final ArrayList z(int p0,int p1){
       int i = 0;
       p0 = Math.max(p0, i);
       p1 = Math.max(p1, i);
       ArrayList uArrayList = null;
       if (this.b.b() <= p0 && this.b.d() <= p1) {
          return uArrayList;
       }
       ArrayList uArrayList1 = new ArrayList();
       while (true) {
          if (this.b.b() <= p0 && this.b.d() <= p1) {
             return uArrayList1;
          }
          u tb = this.b;
          _monitor_enter(tb);
          ArrayList uArrayList2 = (tb.b.isEmpty())? uArrayList: tb.b.keySet().iterator().next();
          _monitor_exit(tb);
          if (uArrayList2 != null) {
             this.b.g(uArrayList2);
             uArrayList1.add(this.c.g(uArrayList2));
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.b.b()),Integer.valueOf(this.b.d())};
       throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", objArray));
    }
}
