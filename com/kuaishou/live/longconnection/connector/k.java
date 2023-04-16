package com.kuaishou.live.longconnection.connector.k;
import java.util.Random;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.os.Handler;
import android.os.Looper;
import lf3.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import if3.t;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import java.lang.Class;
import lf3.g;
import lf3.h;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import w00.a;
import w00.d;
import nf3.a;
import y00.a;
import v00.g;
import x00.a;
import java.util.Map;
import com.kuaishou.live.longconnection.connector.k$b;
import z00.a;
import java.util.Map$Entry;
import com.kuaishou.live.longconnection.connector.k$a;
import java.lang.StringBuilder;
import mf3.b;
import if3.y;
import java.lang.Runnable;
import pf3.a;
import pf3.c;
import com.kwai.robust.PatchProxyResult;
import lf3.a;
import com.kuaishou.live.longconnection.connector.l;
import com.kuaishou.live.longconnection.connector.RunnablePipeline;
import java.lang.Boolean;
import java.util.List;
import if3.u;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import java.util.Objects;
import nf3.f;
import brd.t;
import nf3.e;
import io.reactivex.g;
import com.kuaishou.live.longconnection.connector.h;
import erd.g;
import crd.b;
import java.lang.Long;
import w00.a$d;

public class k	// class@000c73
{
    public long a;
    public long b;
    public long c;
    public int d;
    public Map e;
    public Map f;
    public l g;
    public int h;
    public d i;
    public a j;
    public RunnablePipeline k;
    public Handler l;
    public l$c m;
    public g n;
    public Map o;
    public Map p;
    public e q;
    public List r;
    public f s;
    public boolean t;
    public boolean u;
    public c v;
    public final ConcurrentLinkedQueue w;
    public final k x;
    public static Random y;
    public static int z;

    static {
       k.y = new Random();
       k.z = 0;
    }
    public void k(){
       super();
       this.a = 5000;
       this.b = 5000;
       this.c = 0xea60;
       this.e = new ConcurrentHashMap();
       this.f = new ConcurrentHashMap();
       this.l = new Handler(Looper.getMainLooper());
       this.o = new ConcurrentHashMap();
       this.p = new ConcurrentHashMap();
       this.q = new e();
       this.u = false;
       this.w = new ConcurrentLinkedQueue();
       t ot = new t(this);
       this.x = ot;
       this.o(300, LiveStreamMessages$SCEnterRoomAck.class, ot);
       int z = k.z;
       k.z = z + 1;
       this.d = z;
    }
    public synchronized final void a(int p0,h p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ok, "21")) {
          return;
       }
       ok = this.i;
       if (ok == null || ok.a() == null) {
          return;
       }
       g.b(p0, new a(p1.a));
       a uoa = this.i.a().q();
       if (!uoa.a.containsKey(Integer.valueOf(p0))) {
          uoa.a(p0, new k$b(this, this, p0));
       }
       return;
    }
    public final void b(Map$Entry p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "20")) {
          return;
       }
       this.a(p0.getKey().intValue(), p0.getValue());
       return;
    }
    public synchronized void c(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "23")) {
          return;
       }
       Object[] objArray = new Object[]{p0.b.getClass().getSimpleName()+", mIsFromCache: "+p0.c+", mIsInCachePeriod: "+p0.d+", mCacheMessageDispatching: "+this.u};
       b.a(this.g(), "executeMessageTask", objArray);
       h oh = this.o.get(Integer.valueOf(p0.a));
       if (oh != null && !this.l(Integer.valueOf(p0.a))) {
          String simpleName = p0.b.getClass().getSimpleName();
          long l = a.a(simpleName, new y(oh, p0));
          k tv = this.v;
          if (tv != null) {
             tv.a(simpleName, l);
          }
       }
       return;
    }
    public d d(){
       return this.i;
    }
    public long e(){
       return this.c;
    }
    public int f(){
       return this.h;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, k.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LongConnectionContext-index-"+this.d;
    }
    public a h(){
       return this.j;
    }
    public l i(){
       return this.g;
    }
    public RunnablePipeline j(){
       return this.k;
    }
    public Handler k(){
       return this.l;
    }
    public boolean l(Integer p0){
       k obj = PatchProxy.applyOneRefs(p0, this, k.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.r;
       boolean b = (obj != null && obj.contains(p0))? true: false;
       return b;
    }
    public synchronized void m(){
       long l;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "22")) {
          return;
       }
       k$a uoa = this.w.poll();
       if (uoa != null) {
          this.c(uoa);
       }
       if (!this.w.isEmpty()) {
          Handler handler = this.k();
          u ou = new u(this);
          Object obj = PatchProxy.apply(objArray, this, ok, "25");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else if(this.g.e() > 0){
             l = this.g.e();
          }else {
             l = 0;
          }
          handler.postDelayed(ou, l);
       }else {
          this.u = false;
       }
       return;
    }
    public synchronized final void n(){
       if (PatchProxy.applyVoid(null, this, k.class, "19")) {
          return;
       }
       k ti = this.i;
       if (ti == null || ti.a() == null) {
          return;
       }
       Iterator iterator = this.o.entrySet().iterator();
       while (iterator.hasNext()) {
          this.b(iterator.next());
       }
       iterator = this.p.entrySet().iterator();
       while (iterator.hasNext()) {
          this.b(iterator.next());
       }
       return;
    }
    public void o(int p0,Class p1,g p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, k.class, "1")) {
          return;
       }
       this.p(p0, p1, p2, true);
       return;
    }
    public void p(int p0,Class p1,g p2,boolean p3){
       boolean b;
       t ot;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, k.class, "2")) {
          return;
       }
       k to = (p3)? this.o: this.p;
       h oh = to.get(Integer.valueOf(p0));
       if (oh == null) {
          oh = new h(p1);
          to.put(Integer.valueOf(p0), oh);
          k tg = this.g;
          if (tg != null && tg.N != null) {
             this.a(p0, oh);
          }else {
             this.n();
          }
       }
       oh.c(p2);
       if (!PatchProxy.applyVoidOneRefs(p2, oh, h.class, "2")) {
          oh.b.add(p2);
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p2, Boolean.valueOf(p3), this, k.class, "29")) {
          Object obj = PatchProxy.apply(null, this, ok, "30");
          int i = 0;
          int i1 = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             ok = this.g;
             b = (ok != null && ok.M != null)? true: false;
          }
          if (!b || (p2 == null || (this.t == null || (this.s != null && p2.V())))) {
             Object[] objArray = new Object[i1];
             objArray[i] = Integer.valueOf(p0);
             b.a(this.g(), "dispatchStickyMessagesImmediately", objArray);
             ok = this.s;
             Objects.requireNonNull(ok);
             f uof = f.class;
             if (PatchProxy.isSupport(uof)) {
                ot = PatchProxy.applyOneRefs(Integer.valueOf(p0), ok, uof, "5");
                if (ot != patchProxyRe) {
                label_00e3 :
                   ot.subscribe(new h(this, p0, p3, p2));
                }
             }
             ot = t.create(new e(ok, p0));
             goto label_00e3 ;
          }
       }
    label_00eb :
       return;
    }
    public synchronized void q(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "14")) {
          return;
       }
       k ti = this.i;
       if (ti != null && p0 == null) {
          ti.close();
          this.i = null;
       }
       this.i = p0;
       this.w();
       this.n();
       return;
    }
    public void r(int p0){
       this.h = p0;
    }
    public void s(int p0,long p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, ok, "9")) {
          return;
       }
       this.e.put(Integer.valueOf(p0), Long.valueOf(p1));
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, k.class, "18")) {
          return;
       }
       this.k.c(this.n);
       return;
    }
    public void u(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "15")) {
          return;
       }
       this.j().a(p0);
       return;
    }
    public void v(int p0,g p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ok, "5")) {
          return;
       }
       h oh = this.o.get(Integer.valueOf(p0));
       if (oh != null) {
          oh.c(p1);
       }
       h oh1 = this.p.get(Integer.valueOf(p0));
       if (oh1 != null) {
          oh1.c(p1);
       }
       return;
    }
    public final void w(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "28")) {
          return;
       }
       k ts = this.s;
       if (ts != null) {
          ts.b();
          this.s = objArray;
       }
       ts = this.i;
       a uoa = (ts != null)? ts.a(): objArray;
       if (uoa == null) {
          return;
       }else if(this.t != null){
          f uof = new f(uoa);
          this.s = uof;
          uof.d(this.t);
          uoa.s(this.s);
       }else {
          uoa.s(objArray);
       }
       return;
    }
}
