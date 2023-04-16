package htd.c;
import htd.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.m;
import java.lang.Throwable;
import htd.b;
import nsd.s0;
import msd.l;
import ltd.o;
import htd.z;
import ltd.o$d;
import ltd.e0;
import otd.f;
import htd.c$d;
import ltd.b;
import ltd.o$e;
import msd.p;
import htd.c$c;
import htd.b0;
import ftd.c1;
import htd.p;
import htd.x;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import ltd.d0;
import otd.g;
import ltd.c;
import asd.c;
import mtd.b;
import htd.c$a;
import ftd.p3;
import csd.b;
import qrd.l1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.l;
import ftd.n;
import htd.d0;
import ftd.k;
import kotlin.Result;
import dsd.e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.a;
import ltd.o$b;
import htd.c$b;
import otd.e;
import htd.c$f;
import htd.c$e;
import ltd.o$c;
import ftd.o0;
import nsd.u;
import ltd.l;
import java.util.ArrayList;
import qrd.j0;

public abstract class c implements c0	// class@000fc0
{
    public final m b;
    public Object onCloseHandler;
    public static final AtomicReferenceFieldUpdater c;

    static {
       c.c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    }
    public void c(){
       super();
       this.b = new m();
       this.onCloseHandler = null;
    }
    public final void A(Throwable p0){
       c tonCloseHand = this.onCloseHandler;
       if (tonCloseHand != null) {
          Object e = b.e;
          if (tonCloseHand != e && c.c.compareAndSet(this, tonCloseHand, e)) {
             s0.q(tonCloseHand, 1).invoke(p0);
          }
       }
       return;
    }
    public abstract boolean C();
    public abstract boolean D();
    public final boolean E(){
       boolean b = (!this.b.M() instanceof z && this.D())? true: false;
       return b;
    }
    public Object F(Object p0){
       z oz;
       while (true) {
          oz = this.M();
          if (oz == null) {
             return b.b;
          }
          if (oz.d(p0, null) != null) {
             break ;
          }
       }
       oz.m(p0);
       return oz.e();
    }
    public Object G(Object p0,f p1){
       c$d uod = this.e(p0);
       p1 = p1.g(uod);
       if (p1 != null) {
          return p1;
       }
       z oz = uod.n();
       oz.m(p0);
       return oz.e();
    }
    public void H(o p0){
    }
    public final void I(f p0,Object p1,p p2){
       Object obj;
       while (true) {
          if (p0.isSelected()) {
             return;
          }
          if (this.E()) {
             c$c uoc = new c$c(p1, this, p0, p2);
             obj = this.i(uoc);
             if (obj == null) {
                p0.o(uoc);
                return;
             }else if(!obj instanceof p){
                if (obj != b.d && !obj instanceof x) {
                   throw new IllegalStateException("enqueueSend returned "+obj+' '.toString());
                }
             }else {
                break ;
             }
          }
          Object obj1 = this.G(p1, p0);
          if (obj1 == g.e()) {
             return;
          }else if(obj1 == b.b || obj1 == c.b){
          }else if(obj1 == b.a){
             b.d(p2, this, p0.r());
             return;
          }else if(obj1 instanceof p){
             throw d0.o(this.x(obj1));
          }else {
             throw new IllegalStateException("offerSelectInternal returned "+obj1.toString());
          }
       }
       throw d0.o(this.x(obj));
    }
    public final z J(Object p0){
       c tb = this.b;
       c$a uoa = new c$a(p0);
       while (true) {
          p0 = tb.O();
          if (p0 instanceof z) {
             return p0;
          }
          if (p0.y(uoa, tb)) {
             break ;
          }
       }
       return null;
    }
    public final Object K(Object p0,c p1){
       if (this.F(p0) == b.a) {
          p0 = p3.b(p1);
          if (p0 == b.h()) {
             return p0;
          }
          return l1.a;
       }else {
          p0 = this.L(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }
          return l1.a;
       }
    }
    public final Object L(Object p0,c p1){
       l ol = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(p1));
       while (true) {
          if (this.E()) {
             d0 uod0 = new d0(p0, ol);
             Object obj = this.i(uod0);
             if (obj == null) {
                n.c(ol, uod0);
             }else if(obj instanceof p){
                this.z(ol, obj);
             }else if(obj == b.d || obj instanceof x){
             label_004c :
                Object obj1 = this.F(p0);
                if (obj1 == b.a) {
                   ol.resumeWith(Result.constructor-impl(l1.a));
                }else {
                   if (obj1 == b.b) {
                      continue ;
                   }else if(obj1 instanceof p){
                      this.z(ol, obj1);
                   }else {
                      throw new IllegalStateException("offerInternal returned "+obj1.toString());
                   }
                }
             }else {
                throw new IllegalStateException("enqueueSend returned "+obj.toString());
             }
          }else {
             goto label_004c ;
          }
          p0 = ol.r();
          if (p0 == b.h()) {
             e.c(p1);
             break ;
          }
          break ;
       }
       return p0;
    }
    public z M(){
       z oz;
       c tb = this.b;
       while (true) {
          oz = tb.L();
          if (oz == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          }
          o obj = null;
          if (oz == tb || !oz instanceof z) {
             oz = obj;
             break ;
          }else if(oz instanceof p && !oz.R()){
             obj = oz.X();
             if (obj != null) {
                obj.Q();
             }
          }
          break ;
       }
       return oz;
    }
    public final b0 N(){
       b0 uob0;
       c tb = this.b;
       while (true) {
          uob0 = tb.L();
          if (uob0 == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          }
          o obj = null;
          if (uob0 == tb || !uob0 instanceof b0) {
             uob0 = obj;
             break ;
          }else if(uob0 instanceof p && !uob0.R()){
             obj = uob0.X();
             if (obj != null) {
                obj.Q();
             }
          }
          break ;
       }
       return uob0;
    }
    public boolean T(Throwable p0){
       int i;
       p op = new p(p0);
       c tb = this.b;
       while (true) {
          o oo = tb.O();
          i = 1;
          int i1 = oo instanceof p ^ i;
          if (!i1) {
             i = 0;
          }else {
             if (!oo.y(op, tb)) {
                continue ;
             }
          }
          if (!i) {
             op = this.b.O();
             if (op != null) {
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
             }
          }
          this.w(op);
          if (i) {
             this.A(p0);
             break ;
          }
          break ;
       }
       return i;
    }
    public final int c(){
       c tb = this.b;
       o oo = tb.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       int i = 0;
       int i1 = a.g(oo, tb) ^ 0x01;
       while (i1) {
          if (oo instanceof o) {
             i = i + 1;
          }
          oo = oo.M();
       }
       return i;
    }
    public final o$b d(Object p0){
       return new c$b(this.b, p0);
    }
    public final c$d e(Object p0){
       return new c$d(p0, this.b);
    }
    public final e f(){
       return new c$f(this);
    }
    public Object i(b0 p0){
       c tb;
       if (this.C()) {
          tb = this.b;
          while (true) {
             o oo = tb.O();
             if (oo instanceof z) {
                return oo;
             }
             if (!oo.y(p0, tb)) {
             }
          }
       }else {
          tb = this.b;
          c$e uoe = new c$e(p0, p0, this);
          while (true) {
             o oo1 = tb.O();
             if (oo1 instanceof z) {
                return oo1;
             }
             int i = oo1.Z(p0, tb, uoe);
             int i1 = 1;
             if (i != i1) {
                if (i != 2) {
                }else {
                   i1 = 0;
                }
             }
             if (!i1) {
                return b.d;
             }
          }
       }
       return null;
    }
    public String j(){
       return "";
    }
    public final Object l(Object p0,c p1){
       if (this.F(p0) == b.a) {
          return l1.a;
       }
       p0 = this.L(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public final boolean m(){
       boolean b = (this.p() != null)? true: false;
       return b;
    }
    public final p o(){
       o oo = this.b.M();
       o oo1 = null;
       if (!oo instanceof p) {
          oo = oo1;
       }
       if (oo != null) {
          this.w(oo);
          oo1 = oo;
       }
       return oo1;
    }
    public final boolean offer(Object p0){
       p0 = this.F(p0);
       if (p0 == b.a) {
          return true;
       }
       if (p0 == b.b) {
          p0 = this.p();
          if (p0 == null) {
             return false;
          }
          throw d0.o(this.x(p0));
       }else if(p0 instanceof p){
          throw d0.o(this.x(p0));
       }else {
          throw new IllegalStateException("offerInternal returned "+p0.toString());
       }
    }
    public final p p(){
       o oo = this.b.O();
       o oo1 = null;
       if (!oo instanceof p) {
          oo = oo1;
       }
       if (oo != null) {
          this.w(oo);
          oo1 = oo;
       }
       return oo1;
    }
    public boolean q(){
       return this.E();
    }
    public final m r(){
       return this.b;
    }
    public void t(l p0){
       AtomicReferenceFieldUpdater c = c.c;
       if (!c.compareAndSet(this, null, p0)) {
          c tonCloseHand = this.onCloseHandler;
          if (tonCloseHand == b.e) {
             throw new IllegalStateException("Another handler was already registered and successfully invoked");
          }else {
             throw new IllegalStateException("Another handler was already registered: "+tonCloseHand);
          }
       }else {
          p op = this.p();
          if (op != null && c.compareAndSet(this, p0, b.e)) {
             p0.invoke(op.e);
          }
          return;
       }
    }
    public String toString(){
       return o0.a(this)+'@'+o0.b(this)+'{'+this.u()+'}'+this.j();
    }
    public final String u(){
       String str;
       o oo = this.b.M();
       if (oo == this.b) {
          return "EmptyQueue";
       }
       if (oo instanceof p) {
          str = oo.toString();
       }else if(oo instanceof x){
          str = "ReceiveQueued";
       }else if(oo instanceof b0){
          str = "SendQueued";
       }else {
          str = "UNEXPECTED:"+oo;
       }
       o oo1 = this.b.O();
       if (oo1 != oo) {
          str = str+",queueSize="+this.c();
          if (oo1 instanceof p) {
             str = str+",closedForSend="+oo1;
          }
       }
       return str;
    }
    public final void w(p p0){
       Object obj = null;
       int i = 1;
       Object obj1 = l.c(obj, i, obj);
       o oo = p0.O();
       while (!oo instanceof x) {
          oo = obj;
          break ;
          oo.P();
       }
       if (oo != null) {
          if (!oo.U()) {
             goto label_0019 ;
          }else {
             obj1 = l.h(obj1, oo);
             goto label_0006 ;
          }
       }else if(obj1 == null){
          if (!obj1 instanceof ArrayList) {
             obj1.b0(p0);
          }else {
             for (int i1 = obj1.size() - i; i1 >= 0; i1 = i1 - 1) {
                obj1.get(i1).b0(p0);
             }
          }
       }
       this.H(p0);
       return;
    }
    public final Throwable x(p p0){
       this.w(p0);
       return p0.i0();
    }
    public final void z(c p0,p p1){
       this.w(p1);
       p0.resumeWith(Result.constructor-impl(j0.a(p1.i0())));
    }
}
