package ltd.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.x;
import ltd.z;
import kotlin.TypeCastException;
import ltd.o$b;
import ltd.o$e;
import ltd.n;
import msd.a;
import ltd.o$c;
import ltd.o$f;
import msd.l;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import ltd.d;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class o	// class@001e15
{
    public Object _next;
    public Object _prev;
    public Object _removedRef;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;

    static {
       o.b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");
       o.c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev");
       o.d = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef");
    }
    public void o(){
       super();
       this._next = this;
       this._prev = this;
       this._removedRef = null;
    }
    public final o B(x p0){
       while (true) {
          o t_prev = this._prev;
          AtomicReferenceFieldUpdater uAtomicRefer = null;
          o oo = t_prev;
          while (true) {
             o oo1 = uAtomicRefer;
             break ;
          }
          while (true) {
             o _next = oo._next;
             if (_next == this) {
                if (t_prev == oo) {
                   return oo;
                }
                if (o.c.compareAndSet(this, t_prev, oo)) {
                label_0017 :
                   return oo;
                }
                continue ;
             }else if(this.R()){
                return uAtomicRefer;
             }else if(_next == p0){
                return oo;
             }else if(_next instanceof x){
                if (p0 != null && p0.b(_next)) {
                   return uAtomicRefer;
                }
                _next.c(oo);
                continue ;
             }else if(_next instanceof z){
                if (oo1 != null) {
                   if (!o.b.compareAndSet(oo1, oo, _next.a)) {
                      continue ;
                   }else {
                      oo = oo1;
                   }
                }else {
                   oo = oo._prev;
                }
             }else if(_next != null){
                oo1 = oo;
                oo = _next;
             }else {
                break ;
             }
          }
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
    }
    public final o$b C(o p0){
       return new o$b(this, p0);
    }
    public final o$e D(){
       return new o$e(this);
    }
    public final o I(o p0){
       while (p0.R()) {
          p0 = p0._prev;
       }
       return p0;
    }
    public final void K(o p0){
       while (true) {
          o _prev = p0._prev;
          if (this.L() != p0) {
             return;
          }
          if (o.c.compareAndSet(p0, _prev, this)) {
             if (this.R()) {
                p0.B(null);
                break ;
             }
             break ;
          }
       }
       return;
    }
    public final Object L(){
       o t_next = this._next;
       while (t_next instanceof x) {
          t_next.c(this);
       }
       return t_next;
    }
    public final o M(){
       return n.h(this.L());
    }
    public final o O(){
       o oo = this.B(null);
       if (oo != null) {
       }else {
          oo = this.I(this._prev);
       }
       return oo;
    }
    public final void P(){
       Object obj = this.L();
       if (obj == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
       }
       obj.a.B(null);
       return;
    }
    public final void Q(){
       o oo = this;
       Object obj = oo.L();
       while (obj instanceof z) {
          oo = obj.a;
       }
       oo.B(null);
       return;
    }
    public boolean R(){
       return this.L() instanceof z;
    }
    public final o$c S(o p0,a p1){
       return new o$f(p1, p0, p0);
    }
    public o T(){
       Object obj = this.L();
       z oz = null;
       if (!obj instanceof z) {
          obj = oz;
       }
       if (obj != null) {
          oz = obj.a;
       }
       return oz;
    }
    public boolean U(){
       boolean b = (this.X() == null)? true: false;
       return b;
    }
    public final Object V(l p0){
       while (true) {
          Object obj = this.L();
          if (obj == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          }
          if (obj == this) {
             break ;
          }else {
             a.y(3, "T");
             if (p0.invoke(obj).booleanValue() && !obj.R()) {
                return obj;
             }
             o oo = obj.X();
             if (oo == null) {
                return obj;
             }
             oo.Q();
          }
       }
       return null;
    }
    public final o W(){
       while (true) {
          Object obj = this.L();
          if (obj == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          }
          if (obj == this) {
             break ;
          }else if(obj.U()){
             return obj;
          }else {
             obj.P();
          }
       }
       return null;
    }
    public final o X(){
       while (true) {
          Object obj = this.L();
          if (obj instanceof z) {
             return obj.a;
          }
          if (obj == this) {
             return obj;
          }
          if (obj != null) {
             Object obj1 = obj;
             if (o.b.compareAndSet(this, obj, obj1.Y())) {
                obj1.B(null);
                return null;
             }
          }else {
             break ;
          }
       }
       throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
    public final z Y(){
       o t_removedRef = this._removedRef;
       if (t_removedRef != null) {
       }else {
          t_removedRef = new z(this);
          o.d.lazySet(this, t_removedRef);
       }
       return t_removedRef;
    }
    public final int Z(o p0,o p1,o$c p2){
       o.c.lazySet(p0, this);
       AtomicReferenceFieldUpdater b = o.b;
       b.lazySet(p0, p1);
       p2.b = p1;
       if (!b.compareAndSet(this, p1, p2)) {
          return 0;
       }
       int i = (p2.c(this) == null)? 1: 2;
       return i;
    }
    public final void a0(o p0,o p1){
    }
    public final void s(o p0){
       do {
       } while (this.O().y(p0, this));
       return;
    }
    public final boolean t(o p0,a p1){
       o$f uof = new o$f(p1, p0, p0);
       while (true) {
          int i = this.O().Z(p0, this, uof);
          boolean b = true;
          if (i == b) {
             return b;
          }
          if (i != 2) {
             continue ;
          }else {
             break ;
          }
       }
       return false;
    }
    public String toString(){
       return this.getClass().getSimpleName()+'@'+Integer.toHexString(System.identityHashCode(this));
    }
    public final boolean v(o p0,l p1){
       while (true) {
          o oo = this.O();
          if (!p1.invoke(oo).booleanValue()) {
             return false;
          }
          if (oo.y(p0, this)) {
             break ;
          }
       }
       return true;
    }
    public final boolean x(o p0,l p1,a p2){
       boolean b;
       o$f uof = new o$f(p2, p0, p0);
       while (true) {
          o oo = this.O();
          if (!p1.invoke(oo).booleanValue()) {
             return false;
          }
          int i = oo.Z(p0, this, uof);
          b = true;
          if (i != b) {
             if (i == 2) {
             label_0022 :
                return false;
             }
             continue ;
          }else {
             break ;
          }
       }
       return b;
    }
    public final boolean y(o p0,o p1){
       o.c.lazySet(p0, this);
       AtomicReferenceFieldUpdater b = o.b;
       b.lazySet(p0, p1);
       if (!b.compareAndSet(this, p1, p0)) {
          return false;
       }
       p0.K(p1);
       return true;
    }
    public final boolean z(o p0){
       o.c.lazySet(p0, this);
       o.b.lazySet(p0, this);
       while (true) {
          if (this.L() != this) {
             return false;
          }
          if (o.b.compareAndSet(this, this, p0)) {
             break ;
          }
       }
       p0.K(this);
       return true;
    }
}
