package jtd.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jtd.l;
import asd.c;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import qrd.l1;
import kotlin.Result;
import csd.b;
import dsd.e;
import kotlin.jvm.internal.a;

public final class m	// class@001742
{
    public Object _state;
    public static final AtomicReferenceFieldUpdater a;

    static {
       m.a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    }
    public void m(){
       super();
       this._state = null;
    }
    public final boolean a(){
       if (this._state != null) {
          return false;
       }
       this._state = l.a;
       return true;
    }
    public final Object b(c p0){
       l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p0), 1);
       ol.u();
       if (m.a.compareAndSet(this, l.a, ol)) {
       }else {
          ol.resumeWith(Result.constructor-impl(l1.a));
       }
       Object obj = ol.r();
       if (obj == b.h()) {
          e.c(p0);
       }
       return obj;
    }
    public final void c(){
       this._state = null;
    }
    public final void d(){
       m t_state;
       while (true) {
          t_state = this._state;
          if (t_state == null) {
             return;
          }
          e0 b = l.b;
          if (t_state == b) {
             return;
          }
          e0 a = l.a;
          if (t_state == a) {
             if (m.a.compareAndSet(this, t_state, b)) {
                return;
             }
             continue ;
          }else if(m.a.compareAndSet(this, t_state, a)){
             break ;
          }
       }
       t_state.resumeWith(Result.constructor-impl(l1.a));
       return;
    }
    public final boolean e(){
       Object andSet = m.a.getAndSet(this, l.a);
       if (andSet == null) {
          a.L();
       }
       boolean b = (andSet == l.b)? true: false;
       return b;
    }
}
