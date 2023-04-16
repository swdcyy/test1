package kotlinx.coroutines.android.HandlerContext;
import gtd.a;
import android.os.Handler;
import java.lang.String;
import nsd.u;
import ftd.j2;
import java.lang.Object;
import ftd.k;
import kotlinx.coroutines.android.HandlerContext$b;
import usd.q;
import java.lang.Runnable;
import kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1;
import msd.l;
import java.lang.System;
import ftd.c1;
import kotlinx.coroutines.android.HandlerContext$a;
import java.lang.StringBuilder;
import kotlin.coroutines.CoroutineContext;
import android.os.Looper;
import kotlin.jvm.internal.a;

public final class HandlerContext extends a	// class@001ce6
{
    public HandlerContext _immediate;
    public final HandlerContext c;
    public final Handler d;
    public final String e;
    public final boolean f;

    public void HandlerContext(Handler p0,String p1){
       super(p0, p1, false);
    }
    public void HandlerContext(Handler p0,String p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public void HandlerContext(Handler p0,String p1,boolean p2){
       u ou = null;
       super(ou);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       if (p2) {
          ou = this;
       }
       this._immediate = ou;
       HandlerContext t_immediate = this._immediate;
       if (t_immediate == null) {
          t_immediate = new HandlerContext(p0, p1, true);
          this._immediate = t_immediate;
       }
       this.c = t_immediate;
       return;
    }
    public j2 A(){
       return this.Y();
    }
    public a T(){
       return this.Y();
    }
    public HandlerContext Y(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof HandlerContext && p0.d == this.d)? true: false;
       return b;
    }
    public void g(long p0,k p1){
       HandlerContext$b uob = new HandlerContext$b(this, p1);
       this.d.postDelayed(uob, q.v(p0, 0x3fffffffffffffff));
       p1.w(new HandlerContext$scheduleResumeAfterDelay$1(this, uob));
    }
    public int hashCode(){
       return System.identityHashCode(this.d);
    }
    public c1 k(long p0,Runnable p1){
       this.d.postDelayed(p1, q.v(p0, 0x3fffffffffffffff));
       return new HandlerContext$a(this, p1);
    }
    public String toString(){
       HandlerContext te = this.e;
       if (te != null) {
          if (this.f != null) {
             te = this.e+" [immediate]";
          }
       }else {
          te = this.d.toString();
       }
       return te;
    }
    public void u(CoroutineContext p0,Runnable p1){
       this.d.post(p1);
    }
    public boolean x(CoroutineContext p0){
       int i = 1;
       if (this.f != null && !(a.g(Looper.myLooper(), this.d.getLooper()) ^ i)) {
          i = false;
       }
       return i;
    }
}
