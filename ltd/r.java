package ltd.r;
import ltd.r$a;
import nsd.u;
import ltd.e0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.IllegalStateException;
import ltd.r$b;
import msd.l;
import java.util.List;
import java.util.ArrayList;

public final class r	// class@001e19
{
    public Object _next;
    public long _state;
    public final int a;
    public AtomicReferenceArray b;
    public final int c;
    public final boolean d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final e0 g;
    public static final r$a h;

    static {
       r.h = new r$a(null);
       r.g = new e0("REMOVE_FROZEN");
       r.e = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next");
       r.f = AtomicLongFieldUpdater.newUpdater(r.class, "_state");
    }
    public void r(int p0,boolean p1){
       super();
       this.c = p0;
       this.d = p1;
       int i = p0 - 1;
       this.a = i;
       this._next = null;
       this._state = 0;
       this.b = new AtomicReferenceArray(p0);
       int i1 = 0;
       int i2 = (i <= 0x3fffffff)? 1: 0;
       if (i2) {
          if (!(p0 & i)) {
             i1 = 1;
          }
          if (i1) {
             return;
          }else {
             throw new IllegalStateException("Check failed.".toString());
          }
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final int a(Object p0){
       r tc;
       while (true) {
          r t_state = this._state;
          long l = 0x3000000000000000 & t_state;
          if (l) {
             return r.h.a(t_state);
          }
          r$a h = r.h;
          long l1 = 0x3fffffff & t_state;
          l1 = l1 >> 0;
          int i = (int)l1;
          l1 = 0xfffffffc0000000 & t_state;
          l1 = l1 >> 30;
          int i1 = (int)l1;
          r ta = this.a;
          int i2 = i1 + 2;
          i2 = i2 & ta;
          int i3 = i & ta;
          int i4 = 1;
          if (i2 == i3) {
             return i4;
          }
          i3 = 0x3fffffff;
          if (this.d == null) {
             int i5 = i1 & ta;
             if (this.b.get(i5) != null) {
                tc = this.c;
                if (tc >= 1024) {
                   i1 = i1 - i;
                   i = i1 & i3;
                   int i6 = tc >> 1;
                   if (i <= i6) {
                   }
                }
                return i4;
             }
          }
          i = i1 + 1;
          i = i & i3;
          long l2 = h.c(t_state, i);
          if (r.f.compareAndSet(this, t_state, l2)) {
             this.b.set((i1 & ta), p0);
             tc = this;
             long l3 = tc._state & 0x1000000000000000;
             while (l3) {
                tc = tc.k().e(i1, p0);
                if (tc != null) {
                }else {
                   break ;
                }
             }
             return 0;
          }
       }
    }
    public final r b(long p0){
       r or = new r((this.c * 2), this.d);
       int i = (int)((0x3fffffff & p0) >> 0);
       int i1 = (int)((0xfffffffc0000000 & p0) >> 30);
       r ta = this.a;
       int i2 = i & ta;
       int i3 = i1 & ta;
       while (i2 != i3) {
          int i4 = ta & i;
          r$b uob = this.b.get(i4);
          if (uob == null) {
             uob = new r$b(i);
          }
          i3 = or.a & i;
          or.b.set(i3, uob);
          i = i + 1;
       }
       or._state = r.h.e(p0, 0x1000000000000000);
       return or;
    }
    public final r c(long p0){
       r t_next = this._next;
       while (t_next == null) {
          r.e.compareAndSet(this, null, this.b(p0));
       }
       return t_next;
    }
    public final boolean d(){
       while (true) {
          r t_state = this._state;
          long l = 0x2000000000000000;
          long l1 = t_state & l;
          if (l1) {
             return true;
          }
          l1 = 0x1000000000000000 & t_state;
          if (l1) {
             return false;
          }
          l1 = t_state | l;
          if (r.f.compareAndSet(this, t_state, l1)) {
             break ;
          }
       }
       return true;
    }
    public final r e(int p0,Object p1){
       Object obj = this.b.get((this.a & p0));
       if (!obj instanceof r$b || obj.a != p0) {
          return null;
       }
       this.b.set((p0 & this.a), p1);
       return this;
    }
    public final int f(){
       r t_state = this._state;
       return (0x3fffffff & ((int)((t_state & 0xfffffffc0000000) >> 30) - (int)((0x3fffffff & t_state) >> 0)));
    }
    public final boolean g(){
       boolean b = (this._state & 0x2000000000000000)? true: false;
       return b;
    }
    public final boolean h(){
       r t_state = this._state;
       long l = 0;
       if ((int)((0x3fffffff & t_state) >> l) == (int)((t_state & 0xfffffffc0000000) >> 30)) {
          l = true;
       }
       return l;
    }
    public final List i(l p0){
       ArrayList uArrayList = new ArrayList(this.c);
       r t_state = this._state;
       int i = (int)((0x3fffffff & t_state) >> 0);
       int i1 = (int)((t_state & 0xfffffffc0000000) >> 30);
       t_state = this.a;
       int i2 = i & t_state;
       int i3 = i1 & t_state;
       while (i2 != i3) {
          int i4 = t_state & i;
          Object obj = this.b.get(i4);
          if (obj != null && !obj instanceof r$b) {
             uArrayList.add(p0.invoke(obj));
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public final long j(){
       long l2;
       while (true) {
          r t_state = this._state;
          long l = 0x1000000000000000;
          long l1 = t_state & l;
          if (l1) {
             return t_state;
          }
          l2 = t_state | l;
          if (r.f.compareAndSet(this, t_state, l2)) {
             break ;
          }
       }
       return l2;
    }
    public final r k(){
       return this.c(this.j());
    }
    public final Object l(){
       while (true) {
          r t_state = this._state;
          long l = 0x1000000000000000 & t_state;
          if (l) {
             return r.g;
          }
          r$a h = r.h;
          long l1 = 0x3fffffff & t_state;
          l1 = l1 >> 0;
          int i = (int)l1;
          l1 = 0xfffffffc0000000 & t_state;
          l1 = l1 >> 30;
          int i1 = (int)l1;
          r ta = this.a;
          i1 = i1 & ta;
          int i2 = i & ta;
          if (i1 == i2) {
             return null;
          }
          int i3 = ta & i;
          Object obj = this.b.get(i3);
          if (obj == null) {
             if (this.d != null) {
                return null;
             }
             continue ;
          }else if(obj instanceof r$b){
             return null;
          }else {
             i1 = i + 1;
             int i4 = i1 & 0x3fffffff;
             if (r.f.compareAndSet(this, t_state, h.b(t_state, i4))) {
                this.b.set((this.a & i), null);
                return obj;
             }else if(this.d == null){
                continue ;
             }else {
                r or = this;
                do {
                } while (or.m(i, i4) != null);
                return obj;
             }
          }
       }
    }
    public final r m(int p0,int p1){
       int i;
       while (true) {
          r t_state = this._state;
          r$a h = r.h;
          long l = 0x3fffffff & t_state;
          l = l >> 0;
          i = (int)l;
          l = 0x1000000000000000 & t_state;
          if (l) {
             return this.k();
          }
          if (r.f.compareAndSet(this, t_state, h.b(t_state, p1))) {
             break ;
          }
       }
       this.b.set((this.a & i), null);
       return null;
    }
}
