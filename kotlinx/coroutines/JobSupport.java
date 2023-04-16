package kotlinx.coroutines.JobSupport;
import ftd.z1;
import ftd.s;
import ftd.p2;
import otd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ftd.g2;
import ftd.k2;
import java.lang.Throwable;
import ltd.o;
import kotlin.jvm.internal.a;
import ftd.f2;
import ftd.b0;
import qrd.i;
import kotlinx.coroutines.CompletionHandlerException;
import java.lang.StringBuilder;
import qrd.l1;
import kotlin.TypeCastException;
import java.util.concurrent.CancellationException;
import java.lang.UnsupportedOperationException;
import kotlinx.coroutines.JobCancellationException;
import ftd.m2;
import ftd.q;
import ftd.c1;
import ftd.t1;
import kotlinx.coroutines.JobSupport$c;
import ftd.x;
import asd.c;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.t2;
import msd.l;
import ftd.k;
import ftd.n;
import csd.b;
import dsd.e;
import java.lang.Void;
import nsd.u;
import java.lang.IllegalStateException;
import ftd.f1;
import ftd.r;
import ftd.a2;
import ftd.x1;
import ftd.y1;
import ftd.o0;
import ftd.z1$a;
import ftd.s1;
import kotlinx.coroutines.JobSupport$d;
import ltd.o$c;
import otd.f;
import msd.p;
import mtd.b;
import ftd.x2;
import java.util.List;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Iterator;
import mtd.a;
import kotlinx.coroutines.JobSupport$a;
import ftd.s2;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import wsd.m;
import kotlinx.coroutines.JobSupport$children$1;
import wsd.q;
import kotlinx.coroutines.JobSupport$b;
import kotlin.coroutines.CoroutineContext;
import ftd.p3;
import java.lang.Iterable;
import kotlinx.coroutines.TimeoutCancellationException;
import ftd.y2;
import ltd.x;

public class JobSupport implements z1, s, p2, c	// class@001cdf
{
    public Object _parentHandle;
    public Object _state;
    public static final AtomicReferenceFieldUpdater b;

    static {
       JobSupport.b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    }
    public void JobSupport(boolean p0){
       super();
       f1 g = (p0)? g2.g: g2.f;
       this._state = g;
       this._parentHandle = null;
       return;
    }
    private final void Q0(k2 p0,Throwable p1){
       o oo = p0.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       Throwable throwable = null;
       int i = a.g(oo, p0) ^ 0x01;
       while (i) {
          a.y(3, "T");
          if (oo instanceof o) {
             oo.b0(p1);
          }
       label_0049 :
          oo = oo.M();
       }
       if (throwable != null) {
          this.A0(throwable);
       }
       return;
    }
    public static CancellationException d1(JobSupport p0,Throwable p1,String p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
       }
       if (p3 & 0x01) {
          p2 = null;
       }
       return p0.c1(p1, p2);
    }
    public static JobCancellationException m0(JobSupport p0,String p1,Throwable p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
       }
       if (p3 & 0x01) {
          p1 = null;
       }
       if (p3 & 0x02) {
          p2 = null;
       }
       if (p1 == null) {
          p1 = p0.g0();
       }
       return new JobCancellationException(p1, p2, p0);
    }
    public void A0(Throwable p0){
       throw p0;
    }
    public final void B0(z1 p0){
       if (p0 == null) {
          this.Z0(m2.b);
          return;
       }else {
          p0.start();
          q oq = p0.Q(this);
          this.Z0(oq);
          if (this.c()) {
             oq.dispose();
             this.Z0(m2.b);
          }
          return;
       }
    }
    public final boolean C0(t1 p0){
       boolean b = (p0 instanceof JobSupport$c && p0.f())? true: false;
       return b;
    }
    public final boolean D0(){
       return this.y0() instanceof x;
    }
    public boolean E(){
       Object obj = this.y0();
       boolean b = (obj instanceof t1 && obj.E())? true: false;
       return b;
    }
    public boolean E0(){
       return false;
    }
    public final boolean F0(){
       while (true) {
          Object obj = this.y0();
          if (!obj instanceof t1) {
             return false;
          }
          if (this.a1(obj) >= 0) {
             break ;
          }
       }
       return true;
    }
    public final Object G0(c p0){
       l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p0), 1);
       ol.u();
       n.a(ol, this.S(new t2(this, ol)));
       Object obj = ol.r();
       if (obj == b.h()) {
          e.c(p0);
       }
       return obj;
    }
    public final Void H0(l p0){
       while (true) {
          p0.invoke(this.y0());
       }
    }
    public final Object I0(Object p0){
       Throwable throwable = null;
       Throwable throwable1 = throwable;
       while (true) {
          Object obj = this.y0();
          if (obj instanceof JobSupport$c) {
             _monitor_enter(obj);
             if (obj.h()) {
                _monitor_exit(obj);
                return g2.d;
             }else {
                boolean b = obj.f();
                if (p0 != null || !b) {
                   if (throwable1 == null) {
                      throwable1 = this.k0(p0);
                   }
                   obj.a(throwable1);
                }
                p0 = obj.e();
                if (b ^ 0x01) {
                   throwable = p0;
                }
                _monitor_exit(obj);
                if (throwable != null) {
                   this.O0(obj.b(), throwable);
                   break ;
                }
                break ;
             }
          }else if(obj instanceof t1){
             if (throwable1 == null) {
                throwable1 = this.k0(p0);
             }
             Object obj1 = obj;
             if (obj1.E()) {
                if (this.g1(obj1, throwable1)) {
                   return g2.a;
                }
                continue ;
             }else {
                obj1 = this.h1(obj, new x(throwable1, false, 2, throwable));
                if (obj1 != g2.a) {
                   if (obj1 == g2.c) {
                      continue ;
                   }else {
                      return obj1;
                   }
                }else {
                   throw new IllegalStateException("Cannot happen in "+obj.toString());
                }
             }
          }else {
             return g2.d;
          }
       }
       return g2.a;
    }
    public final boolean J0(Object p0){
       Object obj;
       while (true) {
          obj = this.h1(this.y0(), p0);
          if (obj == g2.a) {
             return false;
          }
          if (obj == g2.b) {
             return true;
          }
          if (obj == g2.c) {
             continue ;
          }else {
             break ;
          }
       }
       this.Y(obj);
       return true;
    }
    public final void K(p2 p0){
       this.c0(p0);
    }
    public final Object K0(Object p0){
       Object obj;
       while (true) {
          obj = this.h1(this.y0(), p0);
          if (obj == g2.a) {
             throw new IllegalStateException("Job "+this+" is already complete or completing, "+"but is being completed with "+p0, this.s0(p0));
          }
          if (obj == g2.c) {
             continue ;
          }else {
             break ;
          }
       }
       return obj;
    }
    public final c1 L(boolean p0,boolean p1,l p2){
       k2 obj1;
       m2 b;
       Throwable throwable;
       x ox = null;
       f2 uof2 = ox;
       while (true) {
          Object obj = this.y0();
          if (obj instanceof f1) {
             obj1 = obj;
             if (obj1.E()) {
                if (uof2 == null) {
                   uof2 = this.L0(p2, p0);
                }
                if (JobSupport.b.compareAndSet(this, obj, uof2)) {
                   return uof2;
                }
                continue ;
             }else {
                this.U0(obj1);
             }
          }else if(obj instanceof t1){
             obj1 = obj.b();
             if (obj1 == null) {
                if (obj != null) {
                   this.V0(obj);
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
             }else {
                b = m2.b;
                if (p0 && obj instanceof JobSupport$c) {
                   _monitor_enter(obj);
                   throwable = obj.e();
                   if (throwable == null || (p2 instanceof r && !obj.g())) {
                      if (uof2 == null) {
                         uof2 = this.L0(p2, p0);
                      }
                      if (!this.W(obj, obj1, uof2)) {
                         _monitor_exit(obj);
                      }else if(throwable == null){
                         _monitor_exit(obj);
                         return uof2;
                      }else {
                         b = uof2;
                      }
                   }
                   _monitor_exit(obj);
                }else {
                   throwable = ox;
                }
                if (throwable != null) {
                   if (p1) {
                      p2.invoke(throwable);
                      break ;
                   }
                   break ;
                }else if(uof2 != null){
                   uof2 = this.L0(p2, p0);
                }
                if (this.W(obj, obj1, uof2)) {
                   return uof2;
                }
             }
          }else if(p1){
             if (!obj instanceof x) {
                obj = ox;
             }
             if (obj != null) {
                ox = obj.a;
             }
             p2.invoke(ox);
          }
          return m2.b;
       }
       return b;
    }
    public final f2 L0(l p0,boolean p1){
       f2 uof2 = null;
       if (p1) {
          if (p0 instanceof a2) {
             uof2 = p0;
          }
          if (!uof2) {
             uof2 = new x1(this, p0);
          }
       }else if(!p0 instanceof f2){
          uof2 = p0;
       }
       if (uof2 == null) {
          uof2 = new y1(this, p0);
       }
       return uof2;
    }
    public final Throwable M(){
       Object obj = this.y0();
       if (obj instanceof t1 ^ 0x01) {
          return this.s0(obj);
       }
       throw new IllegalStateException("This job has not completed yet".toString());
    }
    public String M0(){
       return o0.a(this);
    }
    public final r N0(o p0){
       while (p0.R()) {
          p0 = p0.O();
       }
       do {
          p0 = p0.M();
          if (p0.R()) {
             continue ;
          }else if(p0 instanceof r){
             return p0;
          }else {
          }
       } while (p0 instanceof k2);
       return null;
    }
    public final CancellationException O(){
       CancellationException uCancellatio;
       Throwable obj = this.y0();
       String str = "Job is still new or active: ";
       if (obj instanceof JobSupport$c) {
          obj = obj.e();
          if (obj != null) {
             uCancellatio = this.c1(obj, o0.a(this)+" is cancelling");
             if (uCancellatio == null) {
             }
          }else {
          }
       }else if(!obj instanceof t1){
          uCancellatio = (obj instanceof x)? JobSupport.d1(this, obj.a, null, 1, null): new JobCancellationException(o0.a(this)+" has completed normally", null, this);
       }else {
          throw new IllegalStateException(str+this.toString());
       }
       return uCancellatio;
    }
    public final void O0(k2 p0,Throwable p1){
       this.R0(p1);
       o oo = p0.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       Throwable throwable = null;
       int i = a.g(oo, p0) ^ 0x01;
       while (i) {
          if (oo instanceof a2) {
             oo.b0(p1);
          }
       label_0046 :
          oo = oo.M();
       }
       if (throwable != null) {
          this.A0(throwable);
       }
       this.f0(p1);
       return;
    }
    public CancellationException P(){
       Throwable throwable;
       Object obj = this.y0();
       CancellationException uCancellatio = null;
       if (obj instanceof JobSupport$c) {
          throwable = obj.e();
       }else if(obj instanceof x){
          throwable = obj.a;
       }else if(!obj instanceof t1){
          throwable = uCancellatio;
       }else {
          throw new IllegalStateException("Cannot be cancelling child in this state: "+obj.toString());
       }
       if (throwable instanceof CancellationException) {
          uCancellatio = throwable;
       }
       if (uCancellatio == null) {
          uCancellatio = new JobCancellationException("Parent job is "+this.b1(obj), throwable, this);
       }
       return uCancellatio;
    }
    public final void P0(k2 p0,Throwable p1){
       o oo = p0.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       Throwable throwable = null;
       int i = a.g(oo, p0) ^ 0x01;
       while (i) {
          if (oo instanceof f2) {
             oo.b0(p1);
          }
       label_0043 :
          oo = oo.M();
       }
       if (throwable != null) {
          this.A0(throwable);
       }
       return;
    }
    public final q Q(s p0){
       c1 uoc1 = z1$a.f(this, true, false, new r(this, p0), 2, null);
       if (uoc1 != null) {
          return uoc1;
       }
       throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }
    public void R0(Throwable p0){
    }
    public final c1 S(l p0){
       return this.L(false, true, p0);
    }
    public void S0(Object p0){
    }
    public void T0(){
    }
    public final void U0(f1 p0){
       k2 ok2 = new k2();
       if (p0.E()) {
       }else {
          ok2 = new s1(ok2);
       }
       JobSupport.b.compareAndSet(this, p0, ok2);
       return;
    }
    public final void V0(f2 p0){
       p0.z(new k2());
       JobSupport.b.compareAndSet(this, p0, p0.M());
    }
    public final boolean W(Object p0,k2 p1,f2 p2){
       JobSupport$d uod = new JobSupport$d(p2, p2, this, p0);
       int i = p1.O().Z(p2, p1, uod);
       boolean b = true;
       while (i != b) {
          if (i != 2) {
             continue ;
          }else {
             b = false;
             break ;
          }
       }
       return b;
    }
    public final void W0(f p0,p p1){
       while (true) {
          Object obj = this.y0();
          if (p0.isSelected()) {
             return;
          }
          if (!obj instanceof t1) {
             if (p0.j()) {
                if (obj instanceof x) {
                   p0.k(obj.a);
                   break ;
                }else {
                   b.d(p1, g2.i(obj), p0.r());
                   break ;
                }
             }
             break ;
          }else if(!this.a1(obj)){
             p0.o(this.S(new x2(this, p0, p1)));
             return;
          }
       }
       return;
    }
    public final void X(Throwable p0,List p1){
       if (p1.size() <= 1) {
          return;
       }
       Set set = Collections.newSetFromMap(new IdentityHashMap(p1.size()));
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Throwable throwable = iterator.next();
          if (throwable != p0 && (throwable != p0 && (!throwable instanceof CancellationException && set.add(throwable)))) {
             i.a(p0, throwable);
          }
       }
       return;
    }
    public final void X0(f2 p0){
       while (true) {
          Object obj = this.y0();
          if (obj instanceof f2) {
             if (obj != p0) {
                return;
             }else {
                if (JobSupport.b.compareAndSet(this, obj, g2.g)) {
                   return;
                }
                continue ;
             }
          }else if(obj instanceof t1 && obj.b() != null){
             p0.U();
             break ;
          }
          break ;
       }
       return;
    }
    public void Y(Object p0){
    }
    public final void Y0(f p0,p p1){
       Object obj = this.y0();
       if (obj instanceof x) {
          p0.k(obj.a);
       }else {
          a.d(p1, g2.i(obj), p0.r());
       }
       return;
    }
    public final Object Z(c p0){
       Object obj;
       while (true) {
          obj = this.y0();
          if (!obj instanceof t1) {
             if (obj instanceof x) {
                throw obj.a;
             }
             break ;
          }else {
             if (this.a1(obj) >= 0) {
                return this.a0(p0);
             }
             continue ;
          }
       }
       return g2.i(obj);
    }
    public final void Z0(q p0){
       this._parentHandle = p0;
    }
    public boolean a(Throwable p0){
       CancellationException uCancellatio;
       if (p0 != null) {
          uCancellatio = JobSupport.d1(this, p0, null, 1, null);
          if (uCancellatio != null) {
          label_0014 :
             this.d0(uCancellatio);
             return 1;
          }
       }
       uCancellatio = new JobCancellationException(this.g0(), null, this);
       goto label_0014 ;
    }
    public final Object a0(c p0){
       JobSupport$a uoa = new JobSupport$a(IntrinsicsKt__IntrinsicsJvmKt.d(p0), this);
       n.a(uoa, this.S(new s2(this, uoa)));
       Object obj = uoa.r();
       if (obj == b.h()) {
          e.c(p0);
       }
       return obj;
    }
    public final int a1(Object p0){
       int i = 0;
       if (p0 instanceof f1) {
          if (p0.E()) {
             return i;
          }
          if (!JobSupport.b.compareAndSet(this, p0, g2.g)) {
             return -1;
          }
          this.T0();
          return 1;
       }else if(p0 instanceof s1){
          if (!JobSupport.b.compareAndSet(this, p0, p0.b())) {
             return -1;
          }
          this.T0();
          return 1;
       }else {
          return i;
       }
    }
    public void b(CancellationException p0){
       if (p0 != null) {
       }else {
          JobCancellationException jobCancellat = new JobCancellationException(this.g0(), null, this);
       }
       this.d0(p0);
       return;
    }
    public final boolean b0(Throwable p0){
       return this.c0(p0);
    }
    public final String b1(Object p0){
       String str = "Active";
       if (p0 instanceof JobSupport$c) {
          if (p0.f()) {
             str = "Cancelling";
          }else if(p0.g()){
             str = "Completing";
          }
       }else if(p0 instanceof t1){
          if (!p0.E()) {
             str = "New";
          }
       }else if(p0 instanceof x){
          str = "Cancelled";
       }else {
          str = "Completed";
       }
       return str;
    }
    public final boolean c(){
       return (this.y0() instanceof t1 ^ 0x01);
    }
    public final boolean c0(Object p0){
       e0 uoe0;
       e0 a = g2.a;
       boolean b = true;
       if (this.v0()) {
          uoe0 = this.e0(p0);
          if (uoe0 == g2.b) {
             return b;
          }
       }else {
          uoe0 = a;
       }
       if (uoe0 == a) {
          uoe0 = this.I0(p0);
       }
       if (uoe0 != a && uoe0 != g2.b) {
          if (uoe0 == g2.d) {
             b = false;
          }else {
             this.Y(uoe0);
          }
       }
       return b;
    }
    public final CancellationException c1(Throwable p0,String p1){
       CancellationException uCancellatio = (!p0 instanceof CancellationException)? null: p0;
       if (!uCancellatio) {
          if (p1 == null) {
             p1 = this.g0();
          }
          uCancellatio = new JobCancellationException(p1, p0, this);
       }
       return uCancellatio;
    }
    public void cancel(){
       z1$a.a(this);
    }
    public void d0(Throwable p0){
       this.c0(p0);
    }
    public final Object e0(Object p0){
       Object obj;
       while (true) {
          obj = this.y0();
          if (!obj instanceof t1 || (obj instanceof JobSupport$c && obj.g())) {
             return g2.a;
          }
          obj = this.h1(obj, new x(this.k0(p0), false, 2, null));
          if (obj != g2.c) {
             break ;
          }
       }
       return obj;
    }
    public final String e1(){
       return this.M0()+'{'+this.b1(this.y0())+'}';
    }
    public final boolean f0(Throwable p0){
       boolean b = true;
       if (this.E0()) {
          return b;
       }
       boolean b1 = p0 instanceof CancellationException;
       q oq = this.x0();
       if (oq == null || oq == m2.b) {
          return b1;
       }
       if (!oq.l(p0) && !b1) {
          b = false;
       }
       return b;
    }
    public final boolean f1(t1 p0,Object p1){
       if (!JobSupport.b.compareAndSet(this, p0, g2.h(p1))) {
          return false;
       }
       this.R0(null);
       this.S0(p1);
       this.i0(p0, p1);
       return true;
    }
    public Object fold(Object p0,p p1){
       return z1$a.d(this, p0, p1);
    }
    public String g0(){
       return "Job was cancelled";
    }
    public final boolean g1(t1 p0,Throwable p1){
       k2 ok2 = this.w0(p0);
       if (ok2 == null) {
          return false;
       }
       if (!JobSupport.b.compareAndSet(this, p0, new JobSupport$c(ok2, false, p1))) {
          return false;
       }
       this.O0(ok2, p1);
       return true;
    }
    public CoroutineContext$a get(CoroutineContext$b p0){
       return z1$a.e(this, p0);
    }
    public final m getChildren(){
       return q.e(new JobSupport$children$1(this, null));
    }
    public final CoroutineContext$b getKey(){
       return z1.p0;
    }
    public boolean h0(Throwable p0){
       boolean b = true;
       if (p0 instanceof CancellationException) {
          return b;
       }
       if (!this.c0(p0) || !this.u0()) {
          b = false;
       }
       return b;
    }
    public final Object h1(Object p0,Object p1){
       if (!p0 instanceof t1) {
          return g2.a;
       }
       if (!p0 instanceof f1 && (!p0 instanceof f2 || (p0 instanceof r || p1 instanceof x))) {
          return this.i1(p0, p1);
       }
       if (this.f1(p0, p1)) {
          return p1;
       }
       return g2.c;
    }
    public final void i0(t1 p0,Object p1){
       q oq = this.x0();
       if (oq != null) {
          oq.dispose();
          this.Z0(m2.b);
       }
       x ox = null;
       if (!p1 instanceof x) {
          p1 = ox;
       }
       if (p1 != null) {
          ox = p1.a;
       }
       if (p0 instanceof f2) {
          p0.b0(ox);
       }else {
          k2 ok2 = p0.b();
          if (ok2 != null) {
             this.P0(ok2, ox);
          }
       }
       return;
    }
    public final Object i1(t1 p0,Object p1){
       k2 ok2 = this.w0(p0);
       if (ok2 == null) {
          return g2.c;
       }
       Throwable throwable = null;
       JobSupport$c uoc = (!p0 instanceof JobSupport$c)? throwable: p0;
       if (!uoc) {
          uoc = new JobSupport$c(ok2, false, throwable);
       }
       _monitor_enter(uoc);
       if (uoc.g()) {
          _monitor_exit(uoc);
          return g2.a;
       }else {
          boolean b = true;
          uoc.j(b);
          if (uoc != p0 && !JobSupport.b.compareAndSet(this, p0, uoc)) {
             _monitor_exit(uoc);
             return g2.c;
          }else {
             boolean b1 = uoc.f();
             x ox = (!p1 instanceof x)? throwable: p1;
             if (ox) {
                uoc.a(ox.a);
             }
             Throwable throwable1 = uoc.e();
             if (b ^ b1) {
                throwable = throwable1;
             }
             _monitor_exit(uoc);
             if (throwable != null) {
                this.O0(ok2, throwable);
             }
             r or = this.o0(p0);
             if (or != null && this.j1(uoc, or, p1)) {
                return g2.b;
             }else {
                return this.n0(uoc, p1);
             }
          }
       }
    }
    public final boolean isCancelled(){
       Object obj = this.y0();
       boolean b = (obj instanceof x || (obj instanceof JobSupport$c && obj.f()))? true: false;
       return b;
    }
    public final void j0(JobSupport$c p0,r p1,Object p2){
       p1 = this.N0(p1);
       if (p1 != null && this.j1(p0, p1, p2)) {
          return;
       }
       this.Y(this.n0(p0, p2));
       return;
    }
    public final boolean j1(JobSupport$c p0,r p1,Object p2){
       while (true) {
          if (z1$a.f(p1.f, false, false, new JobSupport$b(this, p0, p1, p2), 1, null) != m2.b) {
             return true;
          }
          p1 = this.N0(p1);
          if (p1 != null) {
             continue ;
          }else {
             break ;
          }
       }
       return false;
    }
    public final Throwable k0(Object p0){
       JobCancellationException jobCancellat;
       v0 = (p0 != null)? p0 instanceof Throwable: 1;
       if (v0) {
          if (p0 != null) {
          }else {
             p0 = new JobCancellationException(this.g0(), null, this);
          }
       }else if(p0 != null){
          p0 = p0.P();
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
       }
       return p0;
    }
    public final JobCancellationException l0(String p0,Throwable p1){
       if (p0 != null) {
       }else {
          p0 = this.g0();
       }
       return new JobCancellationException(p0, p1, this);
    }
    public CoroutineContext minusKey(CoroutineContext$b p0){
       return z1$a.g(this, p0);
    }
    public final Object n0(JobSupport$c p0,Object p1){
       Object obj = null;
       x ox = (!p1 instanceof x)? obj: p1;
       ox = (ox)? ox.a: obj;
       _monitor_enter(p0);
       boolean b = p0.f();
       List list = p0.i(ox);
       Throwable throwable = this.t0(p0, list);
       if (throwable != null) {
          this.X(throwable, list);
       }
       _monitor_exit(p0);
       boolean b1 = false;
       if (throwable != null && throwable != ox) {
          p1 = new x(throwable, b1, 2, obj);
       }
       if (throwable != null) {
          if (this.f0(throwable) || this.z0(throwable)) {
             b1 = 1;
          }
          if (b1) {
             if (p1 != null) {
                p1.b();
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
             }
          }
       }
       if (!b) {
          this.R0(throwable);
       }
       this.S0(p1);
       JobSupport.b.compareAndSet(this, p0, g2.h(p1));
       this.i0(p0, p1);
       return p1;
    }
    public final c o(){
       return this;
    }
    public final r o0(t1 p0){
       r or = null;
       int i = (!p0 instanceof r)? or: p0;
       if (i) {
          or = i;
       }else {
          k2 ok2 = p0.b();
          if (ok2 != null) {
             or = this.N0(ok2);
          }
       }
       return or;
    }
    public final Object p(c p0){
       if (!this.F0()) {
          p3.a(p0.getContext());
          return l1.a;
       }else {
          p0 = this.G0(p0);
          if (p0 == b.h()) {
             return p0;
          }
          return l1.a;
       }
    }
    public final Object p0(){
       Object obj = this.y0();
       if (!(obj instanceof t1 ^ 0x01)) {
          throw new IllegalStateException("This job has not completed yet".toString());
       }
       if (!obj instanceof x) {
          return g2.i(obj);
       }
       throw obj.a;
    }
    public CoroutineContext plus(CoroutineContext p0){
       return z1$a.i(this, p0);
    }
    public final Throwable q0(){
       Throwable obj = this.y0();
       if (obj instanceof JobSupport$c) {
          obj = obj.e();
          if (obj == null) {
             throw new IllegalStateException("Job is still new or active: "+this.toString());
          }
       }else if(!obj instanceof t1){
          x a = (obj instanceof x)? obj.a: null;
       }else {
          throw new IllegalStateException("Job is still new or active: "+this.toString());
       }
       return obj;
    }
    public final boolean r0(){
       Object obj = this.y0();
       boolean b = (obj instanceof x && obj.a())? true: false;
       return b;
    }
    public final Throwable s0(Object p0){
       x ox = null;
       if (!p0 instanceof x) {
          p0 = ox;
       }
       if (p0 != null) {
          ox = p0.a;
       }
       return ox;
    }
    public final boolean start(){
       while (true) {
          int i = this.a1(this.y0());
          if (!i) {
             return false;
          }
          if (i != 1) {
             continue ;
          }else {
             break ;
          }
       }
       return true;
    }
    public final Throwable t0(JobSupport$c p0,List p1){
       Throwable throwable1;
       Throwable throwable = null;
       if (p1.isEmpty()) {
          if (p0.f()) {
             return new JobCancellationException(this.g0(), throwable, this);
          }else {
             return throwable;
          }
       }else {
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                throwable1 = iterator.next();
                int i = throwable1 instanceof CancellationException ^ 1;
                if (!i) {
                   continue ;
                }
             }else {
                throwable1 = throwable;
             }
             if (throwable1 != null) {
                return throwable1;
             }else {
                throwable1 = p1.get(0);
                if (throwable1 instanceof TimeoutCancellationException) {
                   Iterator iterator1 = p1.iterator();
                   while (iterator1.hasNext()) {
                      Object obj = iterator1.next();
                      Object obj1 = obj;
                      obj1 = (obj1 != throwable1 && obj1 instanceof TimeoutCancellationException)? 1: null;
                      if (obj1) {
                         throwable = obj;
                      }else {
                         continue ;
                      }
                   }
                   if (throwable != null) {
                      return throwable;
                   }
                }
                break ;
             }
          }
          return throwable1;
       }
    }
    public String toString(){
       return this.e1()+'@'+o0.b(this);
    }
    public boolean u0(){
       return true;
    }
    public boolean v0(){
       return false;
    }
    public final k2 w0(t1 p0){
       k2 ok2 = p0.b();
       if (ok2 != null) {
       }else if(p0 instanceof f1){
          ok2 = new k2();
       }else if(p0 instanceof f2){
          this.V0(p0);
          ok2 = null;
       }else {
          throw new IllegalStateException("State should have list: "+p0.toString());
       }
       return ok2;
    }
    public final void x(f p0,l p1){
       while (true) {
          Object obj = this.y0();
          if (p0.isSelected()) {
             return;
          }
          if (!obj instanceof t1) {
             if (p0.j()) {
                b.c(p1, p0.r());
                break ;
             }
             break ;
          }else if(!this.a1(obj)){
             p0.o(this.S(new y2(this, p0, p1)));
             return;
          }
       }
       return;
    }
    public final q x0(){
       return this._parentHandle;
    }
    public final Object y0(){
       JobSupport t_state = this._state;
       while (t_state instanceof x) {
          t_state.c(this);
       }
       return t_state;
    }
    public z1 z(z1 p0){
       return z1$a.h(this, p0);
    }
    public boolean z0(Throwable p0){
       return false;
    }
}
