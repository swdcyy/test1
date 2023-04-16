package htd.q;
import htd.i;
import java.lang.Object;
import htd.q$b;
import nsd.u;
import htd.q$a;
import java.lang.Throwable;
import ltd.e0;
import java.lang.String;
import htd.q$c;
import htd.q$d;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import htd.c;
import kotlin.TypeCastException;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.concurrent.CancellationException;
import trd.n;
import kotlin.jvm.internal.a;
import otd.e;
import htd.q$e;
import htd.y;
import htd.b;
import nsd.s0;
import msd.l;
import otd.f;
import msd.p;
import asd.c;
import mtd.b;
import csd.b;
import qrd.l1;
import kotlin.collections.ArraysKt___ArraysKt;

public final class q implements i	// class@000fdd
{
    public Object _state;
    public int _updating;
    public Object onCloseHandler;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;
    public static final q$a e;
    public static final e0 f;
    public static final q$c g;
    public static final q$b h;

    static {
       q.h = new q$b(null);
       q.e = new q$a(null);
       e0 uoe0 = new e0("UNDEFINED");
       q.f = uoe0;
       q.g = new q$c(uoe0, null);
       q.b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
       q.c = AtomicIntegerFieldUpdater.newUpdater(q.class, "_updating");
       q.d = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "onCloseHandler");
    }
    public void q(){
       super();
       this._state = q.g;
       this._updating = 0;
       this.onCloseHandler = null;
    }
    public void q(Object p0){
       super();
       q.b.lazySet(this, new q$c(p0, null));
    }
    public static void o(){
    }
    public boolean T(Throwable p0){
       while (true) {
          q t_state = this._state;
          boolean b = false;
          if (t_state instanceof q$a) {
             return b;
          }
          if (!t_state instanceof q$c) {
             throw new IllegalStateException("Invalid state "+t_state.toString());
          }
          q$a e = (p0 == null)? q.e: new q$a(p0);
          if (q.b.compareAndSet(this, t_state, e)) {
             if (t_state != null) {
                q$c b1 = t_state.b;
                if (b1 != null) {
                   int len = b1.length;
                   for (; b < len; b = b + 1) {
                      b1[b].T(p0);
                   }
                }
                break ;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
             }
          }
       }
       this.i(p0);
       return true;
    }
    public boolean a(Throwable p0){
       return this.T(p0);
    }
    public void b(CancellationException p0){
       this.T(p0);
    }
    public final q$d[] c(q$d[] p0,q$d p1){
       if (p0 != null) {
          return n.T2(p0, p1);
       }
       q$d[] uodArray = new q$d[1];
       for (int i = 0; i < 1; i = i + 1) {
          uodArray[i] = p1;
       }
       return uodArray;
    }
    public final void d(q$d p0){
       q t_state;
       while (true) {
          t_state = this._state;
          if (t_state instanceof q$a) {
             return;
          }
          if (t_state instanceof q$c) {
             q$c a = t_state.a;
             if (t_state == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
             }
             q$c b = t_state.b;
             if (b == null) {
                a.L();
             }
             if (q.b.compareAndSet(this, t_state, new q$c(a, this.n(b, p0)))) {
                return;
             }
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Invalid state "+t_state.toString());
    }
    public final Object e(){
       q t_state = this._state;
       if (t_state instanceof q$a) {
          throw t_state.b();
       }
       if (!t_state instanceof q$c) {
          throw new IllegalStateException("Invalid state "+t_state.toString());
       }
       q$c a = t_state.a;
       if (a != q.f) {
          return a;
       }
       throw new IllegalStateException("No value");
    }
    public e f(){
       return new q$e(this);
    }
    public final Object g(){
       q t_state = this._state;
       q$c uoc = null;
       if (t_state instanceof q$a) {
       }else if(t_state instanceof q$c){
          q$c a = t_state.a;
          if (a != q.f) {
             uoc = a;
          }
       }else {
          throw new IllegalStateException("Invalid state "+t_state.toString());
       }
       return uoc;
    }
    public y h(){
       q t_state;
       q$d uod = new q$d(this);
       while (true) {
          t_state = this._state;
          if (t_state instanceof q$a) {
             uod.T(t_state.a);
             return uod;
          }else if(t_state instanceof q$c){
             q oq = t_state;
             q$c a = oq.a;
             if (a != q.f) {
                uod.F(a);
             }
             q$c a1 = oq.a;
             if (t_state != null) {
                if (q.b.compareAndSet(this, t_state, new q$c(a1, this.c(t_state.b, uod)))) {
                   return uod;
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
             }
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Invalid state "+t_state.toString());
    }
    public final void i(Throwable p0){
       q tonCloseHand = this.onCloseHandler;
       if (tonCloseHand != null) {
          Object e = b.e;
          if (tonCloseHand != e && q.d.compareAndSet(this, tonCloseHand, e)) {
             s0.q(tonCloseHand, 1).invoke(p0);
          }
       }
       return;
    }
    public final q$a j(Object p0){
       q$a uoa = null;
       if (!q.c.compareAndSet(this, 0, 1)) {
          return uoa;
       }
       while (true) {
          q t_state = this._state;
          if (t_state instanceof q$a) {
             this._updating = 0;
             return t_state;
          }else if(t_state instanceof q$c){
             if (t_state == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
             }
             if (q.b.compareAndSet(this, t_state, new q$c(p0, t_state.b))) {
                q$c b = t_state.b;
                if (b != null) {
                   int len = b.length;
                   for (int i = 0; i < len; i = i + 1) {
                      b[i].F(p0);
                   }
                }
                break ;
             }
          }else {
             throw new IllegalStateException("Invalid state "+t_state.toString());
          }
       }
       this._updating = 0;
       return uoa;
    }
    public final void k(f p0,Object p1,p p2){
       if (!p0.j()) {
          return;
       }
       p1 = this.j(p1);
       if (p1 != null) {
          p0.k(p1.a());
          return;
       }else {
          b.d(p2, this, p0.r());
          return;
       }
    }
    public Object l(Object p0,c p1){
       p0 = this.j(p0);
       if (p0 != null) {
          throw p0.a();
       }
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public boolean m(){
       return this._state instanceof q$a;
    }
    public final q$d[] n(q$d[] p0,q$d p1){
       int len = p0.length;
       int i = ArraysKt___ArraysKt.df(p0, p1);
       int i1 = 1;
       if (len == i1) {
          return null;
       }
       q$d[] uodArray = new q$d[(len - i1)];
       Object[] objArray = p0;
       q$d[] uodArray1 = uodArray;
       n.l1(objArray, uodArray1, 0, 0, i, 6, null);
       n.l1(objArray, uodArray1, i, (i + 1), 0, 8, null);
       return uodArray;
    }
    public boolean offer(Object p0){
       p0 = this.j(p0);
       if (p0 == null) {
          return true;
       }
       throw p0.a();
    }
    public boolean q(){
       return false;
    }
    public void t(l p0){
       AtomicReferenceFieldUpdater d = q.d;
       if (!d.compareAndSet(this, null, p0)) {
          q tonCloseHand = this.onCloseHandler;
          if (tonCloseHand == b.e) {
             throw new IllegalStateException("Another handler was already registered and successfully invoked");
          }else {
             throw new IllegalStateException("Another handler was already registered: "+tonCloseHand);
          }
       }else {
          q t_state = this._state;
          if (t_state instanceof q$a && d.compareAndSet(this, p0, b.e)) {
             p0.invoke(t_state.a);
          }
          return;
       }
    }
}
