package mrd.a$a;
import crd.b;
import io.reactivex.internal.util.a$a;
import brd.y;
import mrd.a;
import java.lang.Object;
import io.reactivex.internal.util.a;
import io.reactivex.internal.util.NotificationLite;

public final class a$a implements b, a$a	// class@001d3c
{
    public final y actual;
    public final a b;
    public boolean c;
    public boolean d;
    public a e;
    public boolean f;
    public boolean g;
    public long h;

    public void a$a(y p0,a p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void a(Object p0,long p1){
       if (this.g != null) {
          return;
       }
       if (this.f == null) {
          _monitor_enter(this);
          if (this.g != null) {
             _monitor_exit(this);
             return;
          }else if(!this.h - p1){
             _monitor_exit(this);
             return;
          }else if(this.d != null){
             a$a te = this.e;
             if (te == null) {
                te = new a(4);
                this.e = te;
             }
             te.a(p0);
             _monitor_exit(this);
             return;
          }else {
             this.c = true;
             _monitor_exit(this);
             this.f = true;
          }
       }
       this.test(p0);
       return;
    }
    public void dispose(){
       if (this.g == null) {
          this.g = true;
          this.b.k(this);
       }
       return;
    }
    public boolean isDisposed(){
       return this.g;
    }
    public boolean test(Object p0){
       boolean b = (this.g != null || NotificationLite.accept(p0, this.actual))? true: false;
       return b;
    }
}
