package htd.a;
import htd.l;
import htd.c;
import otd.d;
import htd.a$j;
import htd.z;
import htd.p;
import java.lang.Throwable;
import htd.a$f;
import ltd.m;
import htd.x;
import ltd.o;
import htd.b0;
import htd.a$g;
import ltd.o$c;
import otd.f;
import msd.p;
import htd.a$d;
import ftd.c1;
import java.lang.Object;
import nsd.u;
import ltd.l;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.concurrent.CancellationException;
import java.lang.StringBuilder;
import ftd.o0;
import ltd.o$d;
import ltd.e0;
import htd.b;
import ltd.b;
import ltd.o$e;
import htd.l$a;
import ltd.d0;
import asd.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.l;
import ftd.n;
import htd.a$b;
import ftd.k;
import kotlin.Result;
import csd.b;
import dsd.e;
import kotlin.TypeCastException;
import otd.g;
import ltd.c;
import htd.a$e;
import msd.l;
import htd.f0;
import htd.f0$a;
import mtd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import htd.a$a;
import htd.a$h;
import htd.a$i;

public abstract class a extends c implements l	// class@000fb5
{

    public void a(){
       super();
    }
    public final d B(){
       return new a$j(this);
    }
    public z M(){
       z oz = super.M();
       if (oz != null && !oz instanceof p) {
          this.Z();
       }
       return oz;
    }
    public final boolean O(Throwable p0){
       boolean b = this.T(p0);
       this.Y(b);
       return b;
    }
    public final a$f P(){
       return new a$f(this.r());
    }
    public final boolean Q(x p0){
       boolean b = this.R(p0);
       if (b) {
          this.a0();
       }
       return b;
    }
    public boolean R(x p0){
       m om;
       int i;
       boolean b = false;
       if (this.V()) {
          om = this.r();
          o oo = om.O();
          i = oo instanceof b0 ^ 1;
          while (i) {
             if (oo.y(p0, om)) {
             label_003a :
                b = true;
                break ;
             }
          }
       }else {
          om = this.r();
          a$g og = new a$g(p0, p0, this);
          o oo1 = om.O();
          int i1 = oo1 instanceof b0 ^ 1;
          while (i1) {
             i = oo1.Z(p0, om, og);
             if (i != 1) {
                if (i != 2) {
                }
             }else {
                goto label_003a ;
             }
          }
       }
       return b;
    }
    public final boolean S(f p0,p p1,int p2){
       a$d uod = new a$d(this, p0, p1, p2);
       boolean b = this.Q(uod);
       if (b) {
          p0.o(uod);
       }
       return b;
    }
    public final boolean U(){
       return this.r().M() instanceof z;
    }
    public abstract boolean V();
    public abstract boolean W();
    public final boolean X(){
       boolean b = (!this.r().M() instanceof b0 && this.W())? true: false;
       return b;
    }
    public void Y(boolean p0){
       p op = this.p();
       if (op == null) {
          throw new IllegalStateException("Cannot happen".toString());
       }
       int i = 1;
       Object obj = l.c(null, i, null);
       o oo = op.O();
       while (!oo instanceof m) {
          if (!oo.U()) {
             oo.P();
          }else {
             obj = l.h(obj, oo);
          }
       }
       if (obj != null) {
          if (!obj instanceof ArrayList) {
             obj.d0(op);
          }else {
             for (int i1 = obj.size() - i; i1 >= 0; i1 = i1 - 1) {
                obj.get(i1).d0(op);
             }
          }
       }
       return;
    }
    public void Z(){
    }
    public final boolean a(Throwable p0){
       return this.O(p0);
    }
    public void a0(){
    }
    public final void b(CancellationException p0){
       if (p0 != null) {
       }else {
          p0 = new CancellationException(o0.a(this)+" was cancelled");
       }
       this.O(p0);
       return;
    }
    public Object b0(){
       b0 uob0;
       while (true) {
          uob0 = this.N();
          if (uob0 == null) {
             return b.c;
          }
          if (uob0.e0(null) != null) {
             break ;
          }
       }
       uob0.b0();
       return uob0.c0();
    }
    public Object c0(f p0){
       a$f uof = this.P();
       p0 = p0.g(uof);
       if (p0 != null) {
          return p0;
       }
       uof.n().b0();
       return uof.n().c0();
    }
    public void cancel(){
       l$a.a(this);
    }
    public final Object d0(Object p0){
       if (!p0 instanceof p) {
          return p0;
       }
       p0 = p0.e;
       if (p0 == null) {
          return null;
       }
       throw d0.o(p0);
    }
    public final Object e0(int p0,c p1){
       Object obj;
       l ol = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(p1));
       if (ol == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Any?>");
       }
       a$b uob = new a$b(ol, p0);
       while (true) {
          if (this.Q(uob)) {
             this.g0(ol, uob);
             break ;
          }else {
             obj = this.b0();
             if (obj instanceof p) {
                uob.b0(obj);
                break ;
             }else {
                if (obj != b.c) {
                   ol.resumeWith(Result.constructor-impl(uob.c0(obj)));
                   break ;
                }
             }
          }
       }
       obj = ol.r();
       if (obj == b.h()) {
          e.c(p1);
       }
       return obj;
    }
    public final void f0(f p0,int p1,p p2){
       while (true) {
          if (p0.isSelected()) {
             return;
          }
          if (this.X()) {
             if (this.S(p0, p2, p1)) {
                return;
             }
             continue ;
          }else {
             Object obj = this.c0(p0);
             if (obj == g.e()) {
                break ;
             }else if(obj == b.c || obj == c.b){
                continue ;
             }else {
                this.h0(p2, p0, p1, obj);
             }
          }
       }
       return;
    }
    public final Object g(c p0){
       Object obj = this.b0();
       if (obj != b.c && !obj instanceof p) {
          return obj;
       }
       return this.e0(1, p0);
    }
    public final void g0(k p0,x p1){
       p0.w(new a$e(this, p1));
    }
    public final void h0(p p0,f p1,int p2,Object p3){
       if (v0 = p3 instanceof p) {
          if (p2) {
             if (p2 != 1) {
                if (p2 == 2) {
                   if (!p1.j()) {
                      return;
                   }else {
                      b.d(p0, f0.a(f0.c(new f0$a(p3.e))), p1.r());
                   }
                }
             }else if(p3.e == null){
                if (!p1.j()) {
                   return;
                }else {
                   b.d(p0, null, p1.r());
                }
             }else {
                throw d0.o(p3.h0());
             }
          }else {
             throw d0.o(p3.h0());
          }
       }else if(p2 == 2){
          Object obj = (v0)? f0.c(new f0$a(p3.e)): f0.c(p3);
          b.d(p0, f0.a(obj), p1.r());
       }else {
          b.d(p0, p3, p1.r());
       }
       return;
    }
    public boolean isEmpty(){
       return this.X();
    }
    public final ChannelIterator iterator(){
       return new a$a(this);
    }
    public final Object k(c p0){
       Object obj = this.b0();
       if (obj != b.c && !obj instanceof p) {
          return obj;
       }
       return this.e0(0, p0);
    }
    public boolean n(){
       boolean b = (this.o() != null && this.W())? true: false;
       return b;
    }
    public final Object poll(){
       Object obj = this.b0();
       obj = (obj == b.c)? null: this.d0(obj);
       return obj;
    }
    public final d s(){
       return new a$h(this);
    }
    public final d v(){
       return new a$i(this);
    }
    public final Object y(c p0){
       Object obj = this.b0();
       if (obj == b.c) {
          return this.e0(2, p0);
       }
       p0 = (obj instanceof p)? f0.c(new f0$a(obj.e)): f0.c(obj);
       return f0.a(p0);
    }
}
