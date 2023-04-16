package ftd.l;
import ftd.k;
import dsd.c;
import ftd.w0;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import ftd.b;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Throwable;
import ftd.t0;
import ftd.x;
import nsd.u;
import ftd.o;
import ftd.z;
import ftd.n2;
import ftd.m;
import msd.l;
import ftd.a0;
import kotlinx.coroutines.CompletionHandlerException;
import java.lang.StringBuilder;
import ftd.h0;
import ftd.c1;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import ftd.p;
import ftd.z1$a;
import ftd.m2;
import java.lang.IllegalStateException;
import ftd.i;
import ftd.j;
import java.lang.StackTraceElement;
import ftd.x0;
import java.util.concurrent.CancellationException;
import csd.b;
import ftd.y;
import msd.a;
import ftd.o0;
import ftd.w1;

public class l extends w0 implements k, c	// class@001658
{
    public int _decision;
    public Object _parentHandle;
    public Object _state;
    public final CoroutineContext e;
    public final c f;
    public static final AtomicIntegerFieldUpdater g;
    public static final AtomicReferenceFieldUpdater h;

    static {
       l.g = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");
       l.h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    }
    public void l(c p0,int p1){
       super(p1);
       this.f = p0;
       this.e = p0.getContext();
       this._decision = 0;
       this._state = b.b;
       this._parentHandle = null;
    }
    public void A(CoroutineDispatcher p0,Throwable p1){
       l tf = this.f;
       u ou = null;
       if (!tf instanceof t0) {
          tf = ou;
       }
       int i = 2;
       x ox = new x(p1, false, i, ou);
       if (tf != null) {
          ou = tf.h;
       }
       if (ou != p0) {
          i = this.d;
       }
       this.D(ox, i);
       return;
    }
    public final void B(Throwable p0){
       if (this.k(p0)) {
          return;
       }
       this.a(p0);
       this.n();
       return;
    }
    public final boolean C(){
       if (this._state instanceof z) {
          this.m();
          return false;
       }else {
          this._decision = 0;
          this._state = b.b;
          return true;
       }
    }
    public final o D(Object p0,int p1){
       l t_state;
       while (true) {
          t_state = this._state;
          if (t_state instanceof n2) {
             if (!l.h.compareAndSet(this, t_state, p0)) {
                continue ;
             }else {
                this.n();
                this.o(p1);
                return null;
             }
          }else if(t_state instanceof o && t_state.c()){
             break ;
          }else {
             this.j(p0);
          }
       }
       return t_state;
    }
    public boolean E(){
       return this.s() instanceof n2;
    }
    public void F(Object p0){
       this.o(this.d);
    }
    public Object G(Object p0,Object p1){
       e0 uoe0;
       while (true) {
          l t_state = this._state;
          if (t_state instanceof n2) {
             z oz = (p1 == null)? p0: new z(p1, p0);
             if (!l.h.compareAndSet(this, t_state, oz)) {
                continue ;
             }else {
                this.n();
                return m.a;
             }
          }else {
             uoe0 = null;
             if (t_state instanceof z && t_state.a == p1) {
                uoe0 = m.a;
                break ;
             }
             break ;
          }
       }
       return uoe0;
    }
    public void H(Object p0,l p1){
       p0 = this.D(new a0(p0, p1), this.d);
       if (p0 != null) {
          p1.invoke(p0.a);
       }
       return;
    }
    public final void I(c1 p0){
       this._parentHandle = p0;
    }
    public Object J(Throwable p0){
       while (true) {
          l t_state = this._state;
          u ou = null;
          if (!t_state instanceof n2) {
             return ou;
          }
          if (!l.h.compareAndSet(this, t_state, new x(p0, false, 2, ou))) {
             continue ;
          }else {
             break ;
          }
       }
       this.n();
       return m.a;
    }
    public final void K(){
       if (this.l()) {
          return;
       }
       if (this.q() != null) {
          return;
       }
       CoroutineContext$a uoa = this.f.getContext().get(z1.p0);
       if (uoa != null) {
          uoa.start();
          c1 uoc1 = z1$a.f(uoa, true, false, new p(uoa, this), 2, null);
          this.I(uoc1);
          if (this.c() && !this.v()) {
             uoc1.dispose();
             this.I(m2.b);
          }
       }
       return;
    }
    public final boolean L(){
       boolean b;
       while (true) {
          l t_decision = this._decision;
          b = false;
          if (t_decision != null) {
             if (t_decision != true) {
                throw new IllegalStateException("Already resumed".toString());
             }
             break ;
          }else {
             if (l.g.compareAndSet(this, b, 2)) {
                return true;
             }
             continue ;
          }
       }
       return b;
    }
    public final boolean M(){
       boolean b;
       while (true) {
          l t_decision = this._decision;
          b = false;
          if (t_decision != null) {
             if (t_decision != 2) {
                throw new IllegalStateException("Already suspended".toString());
             }
             break ;
          }else {
             int i = 1;
             if (l.g.compareAndSet(this, b, i)) {
                return i;
             }
             continue ;
          }
       }
       return b;
    }
    public void N(CoroutineDispatcher p0,Object p1){
       l tf = this.f;
       t0 ot0 = null;
       if (!tf instanceof t0) {
          tf = ot0;
       }
       if (tf != null) {
          ot0 = tf.h;
       }
       int i = (ot0 == p0)? 2: this.d;
       this.D(p1, i);
       return;
    }
    public boolean a(Throwable p0){
       while (true) {
          l t_state = this._state;
          if (!t_state instanceof n2) {
             return false;
          }
          boolean b = t_state instanceof i;
          if (!l.h.compareAndSet(this, t_state, new o(this, p0, b))) {
             continue ;
          }else if(b){
             t_state.a(p0);
             break ;
          }
          break ;
       }
       this.n();
       this.o(false);
       return true;
    }
    public boolean c(){
       return (this.s() instanceof n2 ^ 0x01);
    }
    public void d(Object p0,Throwable p1){
       if (p0 instanceof a0) {
          p0.b.invoke(p1);
       }
       return;
    }
    public final c e(){
       return this.f;
    }
    public Object g(Object p0){
       if (p0 instanceof z) {
          p0 = p0.b;
       }else if(p0 instanceof a0){
          p0 = p0.a;
       }
       return p0;
    }
    public c getCallerFrame(){
       l tf = this.f;
       if (!tf instanceof c) {
          tf = null;
       }
       return tf;
    }
    public CoroutineContext getContext(){
       return this.e;
    }
    public StackTraceElement getStackTraceElement(){
       return null;
    }
    public Object i(){
       return this.s();
    }
    public boolean isCancelled(){
       return this.s() instanceof o;
    }
    public final void j(Object p0){
       throw new IllegalStateException("Already resumed, but proposed with update "+p0.toString());
    }
    public final boolean k(Throwable p0){
       if (this.d != null) {
          return false;
       }
       l tf = this.f;
       if (!tf instanceof t0) {
          tf = null;
       }
       if (tf != null) {
          return tf.p(p0);
       }else {
          return false;
       }
    }
    public final boolean l(){
       boolean b = this.c();
       if (this.d != null) {
          return b;
       }
       l tf = this.f;
       if (!tf instanceof t0) {
          tf = null;
       }
       if (tf != null) {
          Throwable throwable = tf.k(this);
          if (throwable != null) {
             if (!b) {
                this.a(throwable);
             }
             b = true;
          }
       }
       return b;
    }
    public final void m(){
       c1 uoc1 = this.q();
       if (uoc1 != null) {
          uoc1.dispose();
       }
       this.I(m2.b);
       return;
    }
    public final void n(){
       if (!this.v()) {
          this.m();
       }
       return;
    }
    public final void o(int p0){
       if (this.L()) {
          return;
       }
       x0.d(this, p0);
       return;
    }
    public Throwable p(z1 p0){
       return p0.O();
    }
    public final c1 q(){
       return this._parentHandle;
    }
    public final Object r(){
       this.K();
       if (this.M()) {
          return b.h();
       }
       Object obj = this.s();
       if (obj instanceof x) {
          throw obj.a;
       }
       if (this.d == 1) {
          z1 oz1 = this.getContext().get(z1.p0);
          if (oz1 != null && !oz1.E()) {
             CancellationException uCancellatio = oz1.O();
             this.d(obj, uCancellatio);
             throw uCancellatio;
          }
       }
       return this.g(obj);
    }
    public void resumeWith(Object p0){
       this.D(y.c(p0, this), this.d);
    }
    public final Object s(){
       return this._state;
    }
    public final void t(a p0){
       p0.invoke();
       return;
    }
    public String toString(){
       return this.z()+'('+o0.c(this.f)+"\){"+this.s()+"}@"+o0.b(this);
    }
    public void u(){
       this.K();
    }
    public final boolean v(){
       l tf = this.f;
       boolean b = (tf instanceof t0 && tf.o(this))? true: false;
       return b;
    }
    public void w(l p0){
       x ox = null;
       i oi = ox;
       while (true) {
          l t_state = this._state;
          if (t_state instanceof b) {
             if (oi == null) {
                oi = this.x(p0);
             }
             if (l.h.compareAndSet(this, t_state, oi)) {
                return;
             }
             continue ;
          }else if(t_state instanceof i){
             this.y(p0, t_state);
          }else if(t_state instanceof o){
             if (!t_state.b()) {
                this.y(p0, t_state);
             }
             if (!t_state instanceof x) {
                t_state = ox;
             }
             if (t_state != null) {
                ox = t_state.a;
             }
             p0.invoke(ox);
             break ;
          }
          break ;
       }
       return;
    }
    public final i x(l p0){
       if (p0 instanceof i) {
       }else {
          w1 ow1 = new w1(p0);
       }
       return p0;
    }
    public final void y(l p0,Object p1){
       throw new IllegalStateException("It\'s prohibited to register multiple handlers, tried to register "+p0+", already has "+p1.toString());
    }
    public String z(){
       return "CancellableContinuation";
    }
}
