package ftd.c$a;
import ftd.f2;
import ftd.c;
import ftd.k;
import ftd.z1;
import java.lang.Throwable;
import java.lang.Object;
import ftd.c$b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.ArrayList;
import ftd.r0;
import java.util.Collection;
import kotlin.Result;
import asd.c;
import ftd.c1;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class c$a extends f2	// class@000e74
{
    public Object _disposer;
    public c1 f;
    public final k g;
    public final c h;

    public void c$a(c p0,k p1,z1 p2){
       this.h = p0;
       super(p2);
       this.g = p1;
       this._disposer = null;
    }
    public void b0(Throwable p0){
       if (p0 != null) {
          p0 = this.g.J(p0);
          if (p0 != null) {
             this.g.F(p0);
             c$b uob = this.c0();
             if (uob != null) {
                uob.b();
             }
          }
       }else if(!c.b.decrementAndGet(this.h)){
          c$a tg = this.g;
          c a = this.h.a;
          ArrayList uArrayList = new ArrayList(a.length);
          int len = a.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(a[i].e());
          }
          tg.resumeWith(Result.constructor-impl(uArrayList));
       }
       return;
    }
    public final c$b c0(){
       return this._disposer;
    }
    public final c1 d0(){
       c$a tf = this.f;
       if (tf == null) {
          a.S("handle");
       }
       return tf;
    }
    public final void e0(c$b p0){
       this._disposer = p0;
    }
    public final void f0(c1 p0){
       this.f = p0;
    }
    public Object invoke(Object p0){
       this.b0(p0);
       return l1.a;
    }
}
